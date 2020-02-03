package com.future.function.qa.steps.Scoring.Quiz;

import com.future.function.qa.pages.scoring.Quizzes.QuizPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QuizSteps {

    private QuizPage quizPage;

    @Then("^user should be on quiz page$")
    public void userShouldBeOnQuizPage() {
        quizPage.shouldBeDisplayed();
    }

    @And("^user should see quiz timer bar$")
    public void userShouldSeeQuizTimerBar() {
        quizPage.quizTimer().shouldBeVisible();
    }

    @And("^user should see quiz navigation bar$")
    public void userShouldSeeQuizNavigationBar() {
        quizPage.quizNavigationBar().shouldBeVisible();
    }

    @And("^question number (\\d+) should have \"([^\"]*)\" with attribute \"([^\"]*)\"$")
    public void questionNumberShouldHaveWithAttribute(int number, String attr, String value) {
        assertTrue(quizPage.quizNavigationBarItem(number).getAttribute(attr).contains(value));
    }

    @And("^user should see question text for number (\\d+)$")
    public void userShouldSeeQuestionTextForNumber(int number) {
        quizPage.questionText(number).shouldBeVisible();
    }

    @And("^user should see (\\d+) options for question (\\d+)$")
    public void userShouldSeeOptionsForQuestion(int options, int number) {
        for (int option=1; option <= options; option++) {
            quizPage.optionButton(number, option).shouldBeVisible();
        }
    }

    @And("^user should select option (\\d+) as the correct answer for number (\\d+)$")
    public void userShouldSelectOptionAsTheCorrectAnswerForNumber(int option, int number) {
        quizPage.optionButton(number, option).click();
    }

    @And("^user should see previous button is currently disabled$")
    public void userShouldSeePreviousButtonIsCurrentlyDisabled() {
        quizPage.prevBtn().shouldBeVisible();
        assertFalse(quizPage.prevBtn().isEnabled());
    }

    @And("^user should see next button is not disabled$")
    public void userShouldSeeNextButtonIsNotDisabled() {
        quizPage.nextBtn().shouldBeVisible();
        assertTrue(quizPage.nextBtn().isEnabled());
    }

    @When("^user clicks on next button$")
    public void userClicksOnNextButton() {
        quizPage.nextBtn().click();
    }

    @And("^user should see previous button is not disabled$")
    public void userShouldSeePreviousButtonIsNotDisabled() {
        assertTrue(quizPage.prevBtn().isEnabled());
    }

    @When("^user navigates to question number (\\d+)$")
    public void userNavigatesToQuestionNumber(int number) {
        quizPage.quizNavigationBarMarker(number).click();
    }

    @And("^user should not see next button$")
    public void userShouldNotSeeNextButton() {
        quizPage.nextBtn().shouldNotBeVisible();
    }

    @And("^user should see submit quiz button$")
    public void userShouldSeeSubmitQuizButton() {
        quizPage.submitBtn().shouldBeVisible();
    }

    @When("^user clicks on submit quiz button$")
    public void userClicksOnSubmitQuizButton() {
        quizPage.submitBtn().click();
    }

    @Then("^user should see finish quiz modal$")
    public void userShouldSeeFinishQuizModal() {
        quizPage.finishQuizModal().shouldBeVisible();
    }

    @And("^user should see remaining trials$")
    public void userShouldSeeRemainingTrials() {
        quizPage.trialsLeft().shouldBeVisible();
    }

    @And("^user should see their final score$")
    public void userShouldSeeTheirFinalScore() {
        quizPage.totalScore().shouldBeVisible();
    }

    @And("^user should see retry quiz button$")
    public void userShouldSeeRetryQuizButton() {
        quizPage.retryBtn().shouldBeVisible();
    }

    @And("^user should see finish quiz button$")
    public void userShouldSeeFinishQuizButton() {
        quizPage.finishBtn().shouldBeVisible();
    }

    @When("^user clicks finish quiz button$")
    public void userClicksFinishQuizButton() {
        quizPage.finishBtn().click();
    }

    @When("^user clicks retry quiz button$")
    public void userClicksRetryQuizButton() {
        quizPage.retryBtn().click();
    }
}
