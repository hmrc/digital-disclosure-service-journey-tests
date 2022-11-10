@page
Feature: A UK tax payer is able to select Limited liability partnership radio button and continue on to Are you a designated member of the limited liability partnership that the disclosure will be about?

  Scenario: What is the disclosure about? - User selects Limited liability partnership radio button and continues to the Are you a designated member of the limited liability partnership that the disclosure will be about? screen
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A limited liability partnership" at Position "4"
    And click on Save and Continue button
    Then page navigates to "Are you a designated member of the limited liability partnership that the disclosure will be about?"