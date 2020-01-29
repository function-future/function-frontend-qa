@EditQuestion @Regression
Feature: Edit Question

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SuccessEditQuestionFromQuestionBankDetailPage
  Scenario: user edit question from an existing question bank via action button on question bank detail
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on question bank detail page
    And user should see question dropdown section
    And user should see list of question this question banks
    When user clicks more button on question with index 0
    Then user should see list of actions for selected question
    When user clicks on action number 0
    Then user should be on edit question page
    And user type "Edited question for QA" on question box
    And user type "Edited option 1" on option 0
    And user type "Edited option 2" on option 1
    And user type "Edited option 3" on option 2
    And user type "Edited option 4" on option 3
    And user select option 1 as the correct answer
    When user clicks edit question button
    Then user should be on question bank detail page
    And user should see toast success with message "Successfully updated a question"

  @Positive @SuccessEditQuestionFromQuestionDetailPage
  Scenario: user edit question from question detail page
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on question bank detail page
    And user should see question dropdown section
    And user should see list of question this question banks
    When user clicks on question number 0
    Then user should be on question detail page
    And user clicks on edit question button
    Then user should be on edit question page
    And user type "Updated QA question, answer should be D" on question box
    And user type "New edited option 1" on option 0
    And user type "New edited option 2" on option 1
    And user type "New edited option 3" on option 2
    And user type "New edited option 4" on option 3
    And user select option 3 as the correct answer
    When user clicks edit question button
    Then user should be on question bank detail page
    And user should see toast success with message "Successfully updated a question"


  @Positive @CancelEditQuestion
  Scenario: user cancel editing question
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on question bank detail page
    And user should see question dropdown section
    And user should see list of question this question banks
    When user clicks on question number 0
    Then user should be on question detail page
    And user clicks on edit question button
    Then user should be on edit question page
    And user type "Updated QA question, answer should be D" on question box
    And user type "New edited option 1" on option 0
    And user type "New edited option 2" on option 1
    And user type "New edited option 3" on option 2
    And user type "New edited option 4" on option 3
    And user select option 3 as the correct answer
    When user click cancel button on edit question page
    Then user should be on question detail page

