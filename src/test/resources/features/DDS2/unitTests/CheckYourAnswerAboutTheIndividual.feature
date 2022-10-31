@page
Feature: An individual UK tax payer is able to check their answers for About the Individual section before submitting page

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "TESTREF1" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I want to disclose offshore liabilities" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "I want to disclose onshore liabilities" at Position "1"
    And click on Save and Continue button
    And I enter "Individual full name" in the TextBox field
    And click on Save and Continue button
    And I enter "01" in the "Day" text box field
    And I enter "01" in the "Month" text box field
    And I enter "1980" in the "Year" text box field
    And click on Save and Continue button
    And I enter "Dentist" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know their National Insurance number" at Position "1"
    And click on Save and Continue button
    And I enter "AZ 12 34 56 D" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know their VAT registration number" at Position "1"
    And click on Save and Continue button
    And I enter "123456789" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know their Unique Taxpayer Reference (UTR)" at Position "1"
    And click on Save and Continue button
    And I enter "1234567890" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
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

  Scenario: On behalf of Individual -About The Individual - Change Route validation -With No Change
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About the individual"
    And clicking on change button navigates as following:
      |Label|ExpectedPage|
      |Individual’s full name|What is the individual’s full name?|
      |Individual’s date of birth|What is the individual’s date of birth?|
      |Individual’s main occupation|What is the individual’s main occupation?|
      |Individual’s National Insurance number|What is the individual’s National Insurance number?|
      |Individual’s VAT registration number|What is the individual’s VAT registration number?|
      |Individual’s Unique Taxpayer Reference|What is the individual’s Unique Tax Reference?|

  Scenario: On behalf of Individual -About The Individual - Change Route validation -By Changing Value
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About the individual"
    And clicking on change button to validate changed value as following:
      |Label|ExpectedPage|ChangedValue|
      |Individual’s full name|What is the individual’s full name?| Changed Name|
      |Individual’s main occupation|What is the individual’s main occupation?|changedOccupation|
      |Individual’s National Insurance number|What is the individual’s National Insurance number?|AZ 12 34 56 A|
      |Individual’s VAT registration number|What is the individual’s VAT registration number?|123456798|
      |Individual’s Unique Taxpayer Reference|What is the individual’s Unique Tax Reference?|1234567809|

  Scenario: On behalf of Individual -About The Individual- Change Route validation -By Changing Value of Date of birth
    Given I am on "Check Your Answers" page
    When I click on change button for "Individual’s date of birth"
    And I enter "02" in the "Day" text box field
    And I enter "02" in the "Month" text box field
    And I enter "1990" in the "Year" text box field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "About the individual"
    And About The Individual section should have a label "Individual’s date of birth" at line "2" an answer with "2 February 1990" and change URL ends with "individual-date-of-birth/change"

  Scenario: On behalf of Individual -About The Individual - Change Route validation -Address Validation-No data population
    Given I am on "Check Your Answers" page
    When I click on change button for "Individual’s address"
    Then page navigates to "What is the country of the individual’s address?"
    And country dropdown is empty
    When click on Save and Continue button
    Then error message should be displayed with text "Enter country of the address"

  Scenario: On behalf of Individual -About The Individual - Change Route validation -Address Validation- Needs to complete new address Journey
    Given I am on "Check Your Answers" page
    When I click on change button for "Individual’s address"
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "3 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "3"
    And click on continue button
    And click on confirm button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Individual’s address" at line "10" an answer with "3 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "individual-address/lookup/change"
