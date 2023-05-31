Feature: A UK tax payer is able to enter the details and continue on "What is your National Insurance number?"

  Scenario: What is your National Insurance number? - UI validation
    Given I am on What is your National Insurance number Page
    Then verify the question should be "What is your National Insurance number?"
    And hint with text "For example, ‘QQ123456A’." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: What is your National Insurance number? - Enter valid input field
    Given I am on What is your National Insurance number Page
    When I enter valid NI Number TextBox field
    And click on Save and Continue button
    Then page navigates to "Are you registered for VAT?"

  Scenario: What is your National Insurance number? - Blank Input
    Given I am on What is your National Insurance number Page
    When I enter no data in NI Number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter your National Insurance number"

  Scenario: What is your National Insurance number? - Invalid NI
    Given I am on What is your National Insurance number Page
    When I enter invalid NI Number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter your National Insurance number in the right format"

  Scenario: What is your National Insurance number? - Navigation of on Error message on top popup
    Given I am on What is your National Insurance number Page
    When I enter no data in NI Number TextBox field
    And click on Save and Continue button
    And I click on problem message "Enter your National Insurance number"
    Then I should navigate to NI number TextBox field

  Scenario: What is your National Insurance number? - Navigation with Back button
    Given I am on Do you have a National Insurance number Page
    When I select Radio Button "Yes, and I know my National Insurance number" at Position "1"
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "Do you have a National Insurance number?"

  Scenario Outline: What is your National Insurance number? - Format Validation
    Given I am on What is your National Insurance number Page
    When I enter <Invalid Format> NI Number TextBox field
    And click on Save and Continue button
    Then error message should be displayed with text "Enter your National Insurance number in the right format"
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

  Scenario: What is your National Insurance number? - Enter Valid input with Space
    Given I am on What is your National Insurance number Page
    When I enter "AZ 12 34 56 D" NI Number TextBox field
    And click on Save and Continue button
    Then page navigates to "Are you registered for VAT?"

  Scenario: What is your National Insurance number? - Enter Invalid input with Invalid Space format
    Given I am on What is your National Insurance number Page
    When I enter "AZ 12 345 6   D" NI Number TextBox field
    And click on Save and Continue button
    Then error message should be displayed with text "Enter your National Insurance number in the right format"

  Scenario: What is your National Insurance number? - Enter Invalid input with less than 9 character
    Given I am on What is your National Insurance number Page
    When I enter "AZ123456" NI Number TextBox field
    And click on Save and Continue button
    Then error message should be displayed with text "Enter your National Insurance number in the right format"