package com.future.function.qa.steps.Scoring.QuestionBank;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class QuestionBankDetailSteps {

    private QuestionBankDetailPage detailPage;

    @And("^user should see question bank title$")
    public void userShouldSeeQuestionBankTitle() {
        detailPage.bankTitle().isDisplayed();
    }

    @And("^user should see question bank description$")
    public void userShouldSeeQuestionBankDescription() {
        detailPage.bankDescription().isDisplayed();
    }

    @And("^user should see question dropdown section$")
    public void userShouldSeeQuestionDropdownSection() {
        detailPage.questionDropdown().shouldBeVisible();
    }

    @When("^user clicks on the dropdown header$")
    public void userClicksOnTheDropdownHeader() {
        detailPage.questionDropdown().click();
    }

    @And("^user should see list of question this question banks$")
    public void userShouldSeeListOfQuestionThisQuestionBanks() {
        detailPage.questionList().shouldBeVisible();
    }

    @And("^user should not see list of question this question banks$")
    public void userShouldNotSeeListOfQuestionThisQuestionBanks() {
        detailPage.questionList().shouldNotBeVisible();
    }

    @And("^user should see add question button$")
    public void userShouldSeeAddQuestionButton() {
        detailPage.addQuestionBtn().shouldBeVisible();
    }

    @And("^user should see edit question bank button$")
    public void userShouldSeeEditQuestionBankButton() {
        detailPage.editBtn().shouldBeVisible();
    }

    @And("^user should see delete question bank button$")
    public void userShouldSeeDeleteQuestionBankButton() {
        detailPage.deleteBtn().shouldBeVisible();
    }

}
