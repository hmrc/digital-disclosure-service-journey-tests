@page
Feature: As Estate UK tax payer is able to enter the details and continue on Was the person registered for Self Assessment, as far as you're aware? page

  Scenario: Was the person registered for Self Assessment, as far as you're aware? - UI validation
    Given I navigate to "estates-individual-self-assessment" page
    Then header with text "Was the person registered for Self Assessment, as far as you’re aware?" is displayed
    And radio Button with text "Yes, and I know their Unique Taxpayer Reference (UTR)" is displayed at position "1"
    And radio Button with text "Yes, but I do not know their Unique Taxpayer Reference (UTR)" is displayed at position "2"
    And radio Button with text "No" is displayed at position "3"
    And save and Continue Button is displayed
    And back Button Link is displayed



  Scenario: Was the person registered for Self Assessment, as far as you're aware? - blank input error message
    Given I navigate to "estates-individual-self-assessment" page
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if the person was registered for Self Assessment"

