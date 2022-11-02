@page
Feature: A UK tax payer is able to enter the details and continue on What is the name of the organisation you represent? page

  @id:001
  Scenario: What is the name of the organisation you represent? - UI Validation
    Given I navigate to "representing-organisation-name" page
    When the page is loaded successfully and verifies the page title is "What is the name of the organisation you represent? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What is the name of the organisation you represent?"
    And input TextBox is displayed

  @id:002
  Scenario: What is the name of the organisation you represent? - Navigation with Valid data
    Given I navigate to "representing-organisation-name" page
    When I enter "Name of organisation" in the TextBox field
    And  click on Save and Continue button
    Then page navigates to "Offshore liabilities"

  @id_003
  Scenario: What is the name of the organisation you represent? - Navigation with blank data
    Given I navigate to "representing-organisation-name" page
    When I enter " " in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the name of the organisation you represent"

  @id_004
  Scenario: What is the name of the organisation you represent? - Validation with  more than max length in TextBox field
    Given I navigate to "representing-organisation-name" page
    When I enter data with max length of "50" in Organisation Name TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Organisation name must be between 1 and 50 characters"

  @id_005
  Scenario: What is the name of the organisation you represent? - Navigation of on Error message on top popup
    Given I navigate to "representing-organisation-name" page
    When I enter " " in the TextBox field
    And click on Save and Continue button
    And I click on problem message "Enter the name of the organisation you represent"
    Then I should navigate to Organisation Name TextBox field

