Feature: A UK tax payer is able to enter the details and continue on Received A Letter from HMRC page

  Scenario: Received a letter page - User navigates to page and verifies the page elements
    Given I am navigated to Received A Letter Page
    When the page is loaded successfully and verifies the page title is "Are you making a disclosure because you have received a letter from HMRC? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Are you making a disclosure because you have received a letter from HMRC?"
    And verify both the radio buttons are not selected

  Scenario: Received a letter page - user should be able to select Yes, save and continue to the next page
    Given I am navigated to Received A Letter Page
    When I select Yes radio button
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is the case reference number provided on the letter you received from HMRC? - Digital Disclosure Service - GOV.UK"
    When I click on Back button
    Then I am navigated back to Received A letter page with title "Are you making a disclosure because you have received a letter from HMRC? - Digital Disclosure Service - GOV.UK"
    And verify that Yes radio option is still selected
    When I select No radio button
    And click on Save and Continue button
    Then I am navigated to the next page with title "What will the disclosure be about? - Digital Disclosure Service - GOV.UK"

  Scenario: Received a letter page - Validation with no selection of Radio Button
    Given I am navigated to Received A Letter Page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you are making this disclosure because you have received a letter from HMRC"