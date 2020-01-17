package com.future.function.qa.steps.Core.Courses;

import com.future.function.qa.pages.core.Courses.CoursesPage;
import com.future.function.qa.pages.core.Courses.CreateCoursePage;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.*;

public class CreateCourseSteps {

  private HomePage homePage;
  private CoursesPage coursesPage;
  private CreateCoursePage createCoursePage;
  private String randomString = getSaltString(6);

  @Then("^user should be on create course page$")
  public void userShouldBeOnCreateMasterCoursePage() {
    createCoursePage.shouldBeDisplayed();
  }

  @When("^user type \"([^\"]*)\" in course title input in create course page$")
  public void userTypeStringInCourseTitleInputInCreateCoursePage(String title) {
    createCoursePage.titleInput().type(title + randomString);
  }

  @When("^user type \"([^\"]*)\" in course description input in create course page$")
  public void userTypeStringInCourseDescriptionInputInCreateCoursePage(String title) {
    createCoursePage.descriptionInput().type(title + randomString);
  }

  @And("^user click on save button on create master course page$")
  public void userClickOnSaveButtonOnCreateMasterCoursePage() {
    createCoursePage.saveButton().click();
  }

  private String getSaltString(int length) {
    String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    StringBuilder salt = new StringBuilder();
    Random rnd = new Random();
    while (salt.length() < length) {
      int index = (int) (rnd.nextFloat() * string.length());
      salt.append(string.charAt(index));
    }
    return salt.toString();
  }
}
