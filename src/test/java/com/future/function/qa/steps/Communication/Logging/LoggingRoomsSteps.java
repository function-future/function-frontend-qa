package com.future.function.qa.steps.Communication.Logging;

import com.future.function.qa.pages.communication.logging.*;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Author: RickyKennedy
 * Created At:5:30 PM 2/5/2020
 */
public class LoggingRoomsSteps {

  private LoggingRoomsPage loggingRoomsPage;

  private LoggingRoomsCreatePage loggingRoomsCreatePage;

  private LoggingRoomsEditPage loggingRoomsEditPage;

  private LoggingRoomsDetailPage loggingRoomsDetailPage;

  private LoggingRoomTopicDetailPage loggingRoomTopicDetailPage;

  private HomePage homePage;

  @And("^user should see logging room menu on row (\\d+)$")
  public void userShouldSeeLoggingRoomMenuOnRow(int row) {
    homePage.findMenuWithIndex(row).shouldBeVisible();
  }

  @When("^user click logging room menu on row (\\d+)$")
  public void userClickLoggingRoomMenuOnRow(int row) {
    homePage.findMenuWithIndex(row).click();
  }

  @Then("^user should be on logging rooms page$")
  public void userShoulBeOnLoggingRoomPage() {
    loggingRoomsPage.shouldBeDisplayed();
  }

  @When("^user click add logging room button$")
  public void userClickAddLoggingRoom(){
    loggingRoomsPage.addButton().click();
  }

  @Then("^user should be on logging room create page$")
  public void userShouldBeOnLoggingRoomCreatePage() {
    loggingRoomsCreatePage.shouldBeDisplayed();
  }

  @And("^user type \"([^\"]*)\" in title input on logging room create page$")
  public void userTypeTitleInTitleInput(String title) {
    loggingRoomsCreatePage.titleInput().type(title);
  }

  @And("^user type \"([^\"]*)\" in description input on logging room create page$")
  public void userTypeDescriptionInTitleInput(String description){
    loggingRoomsCreatePage.descriptionInput().type(description);
  }

  @When("^user click add member modal logging room$")
  public void userClickAddMember(){
    loggingRoomsCreatePage.addMemberButton().click();
  }

  @Then("^add member modal should be showed$")
  public void userShowMemberModal(){
    loggingRoomsCreatePage.addMemberModal().shouldBeVisible();
  }

  @And("^user click member logging room$")
  public void userClickMember(){
    loggingRoomsCreatePage.memberCardOnModal().click();
  }

  @And("^user click save on logging room create page$")
  public void userClickSaveLoggingRoomPage() {
    loggingRoomsCreatePage.saveButton().click();
  }

  @Then("^logging room card should be visible$")
  public void loggingRoomCardShouldBeVisible(){
    loggingRoomsPage.firstLoggingRoomCard().shouldBeCurrentlyVisible();
  }

  @Then("^logging room title should be \"([^\"]*)\"$")
  public void titleLoggingRoomShouldBe(String title){
    loggingRoomsPage.loggingRoomFirstTitle().getText().equals(title);
  }

  @Then("^logging room description should be \"([^\"]*)\"$")
  public void descriptionLoggingRoomShouldBe(String description){
    loggingRoomsPage.loggingRoomFirstDescription().getText().equals(description);
  }

  @When("^user click edit first logging room$")
  public void userClickEditButton() {
    loggingRoomsPage.editButtonFirstLoggingRoomCard().click();
  }

  @Then("^user should be on logging room edit page$")
  public void userShouldBeOnLoggingRoomEditPage() {
    loggingRoomsEditPage.shouldBeDisplayed();
  }

  @And("^user type \"([^\"]*)\" in title input and \"([^\"]*)\" in description input on logging room edit page$")
  public void userTypeTitleAndDescriptionOnLoggingRoomEdit(String title, String description) {
    loggingRoomsEditPage.titleInput().type(title);
    loggingRoomsEditPage.descriptionInput().type(description);
  }

  @When("^user click save on logging room edit page$")
  public void userSaveLoggingRoomEdited(){
    loggingRoomsEditPage.saveButton().click();
  }

  @When("^user click first logging room card$")
  public void userClickFirstLoggingRoom(){
    loggingRoomsPage.firstLoggingRoomCard().click();
  }

  @Then("^user should be on logging room detail page$")
  public void userShoulBeOnLoggingRoomDetailPage(){
    loggingRoomsDetailPage.shouldBeDisplayed();
  }

  @When("^user click add topic button")
  public void userClickAddTopicButton() {
    loggingRoomsDetailPage.addTopicButton().click();
  }

  @Then("^add topic modal should be displayed$")
  public void addTopicModalShouldBeDisplayed(){
    loggingRoomsDetailPage.addTopicModal().shouldBeCurrentlyVisible();
  }

  @And("^user input \"([^\"]*)\" as topic title$")
  public void userTypeTopiOnAddTopicModal(String title){
    loggingRoomsDetailPage.topicInput().type(title);
  }

  @When("^user click submit topic on logging room detail$")
  public void userClickSubmitOnLoggingRoomDetail(){
    loggingRoomsDetailPage.topicSubmitButton().click();
  }

  @When("^user click topic number (\\d+)$")
  public void userClickTopicNumber(int idx){
    loggingRoomsDetailPage.firstTopicCard(idx).click();
  }

  @Then("^user should be on topic detail page$")
  public void userShouldBeOnTopicDetailPage(){
    loggingRoomTopicDetailPage.shouldBeDisplayed();
  }

  @And("^user type \"([^\"]*)\" in log message input on topic detail page$")
  public void userTypeLogInLogMessageInput(String log) {
    loggingRoomTopicDetailPage.logInput().type(log);
  }

  @When("^user click send log message$")
  public void userClickSendLogMessage(){
    loggingRoomTopicDetailPage.sendButton().click();
  }
}
