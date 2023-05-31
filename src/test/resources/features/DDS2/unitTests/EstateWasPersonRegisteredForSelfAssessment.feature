Feature: As Estate UK tax payer is able to enter the details and continue on Was the person registered for Self Assessment, as far as you're aware? page

  Scenario: Was the person registered for Self Assessment, as far as you're aware? - UI validation
    Given I navigate to "estates-individual-self-assessment" page
    Then header with text "Was the person registered for Self Assessment, as far as you’re aware?" is displayed
    And radio Button with text "Yes, and I know their Unique Taxpayer Reference (UTR)" is displayed at position "1"
    And radio Button with text "Yes, but I do not know their Unique Taxpayer Reference (UTR)" is displayed at position "2"
    And radio Button with text "No" is displayed at position "3"
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: Was the person registered for Self Assessment, as far as you're aware? - blank input error message
    Given I navigate to "estates-individual-self-assessment" page
    And click on Save and Continue button
    Then page navigates to "Was the person registered for Self Assessment, as far as you’re aware?"

  Scenario: Was the person registered for Self Assessment, as far as you're aware? - Yes, I know their UTR
    Given I navigate to "estates-individual-self-assessment" page
    When I select Radio Button "Yes, and I know their Unique Taxpayer Reference (UTR)" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What was the person’s Unique Taxpayer Reference?"
    And the page title should be "What was the person’s Unique Taxpayer Reference? - Digital Disclosure Service - GOV.UK"

  Scenario: Was the person registered for Self Assessment, as far as you're aware? - Yes, but I do not know their UTR
    Given I navigate to "estates-individual-self-assessment" page
    When I select Radio Button "Yes, but I do not know their Unique Taxpayer Reference (UTR)" at Position "2"
    And click on Save and Continue button
    Then page navigates to "What was the country of the person’s address?"
    And the page title should be "What was the country of the person’s address? - Digital Disclosure Service - GOV.UK"

  Scenario: Was the person registered for Self Assessment, as far as you're aware? - No
    Given I navigate to "estates-individual-self-assessment" page
    When I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    Then page navigates to "What was the country of the person’s address?"
    And the page title should be "What was the country of the person’s address? - Digital Disclosure Service - GOV.UK"


