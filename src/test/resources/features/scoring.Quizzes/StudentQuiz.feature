@StudentQuiz @Regression
Feature: Student is working on quiz

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | jonathan@gmail.com    |
      | password | jonathanfunctionapp   |
    And user should be in homepage

  @Positive @SuccessfullySubmittedQuiz
  Scenario: user finished a quiz
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 6
    And user click grades menu with index 6
    And user should be in grades page
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on quiz detail page
    And user should see start button
    When user click start quiz button
    Then user should be on quiz page
    And user should see quiz timer bar
    And user should see quiz navigation bar
    And question number 1 should have "class" with attribute "is-active"
    And user should see question text for number 1
    And user should see 4 options for question 1
    And user should select option 2 as the correct answer for number 1
    And user should see previous button is currently disabled
    And user should see next button is not disabled
    When user clicks on next button
    Then question number 1 should have "class" with attribute "is-primary"
    And question number 1 should have "class" with attribute "is-previous"
    And question number 2 should have "class" with attribute "is-active"
    And user should see previous button is not disabled
    When user navigates to question number 5
    Then question number 5 should have "class" with attribute "is-active"
    And question number 1 should have "class" with attribute "is-previous"
    And question number 2 should have "class" with attribute "is-previous"
    And question number 3 should have "class" with attribute "is-previous"
    And question number 4 should have "class" with attribute "is-previous"
    And user should not see next button
    And user should see submit quiz button
    When user clicks on submit quiz button
    Then user should see finish quiz modal
    And user should see remaining trials
    And user should see their final score
    And user should see retry quiz button
    And user should see finish quiz button
    When user clicks finish quiz button
    Then user should be in grades page

  @Positive @RetriedAfterSubmittingQuiz
  Scenario: user retries the selected quiz
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 6
    And user click grades menu with index 6
    And user should be in grades page
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on quiz detail page
    And user should see start button
    When user click start quiz button
    Then user should be on quiz page
    And user should see quiz timer bar
    And user should see quiz navigation bar
    And question number 1 should have "class" with attribute "is-active"
    And user should see question text for number 1
    And user should see 4 options for question 1
    And user should select option 2 as the correct answer for number 1
    And user should see previous button is currently disabled
    And user should see next button is not disabled
    When user clicks on next button
    Then question number 1 should have "class" with attribute "is-primary"
    And question number 1 should have "class" with attribute "is-previous"
    And question number 2 should have "class" with attribute "is-active"
    And user should see previous button is not disabled
    When user navigates to question number 5
    Then question number 5 should have "class" with attribute "is-active"
    And question number 1 should have "class" with attribute "is-previous"
    And question number 2 should have "class" with attribute "is-previous"
    And question number 3 should have "class" with attribute "is-previous"
    And question number 4 should have "class" with attribute "is-previous"
    And user should not see next button
    And user should see submit quiz button
    When user clicks on submit quiz button
    Then user should see finish quiz modal
    And user should see remaining trials
    And user should see their final score
    And user should see retry quiz button
    And user should see finish quiz button
    When user clicks retry quiz button
    Then user should be on quiz page
