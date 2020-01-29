package com.future.function.qa.steps.Scoring.Question;

import com.future.function.qa.pages.scoring.QuestionBanks.QuestionBankDetailPage;
import com.future.function.qa.pages.scoring.Questions.QuestionDetailPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class QuestionDetailSteps {

    private QuestionBankDetailPage bankDetailPage;

    private QuestionDetailPage questionDetailPage;


    @When("^user clicks on question number (\\d+)$")
    public void userClicksOnQuestionNumber(int row) {
        bankDetailPage.questionListItem(row).click();
    }

    @Then("^user should be on question detail page$")
    public void userShouldBeOnQuestionDetailPage() {
        questionDetailPage.shouldBeDisplayed();
    }

    @And("^user should see edit question button$")
    public void userShouldSeeEditQuestionButton() {
        questionDetailPage.editBtn().shouldBeVisible();
    }

    @And("^user should see delete question button$")
    public void userShouldSeeDeleteQuestionButton() {
        questionDetailPage.deleteBtn().shouldBeVisible();
    }

    @And("^user should see question title$")
    public void userShouldSeeQuestionTitle() {
        questionDetailPage.questionBox().shouldBeVisible();
    }

    @And("^user should see option list$")
    public void userShouldSeeOptionList() {
        questionDetailPage.optionContainer().shouldBeVisible();
    }
}
