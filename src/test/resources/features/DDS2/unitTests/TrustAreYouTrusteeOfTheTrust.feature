@page
Feature: A UK tax payer is able to enter the details and continue on Are you trustee of the trust that the disclosure will be about?

  @id_001
  Scenario: Are you trustee of the trust that the disclosure will be about? - UI Validation
    Given I navigate to "are-you-a-trustee" page
    When the page is loaded successfully and verifies the page title is "Are you trustee of the trust that the disclosure will be about? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Are you trustee of the trust that the disclosure will be about?"
    And body should be "A trustee is the legal owner of the assets held in a trust."
    And radio Button with text "Yes, I am the trustee of the trust" is displayed at position "1"
    And radio Button with text "No, I am will be making a disclosure on behalf of the trustee" is displayed at position "2"
    And hint with text "We may ask for additional evidence that you’re authorised to act for them, such as the ‘Authorising a tax agent (64-8)’ form." is displayed
    And verify that radio options are not selected by default
    And save and Continue Button is displayed
    And back Button Link is displayed

  @id_002
  Scenario: Are you trustee of the trust that the disclosure will be about? - Navigation with first radio button
    Given I navigate to "are-you-a-trustee" page
    And I select Radio Button "Yes, I am the trustee of the trust" at Position "1"
    And click on Save and Continue button
    Then user is navigated to the page with title "Offshore liabilities"

  @id_003
  Scenario: Are you trustee of the trust that the disclosure will be about? - Navigation with second radio button
    Given I navigate to "are-you-a-trustee" page
    And I select Radio Button "No, I am will be making a disclosure on behalf of the trustee" at Position "2"
    And click on Save and Continue button
    Then user is navigated to the page with title "Are you representing an organisation?"

  @id_004
  Scenario: Are you trustee of the trust that the disclosure will be about? - No selection error message & summary Validation
    Given I navigate to "are-you-a-trustee" page
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you are the trustee of the trust"


