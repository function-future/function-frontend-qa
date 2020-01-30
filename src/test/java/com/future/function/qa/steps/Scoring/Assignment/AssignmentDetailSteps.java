package com.future.function.qa.steps.Scoring.Assignment;

import com.future.function.qa.pages.errors.general.ToastComponent;
import com.future.function.qa.pages.scoring.Assignment.AssignmentDetailPage;
import com.future.function.qa.pages.scoring.Landing.GradesPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AssignmentDetailSteps {

  private AssignmentDetailPage assignmentDetailPage;

  private GradesPage gradesPage;

  private ToastComponent toastComponent;

  @Then("^user should be on assignment detail page$")
  public void userShouldBeOnAssignmentDetailPage() {
    assignmentDetailPage.shouldBeDisplayed();
  }

  @And("^user should see assignment title$")
  public void userShouldSeeAssignmentTitle() {
    assignmentDetailPage.assignmentTitle().shouldBeVisible();
  }

  @And("^user should see assignment description$")
  public void userShouldSeeAssignmentDescription() {
    assignmentDetailPage.assignmentDescription().shouldBeVisible();
  }

  @And("^user should see assignment deadline$")
  public void userShouldSeeAssignmentDeadline() {
    assignmentDetailPage.assignmentDeadline().shouldBeVisible();
  }

  @And("^user should see action section$")
  public void userShouldSeeActionSection() {
    assignmentDetailPage.actionSection().shouldBeVisible();
  }

  @And("^user should see view room list button$")
  public void userShouldSeeViewRoomListButton() {
    assignmentDetailPage.viewRoomBtn().shouldBeVisible();
  }

  @And("^user should see edit assignment button$")
  public void userShouldSeeEditAssignmentButton() {
    assignmentDetailPage.editBtn().shouldBeVisible();
  }

  @And("^user should see delete assignment button$")
  public void userShouldSeeDeleteAssignmentButton() {
    assignmentDetailPage.deleteBtn().shouldBeVisible();
  }
}
