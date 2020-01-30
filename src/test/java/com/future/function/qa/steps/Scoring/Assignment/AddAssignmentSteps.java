package com.future.function.qa.steps.Scoring.Assignment;

import com.future.function.qa.pages.scoring.Assignment.AddAssignmentPage;
import com.future.function.qa.pages.scoring.Landing.GradesPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAssignmentSteps {

  private AddAssignmentPage addAssignmentPage;

  private GradesPage gradesPage;

  @Then("^user should be on add assignment page$")
  public void userShouldBeOnAddAssignmentPage() {
    addAssignmentPage.shouldBeDisplayed();
  }

  @And("^user should see assignment title form$")
  public void userShouldSeeAssignmentTitleForm() {
    addAssignmentPage.assignmentTitleForm().shouldBeVisible();
  }

  @And("^user should see assignment title input$")
  public void userShouldSeeAssignmentTitleInput() {
    addAssignmentPage.assignmentTitleInput().shouldBeVisible();
  }

  @And("^user should see assignment description form$")
  public void userShouldSeeAssignmentDescriptionForm() {
    addAssignmentPage.assignmentDescriptionForm().shouldBeVisible();
  }

  @And("^user should see assignment description input$")
  public void userShouldSeeAssignmentDescriptionInput() {
    addAssignmentPage.assignmentDescriptionInput().shouldBePresent();
  }

  @And("^user should see assignment deadline form$")
  public void userShouldSeeAssignmentDeadlineForm() {
    addAssignmentPage.assignmentDeadlineForm().shouldBeVisible();
  }

  @And("^user should see assignment deadline input$")
  public void userShouldSeeAssignmentDeadlineInput() {
    addAssignmentPage.assignmentDeadlineInput().shouldBeVisible();
  }

  @And("^user should see assignment upload form$")
  public void userShouldSeeAssignmentUploadForm() {
    addAssignmentPage.assignmentUploadForm().shouldBeVisible();
  }

  @And("^user should see assignment upload input$")
  public void userShouldSeeAssignmentUploadInput() {
    addAssignmentPage.assignmentUploadInput().shouldBePresent();
  }

  @And("^user should see assignment action section$")
  public void userShouldSeeAssignmentActionSection() {
    addAssignmentPage.actionSection().shouldBeVisible();
  }

  @And("^user should see assignment save button$")
  public void userShouldSeeAssignmentSaveButton() {
    addAssignmentPage.saveBtn().shouldBeVisible();
  }

  @And("^user should see assignment cancel button$")
  public void userShouldSeeAssignmentCancelButton() {
    addAssignmentPage.cancelBtn().shouldBeVisible();
  }

  @When("^user type \"([^\"]*)\" in assignment title input$")
  public void userTypeInAssignmentTitleInput(String title) throws Throwable {
    addAssignmentPage.assignmentTitleInput().type(title);
  }

  @And("^user type \"([^\"]*)\" in assignment description input$")
  public void userTypeInAssignmentDescriptionInput(String description) throws Throwable {
    addAssignmentPage.assignmentDescriptionInput().type(description);
  }

  @And("^user click assignment save button$")
  public void userClickAssignmentSaveButton() {
    addAssignmentPage.saveBtn().click();
  }
}
