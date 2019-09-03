@Sanity @Regression
Feature: Sanity

  @Positive @Sanity
  Scenario: Sanity test by checking connection to Google page
    Given user visits Google page
    Then user should see Google search bar
