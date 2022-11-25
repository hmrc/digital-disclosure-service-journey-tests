@page
Feature: A UK estate individual is able to enter the details and continue on Was the person registered for VAT, as far you're aware? screen

  Scenario: Was the person registered for VAT, as far as you're aware? - Estate individual, UI validation
    Given I navigate to "estates-individual-registered-for-vat" page
    Then the page title should be "Was the person registered for VAT, as far as you’re aware? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "Was the person registered for VAT, as far as you’re aware?"
    And radio Button with text "Yes, and I know their VAT registration number" is displayed at position "1"
    And radio Button with text "Yes, but I do not know their VAT registration number" is displayed at position "2"
    And radio Button with text "No" is displayed at position "3"
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: Was the person registered for VAT, as far as you're aware? - Estate individual, Leave blank input field
    Given I navigate to "estates-individual-registered-for-vat" page
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if the person was registered for VAT"

  Scenario: Was the person registered for VAT, as far you're aware?  - Yes, and I know their VAT registration number
    Given I navigate to "estates-individual-registered-for-vat" page
    When I select Radio Button "Yes, and I know their VAT registration number" at Position "1"
    And click on Save and Continue button
    Then I am navigated to the next page with title "What was the person’s VAT registration number? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "What was the person’s VAT registration number?"

  Scenario: Was the person registered for VAT, as far you're aware?  - Yes, but I do not know their VAT registration number
    Given I navigate to "estates-individual-registered-for-vat" page
    When I select Radio Button "Yes, but I do not know their VAT registration number" at Position "2"
    And click on Save and Continue button
    Then I am navigated to the next page with title "Was the person registered for Self Assessment, as far as you’re aware? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "Was the person registered for Self Assessment, as far as you’re aware?"

  Scenario: Was the person registered for VAT, as far you're aware?  - No
    Given I navigate to "estates-individual-registered-for-vat" page
    When I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then I am navigated to the next page with title "Was the person registered for Self Assessment, as far as you’re aware? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "Was the person registered for Self Assessment, as far as you’re aware?"
