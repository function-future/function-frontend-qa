@Room @Comment @Scoring @Regression
Feature: Add Comment Feature

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Negative @AddCommentAsAdmin
  Scenario: Go to Room List as Admin
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user clicks on the grades tab with index 2
    And user should see grades tab list on index 2 having "class" attribute with "is-active"
    And user should click item number 0 on grades page tab number 2
    Then user should be on assignment detail page
    And user should see assignment title
    And user should see assignment description
    And user should see assignment deadline
    And user should see action section
    And user should see edit assignment button
    And user should see delete assignment button
    And user should see view room list button
    When user click view room list button
    Then user should be in room list page
    And user should see room paging section
    And user should see room list section
    And user should see item number 1 of room list section
    And user should see student image in item number 1 of room list section
    And user should see student name in item number 1 of room list section
    And user should see student university in item number 1 of room list section
    And user should see go to detail button in item number 1 of room list section
    When user click detail button in item number 1 of room list section
    Then user should be in room detail page
    And user should see room assignment title
    And user should see room assignment description
    And user should see room discussion section
    And user should see room discussion dropdown
    And user should see room discussions as "ADMIN"
    And user should see add comment input with attribute "disabled"

  @Positive @AddCommentAsMentor
  Scenario: Go to Room List as Admin
    Given user click user section
    Then user should see dropdown as an indicator of logging in
    When user click logout button
    Then user should be in homepage
    And user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | oliver@mentor.com          |
      | password | oliverfunctionapp          |
    Then user should be in homepage
    And user should see menu bar
    And user should see grades menu with index 6
    And user click grades menu with index 6
    And user should be in grades page
    And user clicks on the grades tab with index 0
    And user should see grades tab list on index 0 having "class" attribute with "is-active"
    And user should click item number 0 on grades page tab number 0
    Then user should be on assignment detail page
    And user should see assignment title
    And user should see assignment description
    And user should see assignment deadline
    And user should see view room list button
    When user click view room list button
    Then user should be in room list page
    And user should see room paging section
    And user should see room list section
    And user should see item number 1 of room list section
    And user should see student image in item number 1 of room list section
    And user should see student name in item number 1 of room list section
    And user should see student university in item number 1 of room list section
    And user should see go to detail button in item number 1 of room list section
    When user click detail button in item number 1 of room list section
    Then user should be in room detail page
    And user should see room assignment title
    And user should see room assignment description
    And user should see room discussion section
    And user should see room discussion dropdown
    And user should see room discussions as "MENTOR"
    And user should see add comment input with no attribute "disabled"
    When user type "halo" in comment input
    And user click post comment button
    Then user should see toast success with message "Successfully posted comment on this discussion"

  @Positive @AddCommentAsStudent
  Scenario: Go to Room List as Admin
    Given user click user section
    Then user should see dropdown as an indicator of logging in
    When user click logout button
    Then user should be in homepage
    And user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | oliver@gmail.com          |
      | password | oliverfunctionapp          |
    Then user should be in homepage
    And user should see menu bar
    And user should see grades menu with index 6
    And user click grades menu with index 6
    And user should be in grades page
    And user clicks on the grades tab with index 1
    And user should see grades tab list on index 1 having "class" attribute with "is-active"
    And user should click item number 0 on grades page tab number 1
    Then user should be in room detail page
    And user should see room assignment title
    And user should see room assignment description
    And user should see room discussion section
    And user should see room discussion dropdown
    And user should see room discussions as "STUDENT"
    And user should see add comment input with no attribute "disabled"
    When user type "Hello !" in comment input
    And user click post comment button
    Then user should see toast success with message "Successfully posted comment on this discussion"
