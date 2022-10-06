@page
Feature: A UK tax payer residing abroad is able to enter the details and continue on "What is the country of your address?"

  Scenario: What is your address? - UK - UI validation
    Given I am on UK What is your address Page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter at least one address line or a town"

  Scenario: What is your address? - International - UI validation
    Given I am on International What is your address Page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter at least one address line or a town"

  Scenario: Enter your address - International page - Enter valid data and continue
    Given I am on International What is your address Page
    When I enter "" in the "Organisation" field
    And I enter "San diego lane" in the "Address line 1" field
    And I enter "ABC Ltd" in the "Address line 2" field
    And I enter "ABC Ltd" in the "Address line 3" field
    And I enter "ABC Ltd" in the "Town or city" field
    And I enter "HP19 9AA" in the "Postcode" field
    When click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And I click on Back button
    Then page navigates to "What is your address?"
