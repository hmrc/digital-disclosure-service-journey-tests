@page
Feature: LLP UK tax payer is able to navigate from What will the disclosure be about? to next page

  Scenario: What will the disclosure be about? - A trust and navigates to next page Are you trustee of the trust that the disclosure will be about?
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A trust" at Position "5"
    And click on Save and Continue button
    Then page navigates to "Are you trustee of the trust that the disclosure will be about?"