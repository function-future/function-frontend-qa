@Core @Admin @Users @CreateAllTypeOfUser @Regression
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

  @Positive @CreateBatchForUserSuccess
  Scenario: user create batches for courses feature
    Given user should be logged in
    And user should see menu bar
    And user should see batches menu on row 4
    When user click batches menu on row 4
    Then user should be on batches page
    When user click on add button on batches page
    Then user should be on create batch page
    When user type "future" in batch code input in create batch page
    And user type "Future" in batch name input in create batch page
    And user click on save button on create batch page
    Then user should be on batches page
    And user should see toast success with message "Successfully created new batch"

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
    When user type "Student" in name input on create user page
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
    When user type "Admin" in name input on create user page
    And user type "081212121212" in phone input on create user page
    And user type "admin@email.com" in email input on create user page
    And user type "Address 12345" in address input on create user page
    And user click on save button on create user page
    Then user should be on users page with tab index 1
    And user should see toast success with message "Successfully created new user"

  @Positive @CreateMentor
  Scenario: user add mentor
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    And user should see "Mentors" tab on index 3
    When user click tab on index 3
    And user should be on users page with tab index 3
    When user click on add button on users page on tab index 3
    Then user should be on create user page
    And role select box should be visible
    And batch select box should not be visible
    And role selected on create user page should be "Mentor"
    When user type "Mentor" in name input on create user page
    And user type "081212121212" in phone input on create user page
    And user type "mentor@email.com" in email input on create user page
    And user type "Address 12345" in address input on create user page
    And user click on save button on create user page
    Then user should be on users page with tab index 1
    And user should see toast success with message "Successfully created new user"

  @Positive @CreateJudge
  Scenario: user add judge
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    And user should see "Judges" tab on index 4
    When user click tab on index 4
    And user should be on users page with tab index 4
    When user click on add button on users page on tab index 4
    Then user should be on create user page
    And role select box should be visible
    And batch select box should not be visible
    And role selected on create user page should be "Judge"
    When user type "Judge" in name input on create user page
    And user type "081212121212" in phone input on create user page
    And user type "judge@email.com" in email input on create user page
    And user type "Address 12345" in address input on create user page
    And user click on save button on create user page
    Then user should be on users page with tab index 1
    And user should see toast success with message "Successfully created new user"

  @Negative @CreateStudentWithAllFieldEmpty
  Scenario: user add student with all field empty
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    When user click on add button on users page on tab index 1
    Then user should be on create user page
    And batch select box should be visible
    And role select box should not be visible
    And user click on save button on create user page
    Then user should see error message in name input
    And user should see error message in phone input
    And user should see error message in email input
    And user should see error message in university input
    And user should see error message in address input
    And user should see error message in batch input

  @Negative @CreateAdminWithAllFieldEmpty
  Scenario: user add admin with all field empty
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
    And user click on save button on create user page
    Then user should see error message in name input
    And user should see error message in phone input
    And user should see error message in email input
    And user should see error message in address input

  @Negative @CreateMentorWithAllFieldEmpty
  Scenario: user add mentor with all field empty
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    And user should see "Mentors" tab on index 3
    When user click tab on index 3
    And user should be on users page with tab index 3
    When user click on add button on users page on tab index 3
    Then user should be on create user page
    And role select box should be visible
    And batch select box should not be visible
    And role selected on create user page should be "Mentor"
    And user click on save button on create user page
    Then user should see error message in name input
    And user should see error message in phone input
    And user should see error message in email input
    And user should see error message in address input

  @Negative @CreateJudgeWithAllFieldEmpty
  Scenario: user add judge with all field empty
    Given user should be logged in
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    And user should see "Judges" tab on index 4
    When user click tab on index 4
    And user should be on users page with tab index 4
    When user click on add button on users page on tab index 4
    Then user should be on create user page
    And role select box should be visible
    And batch select box should not be visible
    And role selected on create user page should be "Judge"
    And user click on save button on create user page
    Then user should see error message in name input
    And user should see error message in phone input
    And user should see error message in email input
    And user should see error message in address input
