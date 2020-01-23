@Core @StickyNotes @Student @StudentStickyNotes @Regression
Feature: Sticky Notes with role as Student

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | student@student.com |
      | password | studentfunctionapp  |
    And user should be in homepage

  @Positive @StudentGoToStickyNotesDetailFromFeeds
  Scenario: Go to sticky note from feeds
    Given user should be logged in
    And user remembers sticky notes title on feeds page
    When user click on sticky notes on feeds
    Then user should be on sticky notes detail page
    And user should see sticky note title is the same as displayed on feeds
    And user should not be able to see edit button on sticky notes page