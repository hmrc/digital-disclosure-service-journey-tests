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

  Scenario: other liability issues -Individual
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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

  Scenario: other liability issues -On behalf individual
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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

  Scenario: other liability issues -Estate
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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
    Then page navigates to "Can you describe what other liability issues you need to fix?"
    When I enter "Description for other liability issues" in the can you describe what other liability issues text area
    And click on Save and Continue button
    Then page navigates to "Did the person receive tax credits for any of the years covered by this disclosure?"
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Review other liability issues"
    When click on continue button on summary page
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit other liability issues"

  Scenario: other liability issues - Company
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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
    Then page navigates to "Can you describe what other liability issues you need to fix?"
    When I enter "Description for other liability issues" in the can you describe what other liability issues text area
    And click on Save and Continue button
    Then page navigates to "Review other liability issues"
    When click on continue button on summary page
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit other liability issues"

  Scenario: other liability issues -LLP
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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
    Then page navigates to "Can you describe what other liability issues you need to fix?"
    When I enter "Description for other liability issues" in the can you describe what other liability issues text area
    And click on Save and Continue button
    Then page navigates to "Review other liability issues"
    When click on continue button on summary page
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit other liability issues"


  Scenario: other liability issues -Trust
    Given I am on "You have sent your notification" page
    And I navigate to "make-a-disclosure" specific page
    When I click on Make a disclosure button
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
    Then page navigates to "Can you describe what other liability issues you need to fix?"
    When I enter "Description for other liability issues" in the can you describe what other liability issues text area
    And click on Save and Continue button
    Then page navigates to "Review other liability issues"
    When click on continue button on summary page
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit other liability issues"
