package com.future.function.qa.steps.Scoring.Comparison;

import com.future.function.qa.pages.scoring.Comparison.JudgingDetailPage;
import com.future.function.qa.pages.scoring.Comparison.JudgingFormPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class EditJudgingSteps {

  private JudgingFormPage judgingFormPage;

  private JudgingDetailPage judgingDetailPage;

  @And("^user should see edit judging button$")
  public void userShouldSeeEditJudgingButton() {
    judgingDetailPage.editBtn().shouldBeVisible();
  }

  @When("^user click edit judging button$")
  public void userClickEditJudgingButton() {
    judgingDetailPage.editBtn().click();
  }

  @When("^user re-type \"([^\"]*)\" in title input$")
  public void userReTypeInTitleInput(String title) {
    judgingFormPage.titleInput().clear();
    judgingFormPage.titleInput().type(title);
  }

  @And("^user re-type \"([^\"]*)\" in description input$")
  public void userReTypeInDescriptionInput(String description) {
    judgingFormPage.descriptionInput().clear();
    judgingFormPage.descriptionInput().type(description);
  }
}
