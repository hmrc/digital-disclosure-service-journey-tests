Feature: A UK tax payer is able to submit high confidence level & valid NINO to navigate to start page

  Scenario: Home Page - Navigation - Individual with 250 confidence level and valid NINO is redirected to start page
    Given I navigate to authority wizard page
    When I select "250" from drop down "confidenceLevel"
    And I select "Individual" from drop down "affinityGroupSelect"
    And enter NINO "AB123456A"
    And click on submit button
    Then user is navigated to the page with title "Digital Disclosure Service"
    Then the page title should be "Digital Disclosure Service - Digital Disclosure Service - GOV.UK"


  Scenario: Home Page - Navigation - Individual with 50 confidence level and no NINO is redirected to Identity Verification page
    Given I navigate to authority wizard page
    When I select "50" from drop down "confidenceLevel"
    And I select "Individual" from drop down "affinityGroupSelect"
    And click on submit button
    Then user is navigated to the page with title "Identity Verification Stub"
    Then the page title should be "Identity Verification - Stubbed Journey configuration"

  Scenario Outline: Home Page - Navigation - Individual with less than 250 confidence level and valid NINO is redirected to Identity Verification journey
    Given I navigate to authority wizard page
    When I select <Value> from drop down "confidenceLevel"
    And I select "Individual" from drop down "affinityGroupSelect"
    And enter NINO "AB123456A"
    And click on submit button
    Then user is navigated to the page with title "Identity Verification Stub"
    Then the page title should be "Identity Verification - Stubbed Journey configuration"
    Examples:
      | Value |
      |  "50" |
      | "200" |


  Scenario Outline: Home Page - Navigation - Agent with 250 confidence level or less and no NINO is redirected to DDS start page
    Given I navigate to authority wizard page
    When I select <Value> from drop down "confidenceLevel"
    And I select "Agent" from drop down "affinityGroupSelect"
    And click on submit button
    Then user is navigated to the page with title "Digital Disclosure Service"
    Then the page title should be "Digital Disclosure Service - Digital Disclosure Service - GOV.UK"
    Examples:
      | Value |
      |  "50" |
      | "200" |
      | "250" |

  Scenario Outline: Home Page - Navigation - Organisation with 250 confidence level or less and valid NINO is redirected to DDS start page
    Given I navigate to authority wizard page
    When I select <Value> from drop down "confidenceLevel"
    And I select "Organisation" from drop down "affinityGroupSelect"
    And enter NINO "AB123456A"
    And click on submit button
    Then user is navigated to the page with title "Digital Disclosure Service"
    Then the page title should be "Digital Disclosure Service - Digital Disclosure Service - GOV.UK"
    Examples:
      | Value |
      |  "50" |
      | "200" |
      | "200" |

  Scenario Outline: Home Page - Navigation - Organisation with 250 confidence level or less and no NINO is redirected to DDS start page
    Given I navigate to authority wizard page
    When I select <Value> from drop down "confidenceLevel"
    And I select "Organisation" from drop down "affinityGroupSelect"
    And click on submit button
    Then user is navigated to the page with title "Digital Disclosure Service"
    Then the page title should be "Digital Disclosure Service - Digital Disclosure Service - GOV.UK"
    Examples:
      | Value  |
      |   "50" |
      |  "200" |
      |  "250" |

