@page
Feature: A UK tax payer residing abroad is able to enter the details and continue on "What is the country of your address?"

  Scenario: What is the individual’s address? - International - UI validation
    Given I am on What is the country of the individual address Page
    When enter country name "Australia",select country "Australia"
    And click on continue button
    Then page navigates to "What is the individual’s address?"
    When click on Save and Continue button
    Then error summary popup should be displayed with text "There is a problem"
    And error message should be displayed with text "Enter at least one address line or a town"

  Scenario: What is the individual’s address? - International page - Enter valid data in all fields, verify on the confirm page and edit the address
    Given I am on What is the country of the individual address Page
    When enter country name "Australia",select country "Australia"
    And click on continue button
    Then page navigates to "What is the individual’s address?"
    When I enter "My ABC Ltd" in the "Organisation" field
    And I enter "Victoria Lane" in the "Address line 1" field
    And I enter "Riverside apartments" in the "Address line 2" field
    And I enter "South Yarra" in the "Address line 3" field
    And I enter "Melbourne" in the "Town or city" field
    And I enter "3140" in the "Postcode" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "My ABC Ltd"
    And address at line "2" is "Victoria Lane"
    And address at line "3" is "Riverside apartments"
    And address at line "4" is "South Yarra"
    And address at line "5" is "Melbourne"
    And address at line "6" is "3140"
    And address at line "7" is "Australia"
    When I click on the hyperlink with text "Edit address"
    Then page navigates to "What is the individual’s address?"
    When I enter "My Services Ltd" in the "Organisation" field
    And I enter "3141" in the "Postcode" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "My Services Ltd"
    And address at line "6" is "3141"


  Scenario: What is the individual’s address? - International page - Enter valid data in minimum fields, verify on the confirm page and edit the address
    Given I am on What is the country of the individual address Page
    When enter country name "Australia",select country "Australia"
    And click on continue button
    Then page navigates to "What is the individual’s address?"
    And I enter "Melbourne" in the "Town or city" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "Melbourne"
    And address at line "2" is "Australia"
    When I click on the hyperlink with text "Edit address"
    Then page navigates to "What is the individual’s address?"
    When I enter "My Services Ltd" in the "Organisation" field
    And I enter "3141" in the "Postcode" field
    And click on Save and Continue button
    Then page navigates to "Is this the correct address?"
    And address at line "1" is "My Services Ltd"
    And address at line "2" is "Melbourne"
    And address at line "3" is "3141"
    And address at line "4" is "Australia"