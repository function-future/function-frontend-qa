package com.future.function.qa.steps.Scoring.Comparison;

import com.future.function.qa.pages.core.HomePage;
import com.future.function.qa.pages.scoring.Comparison.JudgingListPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class JudgingListSteps {

  private JudgingListPage judgingListPage;

  private HomePage homePage;

  @Given("^user access function website$")
  public void userAccessFunctionWebsite() {
    homePage.open();
  }

  @And("^user should not see comparisons menu with index (\\d+)$")
  public void userShouldNotSeeComparisonsMenu(int menuIndex) {
    homePage.comparisonsMenu(menuIndex).shouldNotBePresent();
  }

  @When("^user should see comparisons menu with index (\\d+)$")
  public void userSeeComparisonsMenu(int menuIndex) {
    homePage.comparisonsMenu(menuIndex).shouldBeVisible();
  }

  @When("^user click comparisons menu with index (\\d+)$")
  public void userClickComparisonsMenu(int menuIndex) {
    homePage.comparisonsMenu(menuIndex).click();
  }

  @Then("^user should see judging data list$")
  public void userShouldSeeJudgingDataList() {
    judgingListPage.findJudgingDataList().shouldBeVisible();
  }

  @And("^user should see add judging button$")
  public void userShouldSeeAddJudgingButton() {
    judgingListPage.addJudgingButton().shouldBeVisible();
  }

  @And("^user should see view final score button$")
  public void userShouldSeeViewFinalScoreButton() {
    judgingListPage.findViewFinalScoreButton().shouldBeVisible();
  }

  @And("^user should see select batch dropdown$")
  public void userShouldSeeSelectBatchDropdown() {
    judgingListPage.findSelectBatchDropdown().shouldBeVisible();
  }

  @And("^user should see paging section$")
  public void userShouldSeePagingSection() {
    judgingListPage.findPageComponent().shouldBeVisible();
  }

  @Then("^user should be in final judging page$")
  public void userShouldBeInFinalJudgingPage() {
    judgingListPage.shouldBeDisplayed();
  }

  @And("^user should see menu bar$")
  public void userShouldSeeMenuBar() {
    judgingListPage.menuBar().shouldBeVisible();
  }

  @When("^user click judging data list in row number (\\d+)$")
  public void userClickJudgingDataListInRowNumber(int row) {
    judgingListPage.findJudgingData(row).shouldBeVisible();
    judgingListPage.findJudgingData(row).click();
  }
}
