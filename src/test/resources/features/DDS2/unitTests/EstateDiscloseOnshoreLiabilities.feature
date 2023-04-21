@page
Feature: UI Navigation for Screen "Onshore liabilities (For LLP)"

  Scenario: Disclose onshore liabilities - Navigation with Save and Continue button - Yes
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "An estate" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the executor or administrator" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities"
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then I am navigated to the next page with title "What was the name of the person who died? - Digital Disclosure Service - GOV.UK"

  Scenario: Disclose onshore liabilities - Navigation with Save and Continue button - No
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "An estate" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities"
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then I am navigated to the next page with title "What was the name of the person who died? - Digital Disclosure Service - GOV.UK"