package com.future.function.qa.steps.Core.ActivityBlogs;

import com.future.function.qa.pages.core.ActivityBlogs.ActivityBlogsPage;
import com.future.function.qa.pages.core.ActivityBlogs.CreateActivityBlogPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateActivityBlogSteps {

    ActivityBlogsPage activityBlogsPage;
    CreateActivityBlogPage createActivityBlogPage;

    @Then("^user should be on create activity blog page$")
    public void userShouldBeOnCreateActivityBlogPage() {
        createActivityBlogPage.shouldBeDisplayed();
    }

    @When("^user click on add button on activity blogs page$")
    public void userClickAddButtonOnActivityBlogFormPage() {
        activityBlogsPage.addButton().shouldBeVisible();
        activityBlogsPage.addButton().click();
    }

    @When("^user type \"([^\"]*)\" in create activity blog title input$")
    public void userTypeInActivityBlogTitleInput(String title) {
        createActivityBlogPage.titleInput().type(title);
    }

    @And("^user type \"([^\"]*)\" in create activity blog description input$")
    public void userTypeInActivityBlogDescriptionInput(String title) {
        createActivityBlogPage.descriptionInput().type(title);
    }

    @And("^user click on save button on create activity blog page$")
    public void userClickOnSaveButton() {
        createActivityBlogPage.saveButton().click();
    }

}
