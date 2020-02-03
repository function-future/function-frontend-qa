@CopyQuiz @Regression
Feature: Copy Quiz to Another Batch

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SuccessfullyCopyQuizFromGradesPage
  Scenario: user copies an existing quiz from quiz list
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should see tab 0 content with index 0
    And user clicks on the grades tab with index 1
    And user should see tab 1 content with index 0
    And user should see grades tab list item with index 1 in grades menu
    When user clicks action dropdown button on tab 1 item with index 0
    Then user clicks on action number 1
    Then user should see copy quiz modal
    And user should see close copy quiz button
    And user should see cancel copy button
    And user should see confirmation button being disabled
    And user clicks on batch number 1 in quiz copy modal
    When user clicks on the copy quiz confirmation button
    Then user should see toast success with message "Successfully copied this Quiz"
    And user should be in grades page
