@page
Feature: A UK tax payer is able to enter the details and continue on What is your full name?

  Scenario: What is your full name? - UI validation
    Given I am What is your full name Page
    Then header with text "What is your full name?" is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed
