@page @regression
Feature: LLP is able to check their answers for About the LLP section before submitting page

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "A limited liability partnership" at Position "4"
    And click on Save and Continue button
    And I select Radio Button "No, I will be making a disclosure on behalf of a designated member" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "Organization name" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "LLP name" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And I click on the hyperlink with text "Enter the address manually"
    And I enter "The Farm" in the "Address line 1" field
    And I enter "Royal Madeuptown" in the "Town or city" field
    And I enter "ZZ9Z 9TT" in the "Postcode" field
    And click on Save and Continue button
    And click on confirm button
    And I enter "Agent full name" in the TextBox field
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


  @journeytests
  Scenario: LLP - CYA - Send notification
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Case reference|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for|A limited liability partnership|what-is-this-disclosure-about/change|
      |4|Are you a designated member of the limited liability partnership that the disclosure will be about?|No, I will be making a disclosure on behalf of a designated member|are-you-a-designated-member/change|
      |5|Are you representing an organisation?|Yes|representing-organisation/change|
      |6|Name of the organisation you represent|Organization name|representing-organisation-name/change|
      |7|The disclosure will be about|Offshore and onshore liabilities|disclose-offshore-liabilities/change|
    And answers page should have h2 header "About you"
    And line "1" should have a label "Your full name" an answer with "Agent full name" and change URL ends with "your-full-name/change"
    And line "2" should have a label "Your contact preference" an answer with "Email,Telephone" and change URL ends with "contact-preference/change"
    And line "3" should have a label "Your email address" an answer with "abc@abc.com" and change URL ends with "your-email-address/change"
    And line "4" should have a label "Your telephone number" an answer with "07777 777777" and change URL ends with "your-telephone-number/change"
    And line "5" should have a label "Your address" an answer with "1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "your-address/lookup/change"
    And answers page should have h2 header "About the limited liability partnership"
    And About The LLP section should have a label "Limited liability partnership name" at line "1" an answer with "LLP name" and change URL ends with "llp-name/change"
    And About The LLP section should have a label "Limited liability partnership’s address" at line "2" an answer with "The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "llp-address/lookup/change"
    When I click on send notification button
    Then page navigates to "You have sent the notification"
    And the case reference should be "CFSS-1234567"


  Scenario: On behalf of Individual -About The Individual - Change Route validation -Address Validation-No data population
    Given I am on "Check Your Answers" page
    When I click on change button for "Limited liability partnership’s address"
    Then page navigates to "What is the country of the limited liability partnership’s address?"
    And country dropdown is empty

  Scenario: On behalf of Individual -About The Individual - Change Route validation -Address Validation- Needs to complete new address Journey
    Given I am on "Check Your Answers" page
    When I click on change button for "Limited liability partnership’s address"
    Then page navigates to "What is the country of the limited liability partnership’s address?"
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "3 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "3"
    And click on continue button
    And click on confirm button
    Then page navigates to "Check Your Answers"
    And About The LLP section should have a label "Limited liability partnership’s address" at line "2" an answer with "3 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "llp-address/lookup/change"

  @smoke
  Scenario: LLP - About LLP - Check your answers
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About the limited liability partnership"
    And About The LLP section should have a label "Limited liability partnership name" at line "1" an answer with "LLP name" and change URL ends with "llp-name/change"
    And About The LLP section should have a label "Limited liability partnership’s address" at line "2" an answer with "The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "llp-address/lookup/change"

  Scenario: LLP - About LLP - Change route - LLP Name
    Given I am on "Check Your Answers" page
    When I click on change button for "Limited liability partnership name"
    Then page navigates to "What is the limited liability partnership’s name?"
    When I enter "New LLP Name" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    Then answers page should have h2 header "About the limited liability partnership"
    And About The LLP section should have a label "Limited liability partnership name" at line "1" an answer with "New LLP Name" and change URL ends with "llp-name/change"
    And About The LLP section should have a label "Limited liability partnership’s address" at line "2" an answer with "The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "llp-address/lookup/change"
