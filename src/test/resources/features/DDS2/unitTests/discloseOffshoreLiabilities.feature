@page
Feature: UI Validation and Navigation  for Screen "Do you want to disclose offshore liabilities?"

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


