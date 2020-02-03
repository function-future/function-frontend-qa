@DeleteQuestion @Regression
Feature: Delete Question

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SuccessDeleteQuestionFromQuestionBankDetailPage
  Scenario: user delete question via action button on question bank detail
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
    When user clicks more button on question with index 0
    Then user should see list of actions for selected question
    When user clicks on action number 1
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    And user should see toast success with message "Successfully deleted question"
    Then user should be on question bank detail page

  @Positive @SuccessDeleteQuestionFromQuestionDetailPage
  Scenario: user delete question via question detail page
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on question bank detail page
    When user clicks on question number 0
    Then user should be on question detail page
    When user clicks on delete question button
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    And user should see toast success with message "Successfully deleted question"
    Then user should be on question bank detail page
