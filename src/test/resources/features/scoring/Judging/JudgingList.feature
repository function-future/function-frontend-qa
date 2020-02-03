@JudgingList @Scoring @Regression
Feature: JudgingList

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Negative @AccessingJudgingListWithoutLogin
  Scenario: Accessing Judging List Without Login
    Given user should be logged in
    When user click user section
    Then user should see dropdown as an indicator of logging in
    When user click logout button
    Then user should be in homepage
    And user should not see comparisons menu with index 9

  @Positive @AccessingJudgingList
  Scenario: Accessing Judging List as Admin
    Given user should be logged in
    And user should see menu bar
    And user should see comparisons menu with index 9
    When user click comparisons menu with index 9
    Then user should be in final judging page
    And user should see judging data list
    And user should see add judging button
    And user should see view final score button
    And user should see select batch dropdown
    And user should see paging section

