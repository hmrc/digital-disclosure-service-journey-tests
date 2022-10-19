@page
Feature: A UK tax payer is able to enter the details and continue on "What is the country of the individual's address?" for Agent

  @id001
  Scenario: For On Behalf of Individual - Hint Text should be available on Agent Postcode address Page
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I do not have offshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "Individual Full Name" in the TextBox field
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
    And I select Yes radio button
    And click on Save and Continue button
    And I enter "AgentEmailAddress@example.com" email TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then hint with text "If you are representing an organisation on behalf of the individual, you can use your organisation’s address." is displayed

  @id002
  Scenario: For On Behalf of Individual - Hint Text should not be available on Individual Postcode address Page
    Given I am on What is the country of the individual address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    Then hint with text "If you are representing an organisation on behalf of the individual, you can use your organisation’s address." is not displayed

  @id03
  Scenario: For Self Declaration - Hint Text should not be available on Postcode address Page
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    Then hint with text "If you are representing an organisation on behalf of the individual, you can use your organisation’s address." is not displayed

  @id004
  Scenario: For On Behalf of Individual -Navigation to Check you answer page
    Given I am navigated to Are you the individual this disclosure relates to Page
    When I select Radio Button "No, I am disclosing on behalf of the individual" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "I do not have offshore liabilities to disclose" at Position "2"
    And click on Save and Continue button
    And click on Save and Continue button
    And I enter "Individual Full Name" in the TextBox field
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
    And I select Yes radio button
    And click on Save and Continue button
    And I enter "AgentEmailAddress@example.com" email TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "3 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "3"
    And click on continue button
    And click on confirm button
    Then page navigates to "Check Your Answers"



