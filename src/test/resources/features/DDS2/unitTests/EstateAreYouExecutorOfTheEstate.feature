@page
Feature: A UK tax payer is able to enter the details and continue on Are you trustee of the trust that the disclosure will be about?

  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - UI Validation
    Given I navigate to "are-you-the-executor" page
    Then verify the question should be "Are you the executor or administrator of the estate that the disclosure will be about?"
    And body should be "An executor is a person appointed by the person who has passed away to oversee the managing of their estate. An administrator is responsible for managing the estate when there is no will, the will does not name an executor or the executor has abstained from their role."
    And radio Button with text "Yes, I am the executor or administrator of the estate" is displayed at position "1"
    And radio Button with text "No, I will be making a disclosure on behalf of the executor or administrator of the estate" is displayed at position "2"
    And hint with text "We may ask for additional evidence that you’re authorised to act for them, such as the ‘Authorising a tax agent (64-8)’ form." is displayed
    And verify that radio options are not selected by default
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: Are you trustee of the trust that the disclosure will be about? - Navigation with first radio button
    Given I navigate to "are-you-the-executor" page
    And I select Radio Button "Yes, I am the executor or administrator of the estate" at Position "1"
    And click on Save and Continue button
    Then user is navigated to the page with title "Offshore liabilities"

  Scenario: Are you trustee of the trust that the disclosure will be about? - Navigation with second radio button
    Given I navigate to "are-you-the-executor" page
    And I select Radio Button "No, I will be making a disclosure on behalf of the executor or administrator of the estate" at Position "2"
    And click on Save and Continue button
    Then user is navigated to the page with title "Are you representing an organisation?"

  Scenario: Are you trustee of the trust that the disclosure will be about? - No selection error message & summary Validation
    Given I navigate to "are-you-the-executor" page
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you are the executor or administrator of the estate"


