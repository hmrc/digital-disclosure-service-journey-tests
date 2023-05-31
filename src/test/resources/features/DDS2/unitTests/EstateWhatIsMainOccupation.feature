Feature: As Estate UK tax payer is able to enter the details and continue on What your main occupation? page

  Scenario: What was the person’s main occupation? - UI validation
    Given I navigate to "estates-individual-main-occupation" page
    Then header with text "What was the person’s main occupation?" is displayed
    And hint with text "For example, plumber or dentist." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: What was the person’s main occupation? - blank input error message
    Given I navigate to "estates-individual-main-occupation" page
    When I enter "" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the person’s main occupation"

  Scenario: What is your main occupation? - Minimum characters - Less than 4 characters not allowed
    Given I navigate to "estates-individual-main-occupation" page
    When I enter "mat" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "The person’s main occupation must be between 4 and 30 characters"
    And I click on problem message "The person’s main occupation must be between 4 and 30 characters"
    Then I should navigate to TextBox field

  Scenario: What is your main occupation? - Maximum characters - More than 30 characters not allowed
    Given I navigate to "estates-individual-main-occupation" page
    When I enter "this is a very long main occupation" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "The person’s main occupation must be between 4 and 30 characters"

  Scenario: What was the person’s main occupation? - Enter valid data and navigate to next page
    Given I navigate to "estates-individual-main-occupation" page
    When I enter "Dentist" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Did the person have a National Insurance number, as far as you’re aware?"
    When I click on Back button
    Then page navigates to "What was the person’s main occupation?"