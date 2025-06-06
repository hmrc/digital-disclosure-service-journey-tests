Feature: An Individual - On behalf of - is able to notify and submit onshore disclosure

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "represent org" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And page navigates to "The disclosure will only be about onshore liabilities"
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

  @journeytests
  Scenario: Individual On behalf of - Complete onshore disclosure journey - First 3 selections - Complete flow
    Given I am on "You have sent the notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Review your declaration"
    And status is marked as "Not started" for field "Add onshore liability details"
    And click on Hyperlink "Add onshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    And I select Checkbox "The individual did not notify HMRC about a tax liability but this was not deliberate and they have a reasonable excuse." at Position "1"
    And I select Checkbox "The individual submitted an inaccurate return despite taking reasonable care." at Position "2"
    And I select Checkbox "The individual did not file a return but has a reasonable excuse." at Position "3"
    And click on Save and Continue button
    Then page navigates to "What is the reasonable excuse for not notifying HMRC about a tax liability?"
    And I enter "Reasonable excuse" in the reason for excuse text area
    And I enter "tax year ending 2019" in the "Which tax years does this apply to?for not notifying HMRC" text box field
    And click on Save and Continue button
    Then page navigates to "What reasonable care was taken when submitting the inaccurate return?"
    And I enter "Reasonable care" in the reasonable care text area
    And I enter "tax year ending 2019" in the "Which tax years does this apply to?" text box field
    And click on Save and Continue button
    Then page navigates to "What is the reasonable excuse for not filing a return?"
    And I enter "Reasonable excuse" in the reasonable excuse text area
    And I enter "tax year ending 2019" in the "Which tax years does this apply to?" text box field
    And click on Save and Continue button
    Then page navigates to "What onshore liabilities do you need to disclose?"
    And I select Checkbox "Capital Gains Tax liabilities" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Which year does this onshore disclosure relate to?"
    And page should display checkboxes for the "4" tax years before the current tax year
    And I select Checkbox "6 April 2023 to 5 April 2024" at Position "1"
    And I select Checkbox "6 April 2022 to 5 April 2023" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities — Tax year 6 April 2023 to 5 April 2024"
    And I enter "10" in the "gains" text box field
    And I enter "20" in the "unpaidTax" text box field
    And I enter "20" in the "niContributions" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2022" in the "penaltyRateReason" text box field
    And I enter "undeclared Income Or Gain" in the "undeclaredIncomeOrGain" text box field
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities — Tax year 6 April 2022 to 5 April 2023"
    And I enter "70" in the "gains" text box field
    And I enter "80" in the "unpaidTax" text box field
    And I enter "90" in the "niContributions" text box field
    And I enter "10" in the "interest" text box field
    And I enter "30" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2020" in the "penaltyRateReason" text box field
    And I enter "undeclared Income Or Gain" in the "undeclaredIncomeOrGain" text box field
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities summary"
