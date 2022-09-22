@page
Feature: A UK tax payer is able to enter the details and continue on "Do you want to disclose offshore liabilities?"

  @id_001
  Scenario: UI Validation
    Given I am on Do you want to disclose offshore liabilities Page
    Then Heading with text "Do you want to disclose offshore liabilities?" is displayed
    And Body Text "Offshore liabilities can be:" is displayed
    And Bullet Text "any income from outside the UK" is displayed at position "1"
    And Bullet Text "business activity or assets that have ever been outside the UK" is displayed at position "2"
    And Bullet Text "income from savings or investments" is displayed at position "3"
    And Bullet Text "anything else that could be classed as business income, assets or investments" is displayed at position "4"
    And Text "or where the funds connected to the UK liability have been transfered to a territory outside the UK." is displayed
    And Hyperlink with text "Find more information about offshore liabilities (opens in new tab)" is displayed
    And Radio Button with text "I want to disclose offshore liabilities" is displayed at position "1"
    And Radio Button with text "I do not have offshore liabilities to disclose" is displayed at position "2"
    And Save and Continue Button is displayed
    And Back Button Link is displayed

  @id_002
  Scenario: Hyperlink Navigation
    Given I am on Do you want to disclose offshore liabilities Page
    When click on Hyperlink "Find more information about offshore liabilities (opens in new tab)"
    Then Page navigates to "https://www.gov.uk/guidance/worldwide-disclosure-facility-make-a-disclosure" in new tab

  @id_003
  Scenario: Navigation Validation with First Radio Button
    Given I am on Do you want to disclose offshore liabilities Page
    When I select Radio Button "I want to disclose offshore liabilities" at Position "1"
    And click on Save and Continue button
    Then Page navigates to "Do you also want to disclose onshore liabilities?"

  @id_004
  Scenario: Navigation Validation with Second Radio Button
    Given I am on Do you want to disclose offshore liabilities Page
    When I select Radio Button "I do not have offshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    Then Page navigates to "The disclosure is only about onshore liabilities"

  @id_005
  Scenario: Navigation Validation with Back Button
    Given I am on Are you the individual this disclosure relates to Page
    When I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And user click on Back button
    Then Page navigates to "Are you the individual this disclosure relates to?"

  @id_006
  Scenario: Validation with no selection of Radio Button
    Given I am on Do you want to disclose offshore liabilities Page
    When click on Save and Continue button
    Then Error summary popup should be displayed with text "There is a problem"
    And Error message should be displayed with text "Select if you want to disclose offshore liabilities or not"

  @id_007
  Scenario: Navigation of on Error message on top popup
    Given I am on Do you want to disclose offshore liabilities Page
    And click on Save and Continue button
    When I click on problem message "Select if you want to disclose offshore liabilities or not"
    Then I should navigate to Radio button "I want to disclose offshore liabilities" at Position "1"