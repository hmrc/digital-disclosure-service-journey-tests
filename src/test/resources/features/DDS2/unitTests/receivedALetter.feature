@page
Feature: A UK tax payer is able to enter the details and continue on Received A Letter from HMRC page

  Scenario: User navigates to the page and verifies the page elements
    Given User is navigated to Received A Letter Page
    When the page is loaded successfully
    Then verify the page title should be ""
    And verify the question should be ""
    And verify both the radio buttons are not selected

  Scenario: User should be able to select Yes, save and continue to the next page
    Given user is navigated to Received A Letter Page
    When the user selects "Yes" radio button
    And click on "Save and Continue" button
    Then user should be able to navigate to the next page

  Scenario: User should be able to select No, save and continue to the next page
    Given user is navigated to Received A Letter Page
    When the user selects "No" radio button
    And click on "Save and Continue" button
    Then user should be able to navigate to the next page
