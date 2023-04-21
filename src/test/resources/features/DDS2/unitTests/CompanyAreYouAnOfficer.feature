@page
Feature: A UK tax payer is able to enter the details and continue on Are you an officer of the company that the disclosure will be about?

  Scenario: Are you an officer of the company that the disclosure will be about? - UI Validation
    Given I navigate to "are-you-the-entity" page
    When the page is loaded successfully and verifies the page title is "Are you an officer of the company that the disclosure will be about? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Are you an officer of the company that the disclosure will be about?"
    And radio Button with text "Yes, I am an officer" is displayed at position "1"
    And radio Button with text "I am an accountant or tax agent" is displayed at position "2"
    And hint with text "We may ask for additional evidence that you’re authorised to act for them, such as the ‘Authorising a tax agent (64-8)’ form." is displayed
    And verify that radio options are not selected by default

  Scenario: Are you an officer of the company that the disclosure will be about?-Validation with no selection of Radio Button
    Given I navigate to "are-you-the-entity" page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you are an officer of the company"

  Scenario: Are you an officer of the company that the disclosure will be about?-Navigation of Error message on top popup
    Given I navigate to "are-you-the-entity" page
    And click on Save and Continue button
    When I click on problem message "Select yes if you are an officer of the company"
    Then I should navigate to Radio button "Yes, I am an officer" at Position "1"

  Scenario: Are you an officer of the company that the disclosure will be about?-Navigation with first radio button
    Given I navigate to "are-you-the-entity" page
    And I select Radio Button "Yes, I am an officer" at Position "1"
    And click on Save and Continue button
    Then user is navigated to the page with title "Offshore liabilities"

  Scenario: Are you an officer of the company that the disclosure will be about?-Navigation with second radio button
    Given I navigate to "are-you-the-entity" page
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    Then user is navigated to the page with title "Are you representing an organisation?"
