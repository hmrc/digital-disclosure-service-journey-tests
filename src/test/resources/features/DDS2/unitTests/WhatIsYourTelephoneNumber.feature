@page
Feature: A UK tax payer is able to enter the details and continue on What is your telephone number page?

  Scenario: What is your telephone number? - UI validation
    Given I am on What is your telephone number page
    Then the page title should be "What is your telephone number? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "What is your telephone number?"
    And body Text should be "If this is a UK landline or an overseas number, you must include the area or dialing code."
    And hint with text "For example, 01642 123456, 07777 777777 or +33 1 2345 6788." is displayed
    And input TextBox is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed