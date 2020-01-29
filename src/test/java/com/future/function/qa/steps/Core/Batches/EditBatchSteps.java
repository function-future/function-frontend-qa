package com.future.function.qa.steps.Core.Batches;

import com.future.function.qa.pages.core.Batches.BatchesPage;
import com.future.function.qa.pages.core.Batches.EditBatchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditBatchSteps {

  private BatchesPage batchesPage;
  private EditBatchPage editBatchPage;

  @Then("^user should see edit batch page$")
  public void userShouldSeeEditBatchPage() {
    editBatchPage.shouldBeDisplayed();
  }

  @When("^user click on edit button on batch dropdown action in row number (\\d+)$")
  public void userClickOnEditButtonOnBatchDropdown(int row) {
    batchesPage.batchEditButtonOnDropdownMenuOnRow(row).shouldBeVisible();
    batchesPage.batchEditButtonOnDropdownMenuOnRow(row).click();
  }

  @When("^user type \"([^\"]*)\" in batch code input in edit batch page$")
  public void userTypeStringInBatchCodeInput(String code) {
    editBatchPage.codeInput().clear();
    editBatchPage.codeInput().type(code);
  }

  @And("^user type \"([^\"]*)\" in batch name input in edit batch page$")
  public void userTypeStringInBatchBatchNameInput(String name) {
    editBatchPage.nameInput().clear();
    editBatchPage.nameInput().type(name);
  }


  @And("^user click on save button on edit batch page$")
  public void userClickOnSaveButton() {
    editBatchPage.saveButton().shouldBeVisible();
    editBatchPage.saveButton().click();
  }

}
