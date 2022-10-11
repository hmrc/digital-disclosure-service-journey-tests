@page
Feature: A UK tax payer is able to enter the details and continue on What is your date of birth? page

  Scenario: What is your date of birth? - UI validation
    Given I am on What is the individual's date of birth page as "Individual" tax payer
    Then the page title should be "What is the individual's date of birth? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "What is the individual's date of birth?"
    And hint with text "For example, 20 3 1976." is displayed
    And input TextBox with value "Day" is displayed
    And input TextBox with value "Month" is displayed
    And input TextBox with value "Year" is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: What is your date of birth? - Navigation to next and back pages
    Given I am on What is the individual's date of birth page as "Individual" tax payer
    When I enter "01" in the "Day" text box field
    When I enter "01" in the "Month" text box field
    When I enter "1980" in the "Year" text box field
    And click on Save and Continue button
    Then page navigates to "What is the individual's main occupation?"
    When I click on Back button
    Then page navigates to "What is the individual's date of birth?"

