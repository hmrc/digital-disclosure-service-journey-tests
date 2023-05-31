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
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter your main occupation"
    And I click on problem message "Enter your main occupation"
    Then I should navigate to TextBox field

  Scenario: What is your main occupation? - Minimum characters - Less than 4 characters not allowed
    Given I am on What is your main occupation page
    When I enter "mat" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Your main occupation should have at least 4 characters"
    And I click on problem message "Your main occupation should have at least 4 characters"
    Then I should navigate to TextBox field

  Scenario: What is your main occupation? - Maximum characters - More than 30 characters not allowed
    Given I am on What is your main occupation page
    When I enter "this is a very long main occupation" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Your main occupation should have no more than 30 characters"

  Scenario: What is your main occupation? - Enter occupation, continue to the next page and navigated back
    Given I am on What is your main occupation page
    When I enter "IT Consultant" in the TextBox field
    And click on Save and Continue button
    Then I am navigated to the next page with title "Do you have a National Insurance number? - Digital Disclosure Service - GOV.UK"
    When I click on Back button
    Then I am navigated back to the page with title "What is your main occupation? - Digital Disclosure Service - GOV.UK"
