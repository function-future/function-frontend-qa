@Core @EditStickyNotes @Regression
Feature: Edit Sticky Notes

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @GoToEditStickyNotesAsAdmin
  Scenario: user go to edit sticky note as admin
    Given user should be logged in
    And user should see menu bar
    And user should be on sticky notes detail page
    When user click on edit button
    Then user should be on edit sticky notes page