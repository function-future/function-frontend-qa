@AddQuestion @Regression
Feature: Add Question

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SuccessAddQuestion
  Scenario: user add question to an existing question bank
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
    When user clicks add question button
    Then user should be on add question page
    And user type "Dummy question for QA purpose?" on question box
    And user type "Option 1" on option 0
    And user type "Option 2" on option 1
    And user type "Option 3" on option 2
    And user type "Option 4" on option 3
    And user select option 0 as the correct answer
    When user clicks save question button
    Then user should be on question bank detail page
    And user should see toast success with message "Successfully created a question"

  @Positive @CancelAddQuestion
  Scenario: user cancel adding question to an existing question bank
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
    When user clicks add question button
    Then user should be on add question page
    And user type "Dummy question for QA purpose?" on question box
    And user type "Option 1" on option 0
    And user type "Option 2" on option 1
    And user type "Option 3" on option 2
    And user type "Option 4" on option 3
    And user select option 0 as the correct answer
    When user clicks cancel question button
    Then user should be on question bank detail page

  @Positive @HideInfoOnQuestionForm
  Scenario: user close dialog box that displays additional info on question form
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
    When user clicks add question button
    Then user should be on add question page
    And user should see dialog box displaying info
    When user close the dialog box by pressing the designated button
    Then user should not see dialog box displaying info

