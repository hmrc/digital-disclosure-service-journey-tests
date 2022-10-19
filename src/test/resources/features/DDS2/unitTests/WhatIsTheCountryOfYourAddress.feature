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

  @id009
  Scenario: What is the country of your address? - UK - Enter address manually error validation
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    When I click on the hyperlink with text "Enter the address manually"
    Then page navigates to "What is your address?"
    And click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter at least one address line or a town"

  @id010
  Scenario: What is the country of your address? - UK - Enter address manually in all fields on What is your postcode page, and edit the address in the confirm page
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    When I click on the hyperlink with text "Enter the address manually"
    Then page navigates to "What is your address?"
    When I enter "My ABC Ltd" in the "Organisation" field
    And I enter "Berry lane" in the "Address line 1" field
    And I enter "Subline 2" in the "Address line 2" field
    And I enter "Another line 3" in the "Address line 3" field
    And I enter "Aylesbury" in the "Town or city" field
    And I enter "HP19 9AA" in the "Postcode" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "My ABC Ltd"
    And address at line "2" is "Berry lane"
    And address at line "3" is "Subline 2"
    And address at line "4" is "Another line 3"
    And address at line "5" is "Aylesbury"
    And address at line "6" is "HP19 9AA"
    And address at line "7" is "United Kingdom"
    When I click on the hyperlink with text "Edit address"
    Then page navigates to "What is your address?"
    When I enter "My Services Ltd" in the "Organisation" field
    And I enter "HP19 9AT" in the "Postcode" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "My Services Ltd"
    And address at line "6" is "HP19 9AT"

  @id011
  Scenario: What is the country of your address? - UK - Enter address manually on incorrect postcode page, then verify in the confirm page
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    When enter postcode "AA1 1AA"
    And click on continue button
    Then page navigates to "We cannot find any addresses for AA1 1AA"
     When I click on the hyperlink with text "Enter the address manually"
    Then page navigates to "What is your address?"
    And I enter "Aylesbury" in the "Town or city" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "Aylesbury"
    And address at line "2" is "United Kingdom"
    When I click on the hyperlink with text "Edit address"
    Then page navigates to "What is your address?"
    When I enter "My Services Ltd" in the "Organisation" field
    And I enter "HP19 9AT" in the "Postcode" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    When I click on the hyperlink with text "Edit address"
    Then page navigates to "What is your address?"
    When I enter "My ABC Ltd" in the "Organisation" field
    And I enter "Berry lane" in the "Address line 1" field
    And I enter "Subline 2" in the "Address line 2" field
    And I enter "Another line 3" in the "Address line 3" field
    And I enter "Aylesbury" in the "Town or city" field
    And I enter "HP19 9AA" in the "Postcode" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "My ABC Ltd"
    And address at line "2" is "Berry lane"
    And address at line "3" is "Subline 2"
    And address at line "4" is "Another line 3"
    And address at line "5" is "Aylesbury"
    And address at line "6" is "HP19 9AA"
    And address at line "7" is "United Kingdom"

  @id012
  Scenario: What is the country of your address? - UK - Enter address manually on choose address page and then verify the confirm page
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    Then page navigates to "What is the postcode and property name or number of your address?"
    When enter postcode "ZZ9Z 9TT"
    And click on continue button
    Then page navigates to "Choose your address"
    When I click on the hyperlink with text "Enter your address manually"
    Then page navigates to "What is your address?"
    And I enter "Berry lane" in the "Address line 1" field
    And I enter "Another line 3" in the "Address line 3" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "Berry lane"
    And address at line "2" is "Another line 3"
    And address at line "3" is "ZZ9Z 9TT"
    And address at line "4" is "United Kingdom"

  @id013
  Scenario: What is the country of your address? - UK - Navigation to Check your Answer Page
    Given I am on What is the country of your address Page
    When enter country name "United Kingdom",select country "United Kingdom"
    And click on continue button
    And enter postcode "ZZ9Z 9TT"
    And click on continue button
    And I select Radio Button "2 Testing Lane, Royal Madeuptown, ZZ9Z 9TT" at Position "2"
    And click on continue button
    And click on confirm button
    And page navigates to "Check Your Answers"




