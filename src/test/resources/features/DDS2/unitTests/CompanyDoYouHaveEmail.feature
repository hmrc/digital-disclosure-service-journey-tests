@INPROGRESS
Feature: A UK tax payer is able to enter the details and continue on "Do you have an email address that you are happy to be contacted on by HMRC?"

  @id_001
  Scenario: Contact By Email-UI Validation
    Given I am on Do you have an email address that you are happy to be contacted on by HMRC Page
    Then heading with text "Do you have an email address that you are happy to be contacted on by HMRC?" is displayed
    And verify both the radio buttons are not selected
    And save and Continue Button is displayed
    And back Button Link is displayed

  @id_002
  Scenario: Contact By Email-Validation with no selection of Radio Button
    Given I am on Do you have an email address that you are happy to be contacted on by HMRC Page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you have an email address that HMRC can contact you with"

  @id_003
  Scenario: Contact By Email-Navigation of Error message on top popup
    Given I am on Do you have an email address that you are happy to be contacted on by HMRC Page
    And click on Save and Continue button
    When I click on problem message "Select yes if you have an email address that HMRC can contact you with"
    Then I should navigate to Radio button "Yes" at Position "1"

  @id_004
  Scenario: Contact By Email-Navigation with first radio button
    Given I am on Do you have an email address that you are happy to be contacted on by HMRC Page
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then user is navigated to the page with title "What is your email address?"

  @id_005
  Scenario: Contact By Email-Navigation with second radio button
    Given I am on Do you have an email address that you are happy to be contacted on by HMRC Page
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then user is navigated to the page with title "What is your date of birth?"

  @id_006
  Scenario: Contact By Email-Navigation with back button
    Given I am on What is your telephone number page
    And I enter "01642 123456" in the TextBox field
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "What is your telephone number?"
