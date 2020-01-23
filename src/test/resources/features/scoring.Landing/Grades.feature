@GradesItemList @Regression
Feature: QuestionBankList

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Negative @AccessingGradesPageWithoutLogin
  Scenario: Accessing Grades Page Without Login
    Given user should be logged in
    When user click user section
    Then user should see dropdown as an indicator of logging in
    When user click logout button
    Then user should be in homepage
    And user should not see grades menu with index 6

  @Positive @AccessingQuestionBankListAsAdmin
  Scenario: Accessing Question Bank List as an Admin
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    When user click grades menu with index 8
    Then user should be in grades page
    Then user should see grades tab list item with index 0 in grades menu
    And user should see add button on tab 0
    And user should see action dropdown button on tab 0 item with index 0

  @Positive @AccessingQuizListAsAdmin
  Scenario: Accessing Question Bank List as Admin
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    When user click grades menu with index 8
    Then user should be in grades page
    And user should see grades tabs
    And user clicks on the grades tab with index 1
    Then user should see grades tab list item with index 1 in grades menu
    And user should see tab 1 content with index 0
    And user should see add button on tab 1
    And user should see action dropdown button on tab 1 item with index 0
    And user should see passed item checkbox on tab 1
    And user should see batch selection dropdown on tab 1

    @Positive @AccessingAssignmentListAsAdmin
    Scenario: Accessing Assignment List as Admin
      Given user should be logged in
      And user should see menu bar
      And user should see grades menu with index 8
      When user click grades menu with index 8
      Then user should be in grades page
      And user should see grades tabs
      And user clicks on the grades tab with index 2
      Then user should see grades tab list item with index 2 in grades menu
      And user should see tab 2 content with index 0
      And user should see add button on tab 2
      And user should see action dropdown button on tab 2 item with index 0
      And user should see passed item checkbox on tab 2
      And user should see batch selection dropdown on tab 2

  @Positive @AccessingAssignmentListAsJudge
  Scenario: Accessing Assignment List as a Judge
    Given user should be logged in
    When user click user section
    Then user should see dropdown as an indicator of logging in
    And user click logout button
    Then user should be in homepage
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | andi@gmail.com    |
      | password | andifunctionapp   |
    And user should be in homepage
    And user should see menu bar
    And user should see grades menu with index 6
    When user click grades menu with index 6
    Then user should be in grades page
    And user should see grades tabs
    Then user should see grades tab list item with index 0 in grades menu
    And user should see tab 0 content with index 0
    And user should not see add button on tab 0
    And user should not see action dropdown button on tab 0 item with index 0
    And user should see passed item checkbox on tab 0
    And user should see batch selection dropdown on tab 0

  @Positive @AccessingAssignmentListAsMentor
  Scenario: Accessing Assignment List as a Mentor
    Given user should be logged in
    When user click user section
    Then user should see dropdown as an indicator of logging in
    And user click logout button
    Then user should be in homepage
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | bramasti@gmail.com    |
      | password | bramastifunctionapp   |
    And user should be in homepage
    And user should see menu bar
    And user should see grades menu with index 6
    When user click grades menu with index 6
    Then user should be in grades page
    And user should see grades tabs
    Then user should see grades tab list item with index 0 in grades menu
    And user should see tab 0 content with index 0
    And user should not see add button on tab 0
    And user should not see action dropdown button on tab 0 item with index 0
    And user should see passed item checkbox on tab 0
    And user should see batch selection dropdown on tab 0

  @Positive @AccessingQuizListAsStudent
  Scenario: Accessing Quiz List as a Student
    Given user should be logged in
    When user click user section
    Then user should see dropdown as an indicator of logging in
    And user click logout button
    Then user should be in homepage
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | jonathan@gmail.com    |
      | password | jonathanfunctionapp   |
    And user should be in homepage
    And user should see menu bar
    And user should see grades menu with index 6
    When user click grades menu with index 6
    Then user should be in grades page
    And user should see grades tabs
    Then user should see grades tab list item with index 0 in grades menu
    And user should see tab 0 content with index 0
    And user should not see add button on tab 0
    And user should not see action dropdown button on tab 0 item with index 0
    And user should see passed item checkbox on tab 0

  @Positive @AccessingAssignmentListAsStudent
  Scenario: Accessing Assignment List as a Student
    Given user should be logged in
    When user click user section
    Then user should see dropdown as an indicator of logging in
    And user click logout button
    Then user should be in homepage
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | jonathan@gmail.com    |
      | password | jonathanfunctionapp   |
    And user should be in homepage
    And user should see menu bar
    And user should see grades menu with index 6
    When user click grades menu with index 6
    Then user should be in grades page
    And user should see grades tabs
    And user clicks on the grades tab with index 1
    Then user should see grades tab list item with index 1 in grades menu
    And user should see tab 1 content with index 0
    And user should not see add button on tab 1
    And user should not see action dropdown button on tab 1 item with index 0
    And user should see passed item checkbox on tab 1