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

  Scenario: What is the country of the limited liability partnership’s address? - Select the postcode and property name or number of the limited liability partnership’s address page
    Given I navigate to "llp-address/lookup" page
    When the page is loaded successfully and verifies the page title is "What is the country of the limited liability partnership’s address? - Digital Disclosure Service - GOV.UK"
    Then page navigates to "What is the country of the limited liability partnership’s address?"
    And hint with text "For example, United Kingdom." is displayed
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of the limited liability partnership’s address?"
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    Then page navigates to "Choose the limited liability partnership’s address"
    When I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "2 Testing Lane"
    And address at line "2" is "Royal Madeuptown"
    And address at line "3" is "ZZ9Z 9TT"
    And address at line "4" is "United Kingdom"