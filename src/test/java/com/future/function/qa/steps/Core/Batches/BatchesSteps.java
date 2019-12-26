package com.future.function.qa.steps.Core.Batches;

import com.future.function.qa.pages.core.Batches.BatchesPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BatchesSteps {

    private BatchesPage batchesPage;

    @Then("^user should be on batches page$")
    public void userShouldBeOnBatchesPage() {
        batchesPage.shouldBeDisplayed();
    }

    @When("^user click on batch more button on row (\\d+)$")
    public void userClickOnBatchMoreButton(int row) {
        batchesPage.findBatchMoreButtonOnRow(row).shouldBeVisible();
        batchesPage.findBatchMoreButtonOnRow(row).click();
    }

    @Then("^user should see batch dropdown action on row (\\d+)$")
    public void userShouldSeeBatchDropdownActionOnRow(int row) {
        batchesPage.batchDropdownMenuOnRow(row).shouldBeVisible();
    }

    @When("^user click on delete button on batch dropdown action in row number (\\d+)$")
    public void userClickOnDeleteButtonOnBatchDropdown(int row) {
        batchesPage.batchDeleteButtonOnDropdownMenuOnRow(row).shouldBeVisible();
        batchesPage.batchDeleteButtonOnDropdownMenuOnRow(row).click();
    }


}
