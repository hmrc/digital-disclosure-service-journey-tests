Feature: A UK tax payer is able to enter the details and continue on What will the disclosure be about?

  Scenario: What will the disclosure be about? - User navigates to the page and verifies the page elements
    Given I am navigated to What is the disclosure Page
    When the page is loaded successfully and verifies the page title is "What will the disclosure be about? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What will the disclosure be about?"
    And verify that An individual, An estate, A company, A limited liability partnership, A trust are not selected by default

  Scenario: What will the disclosure be about? - User selects An Individual and continues to the next page. And navigated back to verifies Individual is selected
    Given I am navigated to What is the disclosure Page
    When I select radio option An Individual
    And click on Save and Continue button
    Then I am navigated to the next page with title "Are you the individual that the disclosure will be about? - Digital Disclosure Service - GOV.UK"
    When I click on Back button
    Then I am navigated back to the page with title "What will the disclosure be about? - Digital Disclosure Service - GOV.UK"
    And the option An Individual is still selected

  Scenario: What will the disclosure be about? - Validation with no selection of Radio Button
    Given I am navigated to What is the disclosure Page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select what your disclosure is about"