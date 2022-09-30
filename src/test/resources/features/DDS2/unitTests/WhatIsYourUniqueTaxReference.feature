@page
Feature: A UK tax payer is able to enter the details and continue on "What is your Unique Tax Reference?"

  @id001
  Scenario: What is your Unique Tax Reference? - UI validation
    Given I am on What is your Unique Tax Reference Page
    Then verify the question should be "What is your Unique Tax Reference?"
    And hint with text "For example, ‘1234567890’" is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed