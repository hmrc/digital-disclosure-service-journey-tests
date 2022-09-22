@refpage
Feature: UI Validation and Navigation  for Screen "Do you also want to disclose onshore liabilities?"

  @id_001
  Scenario: UI Validation
    Given I am on Do you also want to disclose onshore liabilities page
    Then heading with text "Do you also want to disclose onshore liabilities?" is displayed
    And body Text "You have onshore liabilities if you are classed as a resident (opens in a new tab) in the UK and:" is displayed
    And bullet Text "rent out property" is displayed at position "1"
    And bullet Text "have income from savings and or investments" is displayed at position "2"
    And bullet Text "have a capital gain to declare" is displayed at position "3"
    And bullet Text "have income from self-employment, partnerships, freelance or commission-based work" is displayed at position "4"
    And text "or your income does not fall into the offshore category." is displayed at Third Paragraph
    And hyperlink with text "if you are classed as a resident (opens in a new tab)" is displayed
    And radio Button with text "I want to disclose onshore liabilities" is displayed at position "1"
    And radio Button with text "I do not have onshore liabilities to disclose" is displayed at position "2"
    And save and Continue Button is displayed
    And back Button Link is displayed

  @id_002
  Scenario: Hyperlink Navigation
    Given I am on Do you also want to disclose onshore liabilities page
    When click on Hyperlink "if you are classed as a resident (opens in a new tab)"
    Then page navigates to "https://www.gov.uk/tax-foreign-income/residence" in new tab


