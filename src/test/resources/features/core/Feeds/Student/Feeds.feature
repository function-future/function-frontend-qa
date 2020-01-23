@Core @Feeds @Regression
Feature: Feeds with role as Student

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | student@student.com |
      | password | studentfunctionapp  |
    And user should be in homepage

  @Positive @StudentAnnouncementListVisibleOnFeeds
  Scenario: Announcement List Visible
    Given user should be logged in
    And user should see menu bar
    Then user should see announcement list

  @Positive @StudentGoToAnnouncementsPage
  Scenario: user click on announcements text and redirect to announcements page
    Given user should be logged in
    And user should see menu bar
    When user click on announcements text on feeds
    Then user should be on announcements page

  @Positive @StudentStickyNotesVisibleOnFeeds
  Scenario: Sticky Note Visible
    Given user should be logged in
    And user should see menu bar
    Then user should see sticky notes