package com.future.function.qa.steps.Core.Users;

import com.future.function.qa.pages.core.Users.EditUserPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class EditUserSteps {

    private EditUserPage editUserPage;
    private String randomString = getSaltString(6);

    @Then("^user should be on edit user page$")
    public void userShouldBeOnCreateUserPage() {
        editUserPage.shouldBeDisplayed();
    }

    @And("^user type \"([^\"]*)\" in name input on edit user page$")
    public void userTypeInNameInput(String text) {
        editUserPage.nameInput().clear();
        editUserPage.nameInput().type(randomString + " " + text);
    }

    @And("^user type \"([^\"]*)\" in phone input on edit user page$")
    public void userTypeInPhoneInput(String text) {
        editUserPage.phoneInput().clear();
        editUserPage.phoneInput().type(text);
    }

    @And("^user type \"([^\"]*)\" in email input on edit user page$")
    public void userTypeInEmailInput(String text) {
        editUserPage.emailInput().clear();
        editUserPage.emailInput().type(randomString + text);
    }

    @And("^user type \"([^\"]*)\" in university input on edit user page$")
    public void userTypeInUniversityInput(String text) {
        editUserPage.universityInput().clear();
        editUserPage.universityInput().type(text);
    }

    @And("^user type \"([^\"]*)\" in address input on edit user page$")
    public void userTypeInAddressInput(String text) {
        editUserPage.addressInput().clear();
        editUserPage.addressInput().type(text);
    }

    @And("^user select batch on index (\\d+) on edit user page$")
    public void userSelectBatchOnIndex(int index) {
        editUserPage.batchSelect().selectByIndex(index);
    }

    @And("^role selected on edit user page should be \"([^\"]*)\"$")
    public void roleSelectedShouldBe(String role) {
        assertEquals(role, editUserPage.roleSelect().getSelectedVisibleTextValue().trim());
    }

    @And("^user click on save button on edit user page$")
    public void userClickOnSaveButton() {
        editUserPage.saveButton().click();
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
}
