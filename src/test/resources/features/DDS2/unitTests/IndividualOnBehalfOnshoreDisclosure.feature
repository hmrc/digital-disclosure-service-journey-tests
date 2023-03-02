@page @regression
Feature: An Individual - On behalf of - is able to notify and submit onshore disclosure

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
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And page navigates to "The disclosure is only about onshore liabilities"
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

#   Wip tag added ad onshore journey status story still in backlog DDS2-1592
  @wip
  Scenario: Individual On behalf of - Complete onshore disclosure journey - First 3 selections - Complete flow
    Given I am on "You have sent the notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
    Then status is marked as "Not started" for field "Add onshore liability details"
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
    And I select Checkbox "Capital Gains Tax liabilities" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Which year does this onshore disclosure relate to?"
    And page should display checkboxes for the "4" tax years before the current tax year
    And I select Checkbox "6 April 2021 to 5 April 2022" at Position "1"
    And I select Checkbox "6 April 2020 to 5 April 2021" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities — Tax year 6 April 2021 to 5 April 2022"
    And I enter "10" in the "gains" text box field
    And I enter "20" in the "unpaidTax" text box field
    And I enter "20" in the "niContributions" text box field
    And I enter "50" in the "interest" text box field
    And I enter "50" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2021" in the "penaltyRateReason" text box field
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities — Tax year 6 April 2020 to 5 April 2021"
    And I enter "70" in the "gains" text box field
    And I enter "80" in the "unpaidTax" text box field
    And I enter "90" in the "niContributions" text box field
    And I enter "10" in the "interest" text box field
    And I enter "30" in the "penaltyRate" text box field
    And I enter "Penalty Rate Reason for year 2019" in the "penaltyRateReason" text box field
    And click on Save and Continue button
    Then page navigates to "Where did the undeclared income or gain included in this disclosure come from?"
    And I select Checkbox "Dividends" at Position "1"
    And I select Checkbox "Interest" at Position "2"
    And I select Checkbox "Property income" at Position "3"
    And I select Checkbox "Residential property gain" at Position "4"
    And I select Checkbox "Self-employment income" at Position "5"
    And I select Checkbox "Other gains" at Position "6"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit onshore liability details"
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
    And I enter "CFSS-1234568" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit case reference"
    When click on Save and Continue button
    Then page navigates to "Your offer"
    When I enter "15" in the TextBox field
    And I click on Send offer and disclosure button
    Then page navigates to "You have sent your disclosure"
    And the case reference should be "CFSS-1234568"
