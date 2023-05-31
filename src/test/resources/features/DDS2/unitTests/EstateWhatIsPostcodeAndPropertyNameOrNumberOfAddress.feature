Feature: A UK estate tax payer is able to enter the details and continue on "What is the postcode and property name or number of your address?"

  Scenario: What is the country of the company’s address? - Yes, I am the executor - Manual address entry - UK
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "An estate" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes, I am the executor or administrator" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "James Parker" in the TextBox field
    And click on Save and Continue button
    And I enter "01" in the "Day" text box field
    And I enter "01" in the "Month" text box field
    And I enter "1980" in the "Year" text box field
    And click on Save and Continue button
    And I enter "Dentist" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    And click on confirm button
    And I enter "Agent Full Name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777777777" in the TextBox field
    And click on Save and Continue button
    Then heading with text "Do you have an email address that you are happy to be contacted on by HMRC?" is displayed
    And I select No radio button
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on Save and Continue button
    And heading with text "What is the postcode and property name or number of your address?" is displayed
    And hyperlink of "Enter the address manually" is displayed
    When enter postcode "ZZ9Z 9TT"
    And enter Property number as "2"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    When click on confirm button

  Scenario: What is the country of the company’s address? - No, disclosure on behalf - Manual address entry - UK
    Given I navigate to "what-is-this-disclosure-about" page
    When I select Radio Button "An estate" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I am an accountant or tax agent" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "2"
    And click on Save and Continue button
    And click on confirm button
    And I enter "James Parker" in the TextBox field
    And click on Save and Continue button
    And I enter "01" in the "Day" text box field
    And I enter "01" in the "Month" text box field
    And I enter "1980" in the "Year" text box field
    And click on Save and Continue button
    And I enter "Dentist" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And I select Radio Button "No" at Position "3"
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    And click on confirm button
    And I enter "Agent Full Name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777777777" in the TextBox field
    And click on Save and Continue button
    Then heading with text "Do you have an email address that you are happy to be contacted on by HMRC?" is displayed
    And I select No radio button
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on Save and Continue button
    And heading with text "What is the postcode and property name or number of your address?" is displayed
    And hyperlink of "Enter the address manually" is displayed
    When enter postcode "ZZ9Z 9TT"
    And enter Property number as "2"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    When click on confirm button
