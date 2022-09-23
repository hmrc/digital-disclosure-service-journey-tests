@page
Feature: A UK tax payer is able to enter the details and continue on What is the disclosure about?

  Scenario: What is the disclosure about? - User navigates to the page and verifies the page elements
    Given I am navigated to What is the disclosure Page
    When the page is loaded successfully and verifies the page title is "What is the disclosure about? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What is the disclosure about?"
    And verify that An individual, An estate, A company, A limited liability partnership, A trust are not selected by default

  Scenario: What is the disclosure about? - User selects An Individual and continues to the next page. And navigated back to verifies Individual is selected
    Given I am navigated to What is the disclosure Page
    When I select radio option An Individual
    And click on Save and Continue button
    Then I am navigated to the next page with title "Are you the individual this disclosure relates to? - Digital Disclosure Service - GOV.UK"
    When I click on Back button
    Then I am navigated back to the page with title "What is the disclosure about? - Digital Disclosure Service - GOV.UK"
    And the option An Individual is still selected