@Core @StickyNotes @EditStickyNotes @Regression
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
    When user click on sticky notes on feeds
    Then user should be on sticky notes detail page
    When user click on edit button
    Then user should be on edit sticky notes page

  @Positive @EditStickyNotesAsAdmin @Admin
  Scenario: Edit sticky notes as admin
    Given user should be logged in
    When user click on sticky notes on feeds
    Then user should be on sticky notes detail page
    When user click on edit button
    Then user should be on edit sticky notes page
    When user type "Sticky Notes Title 2" in sticky notes title input
    And user type "Sticky Notes Description 2" in sticky notes description input
    And user click on save button on edit sticky notes page
    Then user should be on sticky notes detail page
    And sticky note title should equal "Sticky Notes Title 2"
    And sticky note description should equal "Sticky Notes Description 2"

  @Positive @CancelEditStickyNotes
  Scenario: user cancels on editing sticky notes
    Given user should be logged in
    When user click on sticky notes on feeds
    Then user should be on sticky notes detail page
    And user remembers sticky notes title on sticky notes page
    And user remembers sticky notes description on sticky notes page
    When user click on edit button
    Then user should be on edit sticky notes page
    When user type "Sticky Notes Title 3" in sticky notes title input
    And user type "Sticky Notes Description 3" in sticky notes description input
    And user click on cancel button on edit sticky notes page
    Then user should be on sticky notes detail page
    And user should see sticky note title is unchanged
    And user should see sticky note description is unchanged