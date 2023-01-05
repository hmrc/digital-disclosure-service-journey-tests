@page @regression
Feature: An Estate is able to check their answers for background submitting page

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
    And I enter "Estate full name" in the TextBox field
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
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "1 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "1"
    And click on continue button
    And click on confirm button

   Scenario: An Estate - Background - Change route - "Are you the executor or administrator of the estate that the disclosure will be about? from Yes to No
    Given I am on "Check Your Answers" page
    When I click on change button for "Are you the executor or administrator of the estate that the disclosure will be about?"
    And I select Radio Button "Yes, I am the executor or administrator of the estate" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    When I click on change button for "Are you the executor or administrator of the estate that the disclosure will be about?"
    And I select Radio Button "No, I will be making a disclosure on behalf of the executor or administrator of the estate" at Position "2"
    And click on Save and Continue button
    And I select Yes radio button
    And click on Save and Continue button
    And I enter "New Org Name" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for|An estate|what-is-this-disclosure-about/change|
      |4|Are you the executor or administrator of the estate that the disclosure will be about?|No, I will be making a disclosure on behalf of the executor or administrator of the estate|are-you-the-executor/change|
      |5|Are you representing an organisation?|Yes|representing-organisation/change|
      |6|Name of the organisation you represent|New Org Name|representing-organisation-name/change|
      |7|Will the disclosure be about offshore liabilities?|Yes|disclose-offshore-liabilities/change|
      |8|Will the disclosure also be about onshore liabilities?|Yes|disclose-onshore-liabilities/change|

  @journeytests
  Scenario: An Estate - Background - Change route - Are you the executor or administrator of the estate that the disclosure will be about? from No to Yes
    Given I am on "Check Your Answers" page
    When I click on change button for "Are you the executor or administrator of the estate that the disclosure will be about?"
    And I select Radio Button "Yes, I am the executor or administrator of the estate" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for|An estate|what-is-this-disclosure-about/change|
      |4|Are you the executor or administrator of the estate that the disclosure will be about?|Yes, I am the executor or administrator of the estate|are-you-the-executor/change|
      |5|The disclosure will be about|Offshore and onshore liabilities|disclose-offshore-liabilities/change|
    And answers page should have h2 header "About you"
    And line "1" should have a label "Your full name" an answer with "Estate full name" and change URL ends with "your-full-name/change"
    And line "2" should have a label "Your contact preference" an answer with "Email,Telephone" and change URL ends with "contact-preference/change"
    And line "3" should have a label "Your email address" an answer with "abc@abc.com" and change URL ends with "your-email-address/change"
    And line "4" should have a label "Your telephone number" an answer with "07777 777777" and change URL ends with "your-telephone-number/change"
    And line "5" should have a label "Your address" an answer with "1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "your-address/lookup/change"
    And answers page should have h2 header "About the person who died"
    And About the person who died section should have a label "Person’s full name" at line "1" an answer with "Estate Person" and change URL ends with "estates-individual-full-name/change"
    And About the person who died section should have a label "Person’s date of birth" at line "2" an answer with "1 January 1980" and change URL ends with "estates-individual-date-of-birth/change"
    And About the person who died section should have a label "Person’s main occupation" at line "3" an answer with "Dentist" and change URL ends with "estates-individual-main-occupation/change"
    And About the person who died section should have a label "Did the person have a National Insurance number, as far as you’re aware?" at line "4" an answer with "Yes, and I know their National Insurance number" and change URL ends with "estates-have-national-insurance-number/change"
    And About the person who died section should have a label "What was the person’s National Insurance number?" at line "5" an answer with "AZ 12 34 56 D" and change URL ends with "estates-individual-national-insurance-number/change"
    And About the person who died section should have a label "Was the person registered for VAT, as far as you’re aware?" at line "6" an answer with "Yes, and I know their VAT registration number" and change URL ends with "estates-individual-registered-for-vat/change"
    And About the person who died section should have a label "Person’s VAT registration number" at line "7" an answer with "123456789" and change URL ends with "estates-individual-vat-registration/change"
    And About the person who died section should have a label "Was the person registered for Self Assessment, as far as you’re aware?" at line "8" an answer with "Yes, and I know their Unique Taxpayer Reference (UTR)" and change URL ends with "estates-individual-self-assessment/change"
    And About the person who died section should have a label "Person’s Unique Taxpayer Reference" at line "9" an answer with "1234567890" and change URL ends with "estates-individual-utr/change"
    When I click on send notification button
    Then page navigates to "You have sent your notification"
    And the case reference should be "CFSS-1234567"

  Scenario: An Estate - Background - Change route - "Are you the executor or administrator of the estate that the disclosure will be about? - No change
    Given I am on "Check Your Answers" page
    When I click on change button for "Are you the executor or administrator of the estate that the disclosure will be about?"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for|An estate|what-is-this-disclosure-about/change|
      |4|Are you the executor or administrator of the estate that the disclosure will be about?|No, I will be making a disclosure on behalf of the executor or administrator of the estate|are-you-the-executor/change|
      |5|Are you representing an organisation?|Yes|representing-organisation/change|
      |6|Name of the organisation you represent|Organization name|representing-organisation-name/change|
      |7|Will the disclosure be about offshore liabilities?|Yes|disclose-offshore-liabilities/change|
      |8|Will the disclosure also be about onshore liabilities?|Yes|disclose-onshore-liabilities/change|