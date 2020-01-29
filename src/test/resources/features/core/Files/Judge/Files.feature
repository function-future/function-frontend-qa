@Core @Files @Judge @JudgeFilesPage @Regression
Feature: Files page with role as Judge

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | judge@judge.com |
      | password | judgefunctionapp |
    And user should be in homepage

  @Positive @JudgeVisitFilesPage
  Scenario: judge visit files page
    Given user should be logged in
    And user should see menu bar
    And user should see files menu on row 5
    When user click files menu on row 5
    Then user should be on files page
