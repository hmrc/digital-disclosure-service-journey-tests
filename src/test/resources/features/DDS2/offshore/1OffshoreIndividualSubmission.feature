
Feature: A UK tax payer is able to submit a offshore DDS request on his tax dispute with HMRC

  Scenario Outline: Ensure UK tax payer is able to submit DDS request
    Given User login with his governament gateway id
    And the HMRC username is displaye on "welcome" page
	And user clicks on submit new "disclousre service"
    When the user enters all below mandatory customer details on the customer search page
      | Field               | Value        |
      | First name          | <First name> |
      | Family name         | <Last name>  |
      | Date of birth day   | <day>        |
      | Date of birth month | <month>      |
      | Date of birth year  | <year>       |
    And the HMRC user clicks on "next" button
    Then the HMRC user will be presented with more details page
    