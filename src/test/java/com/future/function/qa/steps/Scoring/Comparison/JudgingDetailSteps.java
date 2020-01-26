package com.future.function.qa.steps.Scoring.Comparison;

import com.future.function.qa.pages.scoring.Comparison.JudgingDetailPage;
import com.future.function.qa.pages.scoring.Comparison.JudgingListPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.assertEquals;

@Slf4j
public class JudgingDetailSteps {

  private JudgingDetailPage judgingDetailPage;

  private JudgingListPage judgingListPage;

  private String titleText;
  private String descriptionText;

  @Then("^user should be in final judging detail page$")
  public void userShouldBeInFinalJudgingDetailPage() {
    judgingDetailPage.shouldBeDisplayed();
  }

  @When("^user get title label in the data in row number (\\d+)$")
  public void userGetTitleLabelInTheDataInRowNumber(int row) {
    titleText = judgingListPage.judgingDataTitle(row).getText();
  }

  @And("^user get description label in the data in row number (\\d+)$")
  public void userGetDescriptionLabelInTheDataInRowNumber(int row) {
    descriptionText = judgingListPage.judgingDataDescription(row).getText();
  }

  @And("^user should see title label with text the same as the stored title$")
  public void userShouldSeeTitleLabelWithTextTheSameAsTheDataInRowNumber() {
    log.info("title stored: " + titleText);
    assertEquals(judgingDetailPage.titleLabel().getText(), titleText);
  }

  @And("^user should see description label with text the same as the stored description$")
  public void userShouldSeeDescriptionLabelWithTextTheSameAsTheStoredDescription() {
    assertEquals(judgingDetailPage.descriptionLabel().getText(), descriptionText);
  }

  @And("^user should see student list section$")
  public void userShouldSeeStudentListSection() {
    judgingDetailPage.studentList().shouldBeVisible();
  }

  @And("^user should see action bar$")
  public void userShouldSeeActionBar() {
    judgingDetailPage.actionBar().shouldBeVisible();
  }
}
