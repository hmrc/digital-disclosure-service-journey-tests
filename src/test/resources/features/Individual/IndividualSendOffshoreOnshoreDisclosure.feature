@journeytests
Feature: An Individual - On behalf of - is able to notify and submit offshore disclosure

  Scenario: Individual -Complete flow - Onshore & offshore - Letting income
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
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
    And I select Checkbox "Let property income" at Position "3"
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
    When I am on "You have sent the notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Review your declaration"
    And status is marked as "Not started" for field "Add offshore liability details"
    And click on Hyperlink "Add offshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    And I select Checkbox "The individual did not notify HMRC about a tax liability but this was not deliberate and they have a reasonable excuse." at Position "1"
    And I select Checkbox "The individual submitted an inaccurate return despite taking reasonable care." at Position "2"
    And I select Checkbox "The individual did not file a return but has a reasonable excuse." at Position "3"
    And I select Checkbox "The individual deliberately failed to notify HMRC of a tax liability." at Position "6"
    And click on Save and Continue button
    And I select Radio Button "Continue using this digital disclosure service" at Position "1"
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
    Then page navigates to "Which year does this offshore disclosure relate to?"
    And page should display checkboxes for the "20" tax years before the current tax year
    And I select Checkbox "6 April 2023 to 5 April 2024" at Position "1"
    And I select Checkbox "6 April 2020 to 5 April 2021" at Position "3"
    And click on Save and Continue button
    Then page navigates to "You have not included the tax year ending 2022"
    And I enter "Reason for including year in the disclosure" in the text area
    And click on Save and Continue button
    When I enter country or territory "United Arab Emirates" and select "United Arab Emirates"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities — Tax year 6 April 2022 to 5 April 2023"
    And I enter "10" in the "income" text box field
    And I enter "20" in the "chargeableTransfers" text box field
    And I enter "30" in the "capitalGains" text box field
    And I enter "40" in the "unpaidTax" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2023" in the "penaltyRateReason" text box field
    And I enter "undeclaredIncomeOrGain" in the "undeclaredIncomeOrGain" text box field
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "How much foreign tax credit relief have you deducted from your calculations for the tax year ending 2023, in pounds?"
    And I enter "10" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities — Tax year 6 April 2020 to 5 April 2021"
    And I enter "70" in the "income" text box field
    And I enter "80" in the "chargeableTransfers" text box field
    And I enter "90" in the "capitalGains" text box field
    And I enter "10" in the "unpaidTax" text box field
    And I enter "20" in the "interest" text box field
    And I enter "30" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2019" in the "penaltyRateReason" text box field
    And I enter "undeclaredIncomeOrGain" in the "undeclaredIncomeOrGain" text box field
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
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit offshore liability details"
    And status is marked as "Not started" for field "Add onshore liability details"
    And click on Hyperlink "Add onshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    And I select Checkbox "The individual did not notify HMRC about a tax liability but this was not deliberate and they have a reasonable excuse." at Position "1"
    And I select Checkbox "The individual submitted an inaccurate return despite taking reasonable care." at Position "2"
    And I select Checkbox "The individual did not file a return but has a reasonable excuse." at Position "3"
    And I select Checkbox "The individual deliberately failed to notify HMRC of a tax liability." at Position "6"
    And click on Save and Continue button
    And I select Radio Button "Continue using this digital disclosure service" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What is the reasonable excuse for not notifying HMRC about a tax liability?"
    And I enter "Reasonable excuse" in the reason for excuse text area
    And I enter "tax year ending 20120" in the "Which tax years does this apply to?for not notifying HMRC" text box field
    And click on Save and Continue button
    Then page navigates to "What reasonable care was taken when submitting the inaccurate return?"
    And I enter "Reasonable care" in the reasonable care text area
    And I enter "tax year ending 2020" in the "Which tax years does this apply to?" text box field
    And click on Save and Continue button
    Then page navigates to "What is the reasonable excuse for not filing a return?"
    And I enter "Reasonable excuse" in the reasonable excuse text area
    And I enter "tax year ending 2020" in the "Which tax years does this apply to?" text box field
    And click on Save and Continue button
    Then page navigates to "What onshore liabilities do you need to disclose?"
    And I select Checkbox "Letting income from residential property or land" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Which year does this onshore disclosure relate to?"
    And page should display checkboxes for the "20" tax years before the current tax year
    And I select Checkbox "6 April 2022 to 5 April 2023" at Position "1"
    And I select Checkbox "6 April 2020 to 5 April 2021" at Position "3"
    And I select Checkbox "6 April 2018 to 5 April 2019" at Position "5"
    And click on Save and Continue button
    Then page navigates to "You have not selected certain years"
    When I enter "Do not want to include" in yearNotSelected text box field
    And click on Save and Continue button
    Then page navigates to "What is the postcode and property name or number of property 1?"
    And I click on the hyperlink with text "Enter the address manually"
    And I enter "The Farm" in the "Address line 1" field
    And I enter "Royal Madeuptown" in the "Town or city" field
    And I enter "ZZ9Z 9TT" in the "Postcode" field
    And click on Save and Continue button
    And click on confirm button
    Then page navigates to "When was property 1 first let out?"
    And I enter "02" in the "Day" text box field
    And I enter "02" in the "Month" text box field
    And I enter "1982" in the "Year" text box field
    And click on Save and Continue button
    Then page navigates to "Has property 1 stopped being let out?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Property 1 is no longer being let out"
    And I enter "03" in stop day text box field
    And I enter "03" in stop month text box field
    And I enter "1993" in stop year text box field
    And I enter "Nothing 2" in whatHasHappenedToProperty text box field
    And click on Save and Continue button
    Then page navigates to "At the time of letting, was property 1 furnished?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Furnished Holiday Let (FHL)"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "At the time of letting, was property 1 jointly owned with another person?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What was the percentage share of the income you received from property 1?"
    And I enter "5" in percentage text box field
    And click on Save and Continue button
    Then page navigates to "At the time of letting, did you have a mortgage on property 1?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What type of mortgage did you have for property 1?"
    And I select Radio Button "Other" at Position "3"
    And click on Save and Continue button
    Then page navigates to "What was the type of mortgage you had on property 1?"
    And I enter "Type of mortgage" in typeOfMortage text box field
    And click on Save and Continue button
    Then page navigates to "Was a letting agent used to let out or manage property 1?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Did the letting agent collect rent on your behalf?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Review property 1 details"
    And click on continue button
    Then page navigates to "You have added 1 property"
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Is the individual a member of any landlord associations?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Which landlord associations are you a member of?"
    When I enter "landlord associations" in landloard association text box field
    And click on Save and Continue button
    Then page navigates to "How many properties do you currently let out?"
    When I enter "2" in property count text box field
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities — Tax year 6 April 2022 to 5 April 2023"
    And I enter "10" in the "lettingIncome" text box field
    And I enter "20" in the "unpaidTax" text box field
    And I enter "20" in the "niContributions" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2021" in the "penaltyRateReason" text box field
    And I enter "undeclared Income Or Gain" in the "undeclaredIncomeOrGain" text box field
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "How much residential finance costs were used to calculate the tax reduction for the tax year ending 2023, in pounds?"
    And I enter "5" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities — Tax year 6 April 2020 to 5 April 2021"
    And I enter "10" in the "lettingIncome" text box field
    And I enter "20" in the "unpaidTax" text box field
    And I enter "20" in the "niContributions" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2023" in the "penaltyRateReason" text box field
    And I enter "undeclared Income Or Gain" in the "undeclaredIncomeOrGain" text box field
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities — Tax year 6 April 2018 to 5 April 2019"
    And I enter "10" in the "lettingIncome" text box field
    And I enter "20" in the "unpaidTax" text box field
    And I enter "20" in the "niContributions" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2023" in the "penaltyRateReason" text box field
    And I enter "undeclared Income Or Gain" in the "undeclaredIncomeOrGain" text box field
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit onshore liability details"
    Then status is marked as "Not started" for field "Confirm if you have other liability issues or not"
    And click on Hyperlink "Confirm if you have other liability issues or not"
    Then page navigates to "Do you have any other liability issues?"
    When I select Checkbox "No, I do not have any other liability issues" at Position "6"
    And click on Save and Continue button
    Then page navigates to "Did the individual receive tax credits for any of the years covered by this disclosure?"
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Review other liability issues"
    When click on continue button on summary page
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit other liability issues"
    Then status is marked as "Not started" for field "Add the reason for coming forward now"
    And click on Hyperlink "Add the reason for coming forward now"
    Then page navigates to "Why are you making a disclosure now?"
    And I select Checkbox "Other" at Position "8"
    And click on Save and Continue button
    Then page navigates to "What is the reason for making a disclosure now?"
    When I enter "reason for making a disclosure now" in the reason for making a disclosure now text area
    And click on Save and Continue button
    Then page navigates to "Why was the disclosure not made before now?"
    When I enter "reason for why was the disclosure not made before now" in the why was the disclosure not made before now text area
    And click on Save and Continue button
    Then page navigates to "Did someone give the individual advice that led them to not declare these tax issues previously?"
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit the reason for coming forward now"
    Then page navigates to "List of tasks"
    When click on Save and Continue button
    When I enter "15" in the TextBox field
    And I click on Send offer and disclosure button
    Then page navigates to "You have sent your disclosure"
    And the case reference should be "CFSS-1234567"
