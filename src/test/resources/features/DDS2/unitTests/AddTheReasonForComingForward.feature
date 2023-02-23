@page @regression
Feature: A Tax payer is able to add reason for coming forward
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
  Scenario: Add a reason -Individual
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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

  Scenario: Add a reason -On behalf Individual
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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

  Scenario: Add a reason -Estate
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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
    Then page navigates to "Did someone give the person advice that led them to not declare these tax issues previously?"
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

  Scenario: Add a reason -Company
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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
    Then page navigates to "Did someone give the company advice that led it to not declare these tax issues previously?"
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

  Scenario: Add a reason - LLP
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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
    Then page navigates to "Did someone give the limited liability partnership advice that led it to not declare these tax issues previously?"
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

  Scenario: Add a reason -Trust
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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
    Then page navigates to "Did someone give a trustee advice that led them to not declare these tax issues previously?"
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

