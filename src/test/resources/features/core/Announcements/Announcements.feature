@Core @AnnouncementDetail @Regression
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
    And user should see announcements menu
    When user click announcements menu
    Then user should be on announcements page
    When user click on an announcement more button on announcements page in row number 1
    Then user should see dropdown action of the announcement in row number 1
    When user click on delete button on dropdown action
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be on announcements page
    And user should see success toast message

