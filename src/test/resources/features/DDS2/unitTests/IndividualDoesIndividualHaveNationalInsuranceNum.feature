@page
Feature: A UK tax payer is able to enter the details and continue on Does the individual have a National Insurance number?

  @id:001
  Scenario: Does the individual have a National Insurance number? - UI Validation
    Given I am on Does the individual have a National Insurance number Page
    When the page is loaded successfully and verifies the page title is "Does the individual have a National Insurance number? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Does the individual have a National Insurance number?"
    And radio Button with text "Yes, and I know their National Insurance number" is displayed at position "1"
    And radio Button with text "Yes, but I do not know their National Insurance number" is displayed at position "2"
    And radio Button with text "No" is displayed at position "3"
    And verify that radio options are not selected by default