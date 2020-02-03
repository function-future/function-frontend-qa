@Judging @Scoring @Regression
Feature: Add Judging

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @AddJudging
  Scenario: Accessing Add Judging Page
    Given user should be logged in
    And user should see menu bar
    And user should see comparisons menu with index 9
    When user click comparisons menu with index 9
    Then user should be in final judging page
    And user should see add judging button
    When user click add judging button
    Then user should be in final judging form page
    And user should see title label
    And user should see title input
    And user should see description label
    And user should see description input
    And user should see student selection section
    And user should see add student button
    And user should see dropdown arrow button
    When user click add student button
    Then user should see student selection modal
    And user should see student list data
    And user should see student select title modal
    And user should see cancel button
    And user should see save button
    And user should see exit button
    When user click student data with index 1
    Then user should see the checkbox with index 1
    When user click student data with index 2
    Then user should see the checkbox with index 2
    When user click save button
    Then user should not see student selection modal
    And user should be in add judging page
    And user should see student detail in student selection section with index 1
    And user should see student detail in student selection section with index 2
    When user type "Judging Title" in title input
    And user type "Judging Description" in description input
    And user click save button in add judging page
    Then user should be in final judging page

  @Negative @AddJudgingWithEmptyTitleAndDescription
  Scenario: Accessing Add Judging Page
    Given user should be logged in
    And user should see menu bar
    And user should see comparisons menu with index 9
    When user click comparisons menu with index 9
    Then user should be in final judging page
    And user should see add judging button
    When user click add judging button
    Then user should be in final judging form page
    And user should see title label
    And user should see title input
    And user should see description label
    And user should see description input
    When user click save button in add judging page
    Then user should see title error label
    And user should see description error label

  @Negative @AddJudgingWithoutStudents
  Scenario: Accessing Add Judging Page
    Given user should be logged in
    And user should see menu bar
    And user should see comparisons menu with index 9
    When user click comparisons menu with index 9
    Then user should be in final judging page
    And user should see add judging button
    When user click add judging button
    Then user should be in final judging form page
    And user should see title label
    And user should see title input
    And user should see description label
    And user should see description input
    When user type "Judging Title" in title input
    And user type "Judging Description" in description input
    And user click save button in add judging page
    Then user should see toast danger with message "Something went wrong"
