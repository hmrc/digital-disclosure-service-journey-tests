@page @regression
Feature: A Company - On behalf of - is able to notify and submit onshore disclosure

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "A company" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No, I will be making a disclosure on behalf of an officer" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "Organization name" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
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

#   Onshore journey works up to summary page only. DDS2-1592 is in backlog to fix status.
  @runMe
  Scenario: Company On behalf of - Complete onshore disclosure journey with 2 director loan accounting periods.
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
    And I select Checkbox "The company did not notify HMRC about a tax liability but this was not deliberate and it has a reasonable excuse." at Position "1"
    And click on Save and Continue button
    Then page navigates to "What is the reasonable excuse for not notifying HMRC about a tax liability?"
    And I enter "Reasonable excuse" in the reason for excuse text area
    And I enter "tax year ending 2019" in the "Which tax years does this apply to?for not notifying HMRC" text box field
    And click on Save and Continue button
    Then page navigates to "What onshore liabilities do you need to disclose?"
    And I select Checkbox "Director’s loan account liabilities" at Position "4"
    And click on Save and Continue button
    Then page navigates to "Onshore director’s loan account liabilities 1"
    And I enter "Director Name" into the "name" text field
    And I enter "01" into the "periodEnd.day" text field
    And I enter "01" into the "periodEnd.month" text field
    And I enter "2019" into the "periodEnd.year" text field
    And I enter "0" into the "overdrawn" text field
    And I enter "1000" into the "unpaidTax" text field
    And I enter "0" into the "interest" text field
    And I enter "10" into the "penaltyRate" text field
    And I enter "Reason" into the "penaltyRateReason" text field
    And click on Save and Continue button
    Then page navigates to "Review onshore director loans account liabilities"
    And click on Save and Continue button
    Then page navigates to "You have added 1 accounting period"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Onshore director’s loan account liabilities 2"
    And I enter "Director Name" into the "name" text field
    And I enter "02" into the "periodEnd.day" text field
    And I enter "02" into the "periodEnd.month" text field
    And I enter "2019" into the "periodEnd.year" text field
    And I enter "0" into the "overdrawn" text field
    And I enter "1000" into the "unpaidTax" text field
    And I enter "0" into the "interest" text field
    And I enter "10" into the "penaltyRate" text field
    And I enter "Reason" into the "penaltyRateReason" text field
    And click on Save and Continue button
    Then page navigates to "Review onshore director loans account liabilities"
    And click on Save and Continue button
    Then page navigates to "You have added 2 accounting periods"
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities summary"
