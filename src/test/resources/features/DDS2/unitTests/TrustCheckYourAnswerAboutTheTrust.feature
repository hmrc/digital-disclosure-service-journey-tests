@page
Feature: A trust is able to check their answers for About the Trust section before submitting page

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "A trust" at Position "5"
    And click on Save and Continue button
    And I select Radio Button "No, I will be making a disclosure on behalf of a trustee" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "Organization name" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "Trust name" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "The Farm, Royal Madeuptown, ZZ9Z 9TT" at Position "9"
    And click on continue button
    And click on confirm button
    And I enter "Trust full name" in the TextBox field
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

  @journeytests
  Scenario: About the Trust - CYA and send notification
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for?|A trust|what-is-this-disclosure-about/change|
      |4|Are you a trustee of the trust that the disclosure will be about?|No, I will be making a disclosure on behalf of a trustee|are-you-a-trustee/change|
      |5|Are you representing an organisation?|Yes|representing-organisation/change|
      |6|Name of the organisation you represent|Organization name|representing-organisation-name/change|
      |7|Will the disclosure be about offshore liabilities?|Yes|disclose-offshore-liabilities/change|
      |8|Will the disclosure also be about onshore liabilities?|Yes|disclose-onshore-liabilities/change|
    And answers page should have h2 header "About you"
    And line "1" should have a label "Your full name" an answer with "Trust full name" and change URL ends with "your-full-name/change"
    And line "2" should have a label "Your contact preference" an answer with "Email,Telephone" and change URL ends with "contact-preference/change"
    And line "3" should have a label "Your email address" an answer with "abc@abc.com" and change URL ends with "your-email-address/change"
    And line "4" should have a label "Your telephone number" an answer with "07777 777777" and change URL ends with "your-telephone-number/change"
    And line "5" should have a label "Your address" an answer with "1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "your-address/lookup/change"
    And answers page should have h2 header "About the trust"
    And About The Trust section should have a label "Trust Name" at line "1" an answer with "Trust name" and change URL ends with "trust-name/change"
    And About The Trust section should have a label "Trust address" at line "2" an answer with "The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "trust-address/lookup/change"
    When I click on send notification button
    Then page navigates to "You have sent the notification"
    And the case reference should be "CFSS-1234567"

  Scenario: About the Trust - Change Route validation - With No Change
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About the trust"
    And clicking on change button navigates as following:
      |Label|ExpectedPage|
      |Trust Name|What is the trust’s name?|
      |Trust address|What is the country of the trust’s address?|

  Scenario: About the Trust - Change Route validation - By Changing Value
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About the trust"
    And clicking on change button to validate changed value as following:
      |Label|ExpectedPage|ChangedValue|
      |Trust Name|What is the trust’s name?|Changed Trust Name|

  Scenario: About the Trust - Change Route validation - Address data is cleared
    Given I am on "Check Your Answers" page
    When I click on change button for "Trust address"
    Then page navigates to "What is the country of the trust’s address?"
    And country dropdown is empty
    When click on Save and Continue button
    Then error message should be displayed with text "Enter country of the address"

  Scenario: About the Trust - Change Route validation -Address - Needs to complete new address Journey
    Given I am on "Check Your Answers" page
    When I click on change button for "Trust address"
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "3 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "3"
    And click on continue button
    And click on confirm button
    Then page navigates to "Check Your Answers"
    And About The Trust section should have a label "Trust address" at line "2" an answer with "3 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "trust-address/lookup/change"