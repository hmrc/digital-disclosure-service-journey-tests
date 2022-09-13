@acceptance
Feature: A UK tax payer is able to submit a onshore DDS request on his tax dispute with HMRC

  Scenario: Ensure user is able to submit onshore request
    Given User login with his government gateway id
    And the HMRC username is displayed on welcome page
	And user clicks on submit new disclosure service
    When the user enters all below mandatory customer details on the customer search page
    And the HMRC user clicks on next button
    Then the HMRC user will be presented with more details page
