
Feature: An agent is able to view and create multiple cases
  Background:
    Given As an agent I have navigated to the home page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "An individual" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the individual" at Position "1"
    And click on Save and Continue button

  @wip
  Scenario: An agent is able to view and create multiple cases
    Given I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I navigate to "disclosure-list-of-tasks" specific page
    And click on Hyperlink "Make your declaration"
    And click on I confirm button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Review your declaration"
    And status is marked as "Not started" for field "Add offshore liability details"
    When click on Hyperlink "Add offshore liability details"
    Then page navigates to "Why are you making this disclosure?"
    When I select Checkbox "I have submitted an inaccurate return because I did not take reasonable care." at Position "4"
    And click on Save and Continue button
    Then page navigates to "Which year does this offshore disclosure relate to?"
    And page should display checkboxes for the "10" tax years before the current tax year
    When I select Checkbox "Any tax year before 6 April 2013" at Position "10"
    And click on Save and Continue button
    Then page navigates to "Can you tell us more about any tax owed before 6 April 2013?"
    And I enter "Provide the amount, when it was owed, and where the income or gain came from" in the text area
    And click on Save and Continue button
    Then page navigates to "You are making a nil disclosure"
    And click on Save and Continue button
    Then page navigates to "Offshore liabilities summary"
    When click on continue button
    Then page navigates to "List of tasks"
    And status is marked as "Completed" for field "Edit offshore liability details"
    When I select the "case-management-link" link
    Then page navigates to "View, edit or create a case"
    And 1 case is shown on the page
    When I select the "create-case" link
    And Agent selects the make a disclosure radio button
    And click on continue button
    Then page navigates to "List of tasks"
    When I select the "case-management-link" link
    Then page navigates to "View, edit or create a case"
    And 2 case is shown on the page
