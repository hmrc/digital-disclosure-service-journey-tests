@page
Feature: A UK tax payer is able to enter the details and continue on Received A Letter from HMRC page

  Scenario: Received a letter page - User navigates to page and verifies the page elements
    Given user is navigated to Received A Letter Page
    When the page is loaded successfully and verifies the page title is "Are you making this disclosure because you have received a letter from HMRC? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Are you making this disclosure because you have received a letter from HMRC?"
    And verify both the radio buttons are not selected

  Scenario: Received a letter page - user should be able to select Yes, save and continue to the next page
    Given user is navigated to Received A Letter Page
    When the user selects Yes radio button
    And click on Save and Continue button
    Then user is navigated to the next page with title "What is the reference number of the letter you received from HMRC? - Digital Disclosure Service - GOV.UK"
    When user click on Back button
    Then user is navigated back to Received A letter page with title "Are you making this disclosure because you have received a letter from HMRC? - Digital Disclosure Service - GOV.UK"
    And verify that Yes radio option is still selected
    When the user selects No radio button
    And click on Save and Continue button
    Then user is navigated to the next page with title "What is the disclosure about? - Digital Disclosure Service - GOV.UK"
