@page
Feature: A UK tax payer is able to enter the details and continue on What is your telephone number page

  Scenario: What is your telephone number? - UI validation
    Given I am on What is your telephone number page
    Then the page title should be "What is your telephone number? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "What is your telephone number?"
    And body text should be "If this is a UK landline or an overseas number, you must include the area or dialing code."
    And hint with text "For example, 01642 123456, 07777 777777 or +33 1 2345 6788." is displayed
    And input TextBox is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: What is your telephone number? - Enter valid telephone number and navigate to next page
    Given I am on What is your telephone number page
    When I enter "07777777777" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Do you have an email address that you are happy to be contacted on by HMRC?"

  Scenario: What is your telephone number? - Leave blank input field
    Given I am on What is your telephone number page
    When I enter "" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter your telephone number in the right format"

  Scenario: What is your telephone number? - Validation with more than max length i.e. 19 characters in TextBox field
    Given I am on What is your telephone number page
    When I enter "0044955222222355456412" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter a valid telephone number"

  Scenario: What is your telephone number? - Validation with 19 digits in TextBox field - ignore space
    Given I am on What is your telephone number page
    When I enter "+123456 7 8 96 3 2 5 89658 7" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Do you have an email address that you are happy to be contacted on by HMRC?"

  Scenario: What is your telephone number? - Validation with + and 19 digits in TextBox field - ignore space
    Given I am on What is your telephone number page
    When I enter "009112345678963258967" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Do you have an email address that you are happy to be contacted on by HMRC?"

  Scenario: What is your telephone number? - Validation UK number with 9 or 10 digits allowed
    Given I am on What is your telephone number page
    When I enter "07777 777777" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Do you have an email address that you are happy to be contacted on by HMRC?"

  Scenario: What is your telephone number? - Validation UK number more than 10 digits not allowed
    Given I am on What is your telephone number page
    When I enter "077555588853" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter a valid telephone number"

  Scenario: What is your telephone number? - Validation on invalid characters and Navigation of on Error message on top popup
    Given I am on What is your telephone number page
    When I enter ",," in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter a valid telephone number"