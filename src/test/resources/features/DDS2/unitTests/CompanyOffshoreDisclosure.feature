@page @regression
Feature: A Company tax payer is able to notify and submit offshore disclosure

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
    And I enter "Company name" in the TextBox field
    And click on Save and Continue button
    And I enter "12345678" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And I click on the hyperlink with text "Enter the address manually"
    And I enter "The Farm" in the "Address line 1" field
    And I enter "Royal Madeuptown" in the "Town or city" field
    And I enter "ZZ9Z 9TT" in the "Postcode" field
    And click on Save and Continue button
    And click on confirm button
    And I enter "Agent full name" in the TextBox field
    And click on Save and Continue button
    And I select Checkbox "Email" at Position "1"
    And I select Checkbox "Telephone" at Position "2"
    And click on Save and Continue button
    And I enter "abc@abc.com" in the TextBox field
    And click on Save and Continue button
    And I enter "07777 777777" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And I click on the hyperlink with text "Enter the address manually"
    And I enter "1 Testing Lane" in the "Address line 1" field
    And I enter "Royal Madeuptown" in the "Town or city" field
    And I enter "ZZ9Z 9TT" in the "Postcode" field
    And click on Save and Continue button
    And click on confirm button
    And I click on send notification button

  @journeytests-Incomplete
  Scenario: Company - On Behalf of - complete offshore disclosure journey
    Given I am on "You have sent the notification" page
    When I navigate to "make-a-disclosure" specific page
    Then page navigates to "You sent a notification on"
    When I click on Make a disclosure button
    Then page navigates to "List of tasks - Tell HMRC about underpaid tax from previous years"
    When I click on the hyperlink with text "Add offshore liability details"
    And I select Checkbox "The company did not notify HMRC about a tax liability but this was not deliberate and it has a reasonable excuse." at Position "1"
    And I select Checkbox "The company submitted an inaccurate return despite taking reasonable care." at Position "2"
    And I select Checkbox "The company did not notify HMRC about a tax liability but this was not deliberate and it has a reasonable excuse." at Position "3"
    And I enter <any> in the reasonable excuse field
    And I enter <any> in the reasonable excuse years field
    And I enter <any> in the reasonable care field
    And I enter <any> in the reasonable care years field
    And I enter <any> in the reasonable excuse not filing field
    And I enter <any> in the reasonable excuse not filing years field

