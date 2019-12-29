@Core @Users @CreateAllTypeOfUser @Regression
Feature: Create student, mentor, judge, admin

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @CreateStudent
  Scenario: user add student
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    When user click on add button on users page on tab index 1
    Then user should be on create user page
    And batch select box should be visible
    And role select box should not be visible
    When user type "Student One" in name input on create user page
    And user type "081212121212" in phone input on create user page
    And user type "email@email.com" in email input on create user page
    And user type "University" in university input on create user page
    And user type "Address 12345" in address input on create user page
    And user select batch on index 1 on create user page
    And user click on save button on create user page
    Then user should be on users page with tab index 1
    And user should see toast success with message "Successfully created new user"

  @Positive @CreateAdmin
  Scenario: user add admin
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    And user should see "Admins" tab on index 2
    When user click tab on index 2
    And user should be on users page with tab index 2
    When user click on add button on users page on tab index 2
    Then user should be on create user page
    And role select box should be visible
    And batch select box should not be visible
    And role selected on create user page should be "Admin"
    #to be continued