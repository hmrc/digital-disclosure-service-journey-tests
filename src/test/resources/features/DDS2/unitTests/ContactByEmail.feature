@page
Feature: A UK tax payer is able to enter the details and continue on "Do you have an email address that you are happy to be contacted on by HMRC?"

  @id_001
  Scenario: UI Validation
    Given I am on Do you have an email address that you are happy to be contacted on by HMRC Page
    Then heading with text "Do you have an email address that you are happy to be contacted on by HMRC?" is displayed
    And verify both the radio buttons are not selected
    And save and Continue Button is displayed
    And back Button Link is displayed

  @id_002
  Scenario: Validation with no selection of Radio Button
    Given I am on Do you have an email address that you are happy to be contacted on by HMRC Page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you have an email address that you are happy to be contacted on by HMRC"

  @id_003
  Scenario: Navigation of on Error message on top popup
    Given I am on Do you have an email address that you are happy to be contacted on by HMRC Page
    And click on Save and Continue button
    When I click on problem message "Select yes if you have an email address that you are happy to be contacted on by HMRC"
    Then I should navigate to Radio button "Yes" at Position "1"