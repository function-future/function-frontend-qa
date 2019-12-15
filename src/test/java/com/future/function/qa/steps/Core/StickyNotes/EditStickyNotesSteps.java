package com.future.function.qa.steps.Core.StickyNotes;

import com.future.function.qa.pages.core.StickyNotes.EditStickyNotesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EditStickyNotesSteps {

    private EditStickyNotesPage editStickyNotesPage;

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
}
