@page
Feature: A UK tax payer is able to enter the details and continue on What is your full name?

  @id_001
  Scenario: What is your full name? - UI validation
    Given I am What is your full name Page
    Then header with text "What is your full name?" is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  @id_002
  Scenario: What is your full name? - Enter full name
    Given I am What is your full name Page
    When I enter anything in Full Name TextBox field
    And click on Save and Continue button
    Then page navigates to "What is your telephone number?"

  @id_003
  Scenario: What is your full name? - Leave blank input field
    Given I am What is your full name Page
    When I enter no data in Full Name TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter your full name"

  @id_004
  Scenario: What is your full name? - Validation with  more than max length in TextBox field
    Given I am What is your full name Page
    When I enter data with max length of "30" in Full Name TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Full name must be between 1 and 30 characters"

  @id_005
  Scenario: What is your full name? - Navigation of on Error message on top popup
    Given I am What is your full name Page
    When I enter no data in Full Name TextBox field
    And click on Save and Continue button
    And I click on problem message "Enter your full name"
    Then I should navigate to reference number TextBox field

