@accessibility
Feature: An Individual is able to make and send nil offshore and onshore disclosure
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

  @id:001
  Scenario: Individual - offshore flow -for making Nil disclosure
    Given I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I navigate to "disclosure-list-of-tasks" specific page
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
    #And page should display checkboxes for the "10" tax years before the current tax year
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

  @id:002
  Scenario: Individual - Onshore flow -for making Nil disclosure
    Given I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I navigate to "disclosure-list-of-tasks" specific page
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Review your declaration"
    And status is marked as "Not started" for field "Add onshore liability details"
    When click on Hyperlink "Add onshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "I did not notify HMRC of a tax liability but this was not deliberate and I do not have a reasonable excuse." at Position "5"
    And click on Save and Continue button
    And I select Checkbox "Business income liabilities" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Which year does this onshore disclosure relate to?"
    And page should display checkboxes for the "20" tax years before the current tax year
    When I select Checkbox "Any tax year before 6 April 2004" at Position "20"
    And click on Save and Continue button
    Then page navigates to "Can you tell us more about any tax owed before 6 April 2004?"
    And I enter "Provide the amount, when it was owed, and where the income or gain came from" in the text area
    And click on Save and Continue button
    Then page navigates to "You are making a nil disclosure"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit onshore liability details"

  @id:003
  Scenario: Individual -Complete flow - No onshore & Offshore liabilities to disclose - Sending nil disclosure
    Given I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Checkbox "Somewhere else" at Position "7"
    And click on Save and Continue button
    Then page navigates to "Where did the undeclared income or gain come from?"
    And I enter "undeclared income or gain come from?" in the text area
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
    And I select Radio Button "Yes, and I know my National Insurance number" at Position "1"
    And click on Save and Continue button
    When I enter "AZ 12 34 56 D" NI Number TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know my VAT registration number" at Position "1"
    And click on Save and Continue button
    When I enter "123 569 878" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes, and I know my Unique Taxpayer Reference (UTR)" at Position "1"
    And click on Save and Continue button
    When I enter "1234567890" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And I click on the hyperlink with text "Enter the address manually"
    And I enter "The Farm" in the "Address line 1" field
    And I enter "Royal Madeuptown" in the "Town or city" field
    And I enter "ZZ9Z 9TT" in the "Postcode" field
    And click on Save and Continue button
    And click on confirm button
    And I navigate to "disclosure-list-of-tasks" specific page
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Review your declaration"
    Then status is marked as "Not started" for field "Add case reference"
    When click on Hyperlink "Add case reference"
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit case reference"
    And status is marked as "Not started" for field "Add offshore liability details"
    When click on Hyperlink "Add offshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "I did not notify HMRC of a tax liability but this was not deliberate and I do not have a reasonable excuse." at Position "5"
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    And page should display checkboxes for the "20" tax years before the current tax year
    When I select Checkbox "Any tax year before 6 April 2004" at Position "20"
    And click on Save and Continue button
    Then page navigates to "Can you tell us more about any tax owed before 6 April 2004?"
    And I enter "Provide the amount, when it was owed, and where the income or gain came from" in the text area
    And click on Save and Continue button
    Then page navigates to "You have no offshore liabilities to disclose"
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit offshore liability details"
    And status is marked as "Not started" for field "Add onshore liability details"
    When click on Hyperlink "Add onshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "I have submitted an inaccurate return because I did not take reasonable care." at Position "4"
    And click on Save and Continue button
    And I select Checkbox "Capital Gains Tax liabilities" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Which year does this onshore disclosure relate to?"
    And page should display checkboxes for the "6" tax years before the current tax year
    When I select Checkbox "Any tax year before 6 April 2018" at Position "6"
    And click on Save and Continue button
    Then page navigates to "Can you tell us more about any tax owed before 6 April 2018?"
    And I enter "Provide the amount, when it was owed, and where the income or gain came from" in the text area
    And click on Save and Continue button
    Then page navigates to "You have no onshore liabilities to disclose"
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
    Then page navigates to "Your offer"
    And I enter "0" in the TextBox field
    And I click on Send offer and disclosure button
    Then page navigates to "You have sent a nil disclosure"
    And the case reference should be "CFSS-1234567"


