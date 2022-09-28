@page
Feature: UI Validation and Navigation  for Screen "The disclosure is only about onshore liabilities"

  @id_001
  Scenario: Disclose onshore liabilities Only - UI Validation
    Given I am on The disclosure is only about onshore liabilities page
    Then heading with text "The disclosure is only about onshore liabilities" is displayed
    And body Text "As you have no offshore liabilities to disclose, the disclosure is only about onshore liabilities. You have onshore liabilities if you are classed as a resident (opens in a new tab) in the UK and:" is displayed
    And bullet Text "rent out property" is displayed at position "1"
    And bullet Text "have income from savings and or investments" is displayed at position "2"
    And bullet Text "have a capital gain to declare" is displayed at position "3"
    And bullet Text "have income from self-employment, partnerships, freelance or commission-based work" is displayed at position "4"
    And text "or your income does not fall into the offshore category." is displayed at Third Paragraph
    And hyperlink with text "You have onshore liabilities if you are classed as a resident (opens in a new tab)" is displayed
    And save and Continue Button is displayed
    And back Button Link is displayed

   @id_002
   Scenario: Disclose onshore liabilities Only -Hyperlink Navigation
     Given I am on The disclosure is only about onshore liabilities page
     When click on Hyperlink "You have onshore liabilities if you are classed as a resident (opens in a new tab)"
     Then page navigates to "https://www.gov.uk/tax-foreign-income/residence" in new tab

  @id_003
  Scenario: Disclose onshore liabilities Only - Navigation with Back button
    Given I am on Do you want to disclose offshore liabilities Page
    When I select Radio Button "I do not have offshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "Do you want to disclose offshore liabilities?"

  @id_004
  Scenario: Disclose onshore liabilities Only - Navigation with Save and Continue button
    Given I am on Do you want to disclose offshore liabilities Page
    When I select Radio Button "I do not have offshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    Then user is navigated to the page with title "What is your full name?"