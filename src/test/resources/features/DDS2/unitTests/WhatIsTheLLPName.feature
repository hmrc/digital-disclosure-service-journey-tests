@page
Feature: A UK tax payer is able to enter the details and continue on What is the limited liability partnership's name?

  @id_001
  Scenario: What is the name of the company the disclosure will be about? - UI Validation
    Given I navigate to "llp-name" page
    When the page is loaded successfully and verifies the page title is "What is the limited liability partnership’s name? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What is the limited liability partnership’s name?"
    And input TextBox is displayed
    And save and Continue Button is displayed
