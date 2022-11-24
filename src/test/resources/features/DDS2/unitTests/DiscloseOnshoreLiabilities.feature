@page
Feature: UI Validation and Navigation  for Screen "Onshore liabilities"

  @id_001
  Scenario: Disclose onshore liabilities - UI Validation
    Given I am on Do you also want to disclose onshore liabilities page
    Then heading with text "Onshore liabilities" is displayed
    And body Text "You have onshore liabilities if you are classed as a resident (opens in a new tab) in the UK and:" is displayed
    And bullet Text "rent out property" is displayed at position "1"
    And bullet Text "have income from savings and or investments" is displayed at position "2"
    And bullet Text "have a capital gain to declare" is displayed at position "3"
    And bullet Text "have income from self-employment, partnerships, freelance or commission-based work" is displayed at position "4"
    And text "or your income does not fall into the offshore category." is displayed at Fourth Paragraph
    And hyperlink with text "if you are classed as a resident (opens in a new tab)" is displayed
    And radio Button with text "Yes" is displayed at position "1"
    And radio Button with text "No" is displayed at position "2"
    And verify that radio options are not selected by default
    And save and Continue Button is displayed
    And back Button Link is displayed

  @id_002
  Scenario: Disclose onshore liabilities - Hyperlink Navigation
    Given I am on Do you also want to disclose onshore liabilities page
    When click on Hyperlink "if you are classed as a resident (opens in a new tab)"
    Then page navigates to "https://www.gov.uk/tax-foreign-income/residence" in new tab

    @id_003
  Scenario: Disclose onshore liabilities- Navigation with option "Yes"
      Given I am navigated to Are you the individual this disclosure relates to Page
      When I select Radio Button "Yes, I am the individual" at Position "1"
      And click on Save and Continue button
      When I select Radio Button "Yes" at Position "1"
      And click on Save and Continue button
      And I select Radio Button "Yes" at Position "1"
      And click on Save and Continue button
      Then user is navigated to the page with title "What is your full name?"

  @id_004
  Scenario: Disclose onshore liabilities -Navigation with option "No"
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then user is navigated to the page with title "What is your full name?"

  @id_005
  Scenario: Disclose onshore liabilities - Navigation with Back button
    Given I am on Do you also want to disclose onshore liabilities page
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "Onshore liabilities"

  @id_006
  Scenario: Disclose onshore liabilities -Validation with no selection of Radio Button
    Given I am on Do you want to disclose offshore liabilities Page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select if you want to disclose offshore liabilities or not"

  @id_007
  Scenario: Disclose onshore liabilities -Navigation of on Error message on top popup
    Given I am on Do you want to disclose offshore liabilities Page
    And click on Save and Continue button
    When I click on problem message "Select if you want to disclose offshore liabilities or not"
    Then I should navigate to Radio button "Yes" at Position "1"



