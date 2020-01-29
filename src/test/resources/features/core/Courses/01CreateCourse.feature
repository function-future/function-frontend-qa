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

  @Positive @CreateBatchForCourseSuccess
  Scenario: user create batches for courses feature
    Given user should be logged in
    And user should see menu bar
    And user should see batches menu on row 4
    When user click batches menu on row 4
    Then user should be on batches page
    When user click on add button on batches page
    Then user should be on create batch page
    When user type "future" in batch code input in create batch page
    And user type "Future" in batch name input in create batch page
    And user click on save button on create batch page
    Then user should be on batches page
    And user should see toast success with message "Successfully created new batch"

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

  @Positive @ShareMasterCourse
  Scenario: user share master course to batch
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
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
    And user should be on courses page

  @Positive @ShareCourse
  Scenario: user share course to batch
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
    When user click on button on index 2 on course dropdown action in row number 1 on tab index 2
    Then user should see share course modal
    When user click on batch on share course modal on row 1
    Then batch radio button on row 1 should be selected
    When user click on share button on share course modal
    Then user should see toast success with message "Successfully share course"
    And user should be on courses page

  @Negative @CreateMasterCourseEmptyTitle
  Scenario: user create master course with empty title
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    And user should be on courses page with tab index 1
    When user click on add button on courses page
    Then user should be on create course page
    When user type "" in course title input in create course page
    And user type "Course Description" in course description input in create course page
    And user click on save button on create master course page
    Then user should see error message in course title input

  @Negative @CreateMasterCourseEmptyDescription
  Scenario: user create master course with empty description
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    And user should be on courses page with tab index 1
    When user click on add button on courses page
    Then user should be on create course page
    When user type "Course Title" in course title input in create course page
    And user type "" in course description input in create course page
    And user click on save button on create master course page
    Then user should see error message in course description input

  @Negative @CreateMasterCourseEmptyTitleAndDescription
  Scenario: user create master course with empty title and description
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    And user should be on courses page with tab index 1
    When user click on add button on courses page
    Then user should be on create course page
    When user type "" in course title input in create course page
    And user type "" in course description input in create course page
    And user click on save button on create master course page
    Then user should see error message in course title input
    Then user should see error message in course description input