@page
Feature: A UK tax payer is able to enter the details and continue on "What is the country of the limited liability partnership’s address?"
  
  Scenario: What is the country of the limited liability partnership’s address? - Select country and navigate to next page
    Given I navigate to "llp-address/lookup" page
    When the page is loaded successfully and verifies the page title is "What is the country of the limited liability partnership’s address? - Digital Disclosure Service - GOV.UK"
    Then page navigates to "What is the country of the limited liability partnership’s address?"
    And hint with text "For example, United Kingdom." is displayed
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of the limited liability partnership’s address?"