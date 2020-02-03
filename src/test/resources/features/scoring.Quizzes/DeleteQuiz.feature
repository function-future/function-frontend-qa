@DeleteQuiz @Regression
Feature: Delete Quiz

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SuccessfullyDeleteQuizFromQuizDetailPage
  Scenario: user edit an existing quiz
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
    And user should click item number 0 on grades page tab number 1
    Then user should be on quiz detail page
    And user should see delete quiz button
    When user clicks on delete quiz button
    Then user should see delete quiz confirmation modal
    When user clicks cancel delete quiz button
    Then user should be on quiz detail page
    When user clicks on delete quiz button
    And user clicks on delete quiz confirmation button
    Then user should see toast success with message "Successfully deleted quiz"
    And user should be in grades page

  @Positive @SuccessfullyDeleteQuizFromGradesPage
  Scenario: user delete an existing quiz from quiz list
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
    Then user clicks on action number 2
    Then user should see delete quiz confirmation modal
    And user clicks on delete quiz confirmation button
    Then user should see toast success with message "Successfully deleted Quiz"
    And user should be in grades page
