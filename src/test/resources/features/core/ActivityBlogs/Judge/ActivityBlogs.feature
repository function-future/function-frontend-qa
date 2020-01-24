@Core @ActivityBlogs @Judge @JudgeActivityBlogs @Regression
Feature: Activity Blogs Page with role as Judge

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | judge@judge.com  |
      | password | judgefunctionapp  |
    And user should be in homepage

  @Positive @JudgeVisitActivityBlogsPage
  Scenario: judge visit activity blogs page
    Given user should be logged in
    And user should see menu bar
    And user should see activity blogs menu on row 3
    When user click activity blogs menu on row 3
    Then user should be on activity blogs page

  @Positive @JudgeSuccessCreateActivityBlog
  Scenario: judge create activity blog
    Given user should be logged in
    And user should see menu bar
    And user should see activity blogs menu on row 3
    When user click activity blogs menu on row 3
    Then user should be on activity blogs page
    When user click on add button on activity blogs page
    Then user should be on create activity blog page
    When user type "Activity Blog Title" in create activity blog title input
    And user type "Activity Blog Description" in create activity blog description input
    And user click on save button on create activity blog page
    Then user should be on activity blogs page
    And user should see toast success with message "Successfully created new activity blog"

  @Positive @JudgeClickActivityBlogOnActivityBlogs
  Scenario: judge click on an activity blog on activity blogs page and redirect to activity blog detail page
    Given user should be logged in
    And user should see menu bar
    And user should see activity blogs menu on row 3
    When user click activity blogs menu on row 3
    Then user should be on activity blogs page
    And user remembers activity blog title on activity blogs page in row number 1
    When user click on an activity blog on activity blogs page in row number 1
    Then user should be on activity blog detail page
    And user should see activity blog title is the same