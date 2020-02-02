package com.future.function.qa.steps.Scoring.Room;

import com.future.function.qa.pages.scoring.Assignment.AssignmentDetailPage;
import com.future.function.qa.pages.scoring.Room.RoomListPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RoomListSteps {


    private AssignmentDetailPage assignmentDetailPage;

    private RoomListPage roomListPage;


    @When("^user click view room list button$")
    public void userClickViewRoomListButton() {
        assignmentDetailPage.viewRoomBtn().click();
    }

    @Then("^user should be in room list page$")
    public void userShouldBeInRoomListPage() {
        roomListPage.shouldBeDisplayed();
    }

    @And("^user should see room list section$")
    public void userShouldSeeRoomListSection() {
        roomListPage.roomListSection().shouldBeVisible();
    }

    @And("^user should see room paging section$")
    public void userShouldSeeRoomPagingSection() {
        roomListPage.paginationSection().shouldBeVisible();
    }
}
