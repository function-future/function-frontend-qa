package com.future.function.qa.steps.Scoring.Comparison;

import com.future.function.qa.pages.scoring.Comparison.JudgingDetailPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class DeleteJudgingSteps {

  private JudgingDetailPage judgingDetailPage;

  @And("^user should see delete judging button$")
  public void userShouldSeeDeleteJudgingButton() {
    judgingDetailPage.deleteBtn().shouldBeVisible();
  }

  @When("^user click delete judging button$")
  public void userClickDeleteJudgingButton() {
    judgingDetailPage.deleteBtn().click();
  }
}
