Feature: An individual UK tax payer is able to check their answers for background section before submitting page

  @journeytests
  Scenario: On behalf of Individual - Change Route validation -  From Yes to No on behalf of the individual - Are you the individual that the disclosure will be about?
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
    And I select Checkbox "Property capital gains" at Position "4"
    And click on Save and Continue button
    And I enter "My full name" in the TextBox field
    And click on Save and Continue button
    And I select Checkbox "Email" at Position "1"
    And I select Checkbox "Telephone" at Position "2"
    And click on Save and Continue button
    And I enter "individual@email.com" in the TextBox field
    And click on Save and Continue button
    And I enter "07777 777778" in the TextBox field
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
      And I click on the hyperlink with text "Enter the address manually"
      And I enter "4 Testing Lane" in the "Address line 1" field
      And I enter "Royal Madeuptown" in the "Town or city" field
      And I enter "ZZ9Z 9TT" in the "Postcode" field
      And click on Save and Continue button
    And click on confirm button
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And answers page should have h2 header "About you"
    And answers page should not have h2 header "About the individual"
    When I click on change button for "Are you the individual that the disclosure will be about?"
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
      And I select Checkbox "Self-employment income" at Position "5"
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
      And I click on the hyperlink with text "Enter the address manually"
      And I enter "2 Testing Lane" in the "Address line 1" field
      And I enter "Royal Madeuptown" in the "Town or city" field
      And I enter "ZZ9Z 9TT" in the "Postcode" field
      And click on Save and Continue button
    And click on confirm button
    And I enter "Individual full name" in the TextBox field
    And click on Save and Continue button
    And I select Checkbox "Email" at Position "1"
    And I select Checkbox "Telephone" at Position "2"
    And click on Save and Continue button
    And I enter "abc@abc.com" in the TextBox field
    And click on Save and Continue button
    And I enter "07777 777777" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
      And I click on the hyperlink with text "Enter the address manually"
      And I enter "1 Testing Lane" in the "Address line 1" field
      And I enter "Royal Madeuptown" in the "Town or city" field
      And I enter "ZZ9Z 9TT" in the "Postcode" field
      And click on Save and Continue button
    And click on confirm button
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Case reference|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for|An individual|what-is-this-disclosure-about/change|
      |4|Are you the individual that the disclosure will be about?|I am an accountant or tax agent|are-you-the-entity/change|
      |5|Are you representing an organisation?|Yes|representing-organisation/change|
      |6|Name of the organisation you represent|represent org|representing-organisation-name/change|
      |7|The disclosure will be about|Offshore and onshore liabilities|disclose-offshore-liabilities/change|
    And answers page should have h2 header "About you"
    And line "1" should have a label "Your full name" an answer with "Individual full name" and change URL ends with "your-full-name/change"
    And line "2" should have a label "Your contact preference" an answer with "Email,Telephone" and change URL ends with "contact-preference/change"
    And line "3" should have a label "Your email address" an answer with "abc@abc.com" and change URL ends with "your-email-address/change"
    And line "4" should have a label "Your telephone number" an answer with "07777 777777" and change URL ends with "your-telephone-number/change"
    And line "5" should have a label "Your address" an answer with "1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "your-address/lookup/change"
    And answers page should have h2 header "About the individual"
    And About The Individual section should have a label "Individual’s full name" at line "1" an answer with "Individual full name" and change URL ends with "individual-full-name/change"
    And About The Individual section should have a label "Individual’s date of birth" at line "2" an answer with "01 January 1980" and change URL ends with "individual-date-of-birth/change"
    And About The Individual section should have a label "Individual’s main occupation" at line "3" an answer with "Dentist" and change URL ends with "individual-main-occupation/change"
    And About The Individual section should have a label "Does the individual have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, and I know their National Insurance number" and change URL ends with "individual-have-national-insurance-number/change"
    And About The Individual section should have a label "Individual’s National Insurance number" at line "5" an answer with "AZ123456D" and change URL ends with "individual-national-insurance-number/change"
    And About The Individual section should have a label "Is the individual registered for VAT, as far you’re aware?" at line "6" an answer with "Yes, and I know their VAT registration number" and change URL ends with "individual-registered-for-vat/change"
    And About The Individual section should have a label "Individual’s VAT registration number" at line "7" an answer with "123456789" and change URL ends with "individual-vat-registration/change"
    And About The Individual section should have a label "Is the individual registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "individual-self-assessment/change"
    And About The Individual section should have a label "Individual’s Unique Taxpayer Reference" at line "9" an answer with "1234567890" and change URL ends with "individual-utr/change"
    And About The Individual section should have a label "Individual’s address" at line "10" an answer with "2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "individual-address/lookup/change"
    When I click on send notification button
    Then page navigates to "You have sent the notification"
    And the case reference should be "CFSS-1234567"