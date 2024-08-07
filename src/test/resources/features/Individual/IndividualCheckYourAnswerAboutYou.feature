Feature: An individual UK tax payer is able to check their answers for About you section before submitting page

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-12345678" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Checkbox "Self-employment income" at Position "5"
    And click on Save and Continue button
    And I enter "my full name" in the TextBox field
    And click on Save and Continue button
    And I select Checkbox "Email" at Position "1"
    And I select Checkbox "Telephone" at Position "2"
    And click on Save and Continue button
    And I enter "abc@abc.com" in the TextBox field
    And click on Save and Continue button
    And I enter "07777 777777" in the TextBox field
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
    And I click on the hyperlink with text "Enter the address manually"
    And I enter "2 Testing Lane" in the "Address line 1" field
    And I enter "Royal Madeuptown" in the "Town or city" field
    And I enter "ZZ9Z 9TT" in the "Postcode" field
    And click on Save and Continue button
    And click on confirm button

  @journeytests
  Scenario: For Individual - About You Section Verification
    Given I am on "Check Your Answers" page
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Case reference|CFSS-12345678|hmrc-letter-reference/change|
      |3|Who this disclosure is for|An individual|what-is-this-disclosure-about/change|
      |4|Are you the individual that the disclosure will be about?|Yes, I am the individual|are-you-the-entity/change|
      |5|The disclosure will be about|Offshore and onshore liabilities|disclose-offshore-liabilities/change|
    Then answers page should have h2 header "About you"
    And line "1" should have a label "Your full name" an answer with "my full name" and change URL ends with "your-full-name/change"
    And line "2" should have a label "Your contact preference" an answer with "Email,Telephone" and change URL ends with "contact-preference/change"
    And line "3" should have a label "Your email address" an answer with "abc@abc.com" and change URL ends with "your-email-address/change"
    And line "4" should have a label "Your telephone number" an answer with "07777 777777" and change URL ends with "your-telephone-number/change"
    And line "5" should have a label "Your address" an answer with "2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "your-address/lookup/change"
    And line "6" should have a label "Your date of birth" an answer with "01 January 1980" and change URL ends with "your-date-of-birth/change"
    And line "7" should have a label "Your main occupation" an answer with "Dentist" and change URL ends with "your-main-occupation/change"
    And line "8" should have a label "Do you have a National Insurance number?" an answer with "Yes, and I know my National Insurance number" and change URL ends with "have-national-insurance-number/change"
    And line "9" should have a label "Your National Insurance number" an answer with "AZ123456D" and change URL ends with "your-national-insurance-number/change"
    And line "10" should have a label "Are you registered for VAT?" an answer with "Yes, and I know my VAT registration number" and change URL ends with "registered-for-vat/change"
    And line "11" should have a label "Your VAT registration number" an answer with "123456789" and change URL ends with "your-vat-registration/change"
    And line "12" should have a label "Are you registered for Self Assessment?" an answer with "Yes, and I know my Unique Taxpayer Reference (UTR)" and change URL ends with "registered-for-self-assessment/change"
    And line "13" should have a label "Your Unique Taxpayer Reference" an answer with "1234567890" and change URL ends with "your-utr/change"
    And answers page should not have h2 header "About the individual"
    When I click on send notification button
    Then page navigates to "You have sent your notification"
    And the case reference should be "CFSS-12345678"
