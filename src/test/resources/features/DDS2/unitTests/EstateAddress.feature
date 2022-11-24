@page
Feature: A UK tax payer is able to enter the details and continue on "What was the country of the person’s address?"
  
  Scenario: What was the country of the person’s address? - Select country and navigate to next page
    Given I navigate to "estate-address/lookup" page
    When the page is loaded successfully and verifies the page title is "What was the country of the person’s address? - Digital Disclosure Service - GOV.UK"
    Then page navigates to "What was the country of the person’s address?"
    And hint with text "For example, United Kingdom." is displayed
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What was the postcode and property name or number of the person’s address?"