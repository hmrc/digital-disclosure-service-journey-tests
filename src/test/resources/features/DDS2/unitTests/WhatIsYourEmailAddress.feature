Feature: A UK tax payer is able to enter the details and continue on What is your email address?

  Scenario: What is your email address? - UI validation
    Given I am What is your email address Page
    Then header with text "What is your email address?" is displayed
    Then hint with text "For example, name@example.com." is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario Outline: What is your email address?  - Enter valid Email
    Given I am What is your email address Page
    When I enter <validEmail> email TextBox field
    And click on Save and Continue button
    Then page navigates to "What is the country of your address?"

    Examples:
      | validEmail |
      |    "name@example.com" |
      |    "na.!#$%&’’*+/=?^_`{}~-@examples.com" |
      |    "nam1213e@example.com" |
      |    "name@a.c" |
      |    "name@a-a.c" |

  Scenario Outline: What is your email address?  - Enter invalid Email
    Given I am What is your email address Page
    When I enter <invalidEmail> email TextBox field
    And click on Save and Continue button
    Then error message should be displayed with text "Enter a valid email address, like name@example.com"
    Examples:
      | invalidEmail |
      |    "name@@example.com" |
      |    "na me@example.com" |
      |    "name@example" |
      |    "name@!#$%&’’*+/=?^_`{}~-.com" |

  Scenario: What is your email address? - Leave blank input field
    Given I am What is your email address Page
    When I enter no data in email TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter a valid email address, like name@example.com"

  Scenario: What is your email address? - Navigation of on Error message on top popup
    Given I am What is your email address Page
    When I enter no data in email TextBox field
    And click on Save and Continue button
    And I click on problem message "Enter a valid email address, like name@example.com"
    Then I should navigate to email TextBox field

  Scenario: What is your email address?  - Navigation of back button
    Given I am on Do you have an email address that you are happy to be contacted on by HMRC Page
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "Do you have an email address that you are happy to be contacted on by HMRC?"

  Scenario: What is your email address?  - Enter valid Email with max length
    Given I am What is your email address Page
    When I enter data with max length of "320" in Email TextBox field
    And click on Save and Continue button
    Then error message should be displayed with text "Your email address must be 320 characters or less"
