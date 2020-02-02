@Assignment @Scoring @Regression @EditAssignment
Feature: Edit Assignment Feature

  Background:
    When user access function website
    Then user should see login bar
    When user click login button
    Then user should see login modal
    When user login with these credentials
      | email    | admin@admin.com          |
      | password | administratorfunctionapp |
    And user should be in homepage

  @Positive @EditAssignmentWithoutUploadFileAndPickDate
  Scenario: Edit Assignment Without Upload File And Pick Date
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user clicks on the grades tab with index 2
    And user should see grades tab list on index 2 having "class" attribute with "is-active"
    And user should click item number 0 on grades page tab number 2
    Then user should be on assignment detail page
    When user click edit assignment button
    Then user should be in edit assignment page
    And user should see assignment title form
    And user should see assignment title input
    And user should see text inside assignment title input
    And user should see assignment description form
    And user should see assignment description input
    And user should see text inside assignment description input
    And user should see assignment deadline form
    And user should see assignment deadline input
    And user should see assignment upload form
    And user should see assignment upload input
    And user should see assignment action section
    And user should see assignment save button
    And user should see assignment cancel button
    When user remove text from assignment title input
    And user remove text from assignment description input
    And user type "Assignment Title 1 Edited" in assignment title input
    And user type "Assignment Description 1 Edited" in assignment description input
    And user click assignment save button
#    Then user should see toast success with message "Success Save Assignment"
    Then user should be in grades page

  @Negative @EditAssignmentWithNoTitleAndDescription
  Scenario: Edit Assignment With No Title and Description
    Given user should be logged in
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user clicks on the grades tab with index 2
    And user should see grades tab list on index 2 having "class" attribute with "is-active"
    And user should click item number 0 on grades page tab number 2
    Then user should be on assignment detail page
    When user click edit assignment button
    Then user should be in edit assignment page
    And user should see assignment title form
    And user should see assignment title input
    And user should see text inside assignment title input
    And user should see assignment description form
    And user should see assignment description input
    And user should see text inside assignment description input
    And user should see assignment deadline form
    And user should see assignment deadline input
    And user should see assignment upload form
    And user should see assignment upload input
    And user should see assignment action section
    And user should see assignment save button
    And user should see assignment cancel button
    When user remove text from assignment title input
    And user remove text from assignment description input
    And user click assignment save button
#    Then user should see toast success with message "Success Save Assignment"
    Then user should see toast danger with message "Fail to create assignment"

  @Negative @EditAssignmentAsOtherRole
  Scenario: Edit Assignment As Other Role
    Given user click logout button
    And user login with these credentials
      | email    | oliver@mentor.com          |
      | password | oliverfunctionapp |
    And user should see menu bar
    And user should see grades menu with index 8
    And user click grades menu with index 8
    And user should be in grades page
    And user clicks on the grades tab with index 2
    And user should see grades tab list on index 2 having "class" attribute with "is-active"
    And user should click item number 0 on grades page tab number 2
    Then user should be on assignment detail page
    And user should not see edit assignment button