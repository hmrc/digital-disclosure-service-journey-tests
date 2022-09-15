@page
Feature: A UK tax payer is able to enter the details and continue on What is the disclosure about?

  Scenario: User navigates to the page and verifies the page elements
    Given user is navigated to What is the disclosure Page
    When user selects An Individual
    And click on Save and Continue button
    Then user is navigated to the next page with title "Are you the individual this disclosure relates to? - Digital Disclosure Service - GOV.UK"
    When user click on Back button
    Then user is navigated back to the page with title "What is the disclosure about? - Digital Disclosure Service - GOV.UK"