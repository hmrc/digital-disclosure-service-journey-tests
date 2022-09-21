@page
Feature: A UK tax payer is able to enter the details and continue on Are you the individual this disclosure relates to?

  Scenario: Are you the individual this disclosure relates to? - User navigates to the page and verifies the page elements
    Given user is navigated to Are you the individual this disclosure relates to Page
    When the page is loaded successfully and verifies the page title is "Are you the individual this disclosure relates to? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Are you the individual this disclosure relates to?"
    And verify that Yes and No radio options are selected by default

  Scenario: Are you the individual this disclosure relates to? - User selects Yes or No and continues to the next page. And navigated back to Are you the individual this disclosure relates to?
    Given user is navigated to Are you the individual this disclosure relates to Page
    When user selects "Yes"
    And click on Save and Continue button
    Then user is navigated to the next page with title "Do you want to disclose offshore liabilities? - Digital Disclosure Service - GOV.UK"
    When user click on Back button
    Then user is navigated back to the page with title "Are you the individual this disclosure relates to? - Digital Disclosure Service - GOV.UK"
    And option still selected is "Yes"
    When user selects "No"
    And click on Save and Continue button
    Then user is navigated to the next page with title "Do you want to disclose offshore liabilities? - Digital Disclosure Service - GOV.UK"

