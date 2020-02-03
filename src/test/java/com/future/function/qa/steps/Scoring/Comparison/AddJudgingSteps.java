package com.future.function.qa.steps.Scoring.Comparison;

import com.future.function.qa.pages.errors.general.ToastComponent;
import com.future.function.qa.pages.errors.scoring.AddJudgingPageErrors;
import com.future.function.qa.pages.scoring.Comparison.JudgingFormPage;
import com.future.function.qa.pages.scoring.Comparison.JudgingListPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddJudgingSteps {

  private JudgingListPage judgingListPage;

  private JudgingFormPage judgingFormPage;

  private AddJudgingPageErrors addJudgingErrors;

  private ToastComponent toastComponent;


  @When("^user click add judging button$")
  public void userClickAddJudgingButton() {
    judgingListPage.addJudgingButton().click();
  }

  @Then("^user should be in final judging form page$")
  public void userShouldBeInAddFinalJudgingPage() {
    judgingFormPage.shouldBeDisplayed();
  }

  @And("^user should see title label$")
  public void userShouldSeeTitleLabel() {
    judgingFormPage.titleLabel().shouldBeVisible();
  }

  @And("^user should see title input$")
  public void userShouldSeeTitleInput() {
    judgingFormPage.titleInput().shouldBeVisible();
  }

  @And("^user should see description label$")
  public void userShouldSeeDescriptionLabel() {
    judgingFormPage.descriptionLabel().shouldBeVisible();
  }

  @And("^user should see description input$")
  public void userShouldSeeDescriptionInput() {
    judgingFormPage.descriptionInput().shouldBeVisible();
  }

  @And("^user should see student selection section$")
  public void userShouldSeeStudentSelectionSection() {
    judgingFormPage.studentSelectionSection().shouldBeVisible();
  }

  @And("^user should see add student button$")
  public void userShouldSeeAddStudentButton() {
    judgingFormPage.addStudentButton().shouldBeVisible();
  }

  @And("^user should see dropdown arrow button$")
  public void userShouldSeeDropdownArrowButton() {
    judgingFormPage.studentArrowButton().shouldBeVisible();
  }

  @When("^user click add student button$")
  public void userClickAddStudentButton() {
    judgingFormPage.addStudentButton().click();
  }

  @Then("^user should see student selection modal$")
  public void userShouldSeeStudentSelectionModal() {
    judgingFormPage.studentSelectionModal().shouldBeVisible();
  }

  @And("^user should see student list data$")
  public void userShouldSeeStudentListData() {
    judgingFormPage.studentSelectList().shouldBeVisible();
  }

  @And("^user should see student select title modal$")
  public void userShouldSeeStudentSelectTitleModal() {
    judgingFormPage.studentSelectLabel().shouldBeVisible();
  }

  @And("^user should see cancel button$")
  public void userShouldSeeCancelButton() {
    judgingFormPage.cancelStudentSelectionButton().shouldBeVisible();
  }

  @And("^user should see save button$")
  public void userShouldSeeSaveButton() {
    judgingFormPage.saveStudentSelectionModalButton().shouldBeVisible();
  }

  @And("^user should see exit button$")
  public void userShouldSeeExitButton() {
    judgingFormPage.exitStudentSelectionModalButton().shouldBeVisible();
  }

  @When("^user click student data with index (\\d+)$")
  public void userClickStudentDataWithIndex(int row) {
    judgingFormPage.studentSelectDetail(row).click();
  }

  @Then("^user should see the checkbox with index (\\d+)$")
  public void userShouldSeeTheCheckboxWithIndexWithValue(int row) throws Throwable {
    assertTrue(judgingFormPage.studentSelectDetailCheckbox(row).isSelected());
  }


  @When("^user click save button$")
  public void userClickSaveButton() {
    judgingFormPage.saveStudentSelectionModalButton().click();
  }

  @Then("^user should not see student selection modal$")
  public void userShouldNotSeeStudentSelectionModal() {
    judgingFormPage.studentSelectionModal().shouldNotBePresent();
  }

  @And("^user should be in add judging page$")
  public void userShouldBeInAddJudgingPage() {
    judgingFormPage.shouldBeDisplayed();
  }

  @And("^user should see student detail in student selection section with index (\\d+)$")
  public void userShouldSeeStudentDetailInStudentSelectionSectionWithIndex(int index) {
    judgingFormPage.studentDetail(index).shouldBeVisible();
  }


  @When("^user click save button in add judging page$")
  public void userClickSaveButtonInAddJudgingPage() {
    judgingFormPage.saveJudgingButton().click();
  }

  @When("^user type \"([^\"]*)\" in title input$")
  public void userTypeInTitleInput(String title) throws Throwable {
    judgingFormPage.titleInput().type(title);
  }

  @And("^user type \"([^\"]*)\" in description input$")
  public void userTypeInDescriptionInput(String description) throws Throwable {
    judgingFormPage.descriptionInput().type(description);
  }

  @Then("^user should see title error label$")
  public void userShouldSeeTitleErrorLabel() {
    addJudgingErrors.titleErrorLabel().shouldBeVisible();
    addJudgingErrors.titleErrorLabel().shouldBePresent();
  }

  @And("^user should see description error label$")
  public void userShouldSeeDescriptionErrorLabel() {
    addJudgingErrors.descriptionErrorLabel().shouldBeVisible();
    addJudgingErrors.descriptionErrorLabel().shouldBePresent();
  }

  @Then("^user should see toast danger with message \"([^\"]*)\"$")
  public void userShouldSeeToastDangerWithMessage(String message) throws Throwable {
    toastComponent.toastDanger().shouldBeVisible();
    assertEquals(toastComponent.toastDanger().getText(), message);
  }
}
