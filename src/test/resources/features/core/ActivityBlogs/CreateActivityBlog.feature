@Core @CreateActivityBlog @Regression
Feature: Create Activity Blog

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @SuccessCreateActivityBlog
  Scenario: user create activity blog
    Given user should be logged in
    And user should see menu bar
    And user should see activity blogs menu on row 3
    When user click activity blogs menu on row 3
    Then user should be on activity blogs page
    When user click on add button on activity blogs page
    Then user should be on create activity blog page
    When user type "Announcement Title" in create activity blog title input
    And user type "Announcement Description" in create activity blog description input
    And user click on save button on create activity blog page
    Then user should be on activity blogs page
    And user should see toast success with message "Successfully created new activity blog"