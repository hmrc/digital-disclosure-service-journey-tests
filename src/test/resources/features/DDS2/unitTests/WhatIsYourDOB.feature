@page
Feature: A UK tax payer is able to enter the details and continue on What is your date of birth? page

  Scenario: What is your date of birth? - UI validation
    Given I am on What is your date of birth page
    Then the page title should be "What is your date of birth? - Digital Disclosure Service - GOV.UK"
    And verify the question should be "What is your date of birth?"
    And hint with text "For example, 20 3 1976" is displayed
    And input TextBox with value "Day" is displayed
    And input TextBox with value "Month" is displayed
    And input TextBox with value "Year" is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: What is your date of birth? - Navigation to next and back pages
    Given I am on What is your date of birth page
    When I enter "01" in the "Day" text box field
    When I enter "01" in the "Month" text box field
    When I enter "1980" in the "Year" text box field
    And click on Save and Continue button
    Then page navigates to "What is your main occupation?"
    When I click on Back button
    Then page navigates to "What is your date of birth?"

  Scenario Outline: Validate error messages for DOB page
    Given I am on What is your date of birth page
    When I enter <Day> in the "Day" text box field
    And I enter <Month> in the "Month" text box field
    And I enter <Year> in the "Year" text box field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text <Error>

    Examples:
      | Day | Month | Year | Error |
      |    "" |   "" |    "" | "Enter a valid date of birth, like 20 3 1976."    |
      |  "10" |  "tt"  | "45"   | "Enter a real date of birth"    |
      |    "10" |   "" |    "" | "The date of birth must include month and year"    |
      |    "" |   "10" |    "" | "The date of birth must include day and year"    |
      |    "" |   "" |    "1980" | "The date of birth must include day and month"    |
      |    "10" |   "10" |    "" | "The date of birth must include year"    |
      |    "10" |   "" |    "1980" | "The date of birth must include month"    |
      |    "" |   "10" |    "1980" | "The date of birth must include day"    |
      |    "31" |   "06" |    "1980" | "Enter a real date of birth"    |
      |    "29" |   "02" |    "1981" | "Enter a real date of birth"    |

