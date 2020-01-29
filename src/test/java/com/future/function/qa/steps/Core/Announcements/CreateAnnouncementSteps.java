package com.future.function.qa.steps.Core.Announcements;

import com.future.function.qa.pages.core.Announcements.CreateAnnouncementPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CreateAnnouncementSteps {

  private CreateAnnouncementPage createAnnouncementPage;

  @Then("^user should be on create announcements page$")
  public void userShouldBeOnCreateAnnouncementPage() {
    createAnnouncementPage.shouldBeDisplayed();
  }

  @When("^user type \"([^\"]*)\" in announcement title input$")
  public void userTypeInAnnouncementTitleInput(String title) {
    createAnnouncementPage.titleInput().clear();
    createAnnouncementPage.titleInput().type(title);
  }

  @And("^user type \"([^\"]*)\" in announcement description input$")
  public void userTypeInAnnouncementDescriptionInput(String title) {
    createAnnouncementPage.descriptionInput().clear();
    createAnnouncementPage.descriptionInput().type(title);
  }

  @And("^user click on save button on edit announcement page$")
  public void userClickOnSaveButton() {
    createAnnouncementPage.saveButton().click();
  }

  @Then("^user should see error message in announcement title input$")
  public void userShouldSeeErrorMessageInAnnouncementTitleInput() {
    createAnnouncementPage.titleInputError().shouldBeVisible();
  }

  @Then("^user should see error message in announcement description input$")
  public void userShouldSeeErrorMessageInAnnouncementDescriptionInput() {
    createAnnouncementPage.descriptionInputError().shouldBeVisible();
  }
}
