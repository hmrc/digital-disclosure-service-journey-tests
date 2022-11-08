@page
Feature: A UK tax payer is able to enter the details and continue on "What is the country of the company’s address?"
  
  Scenario: What is the country of the company’s address? - Select country and navigate to next page
    Given I navigate to "company-address/lookup" page
    When the page is loaded successfully and verifies the page title is "What is the country of the company’s address? - Digital Disclosure Service - GOV.UK"
    Then page navigates to "What is the country of the company’s address?"
    And hint with text "For example, United Kingdom." is displayed
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of the company’s address?"

  Scenario: Company’s address? - UK address - Enter the Postcode, select address and navigate to address confirmation page
    Given I navigate to "company-address/lookup" page
    When page navigates to "What is the country of the company’s address?"
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of the company’s address?"
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    Then page navigates to "Choose the company’s address"
    When I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "2 Testing Lane"
    And address at line "2" is "Royal Madeuptown"
    And address at line "3" is "ZZ9Z 9TT"
    And address at line "4" is "United Kingdom"

  Scenario: Company’s address? - International address - navigate to address confirmation page
    Given I navigate to "company-address/lookup" page
    When page navigates to "What is the country of the company’s address?"
    When enter country name "Australia",select country "Australia"
    And click on continue button
    Then page navigates to "What is the company’s address?"
    When I enter "My ABC Ltd" in the "Organisation" field
    And I enter "Victoria Lane" in the "Address line 1" field
    And I enter "Riverside apartments" in the "Address line 2" field
    And I enter "South Yarra" in the "Address line 3" field
    And I enter "Melbourne" in the "Town or city" field
    And I enter "3140" in the "Postcode" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "My ABC Ltd"
    And address at line "2" is "Victoria Lane"
    And address at line "3" is "Riverside apartments"
    And address at line "4" is "South Yarra"
    And address at line "5" is "Melbourne"
    And address at line "6" is "3140"
    And address at line "7" is "Australia"




