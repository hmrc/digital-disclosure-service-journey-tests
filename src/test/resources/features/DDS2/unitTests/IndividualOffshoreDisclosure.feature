Feature: An Individual is able to notify and submit offshore disclosure

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
    And I select Checkbox "Let property income" at Position "3"
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
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Review your declaration"
    And status is marked as "Not started" for field "Add offshore liability details"
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
    And I select Checkbox "6 April 2022 to 5 April 2023" at Position "1"
    And I select Checkbox "6 April 2020 to 5 April 2021" at Position "3"
    And click on Save and Continue button
    Then page navigates to "You have not included the tax year ending 2022"
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
    Then page navigates to "Offshore liabilities — Tax year 6 April 2022 to 5 April 2023"
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

  @journeytests
  Scenario: Individual - Complete offshore disclosure journey - last 5 selections
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Review your declaration"
    And status is marked as "Not started" for field "Add offshore liability details"
    When click on Hyperlink "Add offshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "I have submitted an inaccurate return because I did not take reasonable care." at Position "4"
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    When I click on Back button
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "I did not notify HMRC of a tax liability but this was not deliberate and I do not have a reasonable excuse." at Position "5"
    And I select Checkbox "I have deliberately failed to notify HMRC of a tax liability." at Position "6"
    And I select Checkbox "I have deliberately submitted an inaccurate tax return." at Position "7"
    And I select Checkbox "I have deliberately withheld information by failing to submit a return." at Position "8"
    And click on Save and Continue button
    Then page navigates to "Contractual Disclosure Facility"
    When I select Radio Button "Continue using this digital disclosure service" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    And I select Checkbox "6 April 2022 to 5 April 2023" at Position "1"
    And I select Checkbox "6 April 2019 to 5 April 2020" at Position "4"
    And click on Save and Continue button
    Then page navigates to "You have not selected certain years"
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
    Then page navigates to "Offshore liabilities — Tax year 6 April 2022 to 5 April 2023"
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
    Then page navigates to "How much foreign tax credit relief have you deducted from your calculations for the tax year ending 2023, in pounds?"
    And I enter "10" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities — Tax year 6 April 2019 to 5 April 2020"
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
  Scenario: Individual - Complete offshore disclosure journey - Nil disclosure
    Given I am on "You have sent your notification" page 
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Review your declaration"
    And status is marked as "Completed" for field "Edit case reference"
    And status is marked as "Not started" for field "Add offshore liability details"
    When click on Hyperlink "Add offshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "I have submitted an inaccurate return because I did not take reasonable care." at Position "4"
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    When I select Checkbox "Any tax year before 6 April 2013" at Position "11"
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

  @journeytests
  Scenario: Individual - Complete offshore disclosure journey - Complete flow for Nil disclosure
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Review your declaration"
    And status is marked as "Completed" for field "Edit case reference"
    And status is marked as "Not started" for field "Add offshore liability details"
    When click on Hyperlink "Add offshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "I have submitted an inaccurate return because I did not take reasonable care." at Position "4"
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    When I select Checkbox "Any tax year before 6 April 2013" at Position "11"
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
    Then status is marked as "Not started" for field "Confirm if you have other liability issues or not"
    And click on Hyperlink "Confirm if you have other liability issues or not"
    Then page navigates to "Do you have any other liability issues?"
    When I select Checkbox "No, I do not have any other liability issues" at Position "6"
    And click on Save and Continue button
    Then page navigates to "Did you receive tax credits for any of the years covered by your disclosure?"
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Review other liability issues"
    When click on continue button on summary page
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit other liability issues"
    Then status is marked as "Not started" for field "Add the reason for coming forward now"
    And click on Hyperlink "Add the reason for coming forward now"
    Then page navigates to "Why are you making a disclosure now?"
    When I select Checkbox "Other" at Position "8"
    And click on Save and Continue button
    Then page navigates to "What is the reason for making a disclosure now?"
    When I enter "reason for making a disclosure now" in the reason for making a disclosure now text area
    And click on Save and Continue button
    Then page navigates to "Why was the disclosure not made before now?"
    When I enter "reason for why was the disclosure not made before now" in the why was the disclosure not made before now text area
    And click on Save and Continue button
    Then page navigates to "Did someone give you advice that led you to not declare these tax issues previously?"
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit the reason for coming forward now"
    When click on Save and Continue button
    And I enter "15" in the TextBox field
    And I click on Send offer and disclosure button
    Then page navigates to "You have sent a nil disclosure"
    And the case reference should be "CFSS-1234567"

  @journeytests
  Scenario: Individual - Complete offshore disclosure journey - last 5 selections - Complete flow
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Review your declaration"
    And status is marked as "Not started" for field "Add offshore liability details"
    When click on Hyperlink "Add offshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "I did not notify HMRC of a tax liability but this was not deliberate and I do not have a reasonable excuse." at Position "5"
    And I select Checkbox "I have deliberately failed to notify HMRC of a tax liability." at Position "6"
    And I select Checkbox "I have deliberately submitted an inaccurate tax return." at Position "7"
    And I select Checkbox "I have deliberately withheld information by failing to submit a return." at Position "8"
    And click on Save and Continue button
    Then page navigates to "Contractual Disclosure Facility"
    When I select Radio Button "Continue using this digital disclosure service" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    When I select Checkbox "6 April 2022 to 5 April 2023" at Position "1"
    And I select Checkbox "6 April 2019 to 5 April 2020" at Position "4"
    And click on Save and Continue button
    Then page navigates to "You have not selected certain years"
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
    Then page navigates to "Offshore liabilities — Tax year 6 April 2022 to 5 April 2023"
    And I enter "10" in the "income" text box field
    And I enter "20" in the "chargeableTransfers" text box field
    And I enter "30" in the "capitalGains" text box field
    And I enter "40" in the "unpaidTax" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "undeclaredIncomeOrGain" in the "undeclaredIncomeOrGain" text box field
    And I enter "Penalty Rate Reason for year 2022" in the "penaltyRateReason" text box field
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "How much foreign tax credit relief have you deducted from your calculations for the tax year ending 2023, in pounds?"
    And I enter "10" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities — Tax year 6 April 2019 to 5 April 2020"
    And I enter "70" in the "income" text box field
    And I enter "80" in the "chargeableTransfers" text box field
    And I enter "90" in the "capitalGains" text box field
    And I enter "10" in the "unpaidTax" text box field
    And I enter "20" in the "interest" text box field
    And I enter "30" in the "penaltyRate" text box field
    And I enter "undeclaredIncomeOrGain" in the "undeclaredIncomeOrGain" text box field
    And I enter "Penalty Rate Reason for year 2019" in the "penaltyRateReason" text box field
    And I select Radio Button "No" at Position "2"
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
    Then status is marked as "Not started" for field "Confirm if you have other liability issues or not"
    And click on Hyperlink "Confirm if you have other liability issues or not"
    Then page navigates to "Do you have any other liability issues?"
    When I select Checkbox "Employer liability issues" at Position "1"
    And I select Checkbox "Class 2 National Insurance contributions issues" at Position "2"
    And I select Checkbox "Inheritance Tax issues" at Position "3"
    And I select Checkbox "VAT issues" at Position "4"
    And I select Checkbox "Other" at Position "5"
    And click on Save and Continue button
    Then page navigates to "Can you describe the gift (known as a chargeable transfer) that your issue is about?"
    When I enter "Description for gift/chargeable transfer)" in the can you describe the gift text area
    And click on Save and Continue button
    Then page navigates to "Can you describe what other liability issues you have?"
    When I enter "Description for other liability issues" in the can you describe what other liability issues text area
    And click on Save and Continue button
    Then page navigates to "Did you receive tax credits for any of the years covered by your disclosure?"
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
    Then page navigates to "Did someone give you advice that led you to not declare these tax issues previously?"
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What was the name of the person who gave the advice?"
    When I enter "person" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Did the person who gave advice work on behalf of a business or organisation?"
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to " What was the name of the business or organisation the person who gave the advice was working on behalf of?"
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
    And verify the radio option at position "1" is "abc@abc.com"
    When I select Radio Button "A different email address" at Position "2"
    And click on Save and Continue button
    Then page navigates to "What email address can we contact you with?"
    When I enter "xyz@xyz.com" in the TextBox field
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "What email address can we contact you with?"
    And I click on Back button
    Then page navigates to "Which email address can we contact you with?"
    And I click on Back button
    Then page navigates to "Advice given"
    And I select Radio Button "Yes, by telephone" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Which telephone number can we contact you with?"
    And verify the radio option at position "1" is "07777 777777"
    When I select Radio Button "A different telephone number" at Position "2"
    And click on Save and Continue button
    Then page navigates to "What telephone number can we contact you with?"
    When I enter "01642 123456" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit the reason for coming forward now"
    When click on Save and Continue button
    And I enter "15" in the TextBox field
    And I click on Send offer and disclosure button
    Then page navigates to "You have sent your disclosure"
    And the case reference should be "CFSS-1234567"

