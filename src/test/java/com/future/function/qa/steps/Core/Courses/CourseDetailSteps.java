package com.future.function.qa.steps.Core.Courses;

import com.future.function.qa.pages.core.Courses.CourseDetailPage;
import com.future.function.qa.pages.core.Courses.CoursesPage;
import com.future.function.qa.pages.core.Courses.MasterCourseDetailPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CourseDetailSteps {

    private CoursesPage coursesPage;
    private MasterCourseDetailPage masterCourseDetailPage;
    private CourseDetailPage courseDetailPage;

    private String storedTitleText;

    @Then("^user should be in master course detail page$")
    public void userShouldBeInMasterCourseDetailPage() {
        masterCourseDetailPage.shouldBeDisplayed();
    }

    @Then("^user should be in course detail page$")
    public void userShouldBeInCourseDetailPage() {
        courseDetailPage.shouldBeDisplayed();
    }

    @And("^user remembers course title on tab index (\\d+) from courses page in row number (\\d+)$")
    public void userRemembersCourseTitleInRowNumber(int tabIndex, int row) {
        coursesPage.findMasterCourseOrCourseOnTabIndexOnRow(tabIndex, row).shouldBeVisible();
        storedTitleText = coursesPage.findMasterCourseOrCourseTitleOnTabIndexOnRow(tabIndex, row).getText();
    }

    @When("^user click on a course on tab index (\\d+) in row number (\\d+)$")
    public void userClickOnACourseInRowNumberOnTabIndex(int tabIndex, int row) {
        coursesPage.findMasterCourseOrCourseOnTabIndexOnRow(tabIndex, row).click();
    }

    @And("^course title on master course detail page should be the same$")
    public void courseTitleOnMasterCourseDetailPageShouldBeTheSame() {
        assertEquals(masterCourseDetailPage.title().getText(), storedTitleText);
    }

    @And("^course title on course detail page should be the same$")
    public void courseTitleOnCourseDetailPageShouldBeTheSame() {
        assertEquals(courseDetailPage.title().getText(), storedTitleText);
    }

    @And("^user should see discussion section on course detail page$")
    public void userShouldSeeDiscussionSectionOnCourseDetailPage() {
        courseDetailPage.discussionSection().shouldBeVisible();
    }

    @When("^user click on delete button on course detail page$")
    public void userClickOnDeleteButtonOnCourseDetailPage() {
        courseDetailPage.deleteButton().shouldBeVisible();
        courseDetailPage.deleteButton().click();
    }

    @When("^user click on edit button on course detail page$")
    public void userClickOnEditButtonOnCourseDetailPage() {
        courseDetailPage.editButton().shouldBeVisible();
        courseDetailPage.editButton().click();
    }

    @When("^user type \"([^\"]*)\" on discussion input on course detail page$")
    public void userTypeOnDiscussionInputOnCourseDetailPage(String text) {
        courseDetailPage.discussionInput().shouldBeVisible();
        courseDetailPage.discussionInput().type(text);
    }

    @And("^user click on Post discussion button on course detail page$")
    public void userClickOnPostDiscussionButton() {
        courseDetailPage.postDiscussionButton().shouldBeVisible();
        courseDetailPage.postDiscussionButton().click();
    }
    
    @And("^user should see \"([^\"]*)\" discussion that was posted by user$")
    public void userShouldSeeDiscussionThatWasPostedByUser(String text) {
        courseDetailPage.findDiscussionOnRow(1).shouldBeVisible();
        assertEquals(text, courseDetailPage.findDiscussionTextOnRow(1).getText());
    }
}
