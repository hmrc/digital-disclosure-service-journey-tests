Feature: A UK tax payer is able to enter the details and continue on Are you registered for VAT?

  Scenario: Are you registered for VAT? - UI Validation
    Given I am on Are you registered for VAT Page
    When the page is loaded successfully and verifies the page title is "Are you registered for VAT? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Are you registered for VAT?"
    And radio Button with text "Yes, and I know my VAT registration number" is displayed at position "1"
    And radio Button with text "Yes, but I do not know my VAT registration number" is displayed at position "2"
    And radio Button with text "No" is displayed at position "3"
    And verify that radio options are not selected by default

  Scenario: Are you registered for VAT? - Navigation with option 1
    Given I am on Are you registered for VAT Page
    When I select Radio Button "Yes, and I know my VAT registration number" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What is your VAT registration number?"

  Scenario: Are you registered for VAT? - Navigation with option 2
    Given I am on Are you registered for VAT Page
    When I select Radio Button "Yes, but I do not know my VAT registration number" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Are you registered for Self Assessment?"

  Scenario: Are you registered for VAT? - Navigation with option 3
    Given I am on Are you registered for VAT Page
    When I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Are you registered for Self Assessment?"

  Scenario: Are you registered for VAT? - Validation with no selection of Radio Button
    Given I am on Are you registered for VAT Page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you are registered for VAT"

  Scenario: Are you registered for VAT? - Navigation of on Error message on top popup
    Given I am on Are you registered for VAT Page
    And click on Save and Continue button
    When I click on problem message "Select yes if you are registered for VAT"
    Then I should navigate to Radio button "Yes, and I know my VAT registration number" at Position "1"





