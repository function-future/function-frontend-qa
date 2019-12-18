package com.future.function.qa.steps.Core.Announcements;

import com.future.function.qa.components.ModalDeleteConfirmation;
import com.future.function.qa.pages.core.Announcements.AnnouncementDetailPage;
import com.future.function.qa.pages.core.Announcements.AnnouncementsPage;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.assertEquals;

@Slf4j
public class AnnouncementDetailSteps {

    private HomePage homePage;
    private AnnouncementDetailPage announcementDetailPage;
    private AnnouncementsPage announcementsPage;
    private ModalDeleteConfirmation modalDeleteConfirmation;
    private String storedTitleText;

    @Then("^user should be on announcement detail page$")
    public void userShouldBeOnAnnouncementDetailPage() {
        announcementDetailPage.shouldBeDisplayed();
    }

    @And("^user remembers announcement title on feeds in row number (\\d+)$")
    public void userRemembersAnnouncementTitleOnFeedWithIndex(int row) {
        homePage.findAnnouncement(row).shouldBeVisible();
        storedTitleText = homePage.findAnnouncementTitle(row).getText();
        log.info("title stored: " + storedTitleText);
    }

    @When("^user click on an announcement on feeds in row number (\\d+)$")
    public void userClickOnAnnouncementOnFeedsWithIndex(int row) {
        homePage.findAnnouncement(row).click();
    }

    @Then(("^user should see announcement title is the same$"))
    public void userShouldSeeAnnouncementTitleIsTheSameAsDisplayedOnFeeds() {
        log.info("title stored: " + storedTitleText);
        assertEquals(announcementDetailPage.title().getText(), storedTitleText);
    }

    @And("^user should see announcements menu$")
    public void userSeeAnnouncementsMenu() {
        homePage.findMenuWithIndex(2).shouldBeVisible();
    }

    @When("^user click announcements menu$")
    public void userClickAnnouncementsMenu() {
        homePage.findMenuWithIndex(2).click();
    }

    @When("^user click on add button on announcements page$")
    public void userClickAddButtonOnAnnouncementsPage() {
        announcementsPage.addButton().shouldBeVisible();
        announcementsPage.addButton().click();
    }

    @And("^user remembers announcement title on announcements page in row number (\\d+)$")
    public void userRemembersAnnouncementTitleOnAnnouncementsWithIndex(int row) {
        announcementsPage.findAnnouncement(row).shouldBeVisible();
        storedTitleText = announcementsPage.findAnnouncementTitle(row).getText();
        log.info("title stored: " + storedTitleText);
    }

    @And("^user click on an announcement on announcements page in row number (\\d+)$")
    public void userClickOnAnnouncementOnAnnouncementsWithIndex(int row) {
        announcementsPage.findAnnouncement(row).shouldBeVisible();
        announcementsPage.findAnnouncement(row).click();
    }

    @When("^user click on delete button on announcement detail page$")
    public void userClickDeleteButtonOnAnnouncementDetailPage() {
      announcementDetailPage.deleteButton().shouldBeVisible();
      announcementDetailPage.deleteButton().click();
    }

    @Then("^user should see delete confirmation modal$")
    public void userShouldSeeDeleteConfirmationModal() {
      modalDeleteConfirmation.confirmationDialog().shouldBeVisible();
    }

    @And("^user should see delete confirmation modal contains \"([^\"]*)\" text$")
    public void userShouldSeeDeleteConfirmationModalContainText(String text) {
      assertEquals(modalDeleteConfirmation.confirmationText().getText(), text);
    }

    @When("^user click on delete button on delete confirmation modal$")
    public void userClickDeleteButtonOnDeleteModal() {
      modalDeleteConfirmation.deleteButton().click();
    }
}
