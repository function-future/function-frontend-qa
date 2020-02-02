package com.future.function.qa.steps.Scoring.Room;

import com.future.function.qa.pages.scoring.Room.RoomDetailPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddRoomScoreSteps {

    private RoomDetailPage roomDetailPage;

    @And("^user should see room score section$")
    public void userShouldSeeRoomScoreSection() {
        roomDetailPage.scoreSection().shouldBeVisible();
    }

    @And("^user should see room score dropdown$")
    public void userShouldSeeRoomScoreDropdown() {
        roomDetailPage.scoreDropdown().shouldBeVisible();
    }

    @And("^user should see not see room score detail$")
    public void userShouldSeeNotSeeRoomScoreDetail() {
        roomDetailPage.scoreDetailSection().shouldNotBeVisible();
    }

    @When("^user click room score dropdown$")
    public void userClickRoomScoreDropdown() {
        roomDetailPage.scoreDropdown().click();
    }

    @Then("^user should see room score detail$")
    public void userShouldSeeRoomScoreDetail() {
        roomDetailPage.scoreDetailSection().shouldBeVisible();
    }

    @And("^user should see room score input$")
    public void userShouldSeeRoomScoreInput() {
        roomDetailPage.scoreInput().shouldBeVisible();
    }

    @And("^user should see room score submit button$")
    public void userShouldSeeRoomScoreSubmitButton() {
        roomDetailPage.scoreSubmitBtn().shouldBeVisible();
    }

    @When("^user type (\\d+) in room score input$")
    public void userTypeInRoomScoreInput(int score) {
        roomDetailPage.scoreInput().type(String.valueOf(score));
    }

    @And("^user click room score submit button$")
    public void userClickRoomScoreSubmitButton() {
        roomDetailPage.scoreSubmitBtn().click();
    }
}
