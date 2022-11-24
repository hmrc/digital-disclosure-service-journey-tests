@page
Feature: Trust - Navigation  for Screen "The disclosure is only about onshore liabilities (for a trust)"

  Scenario: Disclose onshore liabilities Only - Navigation with Save and Continue button
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A trust" at Position "5"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the trustee of the trust" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    Then I am navigated to the next page with title "What is the trust’s name? - Digital Disclosure Service - GOV.UK"