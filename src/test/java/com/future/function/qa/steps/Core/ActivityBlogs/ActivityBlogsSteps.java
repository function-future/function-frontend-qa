package com.future.function.qa.steps.Core.ActivityBlogs;

import com.future.function.qa.pages.core.ActivityBlogs.ActivityBlogsPage;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActivityBlogsSteps {

    private HomePage homePage;
    private ActivityBlogsPage activityBlogsPage;

    @Then("^user should be on activity blogs page$")
    public void userShouldBeOnActivityBlogsPage() {
        homePage.shouldBeDisplayed();
    }

    @And("^user should see activity blogs menu on row (\\d+)$")
    public void userSeeActivityBlogssMenu(int row) {
        homePage.findMenuWithIndex(row).shouldBeVisible();
    }

    @When("^user click activity blogs menu on row (\\d+)$")
    public void userClickActivityBLogsMenu(int row) {
        homePage.findMenuWithIndex(row).click();
    }

    @When("^user click on an activity blog more button on activity blogs page in row number (\\d+)$")
    public void userClickOnEditButtonOnRow(int row) {
        activityBlogsPage.findActivityBlog(row).shouldBeVisible();
        activityBlogsPage.findActivityBlogMoreButton(row).click();
    }

    @Then("^user should see dropdown action of the activity blog in row number (\\d+)$")
    public void userShouldSeeDropdownAction(int row) {
        activityBlogsPage.findActivityBlogActionDropdown(row).shouldBeVisible();
    }

    @When("^user click on delete button on dropdown action of activity blog in row number (\\d+)$")
    public void userClickDeleteButtonOnDropdownAction(int row) {
        activityBlogsPage.findDeleteButtonOnActionDropdown(row).shouldBeVisible();
        activityBlogsPage.findDeleteButtonOnActionDropdown(row).click();
    }
}
