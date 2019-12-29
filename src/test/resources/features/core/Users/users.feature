@Core @Users @CreateAllTypeOfUser @Regression
Feature: Edit and delete student, mentor, judge, admin from users page

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @DeleteStudent
  Scenario: user delete student
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    When user click on more button on tab index 1 on users page in row number 1
    Then user should see dropdown action of the user in tab index 1 in row number 1
    When user click on button on index 2 on user dropdown action in row number 1 on tab index 1
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    And user should see toast success with message "Successfully delete user"
