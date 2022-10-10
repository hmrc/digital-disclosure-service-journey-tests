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

  Scenario: What is your address? - International page - Enter valid data and continue
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

  Scenario: What is the country of your address? - UK - Enter address manually on choose address page and then verify the confirm page
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    When enter postcode "ZZ9Z 9TT"
    And click on continue button
    Then page navigates to "Choose your address"
    When I click on the hyperlink with text "Enter your address manually"
    Then page navigates to "What is your address?"
    And I enter "Berry lane" in the "Address line 1" field
    And I enter "Another line 3" in the "Address line 3" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "Berry lane"
    And address at line "2" is "Another line 3"
    And address at line "3" is "ZZ9Z 9TT"
    And address at line "4" is "United Kingdom"



