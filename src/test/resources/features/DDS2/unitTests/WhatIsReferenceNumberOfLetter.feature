@refpage
Feature: UI Validation and Navigation  for Screen "What is the reference number of the letter you received from HMRC?"

  @id_001
  Scenario: UI Validation
    Given I am on What is the reference number of the letter you received from HMRC Page
    Then header with text "What is the reference number of the letter you received from HMRC?" is displayed
    And input TextBox is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

  @id_002
  Scenario: Navigation with valid reference number in TextBox field
    Given I am on What is the reference number of the letter you received from HMRC Page
    When I enter anything in reference number TextBox field
    And click on Save and Continue button
    Then user is navigated to the page with title "What is the disclosure about?"

  @id_003
  Scenario: Validation with blank reference number in TextBox field
    Given I am on What is the reference number of the letter you received from HMRC Page
    When I enter no data in reference number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter the letter’s reference number."

  @id_004
  Scenario: Validation with  more than max length reference number in TextBox field
    Given I am on What is the reference number of the letter you received from HMRC Page
    When I enter data with max length of "30" in reference number TextBox field
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "LetterReference must be 30 characters or less"

  @id_005
  Scenario: Navigation of on Error message on top popup
    Given I am on What is the reference number of the letter you received from HMRC Page
    When I enter no data in reference number TextBox field
    And click on Save and Continue button
    And I click on problem message "Enter the letter’s reference number."
    Then I should navigate to reference number TextBox field

  @id_006
  Scenario: Navigation with back button
    Given I am on What is the reference number of the letter you received from HMRC Page
    When I enter anything in reference number TextBox field
    And user click on Back button
    Then user is navigated to the page with title "Are you making this disclosure because you have received a letter from HMRC?"