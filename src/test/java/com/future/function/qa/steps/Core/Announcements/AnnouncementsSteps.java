package com.future.function.qa.steps.Core.Announcements;

import com.future.function.qa.pages.core.Announcements.AnnouncementsPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AnnouncementsSteps {

    private AnnouncementsPage announcementsPage;

    @Then("^user should be on announcements page$")
    public void userShouldBeOnAnnouncementsPage() {
        announcementsPage.shouldBeDisplayed();
    }

}
