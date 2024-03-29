Feature: UI Validation and Navigation for Screen "Are you a designated member of the limited liability partnership that the disclosure will be about?"

  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - UI Validation
    Given I navigate to "are-you-the-entity" page
    Then verify the question should be "Are you a designated member of the limited liability partnership that the disclosure will be about?"
    And radio Button with text "Yes, I am a designated member" is displayed at position "1"
    And radio Button with text "I am an accountant or tax agent" is displayed at position "2"
    And hint with text "We may ask for additional evidence that you’re authorised to act for them, such as the ‘Authorising a tax agent (64-8)’ form." is displayed
    And verify that radio options are not selected by default
    And save and Continue Button is displayed
    And back Button Link is displayed

  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - Navigation with option "Yes, I am a designated member"
      Given I navigate to "are-you-the-entity" page
      When I select Radio Button "Yes, I am a designated member" at Position "1"
      And click on Save and Continue button
      Then heading with text "Offshore liabilities" is displayed

  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - Navigation with option "I am an accountant or tax agent"
    Given I navigate to "are-you-the-entity" page
    When I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    Then heading with text "Are you representing an organisation?" is displayed

  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - Navigation with Back button
    Given I navigate to "are-you-the-entity" page
    And I select Radio Button "Yes, I am a designated member" at Position "1"
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "Are you a designated member of the limited liability partnership that the disclosure will be about?"

  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - Validation with no selection of Radio Button
    Given I navigate to "are-you-the-entity" page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you are a designated member of the limited liability partnership"

  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - Navigation of on Error message on top popup
    Given I navigate to "are-you-the-entity" page
    When click on Save and Continue button
    When I click on problem message "Select yes if you are a designated member of the limited liability partnership"
    Then I should navigate to Radio button "Yes, I am a designated member" at Position "1"