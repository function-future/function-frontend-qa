@AddQuestionBank @Regression
Feature: Create Question Bank

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage


  @Positive @SuccessCreateQuestionBank
  Scenario: user create question bank
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    When user click add button on tab with index 0
    Then user should be on create question bank page
    And user type "Dummy bank for quiz" in question bank title input
    And user click on save button on edit announcement page
    And user type "Dummy description for QA on question bank" in question bank description input
    And user click on create question bank button
    And user should see toast success with message "Successfully created question bank"
    And user should be in grades page

  @Positive @CancelCreateQuestionBank
  Scenario: user click cancel while creating question bank
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    When user click add button on tab with index 0
    Then user should be on create question bank page
    And user type "Dummy bank for quiz" in question bank title input
    And user click on save button on edit announcement page
    And user type "Dummy description for QA on question bank" in question bank description input
    And user click on cancel creating question bank button
    And user should be in grades page