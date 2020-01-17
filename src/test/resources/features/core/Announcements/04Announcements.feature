@Core @Announcements @AnnouncementsPage @Regression
Feature: Announcements

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @DeleteAnnouncementFromAnnouncementsPage
  Scenario: user delete announcement from announcements page
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
    When user click on an announcement more button on announcements page in row number 1
    Then user should see dropdown action of the announcement in row number 1
    When user click on delete button on dropdown action in row number 1
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be on announcements page
    And user should see toast success with message "Successfully delete announcement"

