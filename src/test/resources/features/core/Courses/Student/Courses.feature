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
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    And user should be on courses page with tab index 1
    And user should not be able to see add button on courses page

  @Positive @StudentAbleToViewCourseDetail
  Scenario: user visit course detail
    Given user should be logged in
    And user should see menu bar
    And user should see courses menu on row 5
    When user click courses menu on row 5
    Then user should be on courses page
    And user should be on courses page with tab index 1
    And user remembers course title on tab index 1 from courses page in row number 1
    When user click on a course on tab index 1 in row number 1
    Then user should be in course detail page
    And course title on course detail page should be the same
    And user should see discussion section on course detail page
