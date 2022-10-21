@page
Feature: An individual UK tax payer is able to check their answers for background section before submitting page

  Scenario: For Individual -Background Section Verification -When user selects "Yes" for offshore liabilities
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
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|TESTREF1|hmrc-letter-reference/change|
      |3|Who this disclosure is for?|An individual|what-is-this-disclosure-about/change|
      |4|Are you the individual this disclosure relates to?|Yes, I am the individual|are-you-the-individual/change|
      |5|Will the disclosure be about offshore liabilities?|I want to disclose offshore liabilities|disclose-offshore-liabilities/change|
      |6|Will the disclosure also be about onshore liabilities?|I want to disclose onshore liabilities|disclose-onshore-liabilities/change|


  Scenario: For Individual -Background Section Verification -When user selects "No" for offshore liabilities
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "TESTREF1" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "I do not have offshore liabilities to disclose" at Position "2"
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
      |2|Letter reference number|TESTREF1|hmrc-letter-reference/change|
      |3|Who this disclosure is for?|An individual|what-is-this-disclosure-about/change|
      |4|Are you the individual this disclosure relates to?|Yes, I am the individual|are-you-the-individual/change|
      |5|Will the disclosure be about offshore liabilities?|I do not have offshore liabilities to disclose|disclose-offshore-liabilities/change|
      |6|Will the disclosure be about onshore liabilities?|Yes|disclose-onshore-liabilities/change|


