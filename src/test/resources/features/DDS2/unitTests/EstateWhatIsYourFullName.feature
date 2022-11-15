@page
Feature: As an Estate tax payer is able to enter the details and continue on What was the name of the person who died?

  Scenario: What was the name of the person who died? - UI validation
    Given I navigate to "estates-individual-full-name" page
    Then header with text "What was the name of the person who died?" is displayed
    And body should be "This should be as it’s written on official documents such as their passport or driving licence."
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: What was the name of the person who died? - Leave blank input field
    Given I navigate to "estates-individual-full-name" page
    When I enter "" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the person’s full name"

  Scenario: What was the name of the person who died? - Validation with  more than max length in TextBox field
    Given I navigate to "estates-individual-full-name" page
    When I enter "this name should be more than fifty characters length" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Person’s name must be between 1 and 50 characters"

  Scenario: What was the name of the person who died? - Enter full name and navigate to next page
    Given I navigate to "estates-individual-full-name" page
    When I enter "James Anderson" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What was the person’s date of birth?"
    When I click on Back button
    Then page navigates to "What was the name of the person who died?"