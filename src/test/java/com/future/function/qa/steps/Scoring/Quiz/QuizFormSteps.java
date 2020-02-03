package com.future.function.qa.steps.Scoring.Quiz;

import com.future.function.qa.pages.scoring.Quizzes.QuizFormPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class QuizFormSteps {

    private QuizFormPage formPage;

    @Then("^user should be on add quiz page$")
    public void userShouldBeOnAddQuizPage() {
        formPage.shouldBeDisplayed();
    }

    @Then("^user should be on edit quiz page$")
    public void userShouldBeOnEditQuizPage() {
        formPage.shouldBeDisplayed();
    }

    @And("^user should see quiz title input box$")
    public void userShouldSeeQuizTitleInputBox() {
        formPage.quizTitleInput().shouldBeVisible();
    }

    @And("^user should see quiz description input box$")
    public void userShouldSeeQuizDescriptionInputBox() {
        formPage.quizDescriptionInput().shouldBeVisible();
    }

    @And("^user should see date input box$")
    public void userShouldSeeDateInputBox() {
        formPage.dateBox().shouldBeVisible();
    }

    @And("^user should see \"([^\"]*)\" input on index (\\d+)$")
    public void userShouldSeeInputOnIndex(String title, int col) {
        assertTrue(formPage.detailBox(col).getText().contains(title));
    }

    @And("^user should see a section of question bank$")
    public void userShouldSeeASectionOfQuestionBank() {
        formPage.questionBankSection().shouldBeVisible();
    }

    @When("^user types \"([^\"]*)\" on quiz title$")
    public void userTypesOnQuizTitle(String title) {
        formPage.quizTitleInput().type(title);
    }

    @And("^user types \"([^\"]*)\" on quiz description$")
    public void userTypesOnQuizDescription(String desc) {
        formPage.quizDescriptionInput().type(desc);
    }

    @And("^\"([^\"]*)\" is set to (\\d+) on input box with index (\\d+)$")
    public void isSetToOnInputBoxWithIndex(String inputLabel, int amount, int col) {
        assertTrue(formPage.detailBox(col).getText().contains(inputLabel));
        formPage.detailInputBox(col).type(String.valueOf(amount));
    }

    @When("^user clicks on date field$")
    public void userClicksOnDateField() {
        formPage.dateBox().click();
    }

    @Then("^user should see quiz submission calendar$")
    public void userShouldSeeQuizSubmissionCalendar() {
        formPage.calendar().shouldBeVisible();
    }

    @And("^user set deadline to week (\\d+) day (\\d+) to week (\\d+) day (\\d+)$")
    public void userSetDeadlineToWeekDayToWeekDay(int startWeek, int startDate, int endWeek, int endDate) {
        formPage.calendarDate(startWeek, startDate).click();
        formPage.calendarDate(endDate, endWeek).click();
    }

    @When("^user clicks on add question bank to quiz button$")
    public void userClicksOnAddQuestionBankToQuizButton() {
        formPage.addQuestionBtn().click();
    }

    @Then("^user should see modal containing list of question banks$")
    public void userShouldSeeModalContainingListOfQuestionBanks() {
        formPage.questionBankModal().shouldBeVisible();
    }

    @And("^user select question bank with index (\\d+)$")
    public void userSelectQuestionBankWithIndex(int row) {
        formPage.questionBankModalItem(row).click();
    }

    @And("^user clicks on question bank checkbox with index (\\d+)$")
    public void userClicksOnQuestionBankCheckboxWithIndex(int row) {
        formPage.questionBankModalCheckbox(row).click();
    }

    @And("^user clicks save button on question bank modal$")
    public void userClicksSaveButtonOnQuestionBankModal() {
        formPage.questionBankModalSave().click();
    }

    @Then("^user should see (\\d+) items on question bank list$")
    public void userShouldSeeItemsOnQuestionBankList(int row) {
        formPage.questionBankListItem(row).shouldBeVisible();
    }

    @When("^user click save quiz button$")
    public void userClickSaveQuizButton() {
        formPage.saveBtn().click();
    }
}
