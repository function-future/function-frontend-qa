@Core @ActivityBlogDetail @Regression
Feature: Activity Blog Detail Page

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @ClickActivityBlogOnActivityBlogs
  Scenario: user click on an activity blog on activity blogs page and redirect to activity blog detail page
    Given user should be logged in
    And user should see menu bar
    And user should see activity blogs menu on row 3
    When user click activity blogs menu on row 3
    Then user should be on activity blogs page
    And user remembers activity blog title on activity blogs page in row number 1
    When user click on an activity blog on activity blogs page in row number 1
    Then user should be on activity blog detail page
    And user should see activity blog title is the same
#
  @Positive @DeleteActivityBlogsFromActivityBlogDetailPage
  Scenario: user delete activity blog from activity blog detail page
    Given user should be logged in
    And user should see menu bar
    And user should see activity blogs menu on row 3
    When user click activity blogs menu on row 3
    Then user should be on activity blogs page
    And user remembers activity blog title on activity blogs page in row number 1
    When user click on an activity blog on activity blogs page in row number 1
    Then user should be on activity blog detail page
    And user should see activity blog title is the same
    When user click on delete button on activity blog detail page
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    Then user should be on activity blogs page
    And user should see toast success with message "Successfully delete activity blog"
