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

  @Positive @EditAdmin
  Scenario: user edit admin from users page
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
    When user click on button on index 1 on user dropdown action in row number 1 on tab index 2
    Then user should be on edit user page
    And role select box should be visible
    And batch select box should not be visible
    And role selected on edit user page should be "Admin"
    When user type "Admin Edited" in name input on edit user page
    And user type "081212121212" in phone input on edit user page
    And user type "adminedited@email.com" in email input on edit user page
    And user type "Address 12345 Edited" in address input on edit user page
    And user click on save button on edit user page
    Then user should be on users page with tab index 1
    And user should see toast success with message "Successfully save edited user"

  @Positive @EditMentor
  Scenario: user edit mentor from users page
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
    When user click on button on index 1 on user dropdown action in row number 1 on tab index 3
    Then user should be on edit user page
    And role select box should be visible
    And batch select box should not be visible
    And role selected on edit user page should be "Mentor"
    When user type "Mentor Edited" in name input on edit user page
    And user type "081212121212" in phone input on edit user page
    And user type "mentoredited@email.com" in email input on edit user page
    And user type "Address 12345 Edited" in address input on edit user page
    And user click on save button on edit user page
    Then user should be on users page with tab index 1
    And user should see toast success with message "Successfully save edited user"

  @Positive @EditJudge
  Scenario: user edit judge from users page
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
    When user click on button on index 1 on user dropdown action in row number 1 on tab index 4
    Then user should be on edit user page
    And role select box should be visible
    And batch select box should not be visible
    And role selected on edit user page should be "Judge"
    When user type "Judge Edited" in name input on edit user page
    And user type "081212121212" in phone input on edit user page
    And user type "judgeedited@email.com" in email input on edit user page
    And user type "Address 12345 Edited" in address input on edit user page
    And user click on save button on edit user page
    Then user should be on users page with tab index 1
    And user should see toast success with message "Successfully save edited user"