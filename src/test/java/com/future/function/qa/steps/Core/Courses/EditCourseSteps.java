package com.future.function.qa.steps.Core.Courses;

import com.future.function.qa.pages.core.Courses.EditCoursePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditCourseSteps {

  private EditCoursePage editCoursePage;

  @Then("^user should be on edit course page$")
  public void userShouldBeOnEditCoursePage() {
    editCoursePage.shouldBeDisplayed();
  }

  @When("^user type \"([^\"]*)\" in course title input in edit course page$")
  public void userTypeStringInCourseTitleInputInCreateCoursePage(String title) {
    editCoursePage.titleInput().type(title);
  }

  @When("^user type \"([^\"]*)\" in course description input in edit course page$")
  public void userTypeStringInCourseDescriptionInputInCreateCoursePage(String title) {
    editCoursePage.descriptionInput().type(title);
  }

  @And("^user click on save button on edit course page$")
  public void userClickOnSaveButtonOnCreateMasterCoursePage() {
    editCoursePage.saveButton().click();
  }


}
