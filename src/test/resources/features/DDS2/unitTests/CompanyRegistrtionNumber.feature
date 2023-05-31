Feature: A UK tax payer is able to enter the details and continue on What is the company’s registration number?

  Scenario: What is the company’s registration number? - UI Validation
    Given I navigate to "company-registration" page
    When the page is loaded successfully and verifies the page title is "What is the company’s registration number? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What is the company’s registration number?"
    And body should be "You can find this on the company’s certificate of incorporation."
    And hint with text "This can be 8 numbers like 12345678, or 2 letters followed by 6 numbers like AB123456." is displayed
    And input TextBox is displayed
    And save and Continue Button is displayed

  Scenario: What is the company’s registration number? - Validation with no input
    Given I navigate to "company-registration" page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the company’s registration number"

  Scenario Outline: Validate error messages on What is the company’s registration number? page
    Given I navigate to "company-registration" page
    When I enter <companyName> in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text <Error>

    Examples:
      | companyName | Error |
      |    "123456789" |  "Enter a valid company registration number"    |
      |    "1" |  "Enter a valid company registration number"    |
      |    "A12345678B" |  "Enter a valid company registration number"    |
      |    "JUSTAWORD" |  "Enter a valid company registration number"    |

  Scenario: What is the company’s registration number? - Navigate to next page - Ignore spaces
    Given I navigate to "company-registration" page
    When I enter "AB 123456" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What is the country of the company’s address?"

  Scenario: What is the company’s registration number? - 1 character
    Given I navigate to "company-registration" page
    When I enter "AB123456" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What is the country of the company’s address?"
