package com.future.function.qa.steps.Scoring.Assignment;

import com.future.function.qa.pages.scoring.Assignment.AssignmentDetailPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class DeleteAssignmentSteps {

    private AssignmentDetailPage assignmentDetailPage;

    @When("^user click delete assignment button$")
    public void userClickDeleteAssignmentButton() {
        assignmentDetailPage.deleteBtn().click();
    }

    @And("^user should see delete confirmation text \"([^\"]*)\"$")
    public void userShouldSeeDeleteConfirmationText(String confirmationText) {
        assignmentDetailPage.deleteModalBody().find(By.tagName("div")).shouldContainText(confirmationText);
    }

    @And("^user should see close modal button$")
    public void userShouldSeeCloseModalButton() {
        assignmentDetailPage.closeModalBtn().shouldBeVisible();
    }

    @And("^user should see cancel delete button$")
    public void userShouldSeeCancelDeleteButton() {
        assignmentDetailPage.cancelBtn().shouldBeVisible();
    }

    @And("^user should see delete confirmation button$")
    public void userShouldSeeDeleteConfirmationButton() {
        assignmentDetailPage.deleteConfirmBtn().shouldBeVisible();
    }

    @When("^user click delete confirmation button$")
    public void userClickDeleteConfirmationButton() {
        assignmentDetailPage.deleteConfirmBtn().click();
    }

    @When("^user click cancel delete button$")
    public void userClickCancelDeleteButton() {
        assignmentDetailPage.cancelBtn().click();
    }

    @When("^user click close modal button$")
    public void userClickCloseModalButton() {
        assignmentDetailPage.closeModalBtn().click();
    }
}
