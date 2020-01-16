@Core @Courses @StudentCourse @Regression
Feature: Delete Course

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | student@student.com |
      | password | studentfunctionapp  |
    And user should be in homepage

  @Positive @StudentAbleToVisitCoursesPage
  Scenario: user visit courses page
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should be on courses page with tab index 2
    And user should not be able to see add button on courses page

  @Positive @StudentAbleToViewCourseDetail
  Scenario: user visit course detail
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
    And user should be on courses page with tab index 2
    And user remembers course title on tab index 2 from courses page in row number 1
    When user click on a course on tab index 2 in row number 1
    Then user should be in course detail page
    And course title on course detail page should be the same
    And user should see discussion section on course detail page

  @Positive @StudentAddDiscussionToCourse
  Scenario: user visit course detail and add discussion
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 4
    When user click courses menu on row 4
    Then user should be on courses page
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
