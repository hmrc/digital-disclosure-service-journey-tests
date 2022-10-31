@page
Feature: An individual UK tax payer is able to check their answers for About you section before submitting page

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "TESTREF1" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "I want to disclose offshore liabilities" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "I want to disclose onshore liabilities" at Position "1"
    And click on Save and Continue button
    And I enter "my full name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777 777777" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "abc@abc.com" in the TextBox field
    And click on Save and Continue button
    And I enter "01" in the "Day" text box field
    And I enter "01" in the "Month" text box field
    And I enter "1980" in the "Year" text box field
    And click on Save and Continue button
    And I enter "Dentist" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know my National Insurance number" at Position "1"
    And click on Save and Continue button
    And I enter "AZ 12 34 56 D" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know my VAT registration number" at Position "1"
    And click on Save and Continue button
    And I enter "123456789" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know my Unique Taxpayer Reference (UTR)" at Position "1"
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

  Scenario: For Individual - About You Section Verification
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About you"
    And line "1" should have a label "Your full name" an answer with "my full name" and change URL ends with "your-full-name/change"
    And line "2" should have a label "Your telephone number" an answer with "07777 777777" and change URL ends with "your-telephone-number/change"
    And line "3" should have a label "Do you have an email address that you are happy to be contacted on by HMRC?" an answer with "Yes" and change URL ends with "contact-by-email/change"
    And line "4" should have a label "Your email address" an answer with "abc@abc.com" and change URL ends with "your-email-address/change"
    And line "5" should have a label "Your address" an answer with "2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "your-address/lookup/change"
    And line "6" should have a label "Your date of birth" an answer with "1 January 1980" and change URL ends with "your-date-of-birth/change"
    And line "7" should have a label "Your main occupation" an answer with "Dentist" and change URL ends with "your-main-occupation/change"
    And line "8" should have a label "Do you have a National Insurance number?" an answer with "Yes, and I know my National Insurance number" and change URL ends with "have-national-insurance-number/change"
    And line "9" should have a label "Your National Insurance number" an answer with "AZ 12 34 56 D" and change URL ends with "your-national-insurance-number/change"
    And line "10" should have a label "Are you registered for VAT?" an answer with "Yes, and I know my VAT registration number" and change URL ends with "registered-for-vat/change"
    And line "11" should have a label "Your VAT registration number" an answer with "123456789" and change URL ends with "your-vat-registration/change"
    And line "12" should have a label "Are you registered for Self Assessment?" an answer with "Yes, and I know my Unique Taxpayer Reference (UTR)" and change URL ends with "registered-for-self-assessment/change"
    And line "13" should have a label "Your Unique Taxpayer Reference" an answer with "1234567890" and change URL ends with "your-utr/change"

  Scenario: For Individual -About You - Change Route validation -With No Change
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About you"
    And clicking on change button navigates as following:
      |Label|ExpectedPage|
      |Your full name|What is your full name?|
      |Your telephone number|What is your telephone number?|
      |Your email address|What is your email address?|
      |Your date of birth|What is your date of birth?|
      |Your main occupation|What is your main occupation?|
      |Your National Insurance number|What is your National Insurance number?|
      |Your VAT registration number|What is your VAT registration number?|
      |Your Unique Taxpayer Reference|What is your Unique Tax Reference?|

  Scenario: For Individual -About You - Change Route validation -By Changing Value
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About you"
    And clicking on change button to validate changed value as following:
      |Label|ExpectedPage|ChangedValue|
      |Your full name|What is your full name?| Changed Name|
      |Your telephone number|What is your telephone number?|07777 777788|
      |Your email address|What is your email address?|changed@exmaple.com|
      |Your main occupation|What is your main occupation?|changedOccupation|
      |Your National Insurance number|What is your National Insurance number?|AZ 12 34 56 A|
      |Your VAT registration number|What is your VAT registration number?|123456798|
      |Your Unique Taxpayer Reference|What is your Unique Tax Reference?|1234567809|

  Scenario: For Individual -About You - Change Route validation -By Changing Value of Date of birth
    Given I am on "Check Your Answers" page
    When I click on change button for "Your date of birth"
    And I enter "02" in the "Day" text box field
    And I enter "02" in the "Month" text box field
    And I enter "1990" in the "Year" text box field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "About you"
    And line "6" should have a label "Your date of birth" an answer with "2 February 1990" and change URL ends with "your-date-of-birth/change"

  Scenario: For Individual -About You - Change Route validation -Address Validation-No data population
    Given I am on "Check Your Answers" page
    When I click on change button for "Your address"
    Then page navigates to "What is the country of your address?"
    And country dropdown is empty
    When click on Save and Continue button
    Then error message should be displayed with text "Enter country of the address"

  Scenario: For Individual -About You - Change Route validation -Address Validation- Needs to complete new address Journey
    Given I am on "Check Your Answers" page
    When I click on change button for "Your address"
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "3 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "3"
    And click on continue button
    And click on confirm button
    Then page navigates to "Check Your Answers"
    And line "5" should have a label "Your address" an answer with "3 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "your-address/lookup/change"
