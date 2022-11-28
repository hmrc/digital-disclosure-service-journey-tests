@page
Feature: An individual is able to check their answers for About the Company section before submitting page

  Background:
    Given I am navigated to Received A Letter Page
    When I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "CFSS-1234567" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "A limited liability partnership" at Position "4"
    And click on Save and Continue button
    And I select Radio Button "No, I will be making a disclosure on behalf of a designated member" at Position "2"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "Organization name" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "LLP name" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "The Farm, Royal Madeuptown, ZZ9Z 9TT" at Position "9"
    And click on continue button
    And click on confirm button
    And I enter "Agent full name" in the TextBox field
    And click on Save and Continue button
    And I enter "07777 777777" in the TextBox field
    And click on Save and Continue button
    And I select Radio Button "Yes" at Position "1"
    And click on Save and Continue button
    And I enter "abc@abc.com" in the TextBox field
    And click on Save and Continue button
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "1 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "1"
    And click on continue button
    And click on confirm button

  Scenario: On behalf of the LLP - About the LLP - Change Route LLP address
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About the limited liability partnership"
    And About The LLP section should have a label "Limited liability partnership’s address" at line "2" an answer with "The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "llp-address/lookup/change"
    When clicking on change button navigates as following:
      |Label|ExpectedPage|
      |Limited liability partnership’s address|What is the country of the limited liability partnership’s address?|

  Scenario: On behalf of Individual -About The Individual - Change Route validation -Address Validation-No data population
    Given I am on "Check Your Answers" page
    When I click on change button for "Limited liability partnership’s address"
    Then page navigates to "What is the country of the limited liability partnership’s address?"
    And country dropdown is empty

  Scenario: On behalf of Individual -About The Individual - Change Route validation -Address Validation- Needs to complete new address Journey
    Given I am on "Check Your Answers" page
    When I click on change button for "Limited liability partnership’s address"
    And enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "3 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "3"
    And click on continue button
    And click on confirm button
    Then page navigates to "Check Your Answers"
    And About The LLP section should have a label "Limited liability partnership’s address" at line "2" an answer with "3 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "llp-address/lookup/change"

  Scenario: LLP - About LLP - Check your answers
    Given I am on "Check Your Answers" page
    Then answers page should have h2 header "About the limited liability partnership"
    And About The LLP section should have a label "Limited liability partnership name" at line "1" an answer with "LLP name" and change URL ends with "llp-name/change"
    And About The LLP section should have a label "Limited liability partnership’s address" at line "2" an answer with "The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "llp-address/lookup/change"

  Scenario: LLP - About LLP - Change route - LLP Name
    Given I am on "Check Your Answers" page
    When I click on change button for "Limited liability partnership name"
    Then page navigates to "What is the limited liability partnership’s name?"
    When I enter "New LLP Name" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    Then answers page should have h2 header "About the limited liability partnership"
    And About The LLP section should have a label "Limited liability partnership name" at line "1" an answer with "New LLP Name" and change URL ends with "llp-name/change"
    And About The LLP section should have a label "Limited liability partnership’s address" at line "2" an answer with "The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom" and change URL ends with "llp-address/lookup/change"
