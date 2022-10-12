@page
Feature: A UK tax payer is able to enter the details and continue on "What is the individual's Unique Tax Reference?"

  @id001
  Scenario: What is the individual's Unique Tax Reference? - UI validation
    Given I am on What is the individual Unique Tax Reference Page
    Then verify the question should be "What is the individual's Unique Tax Reference?"
    And body text should be "This 10 digit number is on their tax return, statement of accounts or any other Self Assessment calculations."
    And hint with text "For example, ‘1234567890’." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed