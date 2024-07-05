Feature: An Company tax payer is able to check their answers for background section before submitting page

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "A company" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "Organization name" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Checkbox "Let property income" at Position "3"
    And click on Save and Continue button
    And I enter "Company name" in the TextBox field
    And click on Save and Continue button
    And I enter "12345678" in the TextBox field
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
  Scenario: Company - Background - Change route to - Are you an officer of the company? from No to Yes
    Given I am on "Check Your Answers" page
    When I click on change button for "Are you an officer of the company that the disclosure will be about?"
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    When I click on change button for "Are you an officer of the company that the disclosure will be about?"
    And I select Radio Button "Yes, I am an officer" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Case reference|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for|A company|what-is-this-disclosure-about/change|
      |4|Are you an officer of the company that the disclosure will be about?|Yes, I am an officer|are-you-the-entity/change|
    And answers page should have h2 header "About you"
    And line "1" should have a label "Your full name" an answer with "Agent full name" and change URL ends with "your-full-name/change"
    And line "2" should have a label "Your contact preference" an answer with "Email,Telephone" and change URL ends with "contact-preference/change"
    And line "3" should have a label "Your email address" an answer with "abc@abc.com" and change URL ends with "your-email-address/change"
    And line "4" should have a label "Your telephone number" an answer with "07777 777777" and change URL ends with "your-telephone-number/change"
    And line "5" should have a label "Your address" an answer with "1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "your-address/lookup/change"
    Then answers page should have h2 header "About the company"
    And About The Company section should have a label "Company’s name" at line "1" an answer with "Company name" and change URL ends with "company-name/change"
    And About The Company section should have a label "Company registration number" at line "2" an answer with "12345678" and change URL ends with "company-registration/change"
    And About The Company section should have a label "Company’s address" at line "3" an answer with "The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "company-address/lookup/change"
    When I click on send notification button
    Then page navigates to "You have sent your notification"
    And the case reference should be "CFSS-1234567"
