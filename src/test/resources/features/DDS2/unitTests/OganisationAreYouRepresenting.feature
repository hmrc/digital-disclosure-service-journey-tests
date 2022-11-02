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

  Scenario: Are you an officer of the company that the disclosure will be about?-Validation with no selection of Radio Button
    Given I navigate to "representing-organisation" page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you are representing an organisation"

  Scenario: Are you an officer of the company that the disclosure will be about?-Navigation of Error message on top popup
    Given I navigate to "representing-organisation" page
    And click on Save and Continue button
    When I click on problem message "Select yes if you are representing an organisation"
    Then I should navigate to Radio button "Yes" at Position "1"

  Scenario: Are you an officer of the company that the disclosure will be about?-Navigation with first radio button
    Given I navigate to "representing-organisation" page
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then user is navigated to the page with title "What is the name of the organisation you represent?"

  Scenario: Are you an officer of the company that the disclosure will be about?-Navigation with second radio button
    Given I navigate to "representing-organisation" page
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then user is navigated to the page with title "Offshore liabilities"