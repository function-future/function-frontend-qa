package com.future.function.qa.steps.Scoring.Comparison;

import com.future.function.qa.pages.scoring.JudgingDetailPage;
import com.future.function.qa.pages.scoring.JudgingListPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JudgingDetailSteps {

  private JudgingDetailPage judgingDetailPage;

  private JudgingListPage judgingListPage;

  private String titleText;
  private String descriptionText;
  private String batchText;

  @Then("^user should be in final judging detail page$")
  public void userShouldBeInFinalJudgingDetailPage() {
    judgingDetailPage.shouldBeDisplayed();
  }

  @When("^user get title label in the data in row number (\\d+)$")
  public void userGetTitleLabelInTheDataInRowNumber(int row) {

  }
}
