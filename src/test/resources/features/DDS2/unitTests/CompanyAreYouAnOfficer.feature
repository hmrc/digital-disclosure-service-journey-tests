@page
Feature: A UK tax payer is able to enter the details and continue on Are you an officer of the company that the disclosure will be about?

  Scenario: Are you an officer of the company that the disclosure will be about? - UI Validation
    Given I navigate to "are-you-an-officer" page
    When the page is loaded successfully and verifies the page title is "Are you an officer of the company that the disclosure will be about? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Are you an officer of the company that the disclosure will be about?"
    And radio Button with text "Yes, I am an officer of the company" is displayed at position "1"
    And radio Button with text "No, I will be making a disclosure on behalf of an officer" is displayed at position "2"
    And hint with text "We may ask for additional evidence that you’re authorised to act for them, such as the ‘Authorising a tax agent (64-8)’ form." is displayed
    And verify that radio options are not selected by default
