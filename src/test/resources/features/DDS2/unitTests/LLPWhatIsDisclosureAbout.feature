Feature: LLP UK tax payer is able to navigate from What will the disclosure be about? to next page

  Scenario: What will the disclosure be about? - A limited liability partnership and navigates to next page Are you a designated member of LLP
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A limited liability partnership" at Position "4"
    And click on Save and Continue button
    Then page navigates to "Are you a designated member of the limited liability partnership that the disclosure will be about?"