@Core @Users @EditUser @Regression
Feature: Edit student, mentor, judge, admin

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @EditStudent
  Scenario: user edit student from users page
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    When user click on more button on tab index 1 on users page in row number 1
    Then user should see dropdown action of the user in tab index 1 in row number 1
    When user click on button on index 1 on user dropdown action in row number 1 on tab index 1
    Then user should be on edit user page
    And batch select box should be visible
    And role select box should not be visible
    When user type "Student Edited" in name input on edit user page
    And user type "081212121213" in phone input on edit user page
    And user type "emailedited@email.com" in email input on edit user page
    And user type "University Edited" in university input on edit user page
    And user type "Address 12345 Edited" in address input on edit user page
    And user click on save button on edit user page
    Then user should be on users page with tab index 1
    And user should see toast success with message "Successfully save edited user"