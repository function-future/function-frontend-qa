package com.future.function.qa.steps.Scoring.Assignment;

import com.future.function.qa.pages.scoring.Assignment.AssignmentDetailPage;
import com.future.function.qa.pages.scoring.Assignment.AssignmentFormPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.util.Objects;

import static junit.framework.TestCase.assertTrue;

public class EditAssignmentSteps {

    private AssignmentDetailPage assignmentDetailPage;

    private AssignmentFormPage assignmentFormPage;

    @When("^user click edit assignment button$")
    public void userClickEditAssignmentButton() {
        assignmentDetailPage.editBtn().click();
    }

    @Then("^user should be in edit assignment page$")
    public void userShouldBeInEditAssignmentPage() {
        assignmentFormPage.shouldBeDisplayed();
    }

    @And("^user should see text inside assignment title input$")
    public void userShouldSeeTextInsideAssignmentTitleInput() {
        String text = assignmentFormPage.assignmentTitleInput().getValue();
        assertTrue(Objects.nonNull(text));
    }

    @And("^user should see text inside assignment description input$")
    public void userShouldSeeTextInsideAssignmentDescriptionInput() {
        String text = assignmentFormPage.assignmentDescriptionInput().findBy(By.tagName("p")).getText();
        assertTrue(Objects.nonNull(text));
    }

    @When("^user remove text from assignment title input$")
    public void userRemoveTextFromAssignmentTitleInput() {
        assignmentFormPage.assignmentTitleInput().clear();
    }

    @And("^user remove text from assignment description input$")
    public void userRemoveTextFromAssignmentDescriptionInput() {
        assignmentFormPage.assignmentDescriptionInput().clear();
    }

    @And("^user should not see edit assignment button$")
    public void userShouldNotSeeEditAssignmentButton() {
        assignmentDetailPage.editBtn().shouldNotBeVisible();
    }
}
