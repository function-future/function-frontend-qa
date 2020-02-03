@Judging @Scoring @Regression
Feature: Edit Judging Feature

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @EditJudgingAsAdmin
  Scenario: Edit Judging Detail Page as Admin
    Given user should be logged in
    And user should see menu bar
    And user should see comparisons menu with index 9
    When user click comparisons menu with index 9
    Then user should be in final judging page
    And user should see judging data list
    When user get title label in the data in row number 0
    And user get description label in the data in row number 0
    And user click judging data list in row number 0
    Then user should be in final judging detail page
    And user should see title label with text the same as the stored title
    And user should see description label with text the same as the stored description
    And user should see student list section
    And user should see action bar
    And user should see edit judging button
    When user click edit judging button
    Then user should be in final judging form page
    And user should see title label
    And user should see title input
    And user should see description label
    And user should see description input
    And user should see student selection section
    When user re-type "Judging Title Edited" in title input
    And user re-type "Judging Description Edited" in description input
    And user click save button in add judging page
    Then user should be in final judging page

