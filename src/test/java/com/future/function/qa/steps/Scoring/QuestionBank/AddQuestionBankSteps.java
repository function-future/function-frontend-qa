package com.future.function.qa.steps.Scoring.QuestionBank;

import com.future.function.qa.pages.scoring.QuestionBanks.QuestionBankFormPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AddQuestionBankSteps {

    private QuestionBankFormPage questionBankFormPage;

    @Then("^user should be on create question bank page$")
    public void userShouldBeOnCreateQuestionBankPage() {
        questionBankFormPage.shouldBeDisplayed();
    }


    @And("^user type \"([^\"]*)\" in question bank title input$")
    public void userTypeInQuestionBankTitleInput(String title) {
        questionBankFormPage.titleInput().type(title);
    }

    @And("^user type \"([^\"]*)\" in question bank description input$")
    public void userTypeInQuestionBankDescriptionInput(String desc) {
        questionBankFormPage.descriptionInput().type(desc);
    }

    @And("^user click on create question bank button$")
    public void userClickOnCreateQuestionBankButton() {
        questionBankFormPage.saveBtn().click();
    }

    @And("^user click on cancel creating question bank button$")
    public void userClickOnCancelCreatingQuestionBankButton() {
        questionBankFormPage.cancelBtn().click();
    }
}
