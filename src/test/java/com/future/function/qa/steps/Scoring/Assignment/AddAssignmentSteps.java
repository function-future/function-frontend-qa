package com.future.function.qa.steps.Scoring.Assignment;

import com.future.function.qa.pages.scoring.Assignment.AssignmentFormPage;
import com.future.function.qa.pages.scoring.Landing.GradesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAssignmentSteps {

  private AssignmentFormPage assignmentFormPage;

  private GradesPage gradesPage;

  @Then("^user should be on add assignment page$")
  public void userShouldBeOnAddAssignmentPage() {
    assignmentFormPage.shouldBeDisplayed();
  }

  @And("^user should see assignment title form$")
  public void userShouldSeeAssignmentTitleForm() {
    assignmentFormPage.assignmentTitleForm().shouldBeVisible();
  }

  @And("^user should see assignment title input$")
  public void userShouldSeeAssignmentTitleInput() {
    assignmentFormPage.assignmentTitleInput().shouldBeVisible();
  }

  @And("^user should see assignment description form$")
  public void userShouldSeeAssignmentDescriptionForm() {
    assignmentFormPage.assignmentDescriptionForm().shouldBeVisible();
  }

  @And("^user should see assignment description input$")
  public void userShouldSeeAssignmentDescriptionInput() {
    assignmentFormPage.assignmentDescriptionInput().shouldBePresent();
  }

  @And("^user should see assignment deadline form$")
  public void userShouldSeeAssignmentDeadlineForm() {
    assignmentFormPage.assignmentDeadlineForm().shouldBeVisible();
  }

  @And("^user should see assignment deadline input$")
  public void userShouldSeeAssignmentDeadlineInput() {
    assignmentFormPage.assignmentDeadlineInput().shouldBeVisible();
  }

  @And("^user should see assignment upload form$")
  public void userShouldSeeAssignmentUploadForm() {
    assignmentFormPage.assignmentUploadForm().shouldBeVisible();
  }

  @And("^user should see assignment upload input$")
  public void userShouldSeeAssignmentUploadInput() {
    assignmentFormPage.assignmentUploadInput().shouldBePresent();
  }

  @And("^user should see assignment action section$")
  public void userShouldSeeAssignmentActionSection() {
    assignmentFormPage.actionSection().shouldBeVisible();
  }

  @And("^user should see assignment save button$")
  public void userShouldSeeAssignmentSaveButton() {
    assignmentFormPage.saveBtn().shouldBeVisible();
  }

  @And("^user should see assignment cancel button$")
  public void userShouldSeeAssignmentCancelButton() {
    assignmentFormPage.cancelBtn().shouldBeVisible();
  }

  @When("^user type \"([^\"]*)\" in assignment title input$")
  public void userTypeInAssignmentTitleInput(String title) throws Throwable {
    assignmentFormPage.assignmentTitleInput().type(title);
  }

  @And("^user type \"([^\"]*)\" in assignment description input$")
  public void userTypeInAssignmentDescriptionInput(String description) throws Throwable {
    assignmentFormPage.assignmentDescriptionInput().type(description);
  }

  @And("^user click assignment save button$")
  public void userClickAssignmentSaveButton() {
    assignmentFormPage.saveBtn().click();
  }
}
