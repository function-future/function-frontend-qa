@Regression @Communication @Reminder
Feature: Reminders page
  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive
  Scenario: user create new reminder
    Given user should be logged in
    And user should see menu bar
    And user should see reminders menu on row 11
    When user click reminders menu on row 11
    Then user should be on reminders page
    When user click create reminder button on reminders page
    Then user should be on reminder create page
    When user click on add new members button
    Then add member modal should be visible
    When user click first member
    Then members should be successfully added
    When user fill title and description with "Reminder Title" and "Description title"
    And user click save create reminder button
    Then user should see toast success with message "Reminder has been successfully created"

  @Negative
  Scenario: user fail to create new reminder
    Given user should be logged in
    And user should see menu bar
    And user should see reminders menu on row 11
    When user click reminders menu on row 11
    Then user should be on reminders page
    When user click create reminder button on reminders page
    Then user should be on reminder create page
    And user click save create reminder button
    Then user should see toast danger with message "Something went wrong"