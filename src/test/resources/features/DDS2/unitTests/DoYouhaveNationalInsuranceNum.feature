@page
Feature: A UK tax payer is able to enter the details and continue on Do you have a National Insurance number?

  @id:001
  Scenario: Do you have a National Insurance number? - UI Validation
    Given I am on Do you have a National Insurance number Page
    When the page is loaded successfully and verifies the page title is "Do you have a National Insurance number? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Do you have a National Insurance number?"
    And radio Button with text "Yes, and I know my National Insurance number" is displayed at position "1"
    And radio Button with text "Yes, but I do not know my National Insurance number" is displayed at position "2"
    And radio Button with text "No" is displayed at position "3"
    And verify that radio options are not selected by default

  @id_002
  Scenario: Do you have a National Insurance number?- Navigation with option 1
    Given I am on Do you have a National Insurance number Page
    When I select Radio Button "Yes, and I know my National Insurance number" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What is your National Insurance number?"

  @id_003
  Scenario: Do you have a National Insurance number?- Navigation with option 2
    Given I am on Do you have a National Insurance number Page
    When I select Radio Button "Yes, but I do not know my National Insurance number" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Are you registered for VAT?"

  @id_004
  Scenario: Do you have a National Insurance number?- Navigation with option 3
    Given I am on Do you have a National Insurance number Page
    When I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then page navigates to "Are you registered for VAT?"

  @id_005
  Scenario: Do you have a National Insurance number?- Navigation with Back button
    Given I am on What is your main occupation page
    When I enter "plumber" in the TextBox field
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "What is your main occupation?"

  @id_006
  Scenario: Do you have a National Insurance number? -Validation with no selection of Radio Button
    Given I am on Do you have a National Insurance number Page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you have a National Insurance number"

  @id_007
  Scenario: Do you have a National Insurance number? -Navigation of on Error message on top popup
    Given I am on Do you have a National Insurance number Page
    And click on Save and Continue button
    When I click on problem message "Select yes if you have a National Insurance number"
    Then I should navigate to Radio button "Yes, and I know my National Insurance number" at Position "1"






