@page
Feature: A UK trust representative is able to enter details and continue on Do you have an email address that you are happy to be contacted on by HMRC?"

  Scenario: Do you have an email address that you are happy to be contacted on by HMRC? - User select Yes, I am the trustee of the trust" or " No, I am will be making a disclosure on behalf of the trustee
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A trust" at Position "5"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the trustee of the trust" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "Trust Name" in the TextBox field
    And click on Save and Continue button
    And I enter "James Parker" in the TextBox field
    And click on Save and Continue button
    And I enter "0771557382" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Do you have an email address that you are happy to be contacted on by HMRC?"
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    Then page navigates to "What is your email address?"
    And I enter "youremailaddress@test.com" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "What is the country of your address?"