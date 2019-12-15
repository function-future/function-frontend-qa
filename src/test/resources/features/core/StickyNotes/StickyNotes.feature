@Core @StickyNotes @Regression
Feature: Sticky Notes

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @GoToStickyNotesDetailFromFeeds
  Scenario: Go to sticky note from feeds
    Given user should be logged in
    And user should see menu bar
    And user remembers sticky notes title on feeds page
    When user click on sticky notes on feeds
    Then user should be on sticky notes detail page
    And user should see sticky note title is the same as displayed on feeds