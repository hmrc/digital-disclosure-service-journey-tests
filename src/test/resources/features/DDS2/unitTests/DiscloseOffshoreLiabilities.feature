Feature: A UK tax payer is able to enter the details and continue on "Offshore liabilities"

  Scenario: UI Validation
    Given I am on Do you want to disclose offshore liabilities Page
    Then heading with text "Offshore liabilities" is displayed
    And body Text "Offshore liabilities can be:" is displayed
    And bullet Text "any income from outside the UK" is displayed at position "1"
    And bullet Text "business activity or assets that have ever been outside the UK" is displayed at position "2"
    And bullet Text "income from savings or investments" is displayed at position "3"
    And bullet Text "transfers or matters covered by the Finance (Number 2) Act 2017" is displayed at position "4"
    And bullet text hyperlink with text "the Finance (Number 2) Act 2017" is displayed
    And bullet Text "anything else that could be classed as business income, assets or investments" is displayed at position "5"
    And text "or where the funds connected to the UK liability have been transferred to a territory outside the UK." is displayed
    And hyperlink with text "Find more information about offshore liabilities (opens in new tab)" is displayed
    And sub heading with text "Will the disclosure be about offshore liabilities?" is displayed
    And radio Button with text "Yes" is displayed at position "1"
    And radio Button with text "No" is displayed at position "2"
    And verify that radio options are not selected by default
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: Hyperlink Navigation
    Given I am on Do you want to disclose offshore liabilities Page
    When click on Hyperlink "Find more information about offshore liabilities (opens in new tab)"
    Then page navigates to "https://www.gov.uk/guidance/worldwide-disclosure-facility-make-a-disclosure" in new tab

  Scenario: Navigation Validation with First Radio Button
    Given I am on Do you want to disclose offshore liabilities Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities"

  Scenario: Navigation Validation with Second Radio Button
    Given I am on Do you want to disclose offshore liabilities Page
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "TThe disclosure will only be about onshore liabilities"

  Scenario: Navigation Validation with Back Button
    Given I am navigated to Are you the individual that the disclosure will be about? Page
    When I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "Are you the individual that the disclosure will be about?"

  Scenario: Validation with no selection of Radio Button
    Given I am on Do you want to disclose offshore liabilities Page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if the disclosure is about offshore liabilities"

  Scenario: Navigation of on Error message on top popup
    Given I am on Do you want to disclose offshore liabilities Page
    And click on Save and Continue button
    When I click on problem message "Select yes if the disclosure is about offshore liabilities"
    Then I should navigate to Radio button "Yes" at Position "1"

  Scenario: bullet Hyperlink Navigation
    Given I am on Do you want to disclose offshore liabilities Page
    When I click on the hyperlink with text "the Finance (Number 2) Act 2017"
    Then page navigates to "https://www.legislation.gov.uk/ukpga/2017/32/schedule/18/enacted" in new tab