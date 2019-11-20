package com.future.function.qa.steps.Scoring.Comparison;

import com.future.function.qa.pages.core.HomePage;
import com.future.function.qa.pages.scoring.AddJudgingPage;
import com.future.function.qa.pages.scoring.JudgingListPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddJudgingSteps {

  private JudgingListPage judgingListPage;

  private AddJudgingPage addJudgingPage;


  @When("^user click add judging button$")
  public void userClickAddJudgingButton() {
    judgingListPage.addJudgingButton().click();
  }

  @Then("^user should be in add final judging page$")
  public void userShouldBeInAddFinalJudgingPage() {
    addJudgingPage.shouldBeDisplayed();
  }

  @And("^user should see title label$")
  public void userShouldSeeTitleLabel() {
    addJudgingPage.titleLabel().shouldBeVisible();
  }

  @And("^user should see title input$")
  public void userShouldSeeTitleInput() {
    addJudgingPage.titleInput().shouldBeVisible();
  }

  @And("^user should see description label$")
  public void userShouldSeeDescriptionLabel() {
    addJudgingPage.descriptionLabel().shouldBeVisible();
  }

  @And("^user should see description input$")
  public void userShouldSeeDescriptionInput() {
    addJudgingPage.descriptionInput().shouldBeVisible();
  }

  @And("^user should see student selection section$")
  public void userShouldSeeStudentSelectionSection() {
    addJudgingPage.studentSelectionSection().shouldBeVisible();
  }

  @And("^user should see add student button$")
  public void userShouldSeeAddStudentButton() {
    addJudgingPage.addStudentButton().shouldBeVisible();
  }

  @And("^user should see dropdown arrow button$")
  public void userShouldSeeDropdownArrowButton() {
    addJudgingPage.studentArrowButton().shouldBeVisible();
  }

  @When("^user click add student button$")
  public void userClickAddStudentButton() {
    addJudgingPage.addStudentButton().click();
  }

  @Then("^user should see student selection modal$")
  public void userShouldSeeStudentSelectionModal() {
    addJudgingPage.studentSelectionModal().shouldBeVisible();
  }

  @And("^user should see student list data$")
  public void userShouldSeeStudentListData() {
    addJudgingPage.studentSelectList().shouldBeVisible();
  }

  @And("^user should see student select title modal$")
  public void userShouldSeeStudentSelectTitleModal() {
    addJudgingPage.studentSelectLabel().shouldBeVisible();
  }

  @And("^user should see cancel button$")
  public void userShouldSeeCancelButton() {
    addJudgingPage.cancelStudentSelectionButton().shouldBeVisible();
  }

  @And("^user should see save button$")
  public void userShouldSeeSaveButton() {
    addJudgingPage.saveStudentSelectionModalButton().shouldBeVisible();
  }

  @And("^user should see exit button$")
  public void userShouldSeeExitButton() {
    addJudgingPage.exitStudentSelectionModalButton().shouldBeVisible();
  }

  @When("^user click student data with index (\\d+)$")
  public void userClickStudentDataWithIndex(int row) {
    addJudgingPage.studentSelectDetail(row).click();
  }

  @Then("^user should see the checkbox with index (\\d+)$")
  public void userShouldSeeTheCheckboxWithIndexWithValue(int row) throws Throwable {
    assertTrue(addJudgingPage.studentSelectDetailCheckbox(row).isSelected());
  }


  @When("^user click save button$")
  public void userClickSaveButton() {
    addJudgingPage.saveStudentSelectionModalButton().click();
  }

  @Then("^user should not see student selection modal$")
  public void userShouldNotSeeStudentSelectionModal() {
    addJudgingPage.studentSelectionModal().shouldNotBePresent();
  }

  @And("^user should be in add judging page$")
  public void userShouldBeInAddJudgingPage() {
    addJudgingPage.shouldBeDisplayed();
  }

  @And("^user should see student detail in student selection section with index (\\d+)$")
  public void userShouldSeeStudentDetailInStudentSelectionSectionWithIndex(int index) {
    addJudgingPage.studentDetail(index).shouldBeVisible();
  }


  @When("^user click save button in add judging page$")
  public void userClickSaveButtonInAddJudgingPage() {
    addJudgingPage.saveJudgingButton().click();
  }

  @When("^user type \"([^\"]*)\" in title input$")
  public void userTypeInTitleInput(String title) throws Throwable {
    addJudgingPage.titleInput().type(title);
  }

  @And("^user type \"([^\"]*)\" in description input$")
  public void userTypeInDescriptionInput(String description) throws Throwable {
    addJudgingPage.descriptionInput().type(description);
  }
}
