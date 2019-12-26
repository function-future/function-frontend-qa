package com.future.function.qa.steps.Core.Courses;

import com.future.function.qa.pages.core.Courses.CoursesPage;
import com.future.function.qa.pages.core.Courses.CreateCoursePage;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCourseSteps {

  private HomePage homePage;
  private CoursesPage coursesPage;
  private CreateCoursePage createCoursePage;

  @Then("^user should be on create course page$")
  public void userShouldBeOnCreateMasterCoursePage() {
    createCoursePage.shouldBeDisplayed();
  }

  @When("^user type \"([^\"]*)\" in course title input in create course page$")
  public void userTypeStringInCourseTitleInputInCreateCoursePage(String title) {
    createCoursePage.titleInput().type(title);
  }

  @When("^user type \"([^\"]*)\" in course description input in create course page$")
  public void userTypeStringInCourseDescriptionInputInCreateCoursePage(String title) {
    createCoursePage.descriptionInput().type(title);
  }

  @And("^user click on save button on create master course page$")
  public void userClickOnSaveButtonOnCreateMasterCoursePage() {
    createCoursePage.saveButton().click();
  }

}
