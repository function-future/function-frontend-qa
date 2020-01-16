package com.future.function.qa.steps.Core.Courses;

import com.future.function.qa.components.ModalShareCourse;
import com.future.function.qa.pages.core.Courses.CoursesPage;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class CoursesSteps {

  private HomePage homePage;
  private CoursesPage coursesPage;
  private ModalShareCourse modalShareCourse;

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

  @And("^user should be on courses page with tab index (\\d+)$")
  public void userShouldBeOnMasterCoursesTab(int index) {
    assertTrue(coursesPage.coursesTabs(index).getAttribute("class").contains("is-active"));
  }

  @When("^user click on add button on courses page$")
  public void userClickOnAddButtonOnCoursesPage() {
    coursesPage.addButton().shouldBeVisible();
    coursesPage.addButton().click();
  }

  @When("^user click on an course more button on tab index (\\d+) on courses page in row number (\\d+)$")
  public void userClickOnCourseMoreButtonOnTabIndexOnRow(int tabIndex, int row) {
    coursesPage.findMasterCourseOrCourseMoreButtonOnTabIndexOnRow(tabIndex, row).shouldBeVisible();
    coursesPage.findMasterCourseOrCourseMoreButtonOnTabIndexOnRow(tabIndex, row).click();
  }

  @Then("^user should see dropdown action of the course in tab index (\\d+) in row number (\\d+)$")
  public void userShouldSeeDropdownActionOfCourseOnTabIndexOnRow(int tabIndex, int row) {
    coursesPage.findMasterCourseOrCourseDropdownActionOnTabIndexOnRow(tabIndex, row).shouldBeVisible();
  }

  @When("^user click on button on index (\\d+) on course dropdown action in row number (\\d+) on tab index (\\d+)$")
  public void userClickOnDeleteButtonOnCourseDropdownOnTabIndexOnRowOnIndex(int index, int row, int tabIndex) {
    coursesPage.findActionOnMasterCourseOrCourseDropdownOnTabIndexOnRowOnIndex(tabIndex, row, index).shouldBeVisible();
    coursesPage.findActionOnMasterCourseOrCourseDropdownOnTabIndexOnRowOnIndex(tabIndex, row, index).click();
  }

  @And("^user should see courses tab on index (\\d+)$")
  public void userShouldSeeCoursesTabOnIndex(int index) {
    coursesPage.coursesTabs(index).shouldBeVisible();
  }

  @And("^user click on courses tab on index (\\d+)$")
  public void userClickOnCoursesTabOnIndex(int index) {
    coursesPage.coursesTabs(index).click();
  }

  @Then("^user should see share course modal$")
  public void userShouldSeeShareCourseModal() {
    modalShareCourse.modalDialog().shouldBeVisible();
  }

  @When("^user click on batch on share course modal on row (\\d+)$")
  public void userClickOnBatchOnShareCourseModalOnRow(int row) {
    modalShareCourse.findBatchOnRow(row).click();
  }

  @Then("^batch radio button on row (\\d+) should be selected$")
  public void batchRadioButtonOnRowShouldBeSelected(int row) {
    modalShareCourse.findBatchRadioButtonOnRow(row).isSelected();
  }

  @When("^user click on share button on share course modal$")
  public void userClickOnShareButtonOnShareCourseModal() {
    modalShareCourse.shareButton().isEnabled();
    modalShareCourse.shareButton().click();
  }

  @And("^user should not be able to see add button on courses page$")
  public void userShouldNotSeeAddButton() {
    coursesPage.addButton().shouldNotBeVisible();
  }

}
