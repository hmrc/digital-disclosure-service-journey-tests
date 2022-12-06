@page @regression
Feature: An individual UK tax payer is able to check their answers for background section before submitting page

  @id001 @smoke @regression
  Scenario: For Individual -Background Section Verification -When user selects "Yes" for offshore liabilities
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
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
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for?|An individual|what-is-this-disclosure-about/change|
      |4|Are you the individual this disclosure relates to?|Yes, I am the individual|are-you-the-individual/change|
      |5|Will the disclosure be about offshore liabilities?|Yes|disclose-offshore-liabilities/change|
      |6|Will the disclosure also be about onshore liabilities?|Yes|disclose-onshore-liabilities/change|

  @id002
  Scenario: For Individual -Background Section Verification -When user selects "No" for offshore liabilities
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
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
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for?|An individual|what-is-this-disclosure-about/change|
      |4|Are you the individual this disclosure relates to?|Yes, I am the individual|are-you-the-individual/change|
      |5|Will the disclosure be about offshore liabilities?|No|disclose-offshore-liabilities/change|
      |6|Will the disclosure be about onshore liabilities?|Yes|disclose-offshore-liabilities/change|

  @id003
  Scenario: For Individual -Background - Change Route validation -With Change
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234568" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
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
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And clicking on change button to validate changed value as following:
      |Label|ExpectedPage|ChangedValue|
      |Letter reference number|What is the case reference number provided on the letter you received from HMRC?|CFSS-1234568|
    When I click on change button for "Will the disclosure also be about onshore liabilities?"
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And Background section has following
      |Line|Label|Answer|URL|
      |6|Will the disclosure also be about onshore liabilities?|No|disclose-onshore-liabilities/change|
    When I click on change button for "Will the disclosure be about offshore liabilities?"
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And Background section has following
      |Line|Label|Answer|URL|
      |5|Will the disclosure be about offshore liabilities?|No|disclose-offshore-liabilities/change|

  @id004
  Scenario: For Individual -About You - Change Route -Will you be making a disclosure because you received a letter from HMRC - Yes to No
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
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
    And I click on change button for "Will you be making a disclosure because you received a letter from HMRC?"
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|No|letter-from-hmrc/change|
    And label "Letter reference number" is not displayed on check your answer page

  @id005
  Scenario: For Individual -About You - Change Route -Will you be making a disclosure because you received a letter from HMRC - No to Yes
    Given I am navigated to Received A Letter Page
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
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
    Then page navigates to "Check Your Answers"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|No|letter-from-hmrc/change|
    And label "Letter reference number" is not displayed on check your answer page
    When I click on change button for "Will you be making a disclosure because you received a letter from HMRC?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What is the case reference number provided on the letter you received from HMRC?"
    When I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|

  @id006
  Scenario: For Individual -About You - Change Route -Will you be making a disclosure because you received a letter from HMRC - No change
    Given I am navigated to Received A Letter Page
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
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
    Then page navigates to "Check Your Answers"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|No|letter-from-hmrc/change|
    And label "Letter reference number" is not displayed on check your answer page
    When I click on change button for "Will you be making a disclosure because you received a letter from HMRC?"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|No|letter-from-hmrc/change|

  Scenario: On behalf of Individual - Change Route validation -  From No to Yes I am the Individual - Are you the individual this disclosure relates to?
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
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
    When I click on change button for "Are you the individual this disclosure relates to?"
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "My full name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777 777778" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "individual@email.com" in the TextBox field
    And click on Save and Continue button
    And I enter "01" in the "Day" text box field
    And I enter "01" in the "Month" text box field
    And I enter "1981" in the "Year" text box field
    And click on Save and Continue button
    And I enter "Doctor" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know my National Insurance number" at Position "1"
    And click on Save and Continue button
    And I enter "AZ 12 34 56 D" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know my VAT registration number" at Position "1"
    And click on Save and Continue button
    And I enter "123456788" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know my Unique Taxpayer Reference (UTR)" at Position "1"
    And click on Save and Continue button
    And I enter "1234567810" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "4 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "4"
    And click on continue button
    And click on confirm button
    Then page navigates to "Check Your Answers"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for?|An individual|what-is-this-disclosure-about/change|
      |4|Are you the individual this disclosure relates to?|Yes, I am the individual|are-you-the-individual/change|
      |5|Will the disclosure be about offshore liabilities?|Yes|disclose-offshore-liabilities/change|
      |6|Will the disclosure also be about onshore liabilities?|Yes|disclose-onshore-liabilities/change|
    And answers page should have h2 header "About you"
    And line "1" should have a label "Your full name" an answer with "My full name" and change URL ends with "your-full-name/change"
    And line "2" should have a label "Your telephone number" an answer with "07777 777778" and change URL ends with "your-telephone-number/change"
    And line "3" should have a label "Do you have an email address that you are happy to be contacted on by HMRC?" an answer with "Yes" and change URL ends with "contact-by-email/change"
    And line "4" should have a label "Your email address" an answer with "individual@email.com" and change URL ends with "your-email-address/change"
    And line "5" should have a label "Your address" an answer with "4 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "your-address/lookup/change"
    And line "6" should have a label "Your date of birth" an answer with "1 January 1981" and change URL ends with "your-date-of-birth/change"
    And line "7" should have a label "Your main occupation" an answer with "Doctor" and change URL ends with "your-main-occupation/change"
    And line "8" should have a label "Do you have a National Insurance number?" an answer with "Yes, and I know my National Insurance number" and change URL ends with "have-national-insurance-number/change"
    And line "9" should have a label "Your National Insurance number" an answer with "AZ 12 34 56 D" and change URL ends with "your-national-insurance-number/change"
    And line "10" should have a label "Are you registered for VAT?" an answer with "Yes, and I know my VAT registration number" and change URL ends with "registered-for-vat/change"
    And line "11" should have a label "Your VAT registration number" an answer with "123456788" and change URL ends with "your-vat-registration/change"
    And line "12" should have a label "Are you registered for Self Assessment?" an answer with "Yes, and I know my Unique Taxpayer Reference (UTR)" and change URL ends with "registered-for-self-assessment/change"
    And line "13" should have a label "Your Unique Taxpayer Reference" an answer with "1234567810" and change URL ends with "your-utr/change"
    And answers page should not have h2 header "About the individual"

    @journeytests
  Scenario: On behalf of Individual - Change Route validation -  From Yes to No on behalf of the individual - Are you the individual this disclosure relates to?
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "My full name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777 777778" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "individual@email.com" in the TextBox field
    And click on Save and Continue button
    And I enter "01" in the "Day" text box field
    And I enter "01" in the "Month" text box field
    And I enter "1981" in the "Year" text box field
    And click on Save and Continue button
    And I enter "Doctor" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know my National Insurance number" at Position "1"
    And click on Save and Continue button
    And I enter "AZ 12 34 56 D" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know my VAT registration number" at Position "1"
    And click on Save and Continue button
    And I enter "123456788" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know my Unique Taxpayer Reference (UTR)" at Position "1"
    And click on Save and Continue button
    And I enter "1234567810" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "4 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "4"
    And click on continue button
    And click on confirm button
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And answers page should have h2 header "About you"
    And answers page should not have h2 header "About the individual"
    When I click on change button for "Are you the individual this disclosure relates to?"
    And I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
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
    And I enter "Individual full name" in the TextBox field
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
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for?|An individual|what-is-this-disclosure-about/change|
      |4|Are you the individual this disclosure relates to?|No, I am disclosing on behalf of the individual|are-you-the-individual/change|
      |5|Are you representing an organisation?|Yes|representing-organisation/change|
      |6|Name of the organisation you represent|represent org|representing-organisation-name/change|
      |7|Will the disclosure be about offshore liabilities?|Yes|disclose-offshore-liabilities/change|
      |8|Will the disclosure also be about onshore liabilities?|Yes|disclose-onshore-liabilities/change|
    And answers page should have h2 header "About you"
    And line "1" should have a label "Your full name" an answer with "Individual full name" and change URL ends with "your-full-name/change"
    And line "2" should have a label "Your telephone number" an answer with "07777 777777" and change URL ends with "your-telephone-number/change"
    And line "3" should have a label "Do you have an email address that you are happy to be contacted on by HMRC?" an answer with "Yes" and change URL ends with "contact-by-email/change"
    And line "4" should have a label "Your email address" an answer with "abc@abc.com" and change URL ends with "your-email-address/change"
    And line "5" should have a label "Your address" an answer with "1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "your-address/lookup/change"
    And answers page should have h2 header "About the individual"
    And About The Individual section should have a label "Individual’s full name" at line "1" an answer with "Individual full name" and change URL ends with "individual-full-name/change"
    And About The Individual section should have a label "Individual’s date of birth" at line "2" an answer with "1 January 1980" and change URL ends with "individual-date-of-birth/change"
    And About The Individual section should have a label "Individual’s main occupation" at line "3" an answer with "Dentist" and change URL ends with "individual-main-occupation/change"
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, and I know their National Insurance number" and change URL ends with "individual-have-national-insurance-number/change"
    And About The Individual section should have a label "Individual’s National Insurance number" at line "5" an answer with "AZ 12 34 56 D" and change URL ends with "individual-national-insurance-number/change"
    And About The Individual section should have a label "Is the individual registered for VAT, as far you’re aware?" at line "6" an answer with "Yes, and I know their VAT registration number" and change URL ends with "individual-registered-for-vat/change"
    And About The Individual section should have a label "Individual’s VAT registration number" at line "7" an answer with "123456789" and change URL ends with "individual-vat-registration/change"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"
    And About The Individual section should have a label "Individual’s Unique Taxpayer Reference" at line "9" an answer with "1234567890" and change URL ends with "individual-utr/change"
    And About The Individual section should have a label "Individual’s address" at line "10" an answer with "2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "individual-address/lookup/change"
    When I click on send notification button
    Then page navigates to "You have sent the notification"
    And the case reference should be "CFSS-1234567"