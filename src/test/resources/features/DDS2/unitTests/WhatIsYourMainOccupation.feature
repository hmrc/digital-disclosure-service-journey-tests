@page
Feature: A UK tax payer is able to enter the details and continue on What is your main occupation?

  Scenario: What is your main occupation? - UI validation
    Given I am on What is your main occupation page
    Then the page title should be "What is your main occupation? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "What is your main occupation?"
    And hint with text "For example, plumber or dentist." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: What is your main occupation? - Navigation of on Error message on top popup
    Given I am on What is your main occupation page
    When I enter "" in the TextBox field
    And click on Save and Continue button
    And I click on problem message "Enter your main occupation"
    Then I should navigate to TextBox field



