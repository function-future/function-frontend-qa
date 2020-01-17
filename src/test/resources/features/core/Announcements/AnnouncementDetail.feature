@Core @Announcements @AnnouncementDetail @Regression
Feature: Announcement Detail

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @ClickAnnouncementOnFeeds
  Scenario: user click on an announcement on feeds and redirect to announcements detail page
    Given user should be logged in
    And user remembers announcement title on feeds in row number 1
    When user click on an announcement on feeds in row number 1
    Then user should be on announcement detail page
    And user should see announcement title is the same

  @Positive @ClickAnnouncementOnAnnouncements
  Scenario: user click on an announcement on announcements page and redirect to announcements detail page
    Given user should be logged in
    And user should see menu bar
    And user should see announcements menu on row 2
    When user click announcements menu on row 2
    Then user should be on announcements page
    And user remembers announcement title on announcements page in row number 1
    When user click on an announcement on announcements page in row number 1
    Then user should be on announcement detail page
    And user should see announcement title is the same
#
  @Positive @DeleteAnnouncementFromAnnouncementDetailPage
  Scenario: user delete announcement from announcement detail page
    Given user should be logged in
    And user should see menu bar
    And user should see announcements menu on row 2
    When user click announcements menu on row 2
    Then user should be on announcements page
    And user remembers announcement title on announcements page in row number 1
    When user click on an announcement on announcements page in row number 1
    Then user should be on announcement detail page
    And user should see announcement title is the same
    When user click on delete button on announcement detail page
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be on announcements page
    And user should see toast success with message "Successfully delete announcement"
