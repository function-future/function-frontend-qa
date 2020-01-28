package com.future.function.qa.steps.Scoring.QuestionBank;

import com.future.function.qa.pages.scoring.QuestionBanks.QuestionBankDetailPage;
import com.future.function.qa.pages.scoring.QuestionBanks.QuestionBankFormPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class EditQuestionBankSteps {

    private QuestionBankDetailPage detailPage;

    private QuestionBankFormPage formPage;

    @Then("^user should be on question bank detail page$")
    public void userShouldBeOnQuestionBankDetailPage() {
        detailPage.shouldBeDisplayed();
    }

    @And("^user click edit question bank button$")
    public void userClickEditQuestionBankButton() {
        detailPage.editBtn().click();
    }

    @Then("^user should be on edit question bank page$")
    public void userShouldBeOnEditQuestionBankPage() {
        formPage.shouldBeDisplayed();
    }

    @When("^user type \"([^\"]*)\" in question bank title edit field$")
    public void userTypeInQuestionBankTitleEditField(String title) {
        formPage.titleInput().type(title);
    }

    @And("^user type \"([^\"]*)\" in question bank description edit field$")
    public void userTypeInQuestionBankDescriptionEditField(String desc) {
        formPage.descriptionInput().type(desc);
    }

    @And("^user click on save button on edit question bank page$")
    public void userClickOnSaveButtonOnEditQuestionBankPage() {
        formPage.saveBtn().click();
    }

    @And("^question bank title on question bank detail should be \"([^\"]*)\"$")
    public void questionBankTitleOnQuestionBankDetailShouldBe(String title) {
        assertEquals(detailPage.bankTitle().getText(), title);
    }

    @And("^question bank description on question bank detail should be \"([^\"]*)\"$")
    public void questionBankDescriptionOnQuestionBankDetailShouldBe(String desc) {
        assertEquals(detailPage.bankDescription().getText(), desc);
    }

    @And("^user click on cancel button on edit question bank page$")
    public void userClickOnCancelButtonOnEditQuestionBankPage() {
        formPage.cancelBtn().click();
    }

    @And("^question bank title on question bank detail should not be \"([^\"]*)\"$")
    public void questionBankTitleOnQuestionBankDetailShouldNotBe(String title) {
        assertNotEquals(detailPage.bankTitle().getText(), title);
    }

    @And("^question bank description on question bank detail should not be \"([^\"]*)\"$")
    public void questionBankDescriptionOnQuestionBankDetailShouldNotBe(String desc) {
        assertNotEquals(detailPage.bankDescription().getText(), desc);
    }
}
