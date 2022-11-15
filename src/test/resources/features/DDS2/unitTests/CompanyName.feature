@page
Feature: A UK tax payer is able to enter the details and continue on What is the name of the company the disclosure will be about?

  Scenario: What is the name of the company the disclosure will be about? - UI Validation
    Given I navigate to "company-name" page
    When the page is loaded successfully and verifies the page title is "What is the name of the company the disclosure will be about? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What is the name of the company the disclosure will be about?"
    And input TextBox is displayed
    And save and Continue Button is displayed

  Scenario: What is the name of the company the disclosure will be about?-Validation with no input
    Given I navigate to "company-name" page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the company’s name"

  Scenario Outline: Validate error messages on What is the name of the company the disclosure will be about? page
    Given I navigate to "company-name" page
    When I enter <companyName> in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text <Error>

    Examples:
      | companyName | Error |
      |    "company name with more than fifty characters with spaces" |  "Company name must be between 1 and 50 characters"    |
      |    "company name with special characters and/or than fifty-characters with spaces" |  "Company name must be between 1 and 50 characters"    |

  Scenario: What is the name of the company the disclosure will be about? - Navigate to next page
    Given I navigate to "company-name" page
    When I enter "Marks Estate Ltd" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What is the company’s registration number?"

  Scenario: What is the name of the company the disclosure will be about? - 1 character
    Given I navigate to "company-name" page
    When I enter "A" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What is the company’s registration number?"