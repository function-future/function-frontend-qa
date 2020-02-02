@AddQuiz @Regression
Feature: Add Quiz

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SuccessfullyAddQuiz
  Scenario: user add new quiz
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should see tab 0 content with index 0
    And user clicks on the grades tab with index 1
    And user should see tab 1 content with index 0
    When user click add button on tab with index 1
    Then user should be on add quiz page
    And user should see quiz title input box
    And user should see quiz description input box
    And user should see date input box
    And user should see "Time Limit" input on index 1
    And user should see "Trials" input on index 2
    And user should see "Question Amount" input on index 3
    And user should see a section of question bank
    When user types "Automation Quiz" on quiz title
    And user types "Dummy quiz for QA" on quiz description
    And "Time Limit" is set to 10 on input box with index 1
    And "Trials" is set to 100 on input box with index 2
    And "Question Amount" is set to 5 on input box with index 3
    When user clicks on date field
    Then user should see quiz submission calendar
    And user set deadline to week 3 day 1 to week 4 day 1
    When user clicks on add question bank to quiz button
    Then user should see modal containing list of question banks
    And user select question bank with index 0
    And user clicks on question bank checkbox with index 1
    And user clicks save button on question bank modal
    Then user should see 2 items on question bank list
    When user click save quiz button
    Then user should see toast success with message "Successfully created a quiz"
    And user should be on quiz detail page


  @Positive @AccessingQuizDetailAsStudent
  Scenario: user access quiz detail page as a student
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
    And user click grades menu with index 6
    And user should be in grades page
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on quiz detail page
    And user should not see edit quiz button
    And user should not see delete quiz button
    And user should see start button
    And user should see quiz title
    And user should see quiz description
    And user should see quiz' "Start Date" on detail box number 0
    And user should see quiz' "End Date" on detail box number 1
    And user should see quiz' "Time Limit" on detail box number 2
    And user should see quiz' "Trials" on detail box number 3
    And user should see quiz' "Question Count" on detail box number 4
    And user should see question bank dropdown section
    And user should see list of question bank in this quiz
    And user should be able to toggle question bank list when chevron button is clicked
    And user should not be able to see question bank list
    And user should be able to toggle question bank list when chevron button is clicked
    Then user should see list of question bank in this quiz
