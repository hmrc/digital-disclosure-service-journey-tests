@page @regression
Feature: An individual UK tax payer is able to check their answers for About the Individual section before submitting page

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "represent org" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
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

  @id001 @smoke @regression
  Scenario: On behalf of Individual -About The Individual - Change Route validation -With No Change
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About the individual"
    And About The Individual section should have a label "Individual’s full name" at line "1" an answer with "Individual full name" and change URL ends with "individual-full-name/change"
    And About The Individual section should have a label "Individual’s date of birth" at line "2" an answer with "1 January 1980" and change URL ends with "individual-date-of-birth/change"
    And About The Individual section should have a label "Individual’s main occupation" at line "3" an answer with "Dentist" and change URL ends with "individual-main-occupation/change"
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, and I know their National Insurance number" and change URL ends with "individual-have-national-insurance-number/change"
    And About The Individual section should have a label "Individual’s National Insurance number" at line "5" an answer with "AZ123456D" and change URL ends with "individual-national-insurance-number/change"
    And About The Individual section should have a label "Is the individual registered for VAT, as far you’re aware?" at line "6" an answer with "Yes, and I know their VAT registration number" and change URL ends with "individual-registered-for-vat/change"
    And About The Individual section should have a label "Individual’s VAT registration number" at line "7" an answer with "123456789" and change URL ends with "individual-vat-registration/change"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"
    And About The Individual section should have a label "Individual’s Unique Taxpayer Reference" at line "9" an answer with "1234567890" and change URL ends with "individual-utr/change"
    And clicking on change button navigates as following:
      |Label|ExpectedPage|
      |Individual’s full name|What is the individual’s full name?|
      |Individual’s date of birth|What is the individual’s date of birth?|
      |Individual’s main occupation|What is the individual’s main occupation?|
      |Individual’s National Insurance number|What is the individual’s National Insurance number?|
      |Individual’s VAT registration number|What is the individual’s VAT registration number?|
      |Individual’s Unique Taxpayer Reference|What is the individual’s Unique Tax Reference?|
    When I click on send notification button
    Then page navigates to "You have sent the notification"
    And the case reference should be "CFSS-1234567"

  @id002
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

  @id003
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

  @id004
  Scenario: On behalf of Individual -About The Individual - Change Route validation -Address Validation-No data population
    Given I am on "Check Your Answers" page
    When I click on change button for "Individual’s address"
    Then page navigates to "What is the country of the individual’s address?"
    And country dropdown is empty
    When click on Save and Continue button
    Then error message should be displayed with text "Enter country of the address"

  @id005
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

  @id006
  Scenario: On behalf of Individual -About The Individual - No change route to - Are you the individual that the disclosure will be about?
    Given I am on "Check Your Answers" page
    When I click on change button for "Are you the individual that the disclosure will be about?"
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    Then answers page should have h2 header "About the individual"
    And answers page should have h2 header "Background"
    And answers page should have h2 header "About you"
    And About The Individual section should have a label "Individual’s full name" at line "1" an answer with "Individual full name" and change URL ends with "individual-full-name/change"
    And About The Individual section should have a label "Individual’s date of birth" at line "2" an answer with "1 January 1980" and change URL ends with "individual-date-of-birth/change"
    And About The Individual section should have a label "Individual’s main occupation" at line "3" an answer with "Dentist" and change URL ends with "individual-main-occupation/change"
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, and I know their National Insurance number" and change URL ends with "individual-have-national-insurance-number/change"
    And About The Individual section should have a label "Individual’s National Insurance number" at line "5" an answer with "AZ123456D" and change URL ends with "individual-national-insurance-number/change"
    And About The Individual section should have a label "Is the individual registered for VAT, as far you’re aware?" at line "6" an answer with "Yes, and I know their VAT registration number" and change URL ends with "individual-registered-for-vat/change"
    And About The Individual section should have a label "Individual’s VAT registration number" at line "7" an answer with "123456789" and change URL ends with "individual-vat-registration/change"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"
    And About The Individual section should have a label "Individual’s Unique Taxpayer Reference" at line "9" an answer with "1234567890" and change URL ends with "individual-utr/change"

  @id007
  Scenario: On behalf of Individual -About The Individual - change route to - Are you registered for VAT - No change
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for VAT, as far you’re aware?"
    And I select Radio Button "Yes, and I know their VAT registration number" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    Then answers page should have h2 header "About the individual"
    And answers page should have h2 header "Background"
    And answers page should have h2 header "About you"
    And About The Individual section should have a label "Is the individual registered for VAT, as far you’re aware?" at line "6" an answer with "Yes, and I know their VAT registration number" and change URL ends with "individual-registered-for-vat/change"
    And About The Individual section should have a label "Individual’s VAT registration number" at line "7" an answer with "123456789" and change URL ends with "individual-vat-registration/change"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"

  @id008
  Scenario: On behalf of Individual -About The Individual - change route to - VAT from Yes to No
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for VAT, as far you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    Then answers page should have h2 header "About the individual"
    And answers page should have h2 header "Background"
    And answers page should have h2 header "About you"
    And About The Individual section should have a label "Is the individual registered for VAT, as far you’re aware?" at line "6" an answer with "No" and change URL ends with "individual-registered-for-vat/change"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "7" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"

  @id009
  Scenario: On behalf of Individual -About The Individual - change route to - VAT from Yes to I do not know
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for VAT, as far you’re aware?"
    And I select Radio Button "Yes, but I do not know their VAT registration number" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    Then answers page should have h2 header "About the individual"
    And answers page should have h2 header "Background"
    And answers page should have h2 header "About you"
    And About The Individual section should have a label "Is the individual registered for VAT, as far you’re aware?" at line "6" an answer with "Yes, but I do not know their VAT registration number" and change URL ends with "individual-registered-for-vat/change"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "7" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"

  @id010
  Scenario: On behalf of Individual -About The Individual - change route to - VAT from No to Yes
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for VAT, as far you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    When I click on change button for "Is the individual registered for VAT, as far you’re aware?"
    And I select Radio Button "Yes, and I know their VAT registration number" at Position "1"
    And click on Save and Continue button
    And I enter "123455555" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    Then answers page should have h2 header "About the individual"
    And answers page should have h2 header "Background"
    And answers page should have h2 header "About you"
    And About The Individual section should have a label "Is the individual registered for VAT, as far you’re aware?" at line "6" an answer with "Yes, and I know their VAT registration number" and change URL ends with "individual-registered-for-vat/change"
    And About The Individual section should have a label "Individual’s VAT registration number" at line "7" an answer with "123455555" and change URL ends with "individual-vat-registration/change"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"

  @id011
  Scenario: On behalf of Individual -About The Individual - change route to - VAT from No to I do not know
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for VAT, as far you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    When I click on change button for "Is the individual registered for VAT, as far you’re aware?"
    And I select Radio Button "Yes, but I do not know their VAT registration number" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    Then answers page should have h2 header "About the individual"
    And answers page should have h2 header "Background"
    And answers page should have h2 header "About you"
    And About The Individual section should have a label "Is the individual registered for VAT, as far you’re aware?" at line "6" an answer with "Yes, but I do not know their VAT registration number" and change URL ends with "individual-registered-for-vat/change"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "7" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"

  @id012
  Scenario: On behalf of Individual -About The Individual - change route to - VAT from I do not know to Yes
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for VAT, as far you’re aware?"
    And I select Radio Button "Yes, but I do not know their VAT registration number" at Position "2"
    And click on Save and Continue button
    When I click on change button for "Is the individual registered for VAT, as far you’re aware?"
    And I select Radio Button "Yes, and I know their VAT registration number" at Position "1"
    And click on Save and Continue button
    And I enter "123450000" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    Then answers page should have h2 header "About the individual"
    And answers page should have h2 header "Background"
    And answers page should have h2 header "About you"
    And About The Individual section should have a label "Is the individual registered for VAT, as far you’re aware?" at line "6" an answer with "Yes, and I know their VAT registration number" and change URL ends with "individual-registered-for-vat/change"
    And About The Individual section should have a label "Individual’s VAT registration number" at line "7" an answer with "123450000" and change URL ends with "individual-vat-registration/change"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"

  @id013
  Scenario: On behalf of Individual -About The Individual - change route to - VAT from I do not know to No
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for VAT, as far you’re aware?"
    And I select Radio Button "Yes, but I do not know their VAT registration number" at Position "2"
    And click on Save and Continue button
    When I click on change button for "Is the individual registered for VAT, as far you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    Then answers page should have h2 header "About the individual"
    And answers page should have h2 header "Background"
    And answers page should have h2 header "About you"
    And About The Individual section should have a label "Is the individual registered for VAT, as far you’re aware?" at line "6" an answer with "No" and change URL ends with "individual-registered-for-vat/change"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "7" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"

  @id014
  Scenario: On behalf of Individual -About The Individual -Does the individual have a National Insurance number, as far as you’re aware?- Yes-No change
    Given I am on "Check Your Answers" page
    When I click on change button for "Does the individual have a National Insurance number, as far as you’re aware?"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, and I know their National Insurance number" and change URL ends with "individual-have-national-insurance-number/change"
    And About The Individual section should have a label "Individual’s National Insurance number" at line "5" an answer with "AZ123456D" and change URL ends with "individual-national-insurance-number/change"

  @id015
  Scenario: On behalf of Individual -About The Individual -Does the individual have a National Insurance number, as far as you’re aware?- Yes to Yes, but I do not know
    Given I am on "Check Your Answers" page
    When I click on change button for "Does the individual have a National Insurance number, as far as you’re aware?"
    And I select Radio Button "Yes, but I do not know their National Insurance number" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, but I do not know their National Insurance number" and change URL ends with "individual-have-national-insurance-number/change"
    And label "Individual’s National Insurance number" is not displayed on check your answer page

  @id016
  Scenario: On behalf of Individual -About The Individual -Does the individual have a National Insurance number, as far as you’re aware?- Yes to No
    Given I am on "Check Your Answers" page
    When I click on change button for "Does the individual have a National Insurance number, as far as you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "No" and change URL ends with "individual-have-national-insurance-number/change"
    And label "Individual’s National Insurance number" is not displayed on check your answer page

  @id017
  Scenario: On behalf of Individual -About The Individual -Does the individual have a National Insurance number, as far as you’re aware?- Yes, but I do not know to Yes, and I know
    Given I am on "Check Your Answers" page
    When I click on change button for "Does the individual have a National Insurance number, as far as you’re aware?"
    And I select Radio Button "Yes, but I do not know their National Insurance number" at Position "2"
    And click on Save and Continue button
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, but I do not know their National Insurance number" and change URL ends with "individual-have-national-insurance-number/change"
    And label "Individual’s National Insurance number" is not displayed on check your answer page
    And I click on change button for "Does the individual have a National Insurance number, as far as you’re aware?"
    And I select Radio Button "Yes, and I know their National Insurance number" at Position "1"
    And click on Save and Continue button
    And page navigates to "What is the individual’s National Insurance number?"
    And I enter "AA 12 34 56 D" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, and I know their National Insurance number" and change URL ends with "individual-have-national-insurance-number/change"
    And About The Individual section should have a label "Individual’s National Insurance number" at line "5" an answer with "AA 12 34 56 D" and change URL ends with "individual-national-insurance-number/change"

  @id018
  Scenario: On behalf of Individual -About The Individual -Does the individual have a National Insurance number, as far as you’re aware?- Yes, but I do not know to No
    Given I am on "Check Your Answers" page
    When I click on change button for "Does the individual have a National Insurance number, as far as you’re aware?"
    And I select Radio Button "Yes, but I do not know their National Insurance number" at Position "2"
    And click on Save and Continue button
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, but I do not know their National Insurance number" and change URL ends with "individual-have-national-insurance-number/change"
    And label "Individual’s National Insurance number" is not displayed on check your answer page
    And I click on change button for "Does the individual have a National Insurance number, as far as you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "No" and change URL ends with "individual-have-national-insurance-number/change"
    And label "Individual’s National Insurance number" is not displayed on check your answer page

  @id019
  Scenario: On behalf of Individual -About The Individual -Does the individual have a National Insurance number, as far as you’re aware?- No to Yes, and I know
    Given I am on "Check Your Answers" page
    When I click on change button for "Does the individual have a National Insurance number, as far as you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "No" and change URL ends with "individual-have-national-insurance-number/change"
    And label "Individual’s National Insurance number" is not displayed on check your answer page
    And I click on change button for "Does the individual have a National Insurance number, as far as you’re aware?"
    And I select Radio Button "Yes, and I know their National Insurance number" at Position "1"
    And click on Save and Continue button
    And page navigates to "What is the individual’s National Insurance number?"
    And I enter "AA 12 34 56 A" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, and I know their National Insurance number" and change URL ends with "individual-have-national-insurance-number/change"
    And About The Individual section should have a label "Individual’s National Insurance number" at line "5" an answer with "AA 12 34 56 A" and change URL ends with "individual-national-insurance-number/change"

  @id020
  Scenario: On behalf of Individual -About The Individual -Does the individual have a National Insurance number, as far as you’re aware?- No to Yes, but I do not know
    Given I am on "Check Your Answers" page
    When I click on change button for "Does the individual have a National Insurance number, as far as you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "No" and change URL ends with "individual-have-national-insurance-number/change"
    And label "Individual’s National Insurance number" is not displayed on check your answer page
    And I click on change button for "Does the individual have a National Insurance number, as far as you’re aware?"
    And I select Radio Button "Yes, but I do not know their National Insurance number" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, but I do not know their National Insurance number" and change URL ends with "individual-have-national-insurance-number/change"
    And label "Individual’s National Insurance number" is not displayed on check your answer page

  @id021
  Scenario: On behalf of Individual -About The Individual -Is the individual registered for Self Assessment, as far as you’re aware?- Yes-No change
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for Self Assessment, as far as you’re aware?"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"
    And About The Individual section should have a label "Individual’s Unique Taxpayer Reference" at line "9" an answer with "1234567890" and change URL ends with "individual-utr/change"

  @id022
  Scenario: On behalf of Individual -About The Individual -Is the individual registered for Self Assessment, as far as you’re aware?- Yes to Yes, but I do not know
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for Self Assessment, as far as you’re aware?"
    And I select Radio Button "Yes, but I do not know their Unique Taxpayer Reference (UTR)" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, but I do not know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"
    And label "Individual’s Unique Taxpayer Reference" is not displayed on check your answer page

  @id023
  Scenario: On behalf of Individual -About The Individual -Is the individual registered for Self Assessment, as far as you’re aware?- Yes to No
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for Self Assessment, as far as you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "No" and change URL ends with "individual-self-assessment/change"
    And label "Individual’s Unique Taxpayer Reference" is not displayed on check your answer page

  @id024
  Scenario: On behalf of Individual -About The Individual -Is the individual registered for Self Assessment, as far as you’re aware?- Yes, but I do not know to Yes, and I know
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for Self Assessment, as far as you’re aware?"
    And I select Radio Button "Yes, but I do not know their Unique Taxpayer Reference (UTR)" at Position "2"
    And click on Save and Continue button
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, but I do not know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"
    And label "Individual’s Unique Taxpayer Reference" is not displayed on check your answer page
    And I click on change button for "Is the individual registered for Self Assessment, as far as you’re aware?"
    And I select Radio Button "Yes, and I know their Unique Taxpayer Reference (UTR)" at Position "1"
    And click on Save and Continue button
    And page navigates to "What is the individual’s Unique Tax Reference?"
    And I enter "9876543210" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"
    And About The Individual section should have a label "Individual’s Unique Taxpayer Reference" at line "9" an answer with "9876543210" and change URL ends with "individual-utr/change"

  @id025
  Scenario: On behalf of Individual -About The Individual -Is the individual registered for Self Assessment, as far as you’re aware?- Yes, but I do not know to No
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for Self Assessment, as far as you’re aware?"
    And I select Radio Button "Yes, but I do not know their Unique Taxpayer Reference (UTR)" at Position "2"
    And click on Save and Continue button
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, but I do not know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"
    And label "Individual’s Unique Taxpayer Reference" is not displayed on check your answer page
    And I click on change button for "Is the individual registered for Self Assessment, as far as you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "No" and change URL ends with "individual-self-assessment/change"
    And label "Individual’s Unique Taxpayer Reference" is not displayed on check your answer page

  @id026
  Scenario: On behalf of Individual -About The Individual -Is the individual registered for Self Assessment, as far as you’re aware?- No to Yes, and I know
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for Self Assessment, as far as you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "No" and change URL ends with "individual-self-assessment/change"
    And label "Individual’s Unique Taxpayer Reference" is not displayed on check your answer page
    And I click on change button for "Is the individual registered for Self Assessment, as far as you’re aware?"
    And I select Radio Button "Yes, and I know their Unique Taxpayer Reference (UTR)" at Position "1"
    And click on Save and Continue button
    And page navigates to "What is the individual’s Unique Tax Reference?"
    And I enter "9876543210" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"
    And About The Individual section should have a label "Individual’s Unique Taxpayer Reference" at line "9" an answer with "9876543210" and change URL ends with "individual-utr/change"

  @id027
  Scenario: On behalf of Individual -About The Individual -Is the individual registered for Self Assessment, as far as you’re aware?- No to Yes, but I do not know
    Given I am on "Check Your Answers" page
    When I click on change button for "Is the individual registered for Self Assessment, as far as you’re aware?"
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "No" and change URL ends with "individual-self-assessment/change"
    And label "Individual’s Unique Taxpayer Reference" is not displayed on check your answer page
    When I click on change button for "Is the individual registered for Self Assessment, as far as you’re aware?"
    And I select Radio Button "Yes, but I do not know their Unique Taxpayer Reference (UTR)" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, but I do not know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"
    And label "Individual’s Unique Taxpayer Reference" is not displayed on check your answer page