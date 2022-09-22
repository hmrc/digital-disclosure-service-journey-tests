@page
Feature: A UK tax payer is able to enter the details and continue on What is your email address?

  @id001
  Scenario: What is your email address? - UI validation
    Given I am What is your email address Page
    Then header with text "What is your email address?" is displayed
    Then hint with text "For example, name@example.com." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed