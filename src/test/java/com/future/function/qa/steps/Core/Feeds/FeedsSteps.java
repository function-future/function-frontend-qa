package com.future.function.qa.steps.Core.Feeds;

import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeedsSteps {

    private HomePage homePage;

    @Then("^user should see sticky notes$")
    public void userShouldSeeStickyNotes() {
        homePage.stickyNotes().shouldBeVisible();
    }

    @Then("^user should see announcement list$")
    public void userShouldSeeAnnouncementList() {
        homePage.announcementList().shouldBeVisible();
    }

    @When("^user click on announcements text on feeds$")
    public void userClickOnAnnouncementText() {
        homePage.announcementText().click();
    }

}
