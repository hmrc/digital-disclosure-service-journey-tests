@page
Feature: A UK tax payer is able to enter the details and continue on "What is the country of your address?"

  @id001
  Scenario: What is the country of your address? - UI validation
    Given I am on What is the country of your address Page
    Then verify the question should be "What is the country of your address?"
    And hint with text "For example, United Kingdom." is displayed
    And enter country name "United",dropdown is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed