@QuestionBankDetail @Regression
Feature: Question Bank Detail

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @AccessingQuestionBankDetail
  Scenario: user access question bank detail page
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on question bank detail page
    And user should see question bank title
    And user should see question bank description
    And user should see question dropdown section
    And user should see list of question this question banks
    And user should see add question button
    And user should see edit question bank button
    And user should see delete question bank button

  @Positive @HideQuestionList
  Scenario: user access question bank detail page
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on question bank detail page
    And user should see question dropdown section
    And user should see list of question this question banks
    When user clicks on the dropdown header
    Then user should not see list of question this question banks