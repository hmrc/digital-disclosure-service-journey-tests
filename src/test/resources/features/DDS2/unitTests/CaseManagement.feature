@journeytests
Feature: An agent is able to edit and create case

  Scenario:Case validation - Edit and create a new case
    Given I navigate to authority wizard page
    When select "Agent" from affinityGroup drop down
    And select "250" from confidenceLevel drop down
    And click on submit on wizard page
    And I click on continue button
    Then on the UsingThisServiceUrl page I click Make a notification first and click save and continue
    Then on the WillYouBeMakingADisclosureUrl page I select Yes and click save and continue
    Then on the CaseReferenceNumberUrl page I enter the CRN into the textbox and click save and continue
    Then on the DisclosureAboutUrl page I select An Individual and click save and continue
    Then on the AreYouTheEntityUrl page I select Yes, I am the individual and click save and continue
    Then on the OffshoreLiabilitiesUrl page I select Yes and click save and continue
    Then on the OnshoreLiabilitiesUrl page I select No and click save and continue
    When on the WhereDidTheIncomeComeFromUrl page I click on the header hyperlink
    And on the homepage I click continue to navigate to the ViewEditCreateCaseUrl page
    And the Reference is Not completed
    And the Type is Offshore liabilities
    And the Status is Notification not sent
    And I click the Edit link within the case table
    Then on the YouHaveStartedNotificationUrl page I click Continue or edit this notification and click save and continue
    And on the WillYouBeMakingADisclosureUrl page I click on the header hyperlink
    And on the homepage I click continue to navigate to the ViewEditCreateCaseUrl page
    And I select create a new case
    Then on the UsingThisServiceUrl page I click Make a notification first and click save and continue
    Then on the WillYouBeMakingADisclosureUrl page I select Yes and click save and continue
    Then on the CaseReferenceNumberUrl page I enter the CRN into the textbox and click save and continue
    Then on the DisclosureAboutUrl page I select An Estate and click save and continue
    Then on the AreYouTheEntityUrl page I select Yes, I am the executor or administrator and click save and continue
    Then on the OffshoreLiabilitiesUrl page I select Yes and click save and continue
    Then on the OnshoreLiabilitiesUrl page I select Yes and click save and continue
    Then on the WhereDidTheIncomeComeFromUrl page I select Other capital gains and click save and continue
    Then on the NameOfIndividualUrl page I enter Estate Person into the textbox and click save and continue
    And on the IndividualDobUrl page I click on the header hyperlink
    And on the homepage I click continue to navigate to the ViewEditCreateCaseUrl page
    And the Reference is Estate Person
    And the Type is Offshore and onshore liabilities
    And the Status is Notification not sent
    And I click the Edit link within the case table
    Then on the YouHaveStartedNotificationUrl page I click Make a disclosure and click save and continue
    Then on the ListOfTasksUrl page I click Return to view, edit or create a case
    And verify on the ViewEditCreateCaseUrl page











