@page
Feature: UI Validation and Navigation  for Screen "Do you also want to disclose onshore liabilities?"

  @id_001
  Scenario: UI Validation
    Given I am on Do you also want to disclose onshore liabilities page
    Then Heading with text "Do you also want to disclose onshore liabilities?" is displayed
    And Body Text "You have onshore liabilities if you are classed as a resident (opens in a new tab) in the UK and:" is displayed
    And Bullet Text "rent out property" is displayed at position "1"
    And Bullet Text "have income from savings and or investments" is displayed at position "2"
    And Bullet Text "have a capital gain to declare" is displayed at position "3"
    And Bullet Text "have income from self-employment, partnerships, freelance or commission-based work" is displayed at position "4"
    And Text "or your income does not fall into the offshore category." is displayed at Third Paragraph
    And Hyperlink with text "if you are classed as a resident (opens in a new tab)" is displayed
    And Radio Button with text "I want to disclose onshore liabilities" is displayed at position "1"
    And Radio Button with text "I do not have onshore liabilities to disclose" is displayed at position "2"
    And Save and Continue Button is displayed
    And Back Button Link is displayed

  @id_002
  Scenario: Hyperlink Navigation
    Given I am on Do you also want to disclose onshore liabilities page
    When click on Hyperlink "if you are classed as a resident (opens in a new tab)"
    Then Page navigates to "https://www.gov.uk/tax-foreign-income/residence" in new tab


