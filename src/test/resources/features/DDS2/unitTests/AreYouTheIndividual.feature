@page
Feature: A UK tax payer is able to enter the details and continue on Are you the individual this disclosure relates to?

  Scenario: Are you the individual this disclosure relates to? - User navigates to the page and verifies the page elements
    Given I am navigated to Are you the individual this disclosure relates to Page
    When the page is loaded successfully and verifies the page title is "Are you the individual this disclosure relates to? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Are you the individual this disclosure relates to?"
    And verify that Yes and No radio options are selected by default

  Scenario: Are you the individual this disclosure relates to? - User selects Yes or No and continues to the next page. And navigated back to Are you the individual this disclosure relates to?
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select "Yes"
    And click on Save and Continue button
    Then I am navigated to the next page with title "Do you want to disclose offshore liabilities? - Digital Disclosure Service - GOV.UK"
    When I click on Back button
    Then I am navigated to the next page with title "Are you the individual this disclosure relates to? - Digital Disclosure Service - GOV.UK"
    And option still selected is "Yes"
    When I select "No"
    And click on Save and Continue button
    Then I am navigated to the next page with title "Do you want to disclose offshore liabilities? - Digital Disclosure Service - GOV.UK"

  Scenario: Are you the individual this disclosure relates to? - Validation with no selection of Radio Button
    Given I am navigated to Are you the individual this disclosure relates to Page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you are the individual"

  Scenario: Are you the individual this disclosure relates to? - Navigation to "What is the individual’s full name?"  Option 1
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "I want to disclose onshore liabilities" at Position "1"
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is the individual’s full name? - Digital Disclosure Service - GOV.UK"

  Scenario: Are you the individual this disclosure relates to? - Navigation to "What is the individual’s full name?" Option 2
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "I do not have onshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is the individual’s full name? - Digital Disclosure Service - GOV.UK"

  Scenario: Are you the individual this disclosure relates to? - Navigation to "What is the individual’s full name?" Option 3
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I do not have offshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is the individual’s full name? - Digital Disclosure Service - GOV.UK"

  Scenario: Are you the individual this disclosure relates to? - Navigation to "What is your email address?"
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I do not have offshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "Individual Full Name" in the TextBox field
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
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    And click on confirm button
    And I enter "Agent Full Name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777777777" in the TextBox field
    And click on Save and Continue button
    And I select Yes radio button
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is your email address? - Digital Disclosure Service - GOV.UK"

  Scenario: Are you the individual this disclosure relates to? - Navigation to "What is the country of your address?" Option 1
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I do not have offshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "Individual Full Name" in the TextBox field
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
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    And click on confirm button
    And I enter "Agent Full Name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777777777" in the TextBox field
    And click on Save and Continue button
    And I select No radio button
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is the country of your address? - Digital Disclosure Service - GOV.UK"

  Scenario: Are you the individual this disclosure relates to? - Navigation to "What is the country of your address?" Option 2
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I do not have offshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "Individual Full Name" in the TextBox field
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
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    And click on confirm button
    And I enter "Agent Full Name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777777777" in the TextBox field
    And click on Save and Continue button
    And I select Yes radio button
    And click on Save and Continue button
    And I enter "AgentEmailAddress@example.com" email TextBox field
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is the country of your address? - Digital Disclosure Service - GOV.UK"