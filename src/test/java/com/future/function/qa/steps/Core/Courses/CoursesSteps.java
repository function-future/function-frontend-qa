package com.future.function.qa.steps.Core.Courses;

import com.future.function.qa.pages.core.Courses.CoursesPage;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class CoursesSteps {

  private HomePage homePage;
  private CoursesPage coursesPage;

  @Then("^user should be on courses page$")
  public void userShouldBeOnCoursesPage() {
    coursesPage.shouldBeDisplayed();
  }

  @And("^user should see courses menu on row (\\d+)$")
  public void userSeeCoursesMenu(int row) {
    homePage.findMenuWithIndex(row).shouldBeVisible();
  }

  @When("^user click courses menu on row (\\d+)$")
  public void userClickCoursesMenu(int row) {
    homePage.findMenuWithIndex(row).click();
  }

  @And("^user should be on master courses tab on index (\\d+)$")
  public void userShouldBeOnMasterCoursesTab(int index) {
    assertTrue(coursesPage.coursesTabs(index).getAttribute("class").contains("is-active"));
  }

  @When("^user click on add button on courses page$")
  public void userClickOnAddButtonOnCoursesPage() {
    coursesPage.addButton().shouldBeVisible();
    coursesPage.addButton().click();
  }

}
