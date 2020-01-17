@Core @Admin @Batches @EditBatch @Regression
Feature: Edit Batch

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @EditBatchSuccess
  Scenario: user delete batches
    Given user should be logged in
    And user should see menu bar
    And user should see batches menu on row 4
    When user click batches menu on row 4
    Then user should be on batches page
    When user click on batch more button on row 1
    Then user should see batch dropdown action on row 1
    When user click on edit button on batch dropdown action in row number 1
    Then user should see edit batch page
    When user type "futureEdited" in batch code input in edit batch page
    And user type "Future Edited" in batch name input in edit batch page
    And user click on save button on edit batch page
    Then user should be on batches page
    And user should see toast success with message "Successfully edited batch"