@page
Feature: A UK tax payer is able to enter the details and continue on Are you trustee of the trust that the disclosure will be about?

  Scenario: Are you trustee of the trust that the disclosure will be about? - Navigation with first radio button
    Given I navigate to "are-you-a-trustee" page
    And I select Radio Button "Yes, I am the trustee of the trust" at Position "1"
    And click on Save and Continue button
    Then user is navigated to the page with title "Offshore liabilities"

  Scenario: Are you trustee of the trust that the disclosure will be about? - Navigation with second radio button
    Given I navigate to "are-you-a-trustee" page
    And I select Radio Button "No, I am will be making a disclosure on behalf of the trustee" at Position "2"
    And click on Save and Continue button
    Then user is navigated to the page with title "Are you representing an organisation?"
