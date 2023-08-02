@journeytests
Feature: An agent is able to edit and create case

  Scenario:Case validation - Edit and create a new case
    Given I navigate to authority wizard page
    When select "Agent" from affinityGroup drop down
    And select "250" from confidenceLevel drop down
    And click on submit on wizard page
    And I click on continue button
    Then on the UsingThisService page I click Make a notification first and click save and continue
    Then on the WillYouBeMakingADisclosure page I select Yes and click save and continue
    Then on the CaseReferenceNumber page I enter the CRN into the textbox and click save and continue
    Then on the DisclosureAbout page I select An Individual and click save and continue
    Then on the AreYouTheEntity page I select Yes, I am the individual and click save and continue
    Then on the OffshoreLiabilities page I select Yes and click save and continue
    Then on the OnshoreLiabilities page I select No and click save and continue
    When on the WhereDidTheIncomeComeFrom page I click on the header hyperlink
    And on the homepage I click continue to navigate to the ViewEditCreateCase page
    Then the values within the datatable are verified
      | Row |Reference     | Type                 | Status                |
      | 1   |Not completed | Offshore liabilities | Notification not sent |
    And I click the Edit link within the case table
    Then on the YouHaveStartedNotification page I click Continue or edit this notification and click save and continue
    And on the WillYouBeMakingADisclosure page I click on the header hyperlink
    And on the homepage I click continue to navigate to the ViewEditCreateCase page
    And I select create a new case
    Then on the UsingThisService page I click Make a notification first and click save and continue
    Then on the WillYouBeMakingADisclosure page I select Yes and click save and continue
    Then on the CaseReferenceNumber page I enter the CRN into the textbox and click save and continue
    Then on the DisclosureAbout page I select An Estate and click save and continue
    Then on the AreYouTheEntity page I select Yes, I am the executor or administrator and click save and continue
    Then on the OffshoreLiabilities page I select Yes and click save and continue
    Then on the OnshoreLiabilities page I select Yes and click save and continue
    Then on the WhereDidTheIncomeComeFrom page I select Other capital gains and click save and continue
    Then on the NameOfIndividual page I enter Estate Person into the textbox and click save and continue
    And on the IndividualDob page I click on the header hyperlink
    And on the homepage I click continue to navigate to the ViewEditCreateCase page
    Then the values within the datatable are verified
      | Row |Reference     | Type                              | Status                |
      | 1   |Estate Person | Offshore and onshore liabilities | Notification not sent |
    And I click the Edit link within the case table
    Then on the YouHaveStartedNotification page I click Make a disclosure and click save and continue
    Then on the ListOfTasks page I click Return to view, edit or create a case
    And verify on the ViewEditCreateCase page











