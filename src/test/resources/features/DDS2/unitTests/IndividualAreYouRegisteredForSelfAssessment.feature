Feature: An individual UK tax payer is able to enter the details and continue on Is the individual registered for Self Assessment, as far as you’re aware? page

  Scenario: Is the individual registered for Self Assessment, as far as you’re aware? - UI Validation
    Given I am on Is the individual registered for Self Assessment, as far as you’re aware page as "Individual" tax payer
    When the page is loaded successfully and verifies the page title is "Is the individual registered for Self Assessment, as far as you’re aware? - Digital Disclosure Service - GOV.UK"
    Then verify the question should be "Is the individual registered for Self Assessment, as far as you’re aware?"
    And radio Button with text "Yes, and I know their Unique Taxpayer Reference (UTR)" is displayed at position "1"
    And radio Button with text "Yes, but I do not know their Unique Taxpayer Reference (UTR)" is displayed at position "2"
    And radio Button with text "No" is displayed at position "3"
    And verify that radio options are not selected by default

  Scenario: Is the individual registered for Self Assessment, as far as you’re aware? - Navigation with option 1
    Given I am on Is the individual registered for Self Assessment, as far as you’re aware page as "Individual" tax payer
    When I select Radio Button "Yes, and I know their Unique Taxpayer Reference (UTR)" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What is the individual’s Unique Tax Reference?"

  Scenario: Is the individual registered for Self Assessment, as far as you’re aware? - Navigation with option 2
    Given I am on Is the individual registered for Self Assessment, as far as you’re aware page as "Individual" tax payer
    When I select Radio Button "Yes, but I do not know their Unique Taxpayer Reference (UTR)" at Position "2"
    And click on Save and Continue button
    Then page navigates to "What is the country of the individual’s address?"

  Scenario: Is the individual registered for Self Assessment, as far as you’re aware? - Navigation with option 3
    Given I am on Is the individual registered for Self Assessment, as far as you’re aware page as "Individual" tax payer
    When I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then page navigates to "What is the country of the individual’s address?"

  Scenario: Is the individual registered for Self Assessment, as far as you’re aware? - Validation with no selection of Radio Button
    Given I am on Is the individual registered for Self Assessment, as far as you’re aware page as "Individual" tax payer
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if the individual is registered for Self Assessment"

  Scenario: Is the individual registered for Self Assessment, as far as you’re aware? - Navigation of on Error message on top popup
    Given I am on Is the individual registered for Self Assessment, as far as you’re aware page as "Individual" tax payer
    And click on Save and Continue button
    When I click on problem message "Select yes if the individual is registered for Self Assessment"
    Then I should navigate to Radio button "Yes, and I know their Unique Taxpayer Reference (UTR)" at Position "1"





