package com.future.function.qa.steps.Sanity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import com.future.function.qa.pages.sanity.SanityPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SanitySteps {

  private SanityPage sanityPage;

  @Then("^user should see Google search bar$")
  public void userShouldSeeGoogleSearchBar() throws Throwable {

    assertThat(sanityPage.findSearchBar()
        .waitUntilVisible()
        .isVisible(), equalTo(true));
  }

  @Given("^user visits Google page$")
  public void userVisitsGooglePage() throws Throwable {

    sanityPage.open();
  }
}
