package com.future.function.qa.steps.Scoring.Question;

import com.future.function.qa.pages.scoring.QuestionBanks.QuestionBankDetailPage;
import com.future.function.qa.pages.scoring.Questions.QuestionFormPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddQuestionSteps {

    private QuestionBankDetailPage bankDetailPage;

    private QuestionFormPage formPage;

    @When("^user clicks add question button$")
    public void userClicksAddQuestionButton() {
        bankDetailPage.addQuestionBtn().click();
    }

    @Then("^user should be on add question page$")
    public void userShouldBeOnAddQuestionPage() {
        formPage.shouldBeDisplayed();
    }

    @And("^user type \"([^\"]*)\" on question box$")
    public void userTypeOnQuestionBox(String question) {
        formPage.titleBox().type(question);
    }

    @And("^user type \"([^\"]*)\" on option (\\d+)$")
    public void userTypeOnOption(String option, int idx) {
        formPage.optionSection(idx).type(option);
    }

    @And("^user select option (\\d+) as the correct answer$")
    public void userSelectOptionAsTheCorrectAnswer(int idx) {
        formPage.optionRadio(idx).click();
    }

    @When("^user clicks save question button$")
    public void userClicksSaveQuestionButton() {
        formPage.saveBtn().click();
    }

    @When("^user clicks cancel question button$")
    public void userClicksCancelQuestionButton() {
        formPage.cancelBtn().click();
    }

    @And("^user should see dialog box displaying info$")
    public void userShouldSeeDialogBoxDisplayingInfo() {
        formPage.infoBox().shouldBeVisible();
    }

    @When("^user close the dialog box by pressing the designated button$")
    public void userCloseTheDialogBoxByPressingTheDesignatedButton() {
        formPage.closeInfoBtn().click();
    }

    @Then("^user should not see dialog box displaying info$")
    public void userShouldNotSeeDialogBoxDisplayingInfo() {
        formPage.infoBox().shouldNotBeVisible();
    }
}
