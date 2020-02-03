@DeleteQuestionBank @Regression
Feature: Delete Question Bank

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SuccessDeleteQuestionBank
  Scenario: user delete question bank
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on question bank detail page
    And user click delete question bank button
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be in grades page
    And user should see toast success with message "Successfully delete question bank"