@Core @Admin @Courses @CreateMasterCourseAndCourse @Regression
Feature: Create Master Course and Course

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @CreateMasterCourseSuccess
  Scenario: user create master course
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    And user should be on courses page with tab index 1
    When user click on add button on courses page
    Then user should be on create course page
    When user type "Course Title" in course title input in create course page
    And user type "Course Description" in course description input in create course page
    And user click on save button on create master course page
    Then user should be on courses page
    And user should be on courses page with tab index 1
    And user should see toast success with message "Successfully create new master course"

