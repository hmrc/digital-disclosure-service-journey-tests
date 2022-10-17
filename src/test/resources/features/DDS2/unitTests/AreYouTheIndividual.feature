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

  Scenario: Are you the individual this disclosure relates to? - Navigation to "What is the individual's full name?"  Option 1
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I want to disclose offshore liabilities" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "I want to disclose onshore liabilities" at Position "1"
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is the individual's full name? - Digital Disclosure Service - GOV.UK"

  Scenario: Are you the individual this disclosure relates to? - Navigation to "What is the individual's full name?" Option 2
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I want to disclose offshore liabilities" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "I do not have onshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is the individual's full name? - Digital Disclosure Service - GOV.UK"

  Scenario: Are you the individual this disclosure relates to? - Navigation to "What is the individual's full name?" Option 3
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I do not have offshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is the individual's full name? - Digital Disclosure Service - GOV.UK"