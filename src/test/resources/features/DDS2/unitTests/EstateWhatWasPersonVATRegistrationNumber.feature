Feature: A UK estate tax payer is able to enter the details and continue on to "What was the person's VAT registration number?" screen

  Scenario: What was the person's VAT registration number? - UI validation
    Given I navigate to "estates-individual-vat-registration" page
    Then the page title should be "What was the person’s VAT registration number? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What was the person’s VAT registration number?"
    And body text should be "This has 9 numbers, sometimes with ‘GB’ at the start. You can find it on their VAT registration certificate or VAT online account."
    And hint with text "For example, ‘123456789’ or ‘GB123456789’." is displayed
    And input TextBox is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed


  Scenario: What was the person's VAT registration number? - Invalid input - blank field
    Given I navigate to "estates-individual-vat-registration" page
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the person’s VAT registration number"


  Scenario Outline: What was the person's VAT registration number?- Invalid input length, char type w/wo spaces
    Given I navigate to "estates-individual-vat-registration" page
    When I enter <InvalidValue> in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the person’s VAT registration number in the right format"

    Examples:
      |    InvalidValue   |
      |    "AB1234567890" |
      | "gb12345   67890" |
      |   "gb12345-67890" |
      |    "67890"        |
      |   "1234567890"    |
      |    "@£$%@4"       |
      |   "lasjdahs"      |

  Scenario Outline: What was the person's VAT registration number - valid Input, GB followed by 9 digits (Ignore spaces), 9 digits without GB at the beginning
    Given I navigate to "estates-individual-vat-registration" page
    When I enter <value> in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Was the person registered for Self Assessment, as far as you’re aware?"


    Examples:
      | value            |
      | "GB 123456789"   |
      | "123456789"      |
      | "GB2334 54663"    |