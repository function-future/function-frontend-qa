@Core @Courses @DeleteCourse @Regression
Feature: Delete Course

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @DeleteMasterCourseSuccess
  Scenario: user delete master course
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    And user should be on master courses tab on index 1
    When user click on an master course more button on courses page in row number 1
    Then user should see dropdown action of the master course in row number 1
    When user click on delete button on master course dropdown action in row number 1
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be on courses page
    And user should see toast success with message "Successfully delete master course"

  @Positive @DeleteCourseSuccess
  Scenario: user delete course
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    When user click on courses tab on index 2
    And user should be on courses tab on index 2
    When user click on an master course more button on courses page in row number 1
    Then user should see dropdown action of the master course in row number 1
    When user click on delete button on master course dropdown action in row number 1
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be on courses page
    And user should see toast success with message "Successfully delete master course"

#  @Positive @CopyMasterCourse
#  Scenario: user copy master course to batch
#    Given user should be logged in
#    And user should see menu bar
#    And user should see courses menu on row 5
#    When user click courses menu on row 5
#    Then user should be on courses page
#    And user should be on master courses tab on index 1
