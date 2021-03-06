@Core @Admin @Batches @CreateBatch @Regression
Feature: Create Batch

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @CreateBatchSuccess
  Scenario: user create batches
    Given user should be logged in
    And user should see menu bar
    And user should see batches menu on row 4
    When user click batches menu on row 4
    Then user should be on batches page
    When user click on add button on batches page
    Then user should be on create batch page
    When user type "future" in batch code input in create batch page
    And user type "Future" in batch name input in create batch page
    And user click on save button on create batch page
    Then user should be on batches page
    And user should see toast success with message "Successfully created new batch"

  @Negative @CreateBatchEmptyCodeAndName
  Scenario: user create batches with empty code and name
    Given user should be logged in
    And user should see menu bar
    And user should see batches menu on row 4
    When user click batches menu on row 4
    Then user should be on batches page
    When user click on add button on batches page
    Then user should be on create batch page
    And user click on save button on create batch page
    Then user should see batch code input error message
    And user should see batch name input error message

  @Negative @CreateBatchEmptyCode
  Scenario: user create batches with empty code
    Given user should be logged in
    And user should see menu bar
    And user should see batches menu on row 4
    When user click batches menu on row 4
    Then user should be on batches page
    When user click on add button on batches page
    Then user should be on create batch page
    And user type "Future" in batch name input in create batch page
    And user click on save button on create batch page
    Then user should see batch code input error message

  @Negative @CreateBatchCodeContainsSpace
  Scenario: user create batches with code contains space
    Given user should be logged in
    And user should see menu bar
    And user should see batches menu on row 4
    When user click batches menu on row 4
    Then user should be on batches page
    When user click on add button on batches page
    Then user should be on create batch page
    When user type "future 1" in batch code input in create batch page
    And user type "Future" in batch name input in create batch page
    And user click on save button on create batch page
    Then user should see batch code input has space error message

  @Negative @CreateBatchEmptyName
  Scenario: user create batches with empty name
    Given user should be logged in
    And user should see menu bar
    And user should see batches menu on row 4
    When user click batches menu on row 4
    Then user should be on batches page
    When user click on add button on batches page
    Then user should be on create batch page
    When user type "future" in batch code input in create batch page
    And user click on save button on create batch page
    Then user should see batch name input error message