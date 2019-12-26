@Core @Batches @Regression
Feature: Batches

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @DeleteBatch
  Scenario: user delete batches
    Given user should be logged in
    And user should see menu bar
    And user should see batches menu on row 4
    When user click batches menu on row 4
    Then user should be on batches page
    When user click on batch more button on row 1
    Then user should see batch dropdown action on row 1
    When user click on delete button on batch dropdown action in row number 1
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be on announcements page
    And user should see toast success with message "Successfully delete batch"