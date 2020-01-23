@Core @Admin @Courses @EditCourseAndCourse @Regression
Feature: Edit Course and Course

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @EditMasterCourseFromCoursesPageSuccess
  Scenario: user edit master course
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    And user should be on courses page with tab index 1
    When user click on an course more button on tab index 1 on courses page in row number 1
    Then user should see dropdown action of the course in tab index 1 in row number 1
    When user click on button on index 1 on course dropdown action in row number 1 on tab index 1
    Then user should be on edit course page
    When user type "Course Title Edited" in course title input in edit course page
    And user type "Course Description Edited" in course description input in edit course page
    And user click on save button on edit course page
    Then user should be on courses page
    And user should be on courses page with tab index 1
    And user should see toast success with message "Successfully edit master course"

  @Positive @EditCourseFromCoursesPageSuccess
  Scenario: user edit course
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    And user should see courses tab on index 2
    When user click on courses tab on index 2
    And user should be on courses page with tab index 2
    When user click on an course more button on tab index 2 on courses page in row number 1
    Then user should see dropdown action of the course in tab index 2 in row number 1
    When user click on button on index 1 on course dropdown action in row number 1 on tab index 2
    Then user should be on edit course page
    When user type "Course Title Edited" in course title input in edit course page
    And user type "Course Description Edited" in course description input in edit course page
    And user click on save button on edit course page
    Then user should be on courses page
    And user should be on courses page with tab index 2
    And user should see toast success with message "Successfully edit course"
