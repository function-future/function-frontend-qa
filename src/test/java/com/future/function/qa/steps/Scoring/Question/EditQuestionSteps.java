package com.future.function.qa.steps.Scoring.Question;

import com.future.function.qa.pages.scoring.QuestionBanks.QuestionBankDetailPage;
import com.future.function.qa.pages.scoring.Questions.QuestionDetailPage;
import com.future.function.qa.pages.scoring.Questions.QuestionFormPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditQuestionSteps {

    private QuestionDetailPage questionDetailPage;

    private QuestionBankDetailPage bankDetailPage;

    private QuestionFormPage formPage;

    @When("^user clicks more button on question with index (\\d+)$")
    public void userClicksMoreButtonOnQuestionWithIndex(int row) {
        bankDetailPage.questionListItemMoreAction(row).click();;
    }

    @Then("^user should be on edit question page$")
    public void userShouldBeOnEditQuestionPage() {
        formPage.shouldBeDisplayed();
    }

    @When("^user clicks edit question button$")
    public void userClicksEditQuestionButton() {
        formPage.saveBtn().click();
    }

    @Then("^user should see list of actions for selected question$")
    public void userShouldSeeListOfActionsForQuestionWithIndex() {
        bankDetailPage.questionListItemActionsContainer().shouldBeVisible();
    }

    @When("^user clicks on action number (\\d+)$")
    public void userClicksOnActionForItem(int row) {
        bankDetailPage.questionListItemAction(row).click();
    }

    @And("^user clicks on edit question button$")
    public void userClicksOnEditQuestionButton() {
        questionDetailPage.editBtn().click();
    }

    @When("^user click cancel button on edit question page$")
    public void userClickCancelButtonOnEditQuestionPage()  {
        formPage.cancelBtn().click();
    }
}
