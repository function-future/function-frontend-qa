package com.future.function.qa.steps.Core.Users;

import com.future.function.qa.pages.core.Users.CreateUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

public class CreateUserSteps {

    private CreateUserPage createUserPage;

    @Then("^user should be on create user page$")
    public void userShouldBeOnCreateUserPage() {
        createUserPage.shouldBeDisplayed();
    }

    @And("^batch select box should be visible$")
    public void batchSelectShouldBeVisible() {
        createUserPage.batchSelect().shouldBeVisible();
    }

    @And("^batch select box should not be visible$")
    public void batchSelectShouldNotBeVisible() {
        createUserPage.batchSelect().shouldNotBeVisible();
    }

    @And("^role select box should be visible$")
    public void roleSelectShouldBeVisible() {
        createUserPage.roleSelect().shouldBeVisible();
    }

    @And("^role select box should not be visible$")
    public void roleSelectShouldNotBeVisible() {
        createUserPage.roleSelect().shouldNotBeVisible();
    }

    @And("^user type \"([^\"]*)\" in name input on create user page$")
    public void userTypeInNameInput(String text) {
        createUserPage.nameInput().type(text);
    }

    @And("^user type \"([^\"]*)\" in phone input on create user page$")
    public void userTypeInPhoneInput(String text) {
        createUserPage.phoneInput().type(text);
    }

    @And("^user type \"([^\"]*)\" in email input on create user page$")
    public void userTypeInEmailInput(String text) {
        createUserPage.emailInput().type(text);
    }

    @And("^user type \"([^\"]*)\" in university input on create user page$")
    public void userTypeInUniversityInput(String text) {
        createUserPage.universityInput().type(text);
    }

    @And("^user type \"([^\"]*)\" in address input on create user page$")
    public void userTypeInAddressInput(String text) {
        createUserPage.addressInput().type(text);
    }

    @And("^user select batch on index (\\d+) on create user page$")
    public void userSelectBatchOnIndex(int index) {
        createUserPage.batchSelect().selectByIndex(index);
    }

    @And("^role selected on create user page should be \"([^\"]*)\"$")
    public void roleSelectedShouldBe(String role) {
        assertEquals(role, createUserPage.roleSelect().getSelectedVisibleTextValue().trim());
    }

    @And("^user click on save button on create user page$")
    public void userClickOnSaveButton() {
        createUserPage.saveButton().click();
    }

}
