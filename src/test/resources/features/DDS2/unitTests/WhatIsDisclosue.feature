@page
Feature: A UK tax payer is able to enter the details and continue on What is the disclosure about?

  Scenario: User navigates to the page and verifies the page elements
    Given user is navigated to What is the disclosure Page
    When the page is loaded successfully and verifies the page title is "What is the disclosure about? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "What is the disclosure about?"
    And verify that An individual, An estate, A company, A limited liability partnership, A trust are not selected by default
