@page
Feature: A UK tax payer is able to enter the details and continue on What is your VAT registration number page?

  Scenario: What is your VAT registration number? - UI validation
    Given I am on What is your VAT registration number page
    Then the page title should be "What is your VAT registration number? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "What is your VAT registration number?"
    And body Text should be "This is a 9 digit number on your VAT certificate or VAT online account."
    And hint with text "For example, ‘123456789’." is displayed
    And input TextBox is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed