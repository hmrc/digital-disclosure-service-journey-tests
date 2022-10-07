@page
Feature: A UK tax payer is able to enter the details and continue on "What is the country of your address?"

  @id001
  Scenario: What is the country of your address? - UI validation
    Given I am on What is the country of your address Page
    Then verify the question should be "What is the country of your address?"
    And hint with text "For example, United Kingdom." is displayed
    And enter country name "United",dropdown is displayed
    And Continue Button displayed
    And back Button Link is displayed

  @id002
  Scenario: What is the country of your address? - UK address via valid postcode search
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    And hyperlink of "Enter the address manually" is displayed
    When enter postcode "ZZ9Z 9TT"
    And click on continue button
    Then page navigates to "Choose your address"
    When I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "2 Testing Lane"
    And address at line "2" is "Royal Madeuptown"
    And address at line "3" is "ZZ9Z 9TT"
    And address at line "4" is "United Kingdom"

  @id003
  Scenario: What is the country of your address? - UK search invalid postcode and try with valid one
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    When enter postcode "AA1 1AA"
    And click on continue button
    Then page navigates to "We cannot find any addresses for AA1 1AA"
    When click on Try a Different Postcode
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    When I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "2 Testing Lane"
    And address at line "2" is "Royal Madeuptown"
    And address at line "3" is "ZZ9Z 9TT"
    And address at line "4" is "United Kingdom"

  @id004
  Scenario: What is the country of your address? - UK address via valid Property name
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    When enter postcode "ZZ9Z 9TT"
    And enter Property name as "The Farm"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "The Farm"
    And address at line "2" is "Royal Madeuptown"
    And address at line "3" is "ZZ9Z 9TT"
    And address at line "4" is "United Kingdom"

  @id005
  Scenario: What is the country of your address? - UK address via invalid Property name
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    When enter postcode "ZZ9Z 9TT"
    And enter Property name as "The Farmhouse"
    And click on continue button
    Then page navigates to "Showing all results for ZZ9Z 9TT"
    And shows message "We could not find a match with 'The Farmhouse'."
    And hyperlink of "Try a different name or number" is displayed
    And hyperlink of "Enter your address manually" is displayed
    And list of matching option is displayed
    When click on Hyperlink "Try a different name or number"
    Then page navigates to "What is the postcode and property name or number of your address?"

  @id006
  Scenario: What is the country of your address? - UK address via valid Property number
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    When enter postcode "ZZ9Z 9TT"
    And enter Property number as "2"
    And click on continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "2 Testing Lane"
    And address at line "2" is "Royal Madeuptown"
    And address at line "3" is "ZZ9Z 9TT"
    And address at line "4" is "United Kingdom"


  @id007
  Scenario: What is the country of your address? - UK address via invalid Property number
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    When enter postcode "ZZ9Z 9TT"
    And enter Property number as "15"
    And click on continue button
    Then page navigates to "Showing all results for ZZ9Z 9TT"
    And shows message "We could not find a match with '15'."
    And hyperlink of "Try a different name or number" is displayed
    And hyperlink of "Enter your address manually" is displayed
    And list of matching option is displayed
    When click on Hyperlink "Try a different name or number"
    Then page navigates to "What is the postcode and property name or number of your address?"

  @id008
  Scenario: What is the country of your address? - Error Validation
    Given I am on What is the country of your address Page
    And click on continue button
    Then error message should be displayed with text "Enter country of the address"
    When I click on problem message "Enter country of the address"
    Then focus navigates TextBox field
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    When click on continue button
    Then error message should be displayed with text "Enter a postcode"
    When I click on problem message "Enter a postcode"
    Then focus navigates TextBox field
    When enter postcode "ZZ9Z 9TT"
    And click on continue button
    Then page navigates to "Choose your address"
    When click on continue button
    Then error message should be displayed with text "Select an address"
    When I click on problem message "Select an address"
    Then I should navigate to Radio button "1 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "1"






