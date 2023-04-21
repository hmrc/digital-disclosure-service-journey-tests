@WIP
Feature: As Estate UK tax payer is able to enter the details and continue on to What was the person's address? screen

  Scenario: Was the person registered for Self Assessment, as far as you're aware? - UI validation
    Given I navigate to "what-is-this-disclosure-about" page
    And I select Radio Button "An estate" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on confirm button
    And I enter "James Anderson" in the TextBox field
    And click on Save and Continue button
    And I enter "01" in the "Day" text box field
    And I enter "01" in the "Month" text box field
    And I enter "1980" in the "Year" text box field
    And click on Save and Continue button
    And I enter "Shop Owner" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on Save and Continue button
    When I click on the hyperlink with text "Enter the address manually"
    Then page navigates to "What was the person’s address?"
    And header with text "What was the person’s address?" is displayed











