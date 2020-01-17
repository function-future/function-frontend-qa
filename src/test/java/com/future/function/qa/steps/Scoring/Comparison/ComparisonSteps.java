package com.future.function.qa.steps.Scoring.Comparison;

import com.future.function.qa.pages.scoring.JudgingDetailPage;
import com.future.function.qa.pages.scoring.JudgingListPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ComparisonSteps {

  private JudgingListPage judgingListPage;

  private JudgingDetailPage judgingDetailPage;

  @When("^user click the last final judging data$")
  public void userClickTheLastFinalJudgingData() {
    int lastIndex = judgingListPage.countJudgingDataList();
    judgingListPage.findJudgingData(lastIndex).click();
  }

  @And("^user should see (\\d+) student detail in student list section$")
  public void userShouldSeeStudentDetailInStudentListSection(int expectedSize) {
    assertEquals(judgingDetailPage.countStudentDetailList(), expectedSize);
  }

  @And("^tab with index (\\d+) in student detail number (\\d+) should have class \"([^\"]*)\"$")
  public void tabWithIndexInStudentDetailNumberShouldHaveClass(int tabIndex, int studentIndex, String clazz)
      throws Throwable {
    assertEquals(judgingDetailPage.studentScoreDetailTabs(studentIndex, tabIndex).getAttribute("class"), clazz);
  }

  @When("^user click tab with index (\\d+) in student detail number (\\d+)$")
  public void userClickTabWithIndexInStudentDetailNumber(int tabIndex, int studentIndex) {
    judgingDetailPage.studentScoreDetailTabs(studentIndex, tabIndex).click();
  }

  @When("^user input (\\d+) as final score in student detail number (\\d+)$")
  public void userInputAsFinalScoreInStudentDetailNumber(int score, int studentIndex) {
    judgingDetailPage.studentFinalScoreDetailInput(studentIndex).type(String.valueOf(score));
  }

  @And("^user click submit final score button in student detail number (\\d+)$")
  public void userClickSubmitFinalScoreButtonInStudentDetailNumber(int studentIndex) {
    judgingDetailPage.studentFinalScoreDetailButton(studentIndex).click();
  }

  @Then("^user should see (\\d+) as final score in student detail number (\\d+)$")
  public void userShouldSeeAsFinalScoreInStudentDetailNumber(int score, int studentIndex) {
    assertEquals(judgingDetailPage.studentFinalScoreDetailInput(studentIndex).getValue(), String.valueOf(score));
  }
}
