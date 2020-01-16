@Core @Files @Student @StudentFilesPage @Regression
Feature: Files page with role as Student

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | student@student.com |
      | password | studentfunctionapp  |
    And user should be in homepage

  @Positive @StudentVisitFilesPage
  Scenario: user visit files page
    Given user should be logged in
    And user should see menu bar
    And user should see files menu on row 5
    When user click files menu on row 5
    Then user should be on files page
