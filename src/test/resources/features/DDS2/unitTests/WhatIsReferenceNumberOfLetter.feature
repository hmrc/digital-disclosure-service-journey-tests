Feature: UI Validation and Navigation  for Screen "What is the case reference number provided on the letter you received from HMRC?"

  Scenario: UI Validation
    Given I am on What is the case reference number provided on the letter you received from HMRC Page
    Then header with text "What is the case reference number provided on the letter you received from HMRC?" is displayed
    And input TextBox is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: Validation with blank reference number in TextBox field
    Given I am on What is the case reference number provided on the letter you received from HMRC Page
    When I enter no data in reference number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the case reference"

  Scenario: Validation with  more than max length reference number in TextBox field
    Given I am on What is the case reference number provided on the letter you received from HMRC Page
    When I enter data with max length of "30" in reference number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the case reference in the right format"

  Scenario: Navigation of on Error message on top popup
    Given I am on What is the case reference number provided on the letter you received from HMRC Page
    When I enter no data in reference number TextBox field
    And click on Save and Continue button
    And I click on problem message "Enter the case reference"
    Then I should navigate to reference number TextBox field

  Scenario Outline: Validate error messages on received letter from HMRC page
    Given I am on What is the case reference number provided on the letter you received from HMRC Page
    When I enter <caseRef> in the TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text <Error>

    Examples:
      | caseRef | Error |
      |    "01256896692" |  "Enter the case reference in the right format"    |
      |    "123" |  "Enter the case reference in the right format"    |
      |    "CFSS--1234567" |  "Enter the case reference in the right format"    |
      |    "CFSS-123456789" |  "Enter the case reference in the right format"    |
      |    "CFS-123456789" |  "Enter the case reference in the right format"    |
      |    "ABC-12345678" |  "Enter the case reference in the right format"    |
      |    "CFS-S1234567" |  "Enter the case reference in the right format"    |

  Scenario Outline: Validate correct case reference format
    Given I am on What is the case reference number provided on the letter you received from HMRC Page
    When I enter <caseRef> in the TextBox field
    And click on Save and Continue button
    Then page navigates to <nextPage>

    Examples:
      | caseRef | nextPage |
      |    "CFSS1234567" |  "What will the disclosure be about?"    |
      |    "CFS1234567" |  "What will the disclosure be about?"    |
      |    "CFSS-1234567" |  "What will the disclosure be about?"    |
      |    "CFSS-1234567" |  "What will the disclosure be about?"    |
      |    "CFS-12345678" |  "What will the disclosure be about?"    |
      |    "CFSS-12345678" |  "What will the disclosure be about?"    |

