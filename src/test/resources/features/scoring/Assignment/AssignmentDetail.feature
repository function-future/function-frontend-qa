@AssignmentDetail @Scoring @Regression
Feature: Assignment Detail Feature

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SeeAssignmentDetail
  Scenario: See Assignment Detail as Admin
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user clicks on the grades tab with index 2
    And user should see grades tab list on index 2 having "class" attribute with "is-active"
    And user should click item number 0 on grades page tab number 2
    Then user should be on assignment detail page
    And user should see assignment title
    And user should see assignment description
    And user should see assignment deadline
    And user should see action section
    And user should see edit assignment button
    And user should see delete assignment button
    And user should see view room list button
