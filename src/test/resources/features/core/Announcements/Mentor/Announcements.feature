@Core @AnnouncementDetail @Mentor @MentorAnnouncements @Regression
Feature: Announcement Page with role as Mentor

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | mentor@mentor.com |
      | password | mentorfunctionapp |
    And user should be in homepage

  @Positive @MentorVisitAnnouncementsPage
  Scenario: user visit announcements page
    Given user should be logged in
    And user should see menu bar
    And user should see announcements menu on row 2
    When user click announcements menu on row 2
    Then user should be on announcements page
    And user should not be able to see add button on announcements page
    And user should not be able to see announcement more button on announcements page in row number 1

  @Positive @MentorClickAnnouncementOnAnnouncements
  Scenario: student click on an announcement on announcements page and redirect to announcements detail page
    Given user should be logged in
    And user should see menu bar
    And user should see announcements menu on row 2
    When user click announcements menu on row 2
    Then user should be on announcements page
    And user remembers announcement title on announcements page in row number 1
    When user click on an announcement on announcements page in row number 1
    Then user should be on announcement detail page
    And user should see announcement title is the same
    And user should not be able to see edit button on announcement detail page
    And user should not be able to see delete button on announcement detail page

  @Positive @MentorClickAnnouncementOnFeeds
  Scenario: mentor click on an announcement on feeds and redirect to announcements detail page
    Given user should be logged in
    And user remembers announcement title on feeds in row number 1
    When user click on an announcement on feeds in row number 1
    Then user should be on announcement detail page
    And user should see announcement title is the same