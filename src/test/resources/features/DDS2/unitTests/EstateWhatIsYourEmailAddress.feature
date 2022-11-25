@page
Feature: A UK estate tax payer is able to enter the details on 'What is your email address?' page and navigate to What is the country of your address? screen

  Scenario: What is your email address?  - user can navigate to 'What is the country of your address?' screen after entering valid email on 'What is your email address?' screen
    Given I navigate to "what-is-this-disclosure-about" page
    And I select Radio Button "An estate" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the executor or administrator of the estate" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on confirm button
    And I enter "James Anderson" in the TextBox field
    And click on Save and Continue button
    And I enter "01" in the "Day" text box field
    And I enter "01" in the "Month" text box field
    And I enter "1980" in the "Year" text box field
    And click on Save and Continue button
    And I enter "Shop Owner" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on Save and Continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    And click on confirm button
    And I enter "Agent Full Name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777777777" in the TextBox field
    And click on Save and Continue button
    And I select Yes radio button
    And click on Save and Continue button
    And I enter "EstateAgentEmailAddress@example.com" email TextBox field
    And click on Save and Continue button
    Then user is navigated to the page with title "What is the country of your address?"
