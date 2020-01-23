package com.future.function.qa.steps.Core.ActivityBlogs;

import com.future.function.qa.pages.core.ActivityBlogs.ActivityBlogDetailPage;
import com.future.function.qa.pages.core.ActivityBlogs.ActivityBlogsPage;
import com.future.function.qa.pages.core.ActivityBlogs.EditActivityBlogPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class ActivityBlogDetailSteps {

    private ActivityBlogsPage activityBlogsPage;
    private ActivityBlogDetailPage activityBlogDetailPage;
    private EditActivityBlogPage editActivityBlogPage;

    private String storedTitleText;

    @Then("^user should be on activity blog detail page$")
    public void userShouldBeOnActivityBlogDetailPage() {
        activityBlogDetailPage.shouldBeDisplayed();
    }

    @And("^user remembers activity blog title on activity blogs page in row number (\\d+)$")
    public void userRemembersActivityBlogTitleWithIndex(int row) {
        activityBlogsPage.findActivityBlog(row).shouldBeVisible();
        storedTitleText = activityBlogsPage.findActivityBlogTitle(row).getText();
    }

    @And("^user click on an activity blog on activity blogs page in row number (\\d+)$")
    public void userClickOnActivityBlogWithIndex(int row) {
        activityBlogsPage.findActivityBlog(row).shouldBeVisible();
        activityBlogsPage.findActivityBlog(row).click();
    }

    @Then(("^user should see activity blog title is the same$"))
    public void userShouldSeeActivityBlogTitleIsTheSameAsDisplayedOnActivityBlogsPage() {
        assertEquals(activityBlogDetailPage.title().getText(), storedTitleText);
    }

    @When("^user click on delete button on activity blog detail page$")
     public void userClickOnDeleteButton() {
        activityBlogDetailPage.deleteButton().shouldBeVisible();
        activityBlogDetailPage.deleteButton().click();
    }

    @And("^user should see title on edit activity blog page is the same as activity blogs page$")
    public void userShouldSeeTitleOnEditActivityBlogIsTheSameAsActivityBlogsPage() {
        assertEquals(editActivityBlogPage.titleInput().getValue(), storedTitleText);
    }

}
