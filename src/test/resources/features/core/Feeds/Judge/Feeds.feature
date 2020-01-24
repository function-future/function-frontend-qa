@Core @Feeds @Judge @JudgeFeeds @Regression
Feature: Feeds with role as Judge

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | judge@judge.com |
      | password | judgefunctionapp |
    And user should be in homepage

  @Positive @JudgeAnnouncementListVisibleOnFeeds
  Scenario: Announcement List Visible
    Given user should be logged in
    And user should see menu bar
    Then user should see announcement list

  @Positive @JudgeGoToAnnouncementsPage
  Scenario: judge click on announcements text and redirect to announcements page
    Given user should be logged in
    And user should see menu bar
    When user click on announcements text on feeds
    Then user should be on announcements page

  @Positive @JudgeStickyNotesVisibleOnFeeds
  Scenario: Sticky Note Visible
    Given user should be logged in
    And user should see menu bar
    Then user should see sticky notes