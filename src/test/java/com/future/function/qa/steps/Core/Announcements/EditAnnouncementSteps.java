package com.future.function.qa.steps.Core.Announcements;

import com.future.function.qa.pages.core.Announcements.AnnouncementDetailPage;
import com.future.function.qa.pages.core.Announcements.AnnouncementsPage;
import com.future.function.qa.pages.core.Announcements.EditAnnouncementPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.assertEquals;

@Slf4j
public class EditAnnouncementSteps {

    private EditAnnouncementPage editAnnouncementPage;
    private AnnouncementsPage announcementsPage;
    private AnnouncementDetailPage announcementDetailPage;

    private String storedTitleText;

    @Then("^user should be on edit announcement page$")
    public void userShouldBeOnEditAnnouncementPage() {
        editAnnouncementPage.shouldBeDisplayed();
    }

    @When("^user click on edit button on dropdown action in row number (\\d+)$")
    public void userClickDeleteButtonOnDropdownAction(int row) {
        announcementsPage.findEditButtonOnActionDropdown(row).shouldBeVisible();
        announcementsPage.findEditButtonOnActionDropdown(row).click();
    }

    @And("^announcement title on announcement detail should equal \"([^\"]*)\"$")
    public void announcementTitleShouldEqual(String text) {
        assertEquals(announcementDetailPage.title().getText(), text);
    }

    @And("^announcement description on announcement detail should equal \"([^\"]*)\"$")
    public void announcementDescriptionShouldEqual(String text) {
        assertEquals(announcementDetailPage.description().getText(), text);
    }

    @And("^user remembers announcement title on announcement detail page$")
    public void userRemembersAnnouncementTitle() {
        storedTitleText = announcementDetailPage.title().getText();
    }

    @When("^user click on edit button on announcement detail page$")
    public void userClickOnEditButtonOnAnnouncementDetailPage() {
        announcementDetailPage.editButton().click();
    }

    @And("^user should see title on edit announcements page is the same$")
    public void userShouldSeeTitleOnEditAnnouncementIsTheSame() {
        assertEquals(editAnnouncementPage.titleInput().getValue(), storedTitleText);
    }



}
