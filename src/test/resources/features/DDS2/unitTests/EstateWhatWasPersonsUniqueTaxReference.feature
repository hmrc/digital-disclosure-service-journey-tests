@page
Feature: A UK estate tax payer is able to enter the details and continue on to "What was the person's Unique Taxpayer Reference?" screen

  Scenario: What was the person's Unique Taxpayer Reference? - UI validation
    Given I navigate to "estates-individual-utr" page
    Then the page title should be "What was the person’s Unique Taxpayer Reference? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What was the person’s Unique Taxpayer Reference?"
    And body text should be "This 10 digit number is on their tax return, statement of accounts or any other Self Assessment calculations."
    And hint with text "For example, ‘1234567890’." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario Outline: What was the person's Unique Taxpayer Reference? - valid Input-10 digits UTR with and without spaces
    Given I navigate to "estates-individual-utr" page
    When I enter <value> in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What was the country of the person’s address?"

    Examples:
      | value            |
      | "1234567890"     |
      | "12345 67890"    |
      | "12 34 56 78 90" |

  Scenario: What was the person's Unique Taxpayer Reference?  - Invalid input - blank field
    Given I navigate to "estates-individual-utr" page
    When I enter "" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the person’s Unique Taxpayer Reference"


  Scenario Outline: What is the individual’s Unique Tax Reference? - invalid length >10 & <10, invalid characters (with spaces)
    Given I navigate to "estates-individual-utr" page
    When I enter <InvalidValue> in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the person’s Unique Taxpayer Reference in the right format"

    Examples:
      | InvalidValue |
      |    "12 34" |
      |  "0123456 78901234567890" |
      |    "asdfghj  koi" |
      |    "@test-mes?£%  £^$£%&%&$@@:?<." |