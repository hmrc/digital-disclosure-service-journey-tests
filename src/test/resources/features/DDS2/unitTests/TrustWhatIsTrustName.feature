@page
Feature: A UK tax payer is able to enter the details and continue on to What is the trust's name? screen

  Scenario: What is the trust's name? - UI Validation
    Given I navigate to "trust-name" page
    When the page is loaded successfully and verifies the page title is "What is the trust’s name? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What is the trust’s name?"
    And input TextBox is displayed
    And save and Continue Button is displayed

  Scenario: What is the trust's name? - Navigation to What is the country of the trust's address? screen
    Given I navigate to "trust-name" page
    And I enter "I am fifty characters. I am fifty characters. I am" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What is the country of the trust’s address?"

  Scenario Outline: Validate between 1 and 50 characters on What is the trust's name? screen with digits and special characters
    Given I navigate to "trust-name" page
    When I enter <trustName> in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What is the country of the trust’s address?"
    When the page is loaded successfully and verifies the page title is "What is the country of the trust’s address? - Digital Disclosure Service - GOV.UK"

    Examples:
      | trustName |
      | "A"       |
      | "I am fifty characters. I am fifty characters. I am"    |
      | "IamATrustWithDigits434"                                |
      | "IamATrustWiTHSpecialCharacter!@$%$%$^%$&-----^&"       |


  Scenario: What is the trust's name? - Validation with no input
    Given I navigate to "trust-name" page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the trust’s name"

  Scenario: What is the trust's name? - Validation greater than 50 characters including digits and special characters
    Given I navigate to "trust-name" page
    When I enter "I am fifty characters. I am 50 characters!!@£@£$$%%&**()/.,~`!±/----786344242hg I am fifty characters" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Trust name must be between 1 and 50 characters"