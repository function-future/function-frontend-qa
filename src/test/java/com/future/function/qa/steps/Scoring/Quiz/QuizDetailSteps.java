package com.future.function.qa.steps.Scoring.Quiz;

import com.future.function.qa.pages.scoring.Quizzes.QuizDetailPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuizDetailSteps {
    
    private QuizDetailPage detailPage;
    
    @Then("^user should be on quiz detail page$")
    public void userShouldBeOnQuizDetailPage() {
        detailPage.shouldBeDisplayed();
    }


    @And("^user should see edit quiz button$")
    public void userShouldSeeEditQuizButton() {
        detailPage.editBtn().shouldBeVisible();
    }

    @And("^user should see delete quiz button$")
    public void userShouldSeeDeleteButton() {
        detailPage.deleteBtn().shouldBeVisible();
    }

    @And("^user should see start button$")
    public void userShouldSeeStartButton() {
        detailPage.startBtn().shouldBeVisible();
    }

    @And("^user should not see edit quiz button$")
    public void userShouldNotSeeEditQuizButton() {
        detailPage.editBtn().shouldNotBeVisible();
    }

    @And("^user should not see delete quiz button$")
    public void userShouldNotSeeDeleteQuizButton() {
        detailPage.deleteBtn().shouldNotBeVisible();
    }

    @And("^user should not see start quiz button$")
    public void userShouldNotSeeStartQuizButton() {
        detailPage.startBtn().shouldNotBeVisible();
    }

    @When("^user click edit quiz button$")
    public void userClickEditQuizButton() {
        detailPage.editBtn().click();
    }

    @When("^user click delete quiz button$")
    public void userClickDeleteQuizButton() {
        detailPage.deleteBtn().click();
    }

    @When("^user click start quiz button$")
    public void userClickStartQuizButton() {
        detailPage.startBtn().click();
    }

    @And("^user should see quiz title$")
    public void userShouldSeeQuizTitle() {
        detailPage.quizTitle().shouldBeVisible();
    }

    @And("^user should see quiz description$")
    public void userShouldSeeQuizDescription() {
        detailPage.quizDescription().shouldBeVisible();
    }

    @And("^user should see quiz' \"([^\"]*)\" on detail box number (\\d+)$")
    public void userShouldSeeQuizOnDetailBoxNumber(String boxTitle, int col) {
        detailPage.quizDetailBox(col).shouldBeVisible();
        assertTrue(detailPage.detailBoxHeader(col).getText().contains(boxTitle));
    }

    @And("^user should see question bank dropdown section$")
    public void userShouldSeeQuestionBankDropdownSection() {
        detailPage.questionBankSection().shouldBeVisible();
    }

    @And("^user should see list of question bank in this quiz$")
    public void userShouldSeeListOfQuestionBankInThisQuiz() {
        detailPage.questionBankList().shouldBeVisible();
    }

    @And("^user should be able to toggle question bank list when chevron button is clicked$")
    public void userShouldBeAbleToToggleQuestionBankListWhenChevronButtonIsClicked() {
        detailPage.expandQuestionBankList().click();
    }

    @And("^user should not be able to see question bank list$")
    public void userShouldNotBeAbleToSeeQuestionBankList() {
        detailPage.questionBankList().shouldNotBeVisible();
    }


    @And("^quiz title should be updated to \"([^\"]*)\"$")
    public void quizTitleShouldBeUpdatedTo(String title) {
        assertTrue(detailPage.quizTitle().getText().contains(title));
    }

    @And("^quiz description should be updated to \"([^\"]*)\"$")
    public void quizDescriptionShouldBeUpdatedTo(String desc) {
        assertTrue(detailPage.quizDescription().getText().contains(desc));
    }

    @When("^user clicks on delete quiz button$")
    public void userClicksOnDeleteQuizButton() {
        detailPage.deleteBtn().click();
    }

    @Then("^user should see delete quiz confirmation modal$")
    public void userShouldSeeDeleteQuizConfirmationModal() {
        detailPage.deleteQuizModal().shouldBeVisible();
    }

    @And("^user clicks on delete quiz confirmation button$")
    public void userClicksOnDeleteQuizConfirmationButton() {
        detailPage.deleteModalConfirmBtn().click();
    }

    @When("^user clicks cancel delete quiz button$")
    public void userClicksCancelDeleteQuizButton() {
        detailPage.deleteModalCancelBtn().click();
    }
}
