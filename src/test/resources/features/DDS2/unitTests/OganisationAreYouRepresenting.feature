@page
Feature: A UK tax payer is able to enter the details and continue on Are you representing an organisation?

  Scenario: Are you representing an organisation? - UI Validation
    Given I navigate to "representing-organisation" page
    When the page is loaded successfully and verifies the page title is "Are you representing an organisation? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Are you representing an organisation?"
    And radio Button with text "Yes" is displayed at position "1"
    And radio Button with text "No" is displayed at position "2"
    And hint with text "For example, an accountancy or solicitor’s firm." is displayed
    And verify that radio options are not selected by default
