package com.future.function.qa.steps.Core.Batches;

import com.future.function.qa.pages.core.Batches.BatchesPage;
import com.future.function.qa.pages.core.Batches.CreateBatchPage;
import com.future.function.qa.pages.core.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.*;

public class CreateBatchSteps {

    private HomePage homePage;
    private BatchesPage batchesPage;
    private CreateBatchPage createBatchPage;
    private String randomString = getSaltString(6);

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

    @When("^user type \"([^\"]*)\" in batch code input in create batch page$")
    public void userTypeStringInBatchCodeInput(String code) {
        createBatchPage.codeInput().type(code + randomString);
    }

    @And("^user type \"([^\"]*)\" in batch name input in create batch page$")
    public void userTypeStringInBatchBatchNameInput(String name) {
        createBatchPage.nameInput().type(name + " " + randomString);
    }

    @And("^user click on save button on create batch page$")
    public void userClickOnSaveButton() {
        createBatchPage.saveButton().shouldBeVisible();
        createBatchPage.saveButton().click();
    }

    private String getSaltString(int length) {
        String string = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < length) {
            int index = (int) (rnd.nextFloat() * string.length());
            salt.append(string.charAt(index));
        }
        return salt.toString();
    }

    @Then("^user should see batch code input error message$")
    public void userShouldSeeBatchCodeInputErrorMessage() {
        createBatchPage.codeInputErrorMessage().shouldBeVisible();
    }

    @Then("^user should see batch name input error message$")
    public void userShouldSeeBatchNameInputErrorMessage() {
        createBatchPage.nameInputErrorMessage().shouldBeVisible();
    }

    @Then("^user should see batch code input has space error message$")
    public void userShouldSeeBatchCodeInputHasSpaceErrorMessage() {
        createBatchPage.codeInputOnlyAlphanumericErrorMessage().shouldBeVisible();
    }
}
