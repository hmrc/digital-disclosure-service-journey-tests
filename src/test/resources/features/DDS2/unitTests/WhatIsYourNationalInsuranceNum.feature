@page
Feature: A UK tax payer is able to enter the details and continue on "What is your National Insurance number?"

  @id001
  Scenario: What is your National Insurance number? - UI validation
    Given I am on What is your National Insurance number Page
    Then verify the question should be "What is your National Insurance number?"
    And hint with text "For example, ‘QQ123456A’." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  @id_002
  Scenario: What is your National Insurance number? - Leave blank input field
    Given I am on What is your National Insurance number Page
    When I enter no data in NI Number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter your National Insurance number"

  @id_003
  Scenario: What is your National Insurance number? - Validation with  more than max length in TextBox field
    Given I am on What is your National Insurance number Page
    When I enter data with max length of "10" in NI Number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "National Insurance number must be 10 characters or less"

  @id_004
  Scenario: WWhat is your National Insurance number? - Navigation of on Error message on top popup
    Given I am on What is your National Insurance number Page
    When I enter no data in NI Number TextBox field
    And click on Save and Continue button
    And I click on problem message "Enter your National Insurance number"
    Then I should navigate to NI number TextBox field