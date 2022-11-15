@page
Feature: UI Validation and Navigation for Screen "The disclosure is only about onshore liabilities (For estate)"

  Scenario: Disclose onshore liabilities Only - Navigation with Save and Continue button
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "An estate" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the executor or administrator of the estate" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is the name of the person who died? - Digital Disclosure Service - GOV.UK"