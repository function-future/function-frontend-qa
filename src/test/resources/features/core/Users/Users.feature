@Core @Users @UsersPage @Regression
Feature: Users page

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
    And user should see toast success with message "successfully delete user"

  @Positive @DeleteAdmin
  Scenario: user delete admin
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    And user should see "Admins" tab on index 2
    When user click tab on index 2
    And user should be on users page with tab index 2
    When user click on more button on tab index 2 on users page in row number 1
    Then user should see dropdown action of the user in tab index 2 in row number 1
    When user click on button on index 2 on user dropdown action in row number 1 on tab index 2
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    And user should see toast success with message "successfully delete user"

  @Positive @DeleteMentor
  Scenario: user delete mentor
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    And user should see "Mentors" tab on index 3
    When user click tab on index 3
    And user should be on users page with tab index 3
    When user click on more button on tab index 3 on users page in row number 1
    Then user should see dropdown action of the user in tab index 3 in row number 1
    When user click on button on index 2 on user dropdown action in row number 1 on tab index 3
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    And user should see toast success with message "successfully delete user"

  @Positive @DeleteJudge
  Scenario: user delete judge
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    And user should see "Judges" tab on index 4
    When user click tab on index 4
    And user should be on users page with tab index 4
    When user click on more button on tab index 4 on users page in row number 1
    Then user should see dropdown action of the user in tab index 4 in row number 1
    When user click on button on index 2 on user dropdown action in row number 1 on tab index 4
    Then user should see delete confirmation modal
    When user click on delete button on delete confirmation modal
    And user should see toast success with message "successfully delete user"
