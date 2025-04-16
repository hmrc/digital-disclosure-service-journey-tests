@journeytests
Feature: A Company tax payer is able to notify and submit offshore disclosure

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
    And I select Checkbox "Self-employment income" at Position "5"
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
    And I click on send notification button

  Scenario: Company - On Behalf of - complete offshore disclosure journey
    Given I am on "You have sent the notification" page
    When I navigate to "make-a-disclosure" specific page
    Then page heading contains "You sent a notification on"
    When I click on Make a disclosure button
    Then page navigates to "List of tasks - Tell HMRC about underpaid tax from previous years"
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    When I click on the hyperlink with text "Add offshore liability details"
    And I select Checkbox "The company did not notify HMRC about a tax liability but this was not deliberate and it has a reasonable excuse." at Position "1"
    And I select Checkbox "The company submitted an inaccurate return despite taking reasonable care." at Position "2"
    And I select Checkbox "The company did not file a return but has a reasonable excuse." at Position "3"
    And click on Save and Continue button
    And I enter "Reasonable excuse" in the reason for excuse text area
    And I enter "tax year ending 2019" in the "Which tax years does this apply to?for not notifying HMRC" text box field
    And click on Save and Continue button
    And I enter "Reasonable care" in the reasonable care text area
    And I enter "tax year ending 2019" in the "Which tax years does this apply to?" text box field
    And click on Save and Continue button
    And I enter "Reasonable excuse" in the reasonable excuse text area
    And I enter "tax year ending 2019" in the "Which tax years does this apply to?" text box field
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    And I select Checkbox "6 April 2023 to 5 April 2024" at Position "1"
    And I select Checkbox "6 April 2021 to 5 April 2022" at Position "3"
    And click on Save and Continue button
    Then page navigates to "You have not included the tax year ending 2023"
    And I enter "Reason for including year in the disclosure" in the text area
    And click on Save and Continue button
    When I enter country or territory "United Arab Emirates" and select "United Arab Emirates"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter country or territory "Australia" and select "Australia"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities — Tax year 6 April 2023 to 5 April 2024"
    And I enter "10" in the "income" text box field
    And I enter "20" in the "chargeableTransfers" text box field
    And I enter "30" in the "capitalGains" text box field
    And I enter "40" in the "unpaidTax" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "undeclaredIncomeOrGain" in the "undeclaredIncomeOrGain" text box field
    And I enter "Penalty Rate Reason for year 2021" in the "penaltyRateReason" text box field
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "How much foreign tax credit relief have you deducted from your calculations for the tax year ending 2024, in pounds?"
    And I enter "10" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities — Tax year 6 April 2021 to 5 April 2022"
    And I enter "70" in the "income" text box field
    And I enter "80" in the "chargeableTransfers" text box field
    And I enter "90" in the "capitalGains" text box field
    And I enter "10" in the "unpaidTax" text box field
    And I enter "20" in the "interest" text box field
    And I enter "30" in the "penaltyRate" text box field
    And I enter "undeclaredIncomeOrGain" in the "undeclaredIncomeOrGain" text box field
    And I enter "Penalty Rate Reason for year 2020" in the "penaltyRateReason" text box field
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Your legal interpretation"
    And I select Checkbox "Another issue" at Position "9"
    And click on Save and Continue button
    Then page navigates to "Under what consideration of the law led you to not include some tax in this disclosure?"
    And I enter "consideration of the law" in the text area
    And click on Save and Continue button
    Then page navigates to "How much tax has not been included in this disclosure as a result of your interpretation?"
    And I select Radio Button "£10,000 or less" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What was the maximum value of all assets held outside the UK at any point over the last 5 years?"
    And I select Radio Button "Between £1 million and £100 million" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities summary"