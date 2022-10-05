@page
Feature: A UK tax payer is able to enter the details and continue on What is your VAT registration number page?

  Scenario: What is your VAT registration number? - UI validation
    Given I am on What is your VAT registration number page
    Then the page title should be "What is your VAT registration number? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "What is your VAT registration number?"
    And body Text should be "This is a 9 digit number on your VAT certificate or VAT online account."
    And hint with text "For example, ‘123456789’." is displayed
    And input TextBox is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: What is your VAT registration number? - Leave blank input field
    Given I am on What is your VAT registration number page
    When I enter "" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter your VAT registration number"

  Scenario: What is your VAT registration number?  - Enter VAT number, continue to the next page and navigate back
    Given I am on What is your VAT registration number page
    When I enter "123569878" in the TextBox field
    And click on Save and Continue button
    Then I am navigated to the next page with title "Are you registered for Self Assessment? - Digital Disclosure Service - GOV.UK"
    When I click on Back button
    Then I am navigated back to the page with title "What is your VAT registration number? - Digital Disclosure Service - GOV.UK"
