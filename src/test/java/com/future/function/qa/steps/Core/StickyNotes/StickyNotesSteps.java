package com.future.function.qa.steps.Core.StickyNotes;

import com.future.function.qa.pages.core.HomePage;
import com.future.function.qa.pages.core.StickyNotes.StickyNotesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.assertEquals;

@Slf4j
public class StickyNotesSteps {

    private HomePage homePage;
    private StickyNotesPage stickyNotesPage;

    private String storedTitleText;

    @When("^user click on sticky notes on feeds$")
    public void userClickOnStickyNotes() {
        homePage.stickyNotes().shouldBeVisible();
        homePage.stickyNotes().click();
    }

    @And("^user remembers sticky notes title on feeds page$")
    public void userRemembersStickyNotesTitleOnFeedsPage() {
        storedTitleText = homePage.stickyNotesTitle().getText();
        log.info("sticky note title: " + storedTitleText);
    }

    @Then("^user should be on sticky notes detail page$")
    public void userShouldBeOnStickyNotesPage() {
        stickyNotesPage.shouldBeDisplayed();
    }

    @And("^user should see sticky note title is the same as displayed on feeds$")
    public void userShouldSeeSameTitle() {
        assertEquals(stickyNotesPage.title().getText(), storedTitleText);
    }

    @When(("^user click on edit button$"))
    public void userClickOnEditButton() {
        stickyNotesPage.editButton().click();
    }

    @And("^sticky note title should equal \"([^\"]*)\"$")
    public void stickyNoteTitleShouldEqual(String title) {
        assertEquals(stickyNotesPage.title().getText(), title);
    }

    @And("^sticky note description should equal \"([^\"]*)\"$")
    public void stickyNoteDescriptionShouldEqual(String description) {
        assertEquals(stickyNotesPage.description().getText(), description);
    }

    @And("^user should not be able to see edit button on sticky notes page$")
    public void userShouldNotSeeEditButton() {
        stickyNotesPage.editButton().shouldNotBeVisible();
    }

}
