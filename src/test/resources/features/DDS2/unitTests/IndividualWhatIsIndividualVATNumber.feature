@page
Feature: A UK tax payer is able to enter the details and continue on What is the individual's VAT registration number page?

  Scenario: What is the individual's VAT registration number - UI validation
    Given I am on What is the individual's VAT registration number page
    Then the page title should be "What is the individual's VAT registration number? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "What is the individual's VAT registration number?"
    And body text should be "This has 9 numbers, sometimes with 'GB' at the start. You can find it on their VAT registration certificate or VAT online account."
    And hint with text "For example, ‘123456789’ or 'GB123456789'." is displayed
    And input TextBox is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed