package com.future.function.qa.steps.Scoring.QuestionBank;

import com.future.function.qa.pages.scoring.QuestionBanks.QuestionBankDetailPage;
import cucumber.api.java.en.And;

public class DeleteQuestionBankSteps {

    private QuestionBankDetailPage detailPage;

    @And("^user click delete question bank button$")
    public void userClickDeleteQuestionBankButton() {
        detailPage.deleteBtn().click();
    }
}
