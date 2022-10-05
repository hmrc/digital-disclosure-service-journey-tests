@page
Feature: A UK tax payer is able to enter the details and continue on "What is your Unique Tax Reference?"

  @id001
  Scenario: What is your Unique Tax Reference? - UI validation
    Given I am on What is your Unique Tax Reference Page
    Then verify the question should be "What is your Unique Tax Reference?"
    And hint with text "For example, ‘1234567890’." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  @id002
  Scenario: What is your Unique Tax Reference?  - Enter valid UTR
    Given I am on What is your Unique Tax Reference Page
    When I enter "1234567890" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What is the country of your address?"

  @id003
  Scenario: What is your Unique Tax Reference?  - Leave blank input field
    Given I am on What is your Unique Tax Reference Page
    When I enter "" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter a valid Unique Tax Reference, like 1234567890"

  @id_004
  Scenario: What is your Unique Tax Reference?  - Navigation of on Error message on top popup
    Given I am on What is your Unique Tax Reference Page
    When I enter "" in the TextBox field
    And click on Save and Continue button
    And I click on problem message "Enter a valid Unique Tax Reference, like 1234567890"
    Then I should navigate to UTR number TextBox field

  @id_005
  Scenario: What is your Unique Tax Reference?  - Navigation with Back button
    Given I am on Are you registered for Self Assessment Page
    When I select Radio Button "Yes, and I know my Unique Taxpayer Reference (UTR)" at Position "1"
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "Are you registered for Self Assessment?"
