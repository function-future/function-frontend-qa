package com.future.function.qa.steps.Scoring.Room;

import com.future.function.qa.pages.scoring.Room.RoomDetailPage;
import com.future.function.qa.pages.scoring.Room.RoomListPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class RoomDetailSteps {

    private RoomListPage roomListPage;

    private RoomDetailPage roomDetailPage;

    @And("^user should see item number (\\d+) of room list section$")
    public void userShouldSeeItemNumberOfRoomListSection(int itemIdx) {
        roomListPage.roomListItem(itemIdx).shouldBeVisible();
    }

    @And("^user should see student image in item number (\\d+) of room list section$")
    public void userShouldSeeStudentImageInItemNumberOfRoomListSection(int itemIdx) {
        roomListPage.roomDetailImage(itemIdx).shouldBeVisible();
    }

    @And("^user should see student name in item number (\\d+) of room list section$")
    public void userShouldSeeStudentNameInItemNumberOfRoomListSection(int itemIdx) {
        roomListPage.roomDetailName(itemIdx).shouldBeVisible();
    }

    @And("^user should see student university in item number (\\d+) of room list section$")
    public void userShouldSeeStudentUniversityInItemNumberOfRoomListSection(int itemIdx) {
        roomListPage.roomDetailUniversity(itemIdx).shouldBeVisible();
    }

    @And("^user should see go to detail button in item number (\\d+) of room list section$")
    public void userShouldSeeGoToDetailButtonInItemNumberOfRoomListSection(int itemIdx) {
        roomListPage.roomDetailBtn(itemIdx).shouldBeVisible();
    }

    @When("^user click detail button in item number (\\d+) of room list section$")
    public void userClickDetailButtonInItemNumberOfRoomListSection(int itemIdx) {
        roomListPage.roomDetailBtn(itemIdx).click();
    }

    @Then("^user should be in room detail page$")
    public void userShouldBeInRoomDetailPage() {
        roomDetailPage.shouldBeDisplayed();
    }

    @And("^user should see room assignment title$")
    public void userShouldSeeRoomAssignmentTitle() {
        roomDetailPage.assignmentTitle().shouldBeVisible();
    }

    @And("^user should see room assignment description$")
    public void userShouldSeeRoomAssignmentDescription() {
        roomDetailPage.assignmentDescription().shouldBeVisible();
    }

    @And("^user should see room discussion section$")
    public void userShouldSeeRoomDiscussionSection() {
        roomDetailPage.discussionSection().shouldBeVisible();
    }

    @And("^user should see room discussion dropdown$")
    public void userShouldSeeRoomDiscussionDropdown() {
        roomDetailPage.discussionDropdown().shouldBeVisible();
    }

    @And("^user should see add comment input with attribute \"([^\"]*)\"$")
    public void userShouldSeeAddCommentInputWithAttribute(String attribute) {
        roomDetailPage.commentInput().shouldBeVisible();
        assertTrue(Objects.nonNull(roomDetailPage.commentInput().getAttribute(attribute)));
    }

    @When("^user click room discussion dropdown$")
    public void userClickRoomDiscussionDropdown() {
        roomDetailPage.discussionDropdown().click();
    }

    @Then("^user should see room discussions as \"([^\"]*)\"$")
    public void userShouldSeeRoomDiscussions(String role) {
        roomDetailPage.discussions(role).shouldBeVisible();
    }

    @Then("^user should not see room discussions as \"([^\"]*)\"$")
    public void userShouldNotSeeRoomDiscussions(String role) {
        roomDetailPage.discussions(role).shouldNotBeVisible();
    }
}
