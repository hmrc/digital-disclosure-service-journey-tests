@page
Feature: A UK tax payer is able to enter the details and continue on Onshore liabilities page

  Scenario: Disclose onshore liabilities - UI Validation
    Given I navigate to "disclose-onshore-liabilities" page
    Then heading with text "Onshore liabilities" is displayed
    And body Text "You have onshore liabilities if you are classed as a resident (opens in a new tab) in the UK and:" is displayed
    And bullet Text "rent out property" is displayed at position "1"
    And bullet Text "have income from savings and or investments" is displayed at position "2"
    And bullet Text "have a capital gain to declare" is displayed at position "3"
    And bullet Text "have income from self-employment, partnerships, freelance or commission-based work" is displayed at position "4"
    And text "or your income does not fall into the offshore category." is displayed at Fourth Paragraph
    And hyperlink with text "if you are classed as a resident (opens in a new tab)" is displayed
    And sub heading with text "Will the disclosure also be about onshore liabilities?" is displayed
    And radio Button with text "Yes" is displayed at position "1"
    And radio Button with text "No" is displayed at position "2"
    And verify that radio options are not selected by default
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: Disclose onshore liabilities - Hyperlink Navigation
    Given I navigate to "disclose-onshore-liabilities" page
    When click on Hyperlink "if you are classed as a resident (opens in a new tab)"
    Then page navigates to "https://www.gov.uk/tax-foreign-income/residence" in new tab

  Scenario: Disclose onshore liabilities - Navigation with Save and Continue button - Yes option
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A company" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am an officer of the company" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then user is navigated to the page with title "What is the name of the company the disclosure will be about?"

  Scenario: Disclose onshore liabilities - Navigation with Save and Continue button - No option
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A company" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am an officer of the company" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then user is navigated to the page with title "What is the name of the company the disclosure will be about?"





