@page
Feature: A UK tax payer is able to enter the details and continue on What is the limited liability partnership's name?

  @id_001
  Scenario: What is the limited liability partnership's name? - UI Validation
    Given I navigate to "llp-name" page
    When the page is loaded successfully and verifies the page title is "What is the limited liability partnership’s name? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What is the limited liability partnership’s name?"
    And input TextBox is displayed
    And save and Continue Button is displayed

  @id_002
  Scenario: What is the limited liability partnership's name? - Validation with no input
    Given I navigate to "llp-name" page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the limited liability partnership’s name"

  @id_003
  Scenario Outline: Validate error messages on What is the limited liability partnership's name? page
    Given I navigate to "llp-name" page
    When I enter <llpName> in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text <Error>

    Examples:
      | llpName | Error |
      |    "Limited liability partnership name with more than fifty characters with spaces" |  "Limited liability partnership name must be between 1 and 50 characters"    |
      |    "Limited liability partnership name with special characters and/or than fifty-characters with spaces" |  "Limited liability partnership name must be between 1 and 50 characters"    |

  @id_004
  Scenario: What is the limited liability partnership's name? - Navigation to the next page
    Given I navigate to "llp-name" page
    When the page is loaded successfully and verifies the page title is "What is the limited liability partnership’s name? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What is the limited liability partnership’s name?"
    When I enter "this name is more than thirty characters" in the TextBox field
    And click on Save and Continue button
    Then heading with text "What is the country of the limited liability partnership’s address?" is displayed