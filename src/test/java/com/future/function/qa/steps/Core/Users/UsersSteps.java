package com.future.function.qa.steps.Core.Users;

import com.future.function.qa.pages.core.HomePage;
import com.future.function.qa.pages.core.Users.UsersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UsersSteps {

    private HomePage homePage;
    private UsersPage usersPage;

    @Then("^user should be on users page with tab index (\\d+)$")
    public void userShouldBeOnUsersPage(int index) {
        usersPage.shouldBeDisplayed();
        assertTrue(usersPage.usersTabs(index).getAttribute("class").contains("is-active"));
    }

    @And("^user should see users menu on row (\\d+)$")
    public void userSeeUsersMenu(int row) {
        homePage.findMenuWithIndex(row).shouldBeVisible();
    }

    @When("^user click users menu on row (\\d+)$")
    public void userClickUsersMenu(int row) {
        homePage.findMenuWithIndex(row).click();
    }

    @When("^user click on add button on users page on tab index (\\d+)$")
    public void userClickOnAddButton(int index) {
        usersPage.addButton(index).shouldBeVisible();
        usersPage.addButton(index).click();
    }

    @And("^user should see \"([^\"]*)\" tab on index (\\d+)$")
    public void userShouldSeeTabOnIndex(String tabName, int index) {
        usersPage.usersTabs(index).shouldBeVisible();
        assertEquals(tabName, usersPage.usersTabName(index).getText());
    }

    @When("^user click tab on index (\\d+)$")
    public void userClickOnTabOnIndex(int index) {
        usersPage.usersTabs(index).click();
    }
}
