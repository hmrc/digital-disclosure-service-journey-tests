@page
Feature: A UK company representative is able to enter details and continue on Do you have an email address that you are happy to be contacted on by HMRC?"

  Scenario: What is your email address? - behalf of a officer
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A company" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No, I will be making a disclosure on behalf of an officer" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "James Parker" in the TextBox field
    And click on Save and Continue button
    And I enter "AB 123456" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of the company’s address?"
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    Then page navigates to "Choose the company’s address"
    When I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    When click on confirm button
    And I enter "Dave" in the TextBox field
    And click on Save and Continue button
    And I enter "0771557382" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Do you have an email address that you are happy to be contacted on by HMRC?"
    When click on Save and Continue button
    And error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Select yes if you have an email address that HMRC can contact you with"
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What is your email address?"

  Scenario: What is the country of your address?' - behalf of a officer
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A company" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No, I will be making a disclosure on behalf of an officer" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "James Parker" in the TextBox field
    And click on Save and Continue button
    And I enter "AB 123456" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of the company’s address?"
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    Then page navigates to "Choose the company’s address"
    When I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    When click on confirm button
    And I enter "Dave" in the TextBox field
    And click on Save and Continue button
    And I enter "0771557382" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Do you have an email address that you are happy to be contacted on by HMRC?"
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "What is the country of your address?"



