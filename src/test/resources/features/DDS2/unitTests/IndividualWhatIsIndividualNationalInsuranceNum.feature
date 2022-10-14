@page
Feature: A UK tax payer is able to enter the details and continue on "What is individual's National Insurance number?"

  @id001
  Scenario: What is individual's National Insurance number?- UI validation
    Given I am on What is individual National Insurance number Page
    Then verify the question should be "What is individual's National Insurance number?"
    And hint with text "For example, ‘QQ123456A’." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed


  @id_002
  Scenario: What is individual's National Insurance number? - Enter valid input field
    Given I am on What is individual National Insurance number Page
    When I enter valid NI Number TextBox field
    And click on Save and Continue button
    Then page navigates to "Is the individual registered for VAT, as far as you’re aware?"

  @id_003
  Scenario: What is individual's National Insurance number? - Blank Input
    Given I am on What is individual National Insurance number Page
    When I enter no data in NI Number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the individual's National Insurance number"

  @id_004
  Scenario: What is individual's National Insurance number? - Invalid NI
    Given I am on What is individual National Insurance number Page
    When I enter invalid NI Number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter a valid National Insurance number"

  @id_005
  Scenario: What is individual's National Insurance number? - Navigation of on Error message on top popup
    Given I am on What is individual National Insurance number Page
    When I enter no data in NI Number TextBox field
    And click on Save and Continue button
    And I click on problem message "Enter the individual's National Insurance number"
    Then I should navigate to NI number TextBox field

  @id_006
  Scenario: What is individual's National Insurance number? - Navigation with Back button
    Given I am on Does the individual have a National Insurance number Page
    When I select Radio Button "Yes, and I know their National Insurance number" at Position "1"
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "Does the individual have a National Insurance number, as far as you're aware?"

  @id_007
  Scenario Outline: What is individual's National Insurance number? - Format Validation
    Given I am on What is individual National Insurance number Page
    When I enter <Invalid Format> NI Number TextBox field
    And click on Save and Continue button
    Then error message should be displayed with text "Enter a valid National Insurance number"
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

  @id_008
  Scenario: What is individual's National Insurance number? - Enter Valid input with Space
    Given I am on What is individual National Insurance number Page
    When I enter "AZ 12 34 56 D" NI Number TextBox field
    And click on Save and Continue button
    Then page navigates to "Is the individual registered for VAT, as far as you’re aware?"

  @id_009
  Scenario: What is individual's National Insurance number? - Enter Invalid input with Invalid Space format
    Given I am on What is individual National Insurance number Page
    When I enter "AZ 12 345 6   D" NI Number TextBox field
    And click on Save and Continue button
    Then error message should be displayed with text "Enter a valid National Insurance number"

  @id_0010
  Scenario: What is individual's National Insurance number? - Enter Invalid input with less than 9 character
    Given I am on What is individual National Insurance number Page
    When I enter "AZ123456" NI Number TextBox field
    And click on Save and Continue button
    Then error message should be displayed with text "Enter a valid National Insurance number"