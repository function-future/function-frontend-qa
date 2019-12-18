package com.future.function.qa.steps.Core.Announcements;

import com.future.function.qa.pages.core.Announcements.AnnouncementsPage;
import com.future.function.qa.pages.errors.general.ToastComponent;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

import static org.junit.Assert.assertEquals;

@Slf4j
public class AnnouncementsSteps {

    private AnnouncementsPage announcementsPage;
    private ToastComponent toastComponent;

    @Then("^user should be on announcements page$")
    public void userShouldBeOnAnnouncementsPage() {
        announcementsPage.shouldBeDisplayed();
    }

    @Then("^user should see toast success with message \"([^\"]*)\"$")
    public void userShouldSeeToastSuccessWithMessage(String message) throws Throwable {
        toastComponent.toastSuccess().shouldBeVisible();
        assertEquals(toastComponent.toastSuccess().getText(), message);
    }

    @When("^user click on an announcement more button on announcements page in row number (\\d+)$")
    public void userClickOnMoreButton(int row) {
        announcementsPage.findAnnouncement(row).shouldBeVisible();
        announcementsPage.findAnnouncementMoreButton(row).click();
    }

    @Then("^user should see dropdown action of the announcement in row number (\\d+)$")
    public void userShouldSeeDropdownAction(int row) {
        announcementsPage.findAnnouncementActionDropdown(row).shouldBeVisible();
    }

    @When("^user click on delete button on dropdown action in row number (\\d+)$")
    public void userClickDeleteButtonOnDropdownAction(int row) {
        announcementsPage.findDeleteButtonOnActionDropdown(row).shouldBeVisible();
        announcementsPage.findDeleteButtonOnActionDropdown(row).click();
    }
}
