package com.future.function.qa.steps.Core.StickyNotes;

import com.future.function.qa.pages.core.StickyNotes.EditStickyNotesPage;
import cucumber.api.java.en.Then;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EditStickyNotesSteps {

    private EditStickyNotesPage editStickyNotesPage;

    @Then("^user should be on edit sticky notes page$")
    public void userShouldBeOnEditStickyNotesPage() {
        editStickyNotesPage.shouldBeDisplayed();
    }
}
