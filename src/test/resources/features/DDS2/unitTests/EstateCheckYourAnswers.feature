@page @regression
Feature: An Estate is able to check their answers for About the person who died section before submitting page

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An estate" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No, I will be making a disclosure on behalf of the executor or administrator of the estate" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "Organization name" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "Estate Person" in the TextBox field
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
    And I enter "My full name" in the TextBox field
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

    @smoke
  Scenario: An Estate - About the person who died - Check your answers and change navigation
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About the person who died"
    And About the person who died section should have a label "Person’s full name" at line "1" an answer with "Estate Person" and change URL ends with "estates-individual-full-name/change"
    And About the person who died section should have a label "Person’s date of birth" at line "2" an answer with "1 January 1980" and change URL ends with "estates-individual-date-of-birth/change"
    And About the person who died section should have a label "Person’s main occupation" at line "3" an answer with "Dentist" and change URL ends with "estates-individual-main-occupation/change"
    And About the person who died section should have a label "Did the person have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, and I know their National Insurance number" and change URL ends with "estates-have-national-insurance-number/change"
    And About the person who died section should have a label "What was the person’s National Insurance number?" at line "5" an answer with "AZ 12 34 56 D" and change URL ends with "estates-individual-national-insurance-number/change"
    And About the person who died section should have a label "Was the person registered for VAT, as far as you’re aware?" at line "6" an answer with "Yes, and I know their VAT registration number" and change URL ends with "estates-individual-registered-for-vat/change"
    And About the person who died section should have a label "Person’s VAT registration number" at line "7" an answer with "123456789" and change URL ends with "estates-individual-vat-registration/change"
    And About the person who died section should have a label "Was the person registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "estates-individual-self-assessment/change"
    And About the person who died section should have a label "Person’s Unique Taxpayer Reference" at line "9" an answer with "1234567890" and change URL ends with "estates-individual-utr/change"
    And About the person who died section should have a label "Person’s address" at line "10" an answer with "2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "estate-address/lookup/change"
    And clicking on change button navigates as following:
      |Label|ExpectedPage|
      |Person’s full name|What was the name of the person who died?|
      |Person’s date of birth|What was the person’s date of birth?|
      |Person’s main occupation|What was the person’s main occupation?|
      |Did the person have a National Insurance number, as far as you’re aware?|Did the person have a National Insurance number, as far as you’re aware?|
      |What was the person’s National Insurance number?|What was the person’s National Insurance number?|
      |Was the person registered for VAT, as far as you’re aware?|Was the person registered for VAT, as far as you’re aware?|
      |Person’s VAT registration number|What was the person’s VAT registration number?|
      |Was the person registered for Self Assessment, as far as you’re aware?|Was the person registered for Self Assessment, as far as you’re aware?|
      |Person’s Unique Taxpayer Reference|What was the person’s Unique Taxpayer Reference?|
      |Person’s address|What was the country of the person’s address?|

