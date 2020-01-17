@Core @Admin @Courses @DeleteCourse @Regression
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
    And user should be on courses page with tab index 1
    When user click on add button on courses page
    Then user should be on create course page
    When user type "Course Title" in course title input in create course page
    And user type "Course Description" in course description input in create course page
    And user click on save button on create master course page
    Then user should be on courses page
    And user should be on courses page with tab index 1
    And user should see toast success with message "Successfully create new master course"
    Then user should be on courses page
    And user should be on courses page with tab index 1
    When user click on an course more button on tab index 1 on courses page in row number 1
    Then user should see dropdown action of the course in tab index 1 in row number 1
    When user click on button on index 3 on course dropdown action in row number 1 on tab index 1
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
    And user should be on courses page with tab index 1
    When user click on add button on courses page
    Then user should be on create course page
    When user type "Course Title" in course title input in create course page
    And user type "Course Description" in course description input in create course page
    And user click on save button on create master course page
    Then user should be on courses page
    And user should be on courses page with tab index 1
    And user should see toast success with message "Successfully create new master course"
    Then user should be on courses page
    And user should be on courses page with tab index 1
    When user click on an course more button on tab index 1 on courses page in row number 1
    Then user should see dropdown action of the course in tab index 1 in row number 1
    When user click on button on index 2 on course dropdown action in row number 1 on tab index 1
    Then user should see share course modal
    When user click on batch on share course modal on row 1
    Then batch radio button on row 1 should be selected
    When user click on share button on share course modal
    Then user should see toast success with message "Successfully share course"
    Then user should be on courses page
    And user should see courses tab on index 2
    When user click on courses tab on index 2
    And user should be on courses page with tab index 2
    When user click on an course more button on tab index 2 on courses page in row number 1
    Then user should see dropdown action of the course in tab index 2 in row number 1
    When user click on button on index 3 on course dropdown action in row number 1 on tab index 2
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be on courses page
    And user should see toast success with message "Successfully delete course"