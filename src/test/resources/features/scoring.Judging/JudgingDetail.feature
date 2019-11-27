Feature: Judging Detail Feature

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SeeJudgingDetail
  Scenario: Accessing Judging Detail Page as Admin
    Given user should be logged in
    And user should see menu bar
    And user should see comparisons menu
    When user click comparisons menu
    Then user should be in final judging page
    And user should see judging data list
    When user get title label in the data in row number 1
    And user get description label in the data in row number 1
    And user get batch label in batch dropdown
    And user click judging data list in row number 1
    Then user should be in final judging detail page
    And user should see title label with text the same as the data in row number 1
    And user should see description label with text the same as the data in row number 1
    And user should see batch label with text the same as selected batch in judging data list
    And user should see student list section
    And user should see action bar
