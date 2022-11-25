@page
Feature: A UK tax payer is able to enter the details and continue on to Are you the executor or administrator of the estate that the disclosure will be about?' Screen

  Scenario: What will the disclosure be about? - estate user navigates to next screen 'Are you the executor or administrator of the estate that the disclosure will be about?'
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "An estate" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Are you the executor or administrator of the estate that the disclosure will be about?"
    And I am navigated to the next page with title "Are you the executor or administrator of the estate that the disclosure will be about? - Digital Disclosure Service - GOV.UK"
    And back Button Link is displayed
