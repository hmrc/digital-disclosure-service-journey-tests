@INPROGRESS
Feature: A UK tax payer is able to enter the details and continue on "Do you have an email address that you are happy to be contacted on by HMRC?"

  @id001
  Scenario: Contact By Email - When select Yes to Do you have an email address that you are happy to be contacted on by HMRC? - UI Validation
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A trust" at Position "5"
    And click on Save and Continue button
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "What is the trust’s name?" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "3 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "3"
    And click on continue button
    And click on confirm button
    And I enter "Your Full Name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777777777" in the TextBox field
    And click on Save and Continue button
    Then heading with text "Do you have an email address that you are happy to be contacted on by HMRC?" is displayed
    And I select Yes radio button
    And click on Save and Continue button
    Then user is navigated to the page with title "What is your email address?"

  @id001
  Scenario: Contact By Email - When select No to Do you have an email address that you are happy to be contacted on by HMRC? - UI Validation
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A trust" at Position "5"
    And click on Save and Continue button
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "What is the trust’s name?" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "3 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "3"
    And click on continue button
    And click on confirm button
    And I enter "Your Full Name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777777777" in the TextBox field
    And click on Save and Continue button
    Then heading with text "Do you have an email address that you are happy to be contacted on by HMRC?" is displayed
    And I select No radio button
    And click on Save and Continue button
    Then user is navigated to the page with title "What is the country of your address?"


