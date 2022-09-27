@page
Feature: A UK tax payer is able to enter the details and continue on Do you have a National Insurance number?

  Scenario: Are you the individual this disclosure relates to? - UI Validation
    Given I am on Do you have a National Insurance number Page
    When the page is loaded successfully and verifies the page title is "Do you have a National Insurance number? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Do you have a National Insurance number?"
    And radio Button with text "Yes, and I know my National Insurance number" is displayed at position "1"
    And radio Button with text "Yes, but I do not know my National Insurance number" is displayed at position "2"
    And radio Button with text "No" is displayed at position "3"
    And verify that radio options are not selected by default



