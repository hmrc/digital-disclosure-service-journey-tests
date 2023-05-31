Feature: A UK tax payer is able to enter the details and continue on What is your VAT registration number page?

  Scenario: What is your VAT registration number? - UI validation
    Given I am on What is your VAT registration number page
    Then the page title should be "What is your VAT registration number? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "What is your VAT registration number?"
    And body text should be "This has 9 numbers, sometimes with ‘GB’ at the start. You can find it on your VAT registration certificate or VAT online account."
    And hint with text "For example, ‘123456789’ or ‘GB123456789’." is displayed
    And input TextBox is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: What is your VAT registration number? - Leave blank input field
    Given I am on What is your VAT registration number page
    When I enter "" in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter a valid VAT registration number"

  Scenario: What is your VAT registration number?  - Enter VAT number, continue to the next page and navigate back
    Given I am on What is your VAT registration number page
    When I enter "123569878" in the TextBox field
    And click on Save and Continue button
    Then I am navigated to the next page with title "Are you registered for Self Assessment? - Digital Disclosure Service - GOV.UK"
    When I click on Back button
    Then I am navigated back to the page with title "What is your VAT registration number? - Digital Disclosure Service - GOV.UK"

  Scenario: What is your VAT registration number?  - Enter Valid VAT number with spaces
    Given I am on What is your VAT registration number page
    When I enter "123 569 878" in the TextBox field
    And click on Save and Continue button
    Then I am navigated to the next page with title "Are you registered for Self Assessment? - Digital Disclosure Service - GOV.UK"

  Scenario: What is your VAT registration number?  - Enter Valid VAT number with GB
    Given I am on What is your VAT registration number page
    When I enter "GB123569878" in the TextBox field
    And click on Save and Continue button
    Then I am navigated to the next page with title "Are you registered for Self Assessment? - Digital Disclosure Service - GOV.UK"

  Scenario: What is your VAT registration number?  - Enter Valid VAT number with GB and spaces
    Given I am on What is your VAT registration number page
    When I enter "GB 123 569 878" in the TextBox field
    And click on Save and Continue button
    Then I am navigated to the next page with title "Are you registered for Self Assessment? - Digital Disclosure Service - GOV.UK"

  Scenario Outline: Validate error messages on VAT page
    Given I am on What is your VAT registration number page
    When I enter <vatNumber> in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text <Error>

    Examples:
      | vatNumber | Error |
      |    "01256896692" |  "Enter a valid VAT registration number"    |
      |    "123" |  "Enter a valid VAT registration number"    |
      |    "TEST1123V" |  "Enter a valid VAT registration number"    |