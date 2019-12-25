package com.future.function.qa.steps.Core.Batches;

import com.future.function.qa.pages.core.Batches.BatchesPage;
import com.future.function.qa.pages.core.Batches.CreateBatchPage;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateBatchSteps {

    private HomePage homePage;
    private BatchesPage batchesPage;
    private CreateBatchPage createBatchPage;

    @Then("^user should be on create batch page$")
    public void userShouldBeOnCreateBatchPage() {
        createBatchPage.shouldBeDisplayed();
    }

    @And("^user should see batches menu on row (\\d+)$")
    public void userSeeBatchesMenu(int row) {
        homePage.findMenuWithIndex(row).shouldBeVisible();
    }

    @When("^user click batches menu on row (\\d+)$")
    public void userClickBatchesMenu(int row) {
        homePage.findMenuWithIndex(row).click();
    }

    @When("^user click on add button on batches page$")
    public void userClickAddButtonOnBatchesPage() {
        batchesPage.addButton().shouldBeVisible();
        batchesPage.addButton().click();
    }

}
