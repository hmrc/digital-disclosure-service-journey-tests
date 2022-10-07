@page
Feature: A UK tax payer is able to enter the details and continue on What is the individual's full name?

  Scenario: What is the individual's full name? - UI validation
    Given I am What is your full name page for "Individual" tax payer
    Then header with text "What is the individual's full name?" is displayed
    And body should be "This should be as it's written on official documents such as their passport or driving license."
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: What is the individual's full name? - Leave blank input field
    Given I am What is your full name page for "Individual" tax payer
    When I enter "" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the individual's full name"
