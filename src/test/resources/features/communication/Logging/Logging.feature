@Regression @Communication @Logging
Feature: Logging page
  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal

    @Positive @Negative @Setup
    Scenario: setup Batch
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage
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
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage
    And user should see menu bar
    And user should see users menu on row 6
    When user click users menu on row 6
    Then user should be on users page with tab index 1
    When user click on add button on users page on tab index 1
    Then user should be on create user page
    And batch select box should be visible
    And role select box should not be visible
    When user type "student" in name input on create user page without random
    And user type "081212121212" in phone input on create user page
    And user type "student@mail.com" in email input on create user page without random
    And user type "University" in university input on create user page
    And user type "Address 12345" in address input on create user page
    And user select batch on index 1 on create user page
    And user click on save button on create user page
    Then user should be on users page with tab index 1
    And user should see toast success with message "Successfully created new user"

  @Positive @Negative @Setup @CreateMentor
  Scenario: user add mentor
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage
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
    When user type "mentor" in name input on create user page without random
    And user type "081212121212" in phone input on create user page
    And user type "mentor@mail.com" in email input on create user page without random
    And user type "Address 12345" in address input on create user page
    And user click on save button on create user page
    Then user should be on users page with tab index 1
    And user should see toast success with message "Successfully created new user"


    @Positive
    Scenario: user create logging room
      When user login with these credentials
        | email    | mentor@mail.com   |
        | password | mentorfunctionapp |
      And user should be in homepage
      Given user should be logged in
      And user should see menu bar
      And user should see logging room menu on row 10
      When user click logging room menu on row 10
      Then user should be on logging rooms page
      When user click add logging room button
      Then user should be on logging room create page
      And user type "title" in title input on logging room create page
      And user type "description" in description input on logging room create page
      And user click add member modal logging room
      Then add member modal should be showed
      And user click member logging room
      And user click save on logging room create page
      Then user should be on logging rooms page
      And logging room card should be visible
      And logging room title should be "title"
      And logging room description should be "description"

    @Negative
    Scenario: user create logging room failed
      When user login with these credentials
        | email    | mentor@mail.com   |
        | password | mentorfunctionapp |
      And user should be in homepage
      Given user should be logged in
      And user should see menu bar
      And user should see logging room menu on row 10
      When user click logging room menu on row 10
      Then user should be on logging rooms page
      When user click add logging room button
      Then user should be on logging room create page
      And user click save on logging room create page
      Then user should see toast danger with message "please fill all field"

    @Positive
    Scenario: user edit logging room
      When user login with these credentials
        | email    | mentor@mail.com   |
        | password | mentorfunctionapp |
      And user should be in homepage
      Given user should be logged in
      And user should see menu bar
      And user should see logging room menu on row 10
      When user click logging room menu on row 10
      Then user should be on logging rooms page
      When user click edit first logging room
      Then user should be on logging room edit page
      And user type "new title" in title input and "new description" in description input on logging room edit page
      When user click save on logging room edit page
      Then user should be on logging rooms page
      And logging room card should be visible
      And logging room title should be "new title"
      And logging room description should be "new description"

    @Negative
    Scenario: user edit logging room failed
      When user login with these credentials
        | email    | mentor@mail.com   |
        | password | mentorfunctionapp |
      And user should be in homepage
      Given user should be logged in
      And user should see menu bar
      And user should see logging room menu on row 10
      When user click logging room menu on row 10
      Then user should be on logging rooms page
      When user click edit first logging room
      Then user should be on logging room edit page
      And user type "" in title input and "" in description input on logging room edit page
      When user click save on logging room edit page
      Then user should see toast danger with message "please fill all field"

    @Positive
    Scenario: user add logging room
      When user login with these credentials
        | email    | mentor@mail.com   |
        | password | mentorfunctionapp |
      And user should be in homepage
      Given user should be logged in
      And user should see menu bar
      And user should see logging room menu on row 10
      When user click logging room menu on row 10
      Then user should be on logging rooms page
      When user click first logging room card
      Then user should be on logging room detail page
      And user click add topic button
      Then add topic modal should be displayed
      And user input "title" as topic title
      When user click submit topic on logging room detail
      Then user should see toast success with message "success create topic"

    @Negative
    Scenario: user add logging room edit
      When user login with these credentials
        | email    | mentor@mail.com   |
        | password | mentorfunctionapp |
      And user should be in homepage
      Given user should be logged in
      And user should see menu bar
      And user should see logging room menu on row 10
      When user click logging room menu on row 10
      Then user should be on logging rooms page
      When user click first logging room card
      Then user should be on logging room detail page
      And user click add topic button
      Then add topic modal should be displayed
      And user input "" as topic title
      When user click submit topic on logging room detail
      Then user should see toast danger with message "something error"


  @Positive
  Scenario: user add log message
    When user login with these credentials
      | email    | student@mail.com   |
      | password | studentfunctionapp |
    And user should be in homepage
    Given user should be logged in
    And user should see menu bar
    And user should see logging room menu on row 10
    When user click logging room menu on row 10
    Then user should be on logging rooms page
    When user click first logging room card
    Then user should be on logging room detail page
    When user click topic number 1
    Then user should be on topic detail page
    And user type "log message" in log message input on topic detail page
    When user click send log message
    Then user should see toast success with message "Success add log"


  @Positive @Negative @DeleteStudent
  Scenario: user delete student
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage
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

  @Positive @Negative @DeleteMentor
  Scenario: user delete mentor
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage
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