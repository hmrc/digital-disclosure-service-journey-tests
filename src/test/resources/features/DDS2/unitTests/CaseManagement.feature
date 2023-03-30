@journeytests
Feature: An agent is able to edit and create case

  @id:001
  Scenario:Case validation - Edit and create a new case
    Given I navigate to authority wizard page
    When select "Agent" from affinityGroup drop down
    And select "250" from confidenceLevel drop down
    And click on submit on wizard page
    And I click on continue button
    And I click on "Make a notification first" button
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Header Hyperlink
    And I click on continue button
    Then page navigates to "View, edit or create a case"
    And reference at position "1" is "Not completed"
    And type at position "1" is "Offshore liabilities"
    And status at position "1" is "Notification not sent"
    When click on Edit link at position "1"
    Then page navigates to "You have already started a notification"
    And I click on "Continue or edit this notification" button
    And click on Save and Continue button
    And click on Header Hyperlink
    And I click on continue button
    And page navigates to "View, edit or create a case"
    And I click on create a new case
    And I click on "Make a notification first" button
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An estate" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the executor or administrator of the estate" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Checkbox "Other capital gains" at Position "6"
    And click on Save and Continue button
    And I enter "Estate Person" in the TextBox field
    And click on Save and Continue button
    And click on Header Hyperlink
    And I click on continue button
    And reference at position "1" is "Estate Person"
    And type at position "1" is "Offshore and onshore liabilities"
    And status at position "1" is "Notification not sent"
    When click on Edit link at position "1"
    Then page navigates to "You have already started a notification"
    And I click on "Make a disclosure" button
    And click on Save and Continue button
    Then page navigates to "List of tasks for Estate Person"
    And I click on case management link
    And page navigates to "View, edit or create a case"











