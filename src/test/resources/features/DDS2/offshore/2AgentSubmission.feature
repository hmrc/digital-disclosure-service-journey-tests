Feature: An agent submits onbehalf of UK tax payer is able to submit a onshore DDS request on their tax dispute with HMRC

  Scenario: Agent should be able to submit the offshore request for UK taxpayer
    Given agent login with his governament gateway id
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
    