@page
Feature: An Estate tax payer is able to enter the details and continue on "What was the person’s National Insurance number?"

  Scenario: What was the person’s National Insurance number?- UI validation
    Given I navigate to "estates-individual-national-insurance-number" page
    Then verify the question should be "What was the person’s National Insurance number?"
    And hint with text "For example, ‘QQ123456A’." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: What was the person’s National Insurance number? - Enter valid input field
    Given I navigate to "estates-individual-national-insurance-number" page
    When I enter valid NI Number TextBox field
    And click on Save and Continue button
    Then page navigates to "Was the person registered for VAT, as far as you’re aware?"

  Scenario: What was the person’s National Insurance number? - Blank Input
    Given I navigate to "estates-individual-national-insurance-number" page
    When I enter no data in NI Number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the person’s National Insurance number"

  Scenario: What was the person’s National Insurance number? - Invalid NI
    Given I navigate to "estates-individual-national-insurance-number" page
    When I enter invalid NI Number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the person’s National Insurance number in the right format"

  Scenario: What was the person’s National Insurance number? - Navigation of on Error message on top popup
    Given I navigate to "estates-individual-national-insurance-number" page
    When I enter no data in NI Number TextBox field
    And click on Save and Continue button
    And I click on problem message "Enter the person’s National Insurance number"
    Then I should navigate to NI number TextBox field

  Scenario: What was the person’s National Insurance number? - Navigation with Back button
    Given I navigate to "estates-have-national-insurance-number" page
    When I select Radio Button "Yes, and I know their National Insurance number" at Position "1"
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "Did the person have a National Insurance number, as far as you’re aware?"

  Scenario Outline: What was the person’s National Insurance number? - Format Validation
    Given I navigate to "estates-individual-national-insurance-number" page
    When I enter <Invalid Format> NI Number TextBox field
    And click on Save and Continue button
    Then error message should be displayed with text "Enter the person’s National Insurance number in the right format"
    Examples:
      |Invalid Format| Valid Format Description|
      |"99ABCDEFE"|Two alpha characters, followed by 6 numeric digits, followed by 1 alpha character|
      |"DD123456A"|The first & Second alpha character must be between A and Z, but CANNOT be D, F, I, Q, U, V and|
      |"FF123456A"|The first & Second alpha character must be between A and Z, but CANNOT be D, F, I, Q, U, V and|
      |"II123456A"|The first & Second alpha character must be between A and Z, but CANNOT be D, F, I, Q, U, V and|
      |"QQ123456A"|The first & Second alpha character must be between A and Z, but CANNOT be D, F, I, Q, U, V and|
      |"UU123456A"|The first & Second alpha character must be between A and Z, but CANNOT be D, F, I, Q, U, V and|
      |"VV123456A"|The first & Second alpha character must be between A and Z, but CANNOT be D, F, I, Q, U, V and|
      |"AAabcdefA"|Number can be anything from 0 to 9 and|
      |"AA123456E"|The final alpha character must be between A and D|

  Scenario: What was the person’s National Insurance number? - Enter Valid input with Space
    Given I navigate to "estates-individual-national-insurance-number" page
    When I enter "AZ 12 34 56 D" NI Number TextBox field
    And click on Save and Continue button
    Then page navigates to "Was the person registered for VAT, as far as you’re aware?"

  Scenario: What was the person’s National Insurance number? - Enter Invalid input with Invalid Space format
    Given I navigate to "estates-individual-national-insurance-number" page
    When I enter "AZ 12 345 6   D" NI Number TextBox field
    And click on Save and Continue button
    Then error message should be displayed with text "Enter the person’s National Insurance number in the right format"

  Scenario: What was the person’s National Insurance number? - Enter Invalid input with less than 9 character
    Given I navigate to "estates-individual-national-insurance-number" page
    When I enter "AZ123456" NI Number TextBox field
    And click on Save and Continue button
    Then error message should be displayed with text "Enter the person’s National Insurance number in the right format"