package com.future.function.qa.steps.Core;

import com.future.function.qa.pages.core.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.Map;

import static org.junit.Assert.assertTrue;

public class LoginSteps {

  private HomePage homePage;

  @And("^user click login button$")
  public void userClickLoginButton() {
    homePage.loginButton().click();
  }

  @Then("^user should see login modal$")
  public void userShouldSeeLoginModal() {
    assertTrue(homePage.loginModal().isVisible());
  }

  @When("^user login with these credentials$")
  public void userLoginWithTheseCredentials(DataTable dataTable) {
    Map<String, String> credentials = dataTable.asMap(String.class, String.class);
    homePage.emailLoginInput().type(credentials.get("email"));
    homePage.passwordLoginInput().type(credentials.get("password"));
    homePage.loginModalButton().click();
  }

  @Then("^user should see login bar$")
  public void userShouldSeeLoginBar() {
    homePage.navBar().isVisible();
  }

  @And("^user should be in homepage$")
  public void userShouldBeInHomepage() {
    homePage.shouldBeDisplayed();
  }

  @Given("^user should be logged in$")
  public void userShouldBeLoggedIn() {
    homePage.navBar().shouldBeVisible();
    homePage.userBar().shouldBeVisible();
  }

  @When("^user click user section$")
  public void userClickUserSection() {
    homePage.userBar().click();
  }

  @Then("^user should see dropdown as an indicator of logging in$")
  public void userShouldSeeDropdownAsAnIndicatorOfLoggingIn() {
    homePage.userDropdown().shouldBeVisible();
  }

  @When("^user click logout button$")
  public void userClickLogoutButton() {
    homePage.logoutButton().shouldBeVisible();
    homePage.logoutButton().click();
  }

  @When("^user click exit button in login modal$")
  public void userClickExitButtonInLoginModal() {
    homePage.exitLoginModalButton().shouldBeVisible();
    homePage.exitLoginModalButton().click();
  }

}
