@Judging @Scoring @Regression
Feature: Delete Judging Feature

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @DeleteJudgingAsAdmin
  Scenario: Delete Judging Detail Page as Admin
    Given user should be logged in
    And user should see menu bar
    And user should see comparisons menu with index 9
    When user click comparisons menu with index 9
    Then user should be in final judging page
    And user should see judging data list
    And user click judging data list in row number 2
    Then user should be in final judging detail page
    And user should see student list section
    And user should see action bar
    And user should see delete judging button
    When user click delete judging button
    Then user should see delete confirmation modal
    And user should see delete confirmation text "Are you sure you want to delete this judging session?"
    And user should see close modal button
    And user should see cancel delete button
    And user should see delete confirmation button
    When user click delete confirmation button
    Then user should be in final judging page
