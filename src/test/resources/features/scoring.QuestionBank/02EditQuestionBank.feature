@EditQuestionBank @Regression
Feature: Edit Question Bank

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SuccessEditQuestionBank
  Scenario: user edit question bank
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on question bank detail page
    And user click edit question bank button
    Then user should be on edit question bank page
    When user type "Updated title for QA" in question bank title edit field
    And user type "Updated description for QA" in question bank description edit field
    And user click on save button on edit question bank page
    And user should see toast success with message "Successfully updated question bank"
    Then user should be on question bank detail page
    And question bank title on question bank detail should be "Updated title for QA"
    And question bank description on question bank detail should be "Updated description for QA"


  @Positive @CancelEditQuestionBank
  Scenario: user edit question bank
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should see tab 0 content with index 0
    And user should click item number 0 on grades page tab number 0
    Then user should be on question bank detail page
    And user click edit question bank button
    Then user should be on edit question bank page
    When user type "Updated title for QA" in question bank title edit field
    And user type "" in question bank description edit field
    And user click on cancel button on edit question bank page
    Then user should be on question bank detail page
    And question bank title on question bank detail should not be "Updated title for QA"
    And question bank description on question bank detail should not be "Updated description for QA"
