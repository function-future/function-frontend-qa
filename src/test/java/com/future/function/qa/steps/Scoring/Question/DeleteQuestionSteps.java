package com.future.function.qa.steps.Scoring.Question;

import com.future.function.qa.pages.scoring.Questions.QuestionDetailPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.When;

public class DeleteQuestionSteps {

    private QuestionDetailPage detailPage;

    @When("^user clicks on delete question button$")
    public void userClicksOnDeleteQuestionButton() {
        detailPage.deleteBtn().click();
    }
}
