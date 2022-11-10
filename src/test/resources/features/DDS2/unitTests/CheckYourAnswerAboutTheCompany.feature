@page
Feature: An individual is able to check their answers for About the Company section before submitting page

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "TESTREF1" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "A company" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No, I will be making a disclosure on behalf of an officer" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "Organization name" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "Company name" in the TextBox field
    And click on Save and Continue button
    And I enter "12345678" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "The Farm, Royal Madeuptown, ZZ9Z 9TT" at Position "9"
    And click on continue button
    And click on confirm button
    And I enter "Agent full name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777 777777" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "abc@abc.com" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "1 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "1"
    And click on continue button
    And click on confirm button

  Scenario: About the company - Change Route validation - With No Change
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About the company"
    And About The Company section should have a label "Company’s name" at line "1" an answer with "Company name" and change URL ends with "company-name/change"
    And About The Company section should have a label "Company registration number" at line "2" an answer with "12345678" and change URL ends with "company-registration/change"
    And About The Company section should have a label "Company’s address" at line "3" an answer with "The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "company-address/lookup/change"
    And clicking on change button navigates as following:
      |Label|ExpectedPage|
      |Company’s name|What is the name of the company the disclosure will be about?|
      |Company registration number| What is the company’s registration number?|
      |Company’s address|What is the country of the company’s address?|

  Scenario: About the Company - Change Route validation -By Changing Value
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About the company"
    And clicking on change button to validate changed value as following:
      |Label|ExpectedPage|ChangedValue|
      |Company’s name|What is the name of the company the disclosure will be about?|Changed Company Name|
      |Company registration number| What is the company’s registration number?|87654321|

  Scenario: About the Company - Change Route validation -Address data is cleared
    Given I am on "Check Your Answers" page
    When I click on change button for "Company’s address"
    Then page navigates to "What is the country of the individual’s address?"
    And country dropdown is empty
    When click on Save and Continue button
    Then error message should be displayed with text "Enter country of the address"

  Scenario: About the Company - Change Route validation -Address - Needs to complete new address Journey
    Given I am on "Check Your Answers" page
    When I click on change button for "Company’s address"
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "3 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "3"
    And click on continue button
    And click on confirm button
    Then page navigates to "Check Your Answers"
    And About The Company section should have a label "Company’s address" at line "3" an answer with "3 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "company-address/lookup/change"