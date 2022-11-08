@page
Feature: UI Validation and Navigation for Screen "Are you a designated member of the limited liability partnership that the disclosure will be about?"

  @id_001
  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - UI Validation
    Given I navigate to "are-you-a-designated-member" page
    Then verify the question should be "Are you a designated member of the limited liability partnership that the disclosure will be about?"
    And radio Button with text "Yes, I am a designated member of the limited liability partnership" is displayed at position "1"
    And radio Button with text "No, I will be making a disclosure on behalf of a designated member" is displayed at position "2"
    And hint with text "We may ask for additional evidence that you’re authorised to act for them, such as the ‘Authorising a tax agent (64-8)’ form." is displayed
    And verify that radio options are not selected by default
    And save and Continue Button is displayed
    And back Button Link is displayed

  @id_002
  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - Navigation with option "Yes, I am a designated member of the limited liability partnership"
      Given I navigate to "are-you-a-designated-member" page
      When I select Radio Button "Yes, I am a designated member of the limited liability partnership" at Position "1"
      And click on Save and Continue button
      Then heading with text "Offshore liabilities" is displayed

  @id_003
  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - Navigation with option "No, I will be making a disclosure on behalf of a designated member"
    Given I navigate to "are-you-a-designated-member" page
    When I select Radio Button "No, I will be making a disclosure on behalf of a designated member" at Position "2"
    And click on Save and Continue button
    Then heading with text "Are you representing an organisation?" is displayed

  @id_004
  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - Navigation with Back button
    Given I navigate to "are-you-a-designated-member" page
    And I select Radio Button "Yes, I am a designated member of the limited liability partnership" at Position "1"
    And click on Save and Continue button
    And I click on Back button
    Then page navigates to "Are you a designated member of the limited liability partnership that the disclosure will be about?"

  @id_005
  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - Validation with no selection of Radio Button
    Given I navigate to "are-you-a-designated-member" page
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you are a designated member of the limited liability partnership"

  @id_006
  Scenario: Are you a designated member of the limited liability partnership that the disclosure will be about? - Navigation of on Error message on top popup
    Given I navigate to "are-you-a-designated-member" page
    When click on Save and Continue button
    When I click on problem message "Select yes if you are a designated member of the limited liability partnership"
    Then I should navigate to Radio button "Yes, I am a designated member of the limited liability partnership" at Position "1"