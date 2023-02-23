@page @regression
Feature: A Individual is able to notify and submit offshore disclosure

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "represent org" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
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
  Scenario: Individual On behalf of - Complete offshore disclosure journey - First 3 selections - Complete flow
    Given I am on "You have sent the notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
    Then status is marked as "Not started" for field "Add offshore liability details"
    And click on Hyperlink "Add offshore liability details"
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
    Then page navigates to "Which year does this offshore disclosure relate to?"
    And page should display checkboxes for the "8" tax years before the current tax year
    And I select Checkbox "6 April 2021 to 5 April 2022" at Position "1"
    And I select Checkbox "6 April 2020 to 5 April 2021" at Position "2"
    And click on Save and Continue button
    When I enter country or territory "United Arab Emirates" and select "United Arab Emirates"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities — Tax year 6 April 2021 to 5 April 2022"
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
    Then page navigates to "Offshore liabilities — Tax year 6 April 2020 to 5 April 2021"
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
    And I select Checkbox "Dividends" at Position "1"
    And I select Checkbox "Interest" at Position "2"
    And I select Checkbox "Property income" at Position "3"
    And I select Checkbox "Residential property gain" at Position "4"
    And I select Checkbox "Self-employment income" at Position "5"
    And I select Checkbox "Other gains" at Position "6"
    And click on Save and Continue button
    Then page navigates to "Your legal interpretation"
    And I select Checkbox "Your residence status for tax purposes in the UK" at Position "1"
    And I select Checkbox "Your domicile status for UK tax purposes" at Position "2"
    And I select Checkbox "The remittance basis for taxing income for people not domiciled in the UK" at Position "3"
    And I select Checkbox "How income arising in a trust should be taxed" at Position "4"
    And I select Checkbox "The Transfer of Assets legislation at sections 714 – 751 ITA 2007. This legislation counteracts avoidance by individuals who use overseas arrangements, companies, trusts or other entities to reduce UK tax liability" at Position "5"
    And I select Checkbox "How income arising in an offshore corporate structure should be taxed" at Position "6"
    And I select Checkbox "Inheritance Tax issues" at Position "7"
    And I select Checkbox "Whether income should be taxed under the settlements legislation at section 624 onwards of the Income Tax (Trading and Other Income) Act 2005. This legislation applies where an individual gains a tax advantage by making arrangements to divert their income to another person who is liable at a lower rate of tax or is not liable to income tax." at Position "8"
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
    Then status is marked as "Not started" for field "Confirm if you have other liability issues or not"
    And click on Hyperlink "Confirm if you have other liability issues or not"
    Then page navigates to "Do you have any other liability issues to fix?"
    When I select Checkbox "Employer liability issues" at Position "1"
    And I select Checkbox "Class 2 National Insurance contributions issues" at Position "2"
    And I select Checkbox "Inheritance Tax issues" at Position "3"
    And I select Checkbox "VAT issues" at Position "4"
    And I select Checkbox "Other" at Position "5"
    And click on Save and Continue button
    Then page navigates to "Can you describe the gift (known as a chargeable transfer) that your issue is about?"
    When I enter "Description for gift/chargeable transfer)" in the can you describe the gift text area
    And click on Save and Continue button
    Then page navigates to "Can you describe what other liability issues you need to fix?"
    When I enter "Description for other liability issues" in the can you describe what other liability issues text area
    And click on Save and Continue button
    Then page navigates to "Did the individual receive tax credits for any of the years covered by this disclosure?"
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Review other liability issues"
    When click on continue button on summary page
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit other liability issues"
    Then status is marked as "Not started" for field "Add the reason for coming forward now"
    And click on Hyperlink "Add the reason for coming forward now"
    Then page navigates to "Why are you making a disclosure now?"
    When I select Checkbox "Advised by guidance on the GOV.UK website" at Position "1"
    And I select Checkbox "Prompted by a letter from HMRC advising to make a disclosure" at Position "2"
    And I select Checkbox "Advised by employer" at Position "3"
    And I select Checkbox "After reading an online or newspaper article" at Position "4"
    And I select Checkbox "After reading an article from a professional association website or publication" at Position "5"
    And I select Checkbox "Advised by an accountant, or other type of third party agent" at Position "6"
    And I select Checkbox "After reading about the Register of Overseas Entities" at Position "7"
    And I select Checkbox "Other" at Position "8"
    And click on Save and Continue button
    Then page navigates to "What is the reason for making a disclosure now?"
    When I enter "reason for making a disclosure now" in the reason for making a disclosure now text area
    And click on Save and Continue button
    Then page navigates to "Why was the disclosure not made before now?"
    When I enter "reason for why was the disclosure not made before now" in the why was the disclosure not made before now text area
    And click on Save and Continue button
    Then page navigates to "Did someone give the individual advice that led them to not declare these tax issues previously?"
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What was the name of the person who gave the advice?"
    When I enter "person" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Did the person who gave advice work on behalf of a business or organisation?"
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What was the name of the business or organisation the person who gave the advice was working on behalf of?"
    When I enter "organisation" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What was the profession of the person who gave this advice?"
    When I enter "accountant" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Advice given"
    When I enter "accountant's advice" in the advice text area
    And I enter "01" in the month text area
    And I enter "1980" in the year text area
    And I select Radio Button "Yes, by email" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Which email address can we contact you with?"
    When I select Radio Button "abc@abc.com" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit the reason for coming forward now"
    Then page navigates to "List of tasks"
    Then status is marked as "Not started" for field "Add case reference"
    When click on Hyperlink "Add case reference"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit case reference"
    When click on Save and Continue button
    Then page navigates to "Your offer"
    When I enter "15" in the TextBox field
    And I click on Send offer and disclosure button
    Then page navigates to "You have sent your disclosure"
    And the case reference should be "CFSS-1234567"

  @journeytests
  Scenario: Individual - On behalf of - offshore disclosure journey - last 5 selections
    Given I am on "You have sent the notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
    Then status is marked as "Not started" for field "Add offshore liability details"
    When click on Hyperlink "Add offshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "The individual submitted an inaccurate return because they did not take reasonable care." at Position "4"
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    And page should display checkboxes for the "10" tax years before the current tax year
    When I click on Back button
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "The individual did not notify HMRC of a tax liability but this was not deliberate and they do not have a reasonable excuse." at Position "5"
    And I select Checkbox "The individual deliberately failed to notify HMRC of a tax liability." at Position "6"
    And I select Checkbox "The individual deliberately submitted an inaccurate tax return." at Position "7"
    And I select Checkbox "The individual deliberately withheld information by failing to submit a return." at Position "8"
    And click on Save and Continue button
    Then page navigates to "Contractual Disclosure Facility"
    When I select Radio Button "Continue using this digital disclosure service" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    And page should display checkboxes for the "20" tax years before the current tax year
    When I select Checkbox "6 April 2021 to 5 April 2022" at Position "1"
    And click on Save and Continue button
    When I enter country or territory "United Arab Emirates" and select "United Arab Emirates"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities — Tax year 6 April 2021 to 5 April 2022"
    And I enter "10" in the "income" text box field
    And I enter "20" in the "chargeableTransfers" text box field
    And I enter "30" in the "capitalGains" text box field
    And I enter "40" in the "unpaidTax" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2021" in the "penaltyRateReason" text box field
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Where did the undeclared income or gain included in this disclosure come from?"
    And I select Checkbox "Somewhere else" at Position "7"
    And click on Save and Continue button
    Then page navigates to "Where did the undeclared income or gain come from?"
    And I enter "undeclared income or gain come from?" in the text area
    And click on Save and Continue button
    Then page navigates to "Your legal interpretation"
    And I select Checkbox "Another issue" at Position "9"
    And click on Save and Continue button
    Then page navigates to "Under what consideration of the law led you to not include some tax in this disclosure?"
    When I enter "consideration of the law" in the text area
    And click on Save and Continue button
    Then page navigates to "How much tax has not been included in this disclosure as a result of your interpretation?"
    When I select Radio Button "£10,000 or less" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What was the maximum value of all assets held outside the UK at any point over the last 5 years?"
    When I select Radio Button "Between £1 million and £100 million" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit offshore liability details"

  @journeytests
  Scenario: Individual - On behalf of- Complete offshore disclosure journey - Nil disclosure
    Given I am on "You have sent the notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
    Then status is marked as "Not started" for field "Add case reference"
    And status is marked as "Not started" for field "Add offshore liability details"
    When click on Hyperlink "Add offshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "The individual submitted an inaccurate return because they did not take reasonable care." at Position "4"
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    And page should display checkboxes for the "10" tax years before the current tax year
    When I select Checkbox "Any tax year before 6 April 2013" at Position "10"
    And click on Save and Continue button
    Then page navigates to "Can you tell us more about any tax owed before 6 April 2013?"
    And I enter "Provide the amount, when it was owed, and where the income or gain came from" in the text area
    And click on Save and Continue button
    Then page navigates to "You are making a nil disclosure"
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit offshore liability details"
