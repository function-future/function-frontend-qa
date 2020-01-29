package com.future.function.qa.steps.Core.ActivityBlogs;

import com.future.function.qa.pages.core.ActivityBlogs.ActivityBlogDetailPage;
import com.future.function.qa.pages.core.ActivityBlogs.ActivityBlogsPage;
import com.future.function.qa.pages.core.ActivityBlogs.EditActivityBlogPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class EditActivityBlogSteps {

    private ActivityBlogsPage activityBlogsPage;
    private EditActivityBlogPage editActivityBlogPage;
    private ActivityBlogDetailPage activityBlogDetailPage;

    @Then("^user should be on edit activity blog page$")
    public void userShouldBeOnEditActivityBlogPage() {
        editActivityBlogPage.shouldBeDisplayed();
    }

    @When("^user click on edit button on activity blog detail page$")
    public void userClickOnEditButton() {
        activityBlogDetailPage.editButton().shouldBeVisible();
        activityBlogDetailPage.editButton().click();
    }

    @When("^user type \"([^\"]*)\" in edit activity blog title input$")
    public void userTypeInActivityBlogTitleInput(String title) {
        editActivityBlogPage.titleInput().clear();
        editActivityBlogPage.titleInput().type(title);
    }

    @And("^user type \"([^\"]*)\" in edit activity blog description input$")
    public void userTypeInActivityBlogDescriptionInput(String title) {
        editActivityBlogPage.descriptionInput().type(title);
    }

    @And("^user click on save button on edit activity blog page$")
    public void userClickOnSaveButton() {
        editActivityBlogPage.saveButton().click();
    }

    @And("^activity blog title on activity blog detail should equal \"([^\"]*)\"$")
    public void activityBlogTitleShouldEqual(String text) {
        assertEquals(activityBlogDetailPage.title().getText(), text);
    }

    @And("^activity blog description on activity blog detail should equal \"([^\"]*)\"$")
    public void activityBlogDescriptionShouldEqual(String text) {
        assertEquals(activityBlogDetailPage.description().getText(), text);
    }

    @When("^user click on edit button on dropdown action of activity blog in row number (\\d+)$")
    public void userClickDeleteButtonOnDropdownAction(int row) {
        activityBlogsPage.findEditButtonOnActionDropdown(row).shouldBeVisible();
        activityBlogsPage.findEditButtonOnActionDropdown(row).click();
    }

}
