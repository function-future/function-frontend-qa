@Assignment @Scoring @Regression @DeleteAssignment
Feature: Delete Assignment Feature

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @DeleteAssignmentAsAdmin
  Scenario: Delete Assignment as Admin
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user clicks on the grades tab with index 2
    And user should see grades tab list on index 2 having "class" attribute with "is-active"
    And user should click item number 0 on grades page tab number 2
    Then user should be on assignment detail page
    When user click delete assignment button
    Then user should see delete confirmation modal
    And user should see delete confirmation text "Are you sure you want to delete this assignment?"
    And user should see close modal button
    And user should see cancel delete button
    And user should see delete confirmation button
    When user click delete confirmation button
    Then user should be in grades page

  @Negative @DeleteAssignmentAsAdminAndCancelWhenConfirm
  Scenario: Delete Assignment as Admin And Cancel When Confirm
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user clicks on the grades tab with index 2
    And user should see grades tab list on index 2 having "class" attribute with "is-active"
    And user should click item number 0 on grades page tab number 2
    Then user should be on assignment detail page
    When user click delete assignment button
    Then user should see delete assignment confirmation modal
    And user should see delete confirmation text "Are you sure you want to delete this assignment?"
    And user should see close modal button
    And user should see cancel delete button
    And user should see delete confirmation button
    When user click cancel delete button
    Then user should be on assignment detail page

  @Negative @DeleteAssignmentAsAdminAndCloseWhenConfirm
  Scenario: Delete Assignment as Admin And Close When Confirm
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user clicks on the grades tab with index 2
    And user should see grades tab list on index 2 having "class" attribute with "is-active"
    And user should click item number 0 on grades page tab number 2
    Then user should be on assignment detail page
    When user click delete assignment button
    Then user should see delete assignment confirmation modal
    And user should see delete confirmation text "Are you sure you want to delete this assignment?"
    And user should see close modal button
    And user should see cancel delete button
    And user should see delete confirmation button
    When user click close modal button
    Then user should be on assignment detail page
