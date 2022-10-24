@page
Feature: A UK tax payer is able to enter the details and continue on What is the name of the organisation you represent? page

  Scenario: What is the name of the organisation you represent? - UI Validation
    Given I navigate to "representing-organisation-name" page
    When the page is loaded successfully and verifies the page title is "What is the name of the organisation you represent? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What is the name of the organisation you represent?"
    And input TextBox is displayed
