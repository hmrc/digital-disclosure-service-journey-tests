@page
Feature: As an Estate tax payer is able to enter the details and continue on Did the person have a National Insurance number, as far as you’re aware?

  Scenario: Did the person have a National Insurance number, as far as you’re aware? - UI Validation
    Given I navigate to "estates-have-national-insurance-number" page
    When the page is loaded successfully and verifies the page title is "Did the person have a National Insurance number, as far as you’re aware? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Did the person have a National Insurance number, as far as you’re aware?"
    And radio Button with text "Yes, and I know their National Insurance number" is displayed at position "1"
    And radio Button with text "Yes, but I do not know their National Insurance number" is displayed at position "2"
    And radio Button with text "No" is displayed at position "3"
    And verify that radio options are not selected by default

  Scenario: Did the person have a National Insurance number, as far as you’re aware? -Navigation of on Error message on top popup
    Given I navigate to "estates-have-national-insurance-number" page
    And click on Save and Continue button
    When I click on problem message "Select yes if the person had a National Insurance number"
    Then I should navigate to Radio button "Yes, and I know their National Insurance number" at Position "1"

    @WIP
  Scenario: Did the person have a National Insurance number, as far as you’re aware? - Navigation with option 1
    Given I navigate to "estates-have-national-insurance-number" page
    When I select Radio Button "Yes, and I know their National Insurance number" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What is the person’s National Insurance number?"

  Scenario: Did the person have a National Insurance number, as far as you’re aware?  -Validation with no selection of Radio Button
    Given I navigate to "estates-have-national-insurance-number" page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if the person had a National Insurance number"

  Scenario: Did the person have a National Insurance number, as far as you’re aware? - Navigation with option 2
    Given I navigate to "estates-have-national-insurance-number" page
    When I select Radio Button "Yes, but I do not know their National Insurance number" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Was the person registered for VAT, as far you’re aware?"

  Scenario: Did the person have a National Insurance number, as far as you’re aware? - Navigation with option 3
    Given I navigate to "estates-have-national-insurance-number" page
    When I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Was the person registered for VAT, as far you’re aware?"