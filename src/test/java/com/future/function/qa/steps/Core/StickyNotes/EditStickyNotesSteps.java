package com.future.function.qa.steps.Core.StickyNotes;

import com.future.function.qa.pages.core.StickyNotes.EditStickyNotesPage;
import com.future.function.qa.pages.core.StickyNotes.StickyNotesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.assertEquals;

@Slf4j
public class EditStickyNotesSteps {

    private EditStickyNotesPage editStickyNotesPage;
    private StickyNotesPage stickyNotesPage;

    private String storedTitleText;
    private String storedDescriptionText;

    @Then("^user should be on edit sticky notes page$")
    public void userShouldBeOnEditStickyNotesPage() {
        editStickyNotesPage.shouldBeDisplayed();
    }

    @When("^user type \"([^\"]*)\" in sticky notes title input$")
    public void userTypeInStickyNotesTitleInput(String title) throws Throwable {
        editStickyNotesPage.titleInput().clear();
        editStickyNotesPage.titleInput().type(title);
    }

    @And("^user type \"([^\"]*)\" in sticky notes description input$")
    public void userTypeInStickyNotesDescriptionInput(String description) throws Throwable {
        editStickyNotesPage.descriptionInput().type(description);
    }

    @And("^user click on save button on edit sticky notes page$")
    public void userClickOnSubmitButton() {
        editStickyNotesPage.submitButton().click();
    }

    @And("^user remembers sticky notes title on sticky notes page$")
    public void userRemembersStickyNotesTitleOnStickyNotesPage() {
        storedTitleText = stickyNotesPage.title().getText();
        log.info("sticky note title: " + storedTitleText);
    }

    @And("^user remembers sticky notes description on sticky notes page$")
    public void userRemembersStickyNotesDescriptionOnStickyNotesPage() {
        storedDescriptionText = stickyNotesPage.description().getText();
        log.info("sticky note description: " + storedTitleText);
    }

    @And("^user should see sticky note title is unchanged$")
    public void userShouldSeeSameTitle() {
        assertEquals(stickyNotesPage.title().getText(), storedTitleText);
    }

    @And("^user should see sticky note description is unchanged$")
    public void userShouldSeeSameDescription() {
        assertEquals(stickyNotesPage.description().getText(), storedDescriptionText);
    }

    @When(("^user click on cancel button on edit sticky notes page$"))
    public void userClickOnCancelButton() {
        editStickyNotesPage.cancelButton().click();
    }

}
