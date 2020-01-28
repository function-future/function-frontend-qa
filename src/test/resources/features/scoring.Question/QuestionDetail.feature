@QuestionDetail @Regression
Feature: Question Detail

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @AccessingQuestionDetail
  Scenario: user access question detail page
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on question bank detail page
    And user should see question dropdown section
    And user should see list of question this question banks
    When user clicks on question number 0
    Then user should be on question detail page
    And user should see edit question button
    And user should see delete question button
    And user should see question title
    And user should see option list
    