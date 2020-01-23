@Core @StickyNotes @Judge @JudgeStickyNotes @Regression
Feature: Sticky Notes with role as Judge

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | judge@judge.com |
      | password | judgefunctionapp |
    And user should be in homepage

  @Positive @JudgeGoToStickyNotesDetailFromFeeds
  Scenario: judge go to sticky note from feeds
    Given user should be logged in
    And user remembers sticky notes title on feeds page
    When user click on sticky notes on feeds
    Then user should be on sticky notes detail page
    And user should see sticky note title is the same as displayed on feeds
    And user should not be able to see edit button on sticky notes page