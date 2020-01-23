@Core @Courses @Judge @JudgeCourse @Regression
Feature: Course with role as Judge

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | judge@judge.com  |
      | password | judgefunctionapp  |
    And user should be in homepage

  @Positive @JudgeAbleToVisitCoursesPage
  Scenario: judge visit courses page
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should be on courses page with tab index 1

  @Positive @JudgeCreateMasterCourseSuccess
  Scenario: judge create master course
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should be on courses page with tab index 1
    When user click on add button on courses page
    Then user should be on create course page
    When user type "Course Title by Mentor" in course title input in create course page
    And user type "Course Description by Mentor" in course description input in create course page
    And user click on save button on create master course page
    Then user should be on courses page
    And user should be on courses page with tab index 1
    And user should see toast success with message "Successfully create new master course"

  @Positive @JudgeGoToMasterCourseDetail
  Scenario: judge go to master course detail
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should be on courses page with tab index 1
    And user remembers course title on tab index 1 from courses page in row number 1
    When user click on a course on tab index 1 in row number 1
    Then user should be in master course detail page
    And course title on master course detail page should be the same

  @Positive @JudgeShareMasterCourse
  Scenario: judge share master course to batch
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
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

  @Positive @JudgeShareCourse
  Scenario: judge share course to batch
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
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

  @Positive @JudgeGoToCourseDetail
  Scenario: judge go to course detail
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should see courses tab on index 2
    When user click on courses tab on index 2
    And user should be on courses page with tab index 2
    And user remembers course title on tab index 2 from courses page in row number 1
    When user click on a course on tab index 2 in row number 1
    Then user should be in course detail page
    And course title on course detail page should be the same
    And user should see discussion section on course detail page

  @Positive @JudgeAddDiscussionToCourse
  Scenario: judge visit course detail and add discussion
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should see courses tab on index 2
    When user click on courses tab on index 2
    And user should be on courses page with tab index 2
    And user remembers course title on tab index 2 from courses page in row number 1
    When user click on a course on tab index 2 in row number 1
    Then user should be in course detail page
    And course title on course detail page should be the same
    And user should see discussion section on course detail page
    When user type "Let's discuss something" on discussion input on course detail page
    And user click on Post discussion button on course detail page
    And user should see toast success with message "Successfully added course discussion"
    And user should see "Let's discuss something" discussion that was posted by user

  @Positive @JudgeEditMasterCourseFromCoursesPageSuccess
  Scenario: judge edit master course
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should be on courses page with tab index 1
    When user click on an course more button on tab index 1 on courses page in row number 1
    Then user should see dropdown action of the course in tab index 1 in row number 1
    When user click on button on index 1 on course dropdown action in row number 1 on tab index 1
    Then user should be on edit course page
    When user type "Course Title Edited by Mentor" in course title input in edit course page
    And user type "Course Description Edited by Mentor" in course description input in edit course page
    And user click on save button on edit course page
    Then user should be on courses page
    And user should be on courses page with tab index 1
    And user should see toast success with message "Successfully edit master course"

  @Positive @JudgeEditCourseFromCoursesPageSuccess
  Scenario: judge edit course
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should see courses tab on index 2
    When user click on courses tab on index 2
    And user should be on courses page with tab index 2
    When user click on an course more button on tab index 2 on courses page in row number 1
    Then user should see dropdown action of the course in tab index 2 in row number 1
    When user click on button on index 1 on course dropdown action in row number 1 on tab index 2
    Then user should be on edit course page
    When user type "Course Title Edited by Mentor" in course title input in edit course page
    And user type "Course Description Edited by Mentor" in course description input in edit course page
    And user click on save button on edit course page
    Then user should be on courses page
    And user should be on courses page with tab index 2
    And user should see toast success with message "Successfully edit course"

  @Positive @JudgeDeleteCourseSuccess
  Scenario: judge delete course
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
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

  @Positive @JudgeDeleteMasterCourseSuccess
  Scenario: judge delete master course
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should be on courses page with tab index 1
    When user click on an course more button on tab index 1 on courses page in row number 1
    Then user should see dropdown action of the course in tab index 1 in row number 1
    When user click on button on index 3 on course dropdown action in row number 1 on tab index 1
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be on courses page
    And user should see toast success with message "Successfully delete master course"

  @Positive @JudgeDeleteMasterCourseFromCourseDetailSuccess
  Scenario: judge delete master course from course detail
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should be on courses page with tab index 1
    And user remembers course title on tab index 1 from courses page in row number 1
    When user click on a course on tab index 1 in row number 1
    Then user should be in master course detail page
    And course title on master course detail page should be the same
    When user click on delete button on course detail page
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be on courses page
    And user should see toast success with message "Successfully delete course"

  @Positive @JudgeDeleteCourseFromCourseDetailSuccess
  Scenario: judge delete course from course detail
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should see courses tab on index 2
    When user click on courses tab on index 2
    And user should be on courses page with tab index 2
    And user remembers course title on tab index 2 from courses page in row number 1
    When user click on a course on tab index 2 in row number 1
    Then user should be in master course detail page
    And course title on master course detail page should be the same
    When user click on delete button on course detail page
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be on courses page
    And user should see toast success with message "Successfully delete course"
