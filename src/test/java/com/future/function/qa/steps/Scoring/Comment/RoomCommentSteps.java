package com.future.function.qa.steps.Scoring.Comment;

import com.future.function.qa.pages.scoring.Room.RoomDetailPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

import java.util.Objects;

import static org.junit.Assert.assertTrue;

public class RoomCommentSteps {

    private RoomDetailPage roomDetailPage;

    @And("^user should see add comment input with no attribute \"([^\"]*)\"$")
    public void userShouldSeeAddCommentInputWithNoAttribute(String attribute) {
        roomDetailPage.commentInput().shouldBeVisible();
        assertTrue(Objects.isNull(roomDetailPage.commentInput().getAttribute(attribute)));
    }

    @When("^user type \"([^\"]*)\" in comment input$")
    public void userTypeInCommentInput(String text) {
        roomDetailPage.commentInput().type(text);
    }

    @And("^user click post comment button$")
    public void userClickPostCommentButton() {

    }
}
