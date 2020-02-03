@Assignment @Scoring @Regression
Feature: Add Assignment Feature

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @AddAssignmentWithoutUploadFileAndPickDate
  Scenario: Add Assignment Without Upload File And Pick Date
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user clicks on the grades tab with index 2
    And user should see grades tab list on index 2 having "class" attribute with "is-active"
    And user click add button on tab with index 2
    Then user should be on add assignment page
    And user should see assignment title form
    And user should see assignment title input
    And user should see assignment description form
    And user should see assignment description input
    And user should see assignment deadline form
    And user should see assignment deadline input
    And user should see assignment upload form
    And user should see assignment upload input
    And user should see assignment action section
    And user should see assignment save button
    And user should see assignment cancel button
    When user type "Assignment Title 1" in assignment title input
    And user type "Assignment Description 1" in assignment description input
    And user click assignment save button
    Then user should see toast success with message "Successfully created assignment"
    Then user should be in grades page

  @Negative @AddAssignmentWithNoTitleAndDescription
  Scenario: Add assignment without title and description
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user clicks on the grades tab with index 2
    And user should see grades tab list on index 2 having "class" attribute with "is-active"
    And user click add button on tab with index 2
    Then user should be on add assignment page
    And user should see assignment title form
    And user should see assignment title input
    And user should see assignment description form
    And user should see assignment description input
    And user should see assignment deadline form
    And user should see assignment deadline input
    And user should see assignment upload form
    And user should see assignment upload input
    And user should see assignment action section
    And user should see assignment save button
    And user should see assignment cancel button
    When user click assignment save button
    Then user should see toast danger with message "Fail to create assignment"
