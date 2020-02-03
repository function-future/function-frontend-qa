@EditQuiz @Regression
Feature: Edit Quiz

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SuccessfullyEditQuizFromQuizDetailPage
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
    And user should see edit quiz button
    When user click edit quiz button
    Then user should be on edit quiz page
    And user should see quiz title input box
    And user should see quiz description input box
    And user should see date input box
    And user should see "Time Limit" input on index 1
    And user should see "Trials" input on index 2
    And user should see "Question Amount" input on index 3
    And user should see a section of question bank
    When user types "Automatically updated quiz" on quiz title
    And user types "Updated by QA while automation" on quiz description
    And "Time Limit" is set to 20 on input box with index 1
    And "Trials" is set to 200 on input box with index 2
    And "Question Amount" is set to 3 on input box with index 3
    When user clicks on date field
    Then user should see quiz submission calendar
    And user set deadline to week 3 day 1 to week 4 day 1
    When user clicks on add question bank to quiz button
    Then user should see modal containing list of question banks
    And user select question bank with index 0
    And user clicks on question bank checkbox with index 1
    And user clicks save button on question bank modal
    Then user should see 1 items on question bank list
    When user click save quiz button
    Then user should see toast success with message "Successfully updated quiz"
    And user should be in grades page

  @Positive @SuccessfullyEditQuizFromGradesPage
  Scenario: user edit an existing quiz from quiz list
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
    Then user clicks on action number 0
    Then user should be on edit quiz page
    And user should see quiz title input box
    And user should see quiz description input box
    And user should see date input box
    And user should see "Time Limit" input on index 1
    And user should see "Trials" input on index 2
    And user should see "Question Amount" input on index 3
    And user should see a section of question bank
    When user types "Automatically updated quiz" on quiz title
    And user types "Updated by QA while automation" on quiz description
    And "Time Limit" is set to 20 on input box with index 1
    And "Trials" is set to 200 on input box with index 2
    And "Question Amount" is set to 3 on input box with index 3
    When user clicks on date field
    Then user should see quiz submission calendar
    And user set deadline to week 3 day 1 to week 4 day 1
    When user clicks on add question bank to quiz button
    Then user should see modal containing list of question banks
    And user select question bank with index 0
    And user clicks on question bank checkbox with index 1
    And user clicks save button on question bank modal
    Then user should see 1 items on question bank list
    When user click save quiz button
    Then user should see toast success with message "Successfully updated quiz"
    And user should be in grades page
