Feature: A UK Limited liability partnership representative is able to enter details and continue onto What is your email address? screen

  Scenario: What is your email address? - Yes, I am designated member and Enter the email address and navigate to next page
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A limited liability partnership" at Position "4"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am a designated member" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "James Parker" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of the limited liability partnership’s address?"
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    Then page navigates to "Choose the limited liability partnership’s address"
    When I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    When click on confirm button
    And I enter "Dave Smith" in the TextBox field
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

  Scenario: What is your email address? - No, on behalf of designated member and Enter the email address and navigate to next page
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "A limited liability partnership" at Position "4"
    And click on Save and Continue button
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "James Parker" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of the limited liability partnership’s address?"
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    Then page navigates to "Choose the limited liability partnership’s address"
    When I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    When click on confirm button
    And I enter "Dave Smith" in the TextBox field
    And click on Save and Continue button
    And I enter "0771557382" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Do you have an email address that you are happy to be contacted on by HMRC?"
    When I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    Then page navigates to "What is the country of your address?"



