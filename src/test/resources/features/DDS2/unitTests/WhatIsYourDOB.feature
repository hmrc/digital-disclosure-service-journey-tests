@page
Feature: A UK tax payer is able to enter the details and continue on What is your date of birth? page

  Scenario: What is your date of birth? - UI validation
    Given I am on What is your date of birth page
    Then the page title should be "What is your date of birth? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "What is your date of birth?"
    And hint with text "For example, 20 3 1976" is displayed
    And input TextBox with value "Day" is displayed
    And input TextBox with value "Month" is displayed
    And input TextBox with value "Year" is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed