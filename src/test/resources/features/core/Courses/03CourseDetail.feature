@Core @Admin @Courses @CourseDetail @Regression
Feature: Course Detail

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @GoToMasterCourseDetail
  Scenario: user go to master course detail
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    And user should be on courses page with tab index 1
    And user remembers course title on tab index 1 from courses page in row number 1
    When user click on a course on tab index 1 in row number 1
    Then user should be in master course detail page
    And course title on master course detail page should be the same

  @Positive @GoToCourseDetail
  Scenario: user go to master course detail
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    And user should see courses tab on index 2
    When user click on courses tab on index 2
    And user should be on courses page with tab index 2
    And user remembers course title on tab index 2 from courses page in row number 1
    When user click on a course on tab index 2 in row number 1
    Then user should be in course detail page
    And course title on course detail page should be the same
    And user should see discussion section on course detail page

  @Positive @DeleteMasterCourseFromCourseDetailSuccess
  Scenario: user delete master course from course detail
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
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

  @Positive @DeleteCourseFromCourseDetailSuccess
  Scenario: user delete course from course detail
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
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

  @Positive @PostCourseDiscussionSuccess
  Scenario: post discussion on courses page
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
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
