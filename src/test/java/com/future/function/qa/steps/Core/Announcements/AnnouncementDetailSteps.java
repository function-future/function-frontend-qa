package com.future.function.qa.steps.Core.Announcements;

import com.future.function.qa.pages.core.Announcements.AnnouncementDetailPage;
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

    @Then(("^user should see announcement title is the same"))
    public void userShouldSeeAnnouncementTitleIsTheSameAsDisplayedOnFeeds() {
        log.info("title stored: " + storedTitleText);
        assertEquals(announcementDetailPage.title().getText(), storedTitleText);
    }
}
