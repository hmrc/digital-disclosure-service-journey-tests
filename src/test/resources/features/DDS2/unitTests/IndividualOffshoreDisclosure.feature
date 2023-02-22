@page @regression
Feature: A Individual is able to notify and submit offshore disclosure

  Background:
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
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I enter "Individual full name" in the TextBox field
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
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And I click on the hyperlink with text "Enter the address manually"
    And I enter "The Farm" in the "Address line 1" field
    And I enter "Royal Madeuptown" in the "Town or city" field
    And I enter "ZZ9Z 9TT" in the "Postcode" field
    And click on Save and Continue button
    And click on confirm button
    And I click on send notification button



  @journeytests
  Scenario: Individual - Complete offshore disclosure journey - First 3 selections
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
    And click on Hyperlink "Add offshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    And I select Checkbox "I did not notify HMRC about a tax liability but this was not deliberate and I have a reasonable excuse." at Position "1"
    And I select Checkbox "I have submitted an inaccurate return despite taking reasonable care." at Position "2"
    And I select Checkbox "I have not filed a return but have a reasonable excuse." at Position "3"
    And click on Save and Continue button
    Then page navigates to "What is your reasonable excuse for not notifying HMRC about a tax liability?"
    And I enter "Reasonable excuse" in the reason for excuse text area
    And I enter "tax year ending 2019" in the "Which tax years does this apply to?for not notifying HMRC" text box field
    And click on Save and Continue button
    Then page navigates to "What reasonable care did you take when submitting the inaccurate return?"
    And I enter "Reasonable care" in the reasonable care text area
    And I enter "tax year ending 2019" in the "Which tax years does this apply to?" text box field
    And click on Save and Continue button
    Then page navigates to "What is your reasonable excuse for not filing a return?"
    And I enter "Reasonable excuse" in the reasonable excuse text area
    And I enter "tax year ending 2019" in the "Which tax years does this apply to?" text box field
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    And page should display checkboxes for the "8" tax years before the current tax year
    And I select Checkbox "6 April 2021 to 5 April 2022" at Position "1"
    And I select Checkbox "6 April 2019 to 5 April 2020" at Position "3"
    And click on Save and Continue button
    Then page navigates to "You have not included the tax year ending 2021"
    And I enter "Reason for including year in the disclosure" in the reason for including year text area
    And click on Save and Continue button
    And enter country name "United Arab Emirates",select country "United Arab Emirates"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And enter country name "Australia",select country "Australia"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities - Tax year 6 April 2021 to 5 April 2022"
    And I enter "10" in the "income" text box field
    And I enter "20" in the "chargeableTransfers" text box field
    And I enter "30" in the "capitalGains" text box field
    And I enter "40" in the "unpaidTax" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2021" in the "penaltyRateReason" text box field
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "How much foreign tax credit relief have you deducted from your calculations for the tax year ending 2022, in pounds?"
    And I enter "10" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities - Tax year 6 April 2019 to 5 April 2020"
    And I enter "70" in the "income" text box field
    And I enter "80" in the "chargeableTransfers" text box field
    And I enter "90" in the "capitalGains" text box field
    And I enter "10" in the "unpaidTax" text box field
    And I enter "20" in the "interest" text box field
    And I enter "30" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2019" in the "penaltyRateReason" text box field
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Where did the undeclared income or gain included in this disclosure come from?"
    And I select Checkbox "Somewhere else" at Position "7"
    And click on Save and Continue button
    Then page navigates to "Where did the undeclared income or gain come from?"
    And I enter "undeclared income or gain come from?" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Your legal interpretation"
    And I select Checkbox "Another issue" at Position "9"
    And click on Save and Continue button
    Then page navigates to "Under what consideration of the law led you to not include some tax in this disclosure?"
    And I enter "consideration of the law" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "How much tax has not been included in this disclosure as a result of your interpretation?"
    And I select Radio Button "£10,000 or less" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What was the maximum value of all assets held outside the UK at any point over the last 5 years?"
    And I select Radio Button "Between £1 million and £100 million" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities summary"
