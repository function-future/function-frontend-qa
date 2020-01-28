package com.future.function.qa.steps.Scoring.QuestionBank;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class DeleteQuestionBankSteps {

    private QuestionBankDetailPage detailPage;

    @And("^user click delete question bank button$")
    public void userClickDeleteQuestionBankButton() {
        detailPage.deleteBtn().click();
    }
}
