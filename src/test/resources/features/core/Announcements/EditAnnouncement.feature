@Core @EditAnnouncement @Regression
Feature: Edit Announcement

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @EditAnnouncementFromAnnouncementsPage
  Scenario: user click on edit button on announcement detail page to go to edit announcement page
    Given user should be logged in
    And user should see menu bar
    And user should see announcements menu
    When user click announcements menu
    Then user should be on announcements page
    And user remembers announcement title on announcements page in row number 1
    When user click on an announcement more button on announcements page in row number 1
    Then user should see dropdown action of the announcement in row number 1
    When user click on edit button on dropdown action
    Then user should be on edit announcements page
    And user should see title on edit announcements page is the same
    When user type "Announcement Title" in announcement title input
    And user type "Announcement Description" in announcement description input
    And user click on save button on edit announcement page
    Then user should be on announcement detail page
    And announcement title should equal "Announcement Title"
    And announcement description should equal "Announcement Description"

  @Positive @EditAnnouncementFromAnnouncementDetailPage
  Scenario: user click on edit button on announcement detail page to go to edit announcement page
    Given user should be logged in
    And user should see menu bar
    And user should see announcements menu
    When user click announcements menu
    Then user should be on announcements page
    When user click on an announcement on announcements page in row number 1
    Then user should be on announcement detail page
    And user remembers announcement title on announcement detail page
    When user click on edit button on announcement detail page
    Then user should be on edit announcements page
    And user should see title on edit announcements page is the same
    When user type "Announcement Title" in announcement title input
    And user type "Announcement Description" in announcement description input
    And user click on save button on edit announcement page
    Then user should be on announcement detail page
    And announcement title should equal "Announcement Title"
    And announcement description should equal "Announcement Description"

