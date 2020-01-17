@Core @Admin @ActivityBlogs @EditActivityBlog @Regression
Feature: Edit Activity Blog

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @EditActivityBlogFromActivityBlogsPage
  Scenario: user click on edit button on activity blogs page to go to edit activity blog page
    Given user should be logged in
    And user should see menu bar
    And user should see activity blogs menu on row 3
    When user click activity blogs menu on row 3
    Then user should be on activity blogs page
    And user remembers activity blog title on activity blogs page in row number 1
    When user click on an activity blog more button on activity blogs page in row number 1
    Then user should see dropdown action of the activity blog in row number 1
    When user click on edit button on dropdown action of activity blog in row number 1
    Then user should be on edit activity blog page
    And user should see title on edit activity blog page is the same as activity blogs page
    When user type "Activity Blog Title Edited" in edit activity blog title input
    And user type "Activity Blog Description Edited" in edit activity blog description input
    And user click on save button on edit activity blog page
    Then user should be on activity blog detail page
    And activity blog title on activity blog detail should equal "Activity Blog Title Edited"
    And activity blog description on activity blog detail should equal "Activity Blog Description Edited"


  @Positive @EditActivityBlogFromActivityBlogDetailPage
  Scenario: user click on edit button on activity blog detail page to go to edit activity blog page
    Given user should be logged in
    And user should see menu bar
    And user should see activity blogs menu on row 3
    When user click activity blogs menu on row 3
    Then user should be on activity blogs page
    And user remembers activity blog title on activity blogs page in row number 1
    When user click on an activity blog on activity blogs page in row number 1
    Then user should be on activity blog detail page
    And user should see activity blog title is the same
    When user click on edit button on activity blog detail page
    Then user should be on edit activity blog page
    When user type "Activity Blog Title Edited Two" in edit activity blog title input
    And user type "Activity Blog Description Edited Two" in edit activity blog description input
    And user click on save button on edit activity blog page
    Then user should be on activity blog detail page
    And activity blog title on activity blog detail should equal "Activity Blog Title Edited Two"
    And activity blog description on activity blog detail should equal "Activity Blog Description Edited Two"