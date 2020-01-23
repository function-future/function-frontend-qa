@Core @Admin @Files @FilesPage @Regression
Feature: Files page

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @CreateFolder
  Scenario: user create folder
    Given user should be logged in
    And user should see menu bar
    And user should see files menu on row 7
    When user click files menu on row 7
    Then user should be on files page
    When user click on create folder button on files page
    Then create folder modal should be visible
    When user type in "Folder Name" in folder name input box on create folder modal
    And user click on create button on create folder modal
    Then user should see toast success with message "Folder created"