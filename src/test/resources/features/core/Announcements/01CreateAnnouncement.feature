@Core @Admin @Announcements @CreateAnnouncement @Regression
Feature: Create Announcement

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage


  @Positive @SuccessCreateAnnouncement
  Scenario: user create announcement
    Given user should be logged in
    And user should see menu bar
    And user should see announcements menu on row 2
    When user click announcements menu on row 2
    Then user should be on announcements page
    When user click on add button on announcements page
    Then user should be on create announcements page
    When user type "Announcement Title" in announcement title input
    And user type "Announcement Description" in announcement description input
    And user click on save button on edit announcement page
    Then user should be on announcements page
    And user should see toast success with message "Successfully created new announcement"

  @Negative @CreateAnnouncementEmptyTitleAndDescription
  Scenario: user create announcement with empty title and description
    Given user should be logged in
    And user should see menu bar
    And user should see announcements menu on row 2
    When user click announcements menu on row 2
    Then user should be on announcements page
    When user click on add button on announcements page
    Then user should be on create announcements page
    And user click on save button on edit announcement page
    Then user should see error message in announcement title input
    And user should see error message in announcement description input

  @Negative @CreateAnnouncementEmptyTitle
  Scenario: user create announcement with empty title
    Given user should be logged in
    And user should see menu bar
    And user should see announcements menu on row 2
    When user click announcements menu on row 2
    Then user should be on announcements page
    When user click on add button on announcements page
    Then user should be on create announcements page
    And user type "Announcement Description" in announcement description input
    And user click on save button on edit announcement page
    Then user should see error message in announcement title input

  @Negative @CreateAnnouncementEmptyDescription
  Scenario: user create announcement with empty description
    Given user should be logged in
    And user should see menu bar
    And user should see announcements menu on row 2
    When user click announcements menu on row 2
    Then user should be on announcements page
    When user click on add button on announcements page
    Then user should be on create announcements page
    When user type "Announcement Title" in announcement title input
    And user click on save button on edit announcement page
    Then user should see error message in announcement description input