@page
Feature: A UK tax payer is able to navigate to Home page and continue to the next page

  Scenario: Home Page - Validate the static content of the page
    Given I am on the Home page
    Then the page title should be "Digital Disclosure Service - Digital Disclosure Service - GOV.UK"
    And first heading should be "Digital Disclosure Service"
    And first paragraph should be "You can tell us about undisclosed income you need to pay tax on for any years between the tax years ending 2003 and 2021. However, if you have been sent a tax return for any year from the tax year ending 2019 which is still outstanding, you must complete it as normal – do not include the tax from these tax years in this disclosure."
    And second paragraph should be "If you need to pay tax you owe from previous years (by making a ‘disclosure’), you need to make HMRC aware of this first."
    And third paragraph should be "To do this, you can either:"
    And bullet Text "call the HMRC helpline (opens in new tab)" is displayed at position "1"
    And bullet Text "use this service to make a ‘notification’, providing a few basic details" is displayed at position "2"
    And second heading should be "Before you start"
    And fourth paragraph should be "You can also use this service to make a disclosure."
    And fifth paragraph should be "Read the guidance on making a disclosure (opens in new tab) before using this online service. This explains how to prepare your disclosure and what to expect."
    And sixth paragraph should be "The guidance will also explain if you need to use a different, more appropriate service instead, for example using the Contractual Disclosure Facility if you have deliberate behaviour to disclose (opens in new tab)"
    And seventh paragraph should be "You can authorise someone else to deal with HMRC for you (opens in new tab), for example an accountant, friend or relative."
    And third heading should be "What you will need to complete your disclosure"
    And bullet Text "figures for the tax, interest and penalty due on any onshore or offshore income. Find help on how to calculate these figures in the guidance on making a voluntary disclosure (opens in new tab)" is displayed at position "3"
    And bullet Text "relevant numbers such as National Insurance number, VAT registration number and Unique Taxpayer Reference number" is displayed at position "4"
    And bullet Text "any other reference numbers you might have received from HMRC about unpaid tax, such as a case reference" is displayed at position "5"

  Scenario: Home Page - Hyperlink Navigation Let us know as soon as possible
    Given I am on the Home page
    When I click on the hyperlink with text "call the HMRC helpline (opens in new tab)"
    Then I am navigated to new tab with page title "How to make a voluntary disclosure to HMRC - GOV.UK"

  Scenario: Home Page - Hyperlink Navigation Read the guidance
    Given I am on the Home page
    When I click on the hyperlink with text "Read the guidance on making a disclosure (opens in new tab)"
    Then I am navigated to new tab with page title "How to make a voluntary disclosure to HMRC - GOV.UK"

  Scenario: Home Page - Hyperlink Navigation authorise someone else
    Given I am on the Home page
    When I click on the hyperlink with text "authorise someone else to deal with HMRC for you (opens in new tab)"
    Then I am navigated to new tab with page title "Appoint someone to deal with HMRC on your behalf - GOV.UK"

  Scenario: Home Page - Hyperlink Navigation how to calculate
    Given I am on the Home page
    When I click on the hyperlink with text "how to calculate these figures in the guidance on making a voluntary disclosure (opens in new tab)"
    Then I am navigated to new tab with page title "How to make a voluntary disclosure to HMRC - GOV.UK"

  Scenario: Home Page - Continue takes to the first question
    Given I am on the Home page
    When I click on continue button
    Then I am navigated to page with title "Using this service - Digital Disclosure Service - GOV.UK"



