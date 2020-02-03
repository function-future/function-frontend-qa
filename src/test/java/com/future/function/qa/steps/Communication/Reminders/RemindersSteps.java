package com.future.function.qa.steps.Communication.Reminders;

import com.future.function.qa.pages.communication.Reminder.ReminderCreatePage;
import com.future.function.qa.pages.communication.Reminder.ReminderDetailPage;
import com.future.function.qa.pages.communication.Reminder.ReminderEditPage;
import com.future.function.qa.pages.communication.Reminder.RemindersPage;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class RemindersSteps {

  private ReminderDetailPage reminderDetailPage;

  private RemindersPage remindersPage;

  private ReminderEditPage reminderEditPage;

  private ReminderCreatePage reminderCreatePage;

  private HomePage homePage;

  @And("^user should see reminders menu on row (\\d+)$")
  public void userShouldSeeRemindersMenuOnRow(int row) {
    homePage.findMenuWithIndex(row).shouldBeVisible();
  }

  @When("^user click reminders menu on row (\\d+)$")
  public void userClickRemindersMenuOnRow(int row) {
    homePage.findMenuWithIndex(row).click();
  }

  @Then("^user should be on reminders page$")
  public void userShouldBeOnRemindersPage() {
    remindersPage.shouldBeDisplayed();
  }

  @When("^user click create reminder button on reminders page$")
  public void userClickCreateReminderButtonOnRemindersPage() {
    remindersPage.createButton().click();
  }

  @Then("^user should be on reminder create page$")
  public void userShouldBeOnReminderCreatePage() {
    reminderCreatePage.shouldBeDisplayed();
  }

  @When("^user click on add new members button$")
  public void userClickOnAddNewMembersButton() {
    reminderCreatePage.addMemberButton().click();
  }

  @Then("^add member modal should be visible$")
  public void addMemberModalShouldBeVisible() {
    reminderCreatePage.addMemberModal().shouldBeVisible();
  }

  @When("^user click first member$")
  public void userClickFirstMember() {
    reminderCreatePage.memberModalCard(1).click();
  }

  @Then("^members should be successfully added$")
  public void membersShouldBeSuccessfullyAdded() {
    reminderCreatePage.member(1).shouldBeVisible();
  }

  @When("^user fill title and description with \"([^\"]*)\" and \"([^\"]*)\"$")
  public void userFillTitleAndDescriptionWithAnd(String title, String description) throws Throwable {
    reminderCreatePage.titleInput().type(title);
    reminderCreatePage.descriptionInput().type(description);
  }

  @And("^user click save create reminder button$")
  public void userClickSaveCreateReminderButton() {
    reminderCreatePage.saveButton().click();
  }

  @When("^user click delete reminder$")
  public void userClickDeleteReminder() {
    remindersPage.deleteButton(1).click();
  }

  @And("^user should be in reminder detail page$")
  public void userShouldBeInReminderDetailPage() {
    reminderDetailPage.shouldBeDisplayed();
  }

  @Then("^user should see first reminder card with title \"([^\"]*)\" and description \"([^\"]*)\"$")
  public void userShouldSeeFirstReminderCardWithTitleAndDescription(String title, String description) throws Throwable {
    assertThat(remindersPage.reminderTitle(1).getText(), equalTo(title));
    assertThat(remindersPage.reminderDescription(1).getText(), equalTo(description));
  }

  @When("^user click a reminder card$")
  public void userClickAReminderCard() {
    remindersPage.reminderBox(1).click();
  }

  @When("^user click edit button in reminder detail page$")
  public void userClickEditButtonInReminderDetailPage() {
    reminderDetailPage.editButton().click();
  }

  @Then("^user should be in reminder edit page$")
  public void userShouldBeInReminderEditPage() {
    reminderEditPage.shouldBeDisplayed();
  }

  @When("^user change title to \"([^\"]*)\" and description to \"([^\"]*)\"$")
  public void userChangeTitleToAndDescriptionTo(String title, String description) throws Throwable {
    reminderEditPage.titleInput().type(title);
    reminderEditPage.descriptionInput().type(description);
  }

  @And("^user click save edit reminder button$")
  public void userClickSaveEditReminderButton() {
    reminderEditPage.saveButton().click();
  }
}
