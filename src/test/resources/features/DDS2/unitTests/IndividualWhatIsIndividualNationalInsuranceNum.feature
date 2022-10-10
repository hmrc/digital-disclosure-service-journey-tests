@page
Feature: A UK tax payer is able to enter the details and continue on "What is individual's National Insurance number?"

  @id001
  Scenario: What is individual's National Insurance number?- UI validation
    Given I am on What is individual National Insurance number Page
    Then verify the question should be "What is individual's National Insurance number?"
    And hint with text "For example, ‘QQ123456A’." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed