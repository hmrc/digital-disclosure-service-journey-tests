@accessibility
Feature: A Company - is able to submit onshore disclosure with CL and DL

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "A company" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No, I will be making a disclosure on behalf of an officer" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "Organization name" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button

  Scenario: Company - Onshore Journey with CT and DL
    Given I navigate to "disclosure-list-of-tasks" specific page
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Review your declaration"
    And status is marked as "Not started" for field "Add onshore liability details"
    And click on Hyperlink "Add onshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    And I select Checkbox "The company submitted an inaccurate return because it did not take reasonable care." at Position "4"
    And click on Save and Continue button
    Then page navigates to "What onshore liabilities do you need to disclose?"
    And I select Checkbox "Corporation Tax liabilities" at Position "3"
    And I select Checkbox "Director’s loan account liabilities" at Position "4"
    And click on Save and Continue button
    Then page navigates to "Onshore Corporation Tax liability 1"
    And I enter "01" into the "periodEnd.day" text field
    And I enter "01" into the "periodEnd.month" text field
    And I enter "2019" into the "periodEnd.year" text field
    And I enter "0" into the "howMuchIncome" text field
    And I enter "1000" into the "howMuchUnpaid" text field
    And I enter "0" into the "howMuchInterest" text field
    And I enter "10" into the "penaltyRate" text field
    And I enter "Reason" into the "penaltyRateReason" text field
    And click on Save and Continue button
    Then page navigates to "Review onshore Corporation Tax liabilities"
    And click on Save and Continue button
    Then page navigates to "You have added 1 accounting period for Corporation Tax liabilities"
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Onshore director’s loan account liabilities 1"
    And I enter "Director Name" into the "name" text field
    And I enter "01" into the "periodEnd.day" text field
    And I enter "01" into the "periodEnd.month" text field
    And I enter "2019" into the "periodEnd.year" text field
    And I enter "0" into the "overdrawn" text field
    And I enter "1000" into the "unpaidTax" text field
    And I enter "0" into the "interest" text field
    And I enter "10" into the "penaltyRate" text field
    And I enter "Reason" into the "penaltyRateReason" text field
    And click on Save and Continue button
    Then page navigates to "Review onshore director loans account liabilities"
    And click on Save and Continue button
    Then page navigates to "You have added 1 accounting period for director loan account liabilities"
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "Onshore liabilities summary"
