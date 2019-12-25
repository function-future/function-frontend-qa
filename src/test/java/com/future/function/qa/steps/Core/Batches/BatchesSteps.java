package com.future.function.qa.steps.Core.Batches;

import com.future.function.qa.pages.core.Batches.BatchesPage;
import cucumber.api.java.en.Then;

public class BatchesSteps {

    private BatchesPage batchesPage;

    @Then("^user should be on batches page$")
    public void userShouldBeOnBatchesPage() {
        batchesPage.shouldBeDisplayed();
    }
}
