Feature: A trust is able to notify and submit onshore disclosure

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "A trust" at Position "5"
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
    And I select Checkbox "Other capital gains" at Position "6"
    And click on Save and Continue button
    And I enter "Trust name" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And I click on the hyperlink with text "Enter the address manually"
    And I enter "The Farm" in the "Address line 1" field
    And I enter "Royal Madeuptown" in the "Town or city" field
    And I enter "ZZ9Z 9TT" in the "Postcode" field
    And click on Save and Continue button
    And click on confirm button
    And I enter "Your full name" in the TextBox field
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
    And I enter "2 Testing Lane" in the "Address line 1" field
    And I enter "Royal Madeuptown" in the "Town or city" field
    And I enter "ZZ9Z 9TT" in the "Postcode" field
    And click on Save and Continue button
    And click on confirm button
    And I click on send notification button

  @journeytests
  Scenario: Trust - Onshore Journey- Letting Income
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
    And I select Checkbox "The trust deliberately failed to notify HMRC of a tax liability." at Position "6"
    And click on Save and Continue button
    And I select Radio Button "Continue using this digital disclosure service" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What onshore liabilities do you need to disclose?"
    And I select Checkbox "Letting income from residential property or land" at Position "1"
    And I select Checkbox "Non-business income liabilities" at Position "4"
    And click on Save and Continue button
    Then page navigates to "Which year does this onshore disclosure relate to?"
    And page should display checkboxes for the "20" tax years before the current tax year
    When I select Checkbox "6 April 2021 to 5 April 2022" at Position "1"
    And I select Checkbox "6 April 2017 to 5 April 2018" at Position "5"
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
    And I enter "01" in the "Day" text box field
    And I enter "01" in the "Month" text box field
    And I enter "1980" in the "Year" text box field
    And click on Save and Continue button
    Then page navigates to "Has property 1 stopped being let out?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Property 1 is no longer being let out"
    And I enter "02" in stop day text box field
    And I enter "02" in stop month text box field
    And I enter "1990" in stop year text box field
    And I enter "Nothing" in whatHasHappenedToProperty text box field
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
    When I enter "5" in percentage text box field
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
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What is the postcode and property name or number of property 2?"
    And I click on the hyperlink with text "Enter the address manually"
    And I enter "The Farm" in the "Address line 1" field
    And I enter "Royal Madeuptown" in the "Town or city" field
    And I enter "ZZ9Z 9TT" in the "Postcode" field
    And click on Save and Continue button
    And click on confirm button
    Then page navigates to "When was property 2 first let out?"
    And I enter "02" in the "Day" text box field
    And I enter "02" in the "Month" text box field
    And I enter "1982" in the "Year" text box field
    And click on Save and Continue button
    Then page navigates to "Has property 2 stopped being let out?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Property 2 is no longer being let out"
    And I enter "03" in stop day text box field
    And I enter "03" in stop month text box field
    And I enter "1993" in stop year text box field
    And I enter "Nothing 2" in whatHasHappenedToProperty text box field
    And click on Save and Continue button
    Then page navigates to "At the time of letting, was property 2 furnished?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Furnished Holiday Let (FHL)"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "At the time of letting, was property 2 jointly owned with another person?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What was the percentage share of the income you received from property 2?"
    And I enter "5" in percentage text box field
    And click on Save and Continue button
    Then page navigates to "At the time of letting, did you have a mortgage on property 2?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What type of mortgage did you have for property 2?"
    And I select Radio Button "Other" at Position "3"
    And click on Save and Continue button
    Then page navigates to "What was the type of mortgage you had on property 2?"
    And I enter "Type of mortgage" in typeOfMortage text box field
    And click on Save and Continue button
    Then page navigates to "Was a letting agent used to let out or manage property 2?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Did the letting agent collect rent on your behalf?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Review property 2 details"
    And click on continue button
    Then page navigates to "You have added 2 properties"
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Is the trust a member of any landlord associations?"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Which landlord associations are you a member of?"
    When I enter "landlord associations" in landloard association text box field
    And click on Save and Continue button
    Then page navigates to "How many properties do you currently let out?"
    When I enter "2" in property count text box field
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities — Tax year 6 April 2021 to 5 April 2022"
    And I enter "10" in the "nonBusinessIncome" text box field
    And I enter "10" in the "lettingIncome" text box field
    And I enter "20" in the "unpaidTax" text box field
    And I enter "20" in the "niContributions" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2021" in the "penaltyRateReason" text box field
    And I enter "undeclared Income Or Gain" in the "undeclaredIncomeOrGain" text box field
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "How much residential finance costs were used to calculate the tax reduction for the tax year ending 2022, in pounds?"
    And I enter "5" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities — Tax year 6 April 2017 to 5 April 2018"
    And I enter "10" in the "nonBusinessIncome" text box field
    And I enter "10" in the "lettingIncome" text box field
    And I enter "20" in the "unpaidTax" text box field
    And I enter "20" in the "niContributions" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2017" in the "penaltyRateReason" text box field
    And I enter "undeclared Income Or Gain" in the "undeclaredIncomeOrGain" text box field
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit onshore liability details"

  @journeytests
  Scenario: Trust - Onshore Journey- There are no onshore liabilities to disclose
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
    And I select Checkbox "The trust submitted an inaccurate return because it did not take reasonable care." at Position "4"
    And click on Save and Continue button
    Then page navigates to "What onshore liabilities do you need to disclose?"
    And I select Checkbox "Business income liabilities" at Position "2"
    And I select Checkbox "Capital Gains Tax liabilities" at Position "3"
    And I select Checkbox "Non-business income liabilities" at Position "4"
    And click on Save and Continue button
    Then page navigates to "Which year does this onshore disclosure relate to?"
    And page should display checkboxes for the "6" tax years before the current tax year
    When I select Checkbox "Any tax year before 6 April 2017" at Position "6"
    And click on Save and Continue button
    Then page navigates to "Can you tell us more about any tax owed before 6 April 2017?"
    When I enter "tax owed details" in tax owed reason text box field
    And click on Save and Continue button
    Then page navigates to "There are no onshore liabilities to disclose"
    And body should be "The trust only needs to pay HMRC what it owes for up to 6 years for onshore liabilities. Based on the information you have given, you do not need to provide any figures or calculations for onshore liabilities."
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit onshore liability details"

