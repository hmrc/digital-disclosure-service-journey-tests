@page
Feature: A UK company representative is able to enter details and continue on Do you have an email address that you are happy to be contacted on by HMRC?"

  Scenario: Do you have an email address that you are happy to be contacted on by HMRC? - Yes, I am the officer, Error on no input and Yes to be contacted via email
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A company" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am an officer of the company" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "James Parker" in the TextBox field
    And click on Save and Continue button
    And I enter "AB 123456" in the TextBox field
    And click on Save and Continue button
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

  Scenario: Do you have an email address that you are happy to be contacted on by HMRC? - No, On behalf and No to email
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

    And I enter "Dave" in the TextBox field
    And click on Save and Continue button
    And I enter "0771557382" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Do you have an email address that you are happy to be contacted on by HMRC?"
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "What is the country of your address?"

  Scenario: What is your email address? - Enter the email address and navigate to next page
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A company" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am an officer of the company" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "James Parker" in the TextBox field
    And click on Save and Continue button
    And I enter "AB 123456" in the TextBox field
    And click on Save and Continue button

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
    When I enter "abc@abc.com" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What is the country of your address?"


