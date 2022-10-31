@page
Feature: A UK tax payer is able to navigate to Home page and continue to the next page

  Scenario: Home Page - Validate the static content of the page
    Given I am on the Home page
    Then the page title should be "Digital Disclosure Service - Digital Disclosure Service - GOV.UK"
    And first heading should be "Digital Disclosure Service"
    And first paragraph should be "You can tell us about undisclosed income you need to pay tax on for any years between the tax years ending 2003 and 2021. However, if you have been sent a tax return for any year from the tax year ending 2019 which is still outstanding, you must complete it as normal – do not include the tax from these tax years in this disclosure."
    And second paragraph should be "You’ll first need to tell (notify) us that you’re going to pay HMRC the tax, interest and penalties you owe (make a disclosure). We will then write to you with specific reference numbers which are needed for making your full disclosure by using this service again."
    And third paragraph should be "You will also be asked to pay the full amount due at the same time as making your disclosure. If you cannot pay the full amount, let us know as soon as possible and before you send in your disclosure by calling the helpline (opens in a new tab)"
    And second heading should be "Before you start"
    And fourth paragraph should be "Read the guidance on making a disclosure (opens in a new tab) before using this online service. This explains how to prepare your disclosure and what to expect."
    And fifth paragraph should be "You can authorise someone else to deal with HMRC for you (opens in a new tab), for example an accountant, friend or relative."
    And third heading should be "What you will need to complete your disclosure"
    And bullet Text "figures for the tax, interest and penalty due on any sources of onshore or offshore income. Find help on how to calculate these figures in the guidance on making a voluntary disclosure (opens in a new tab)" is displayed at position "1"
    And bullet Text "a disclosure reference number" is displayed at position "2"
    And bullet Text "other relevant numbers such as National Insurance number, VAT registration number and Unique Taxpayer Reference number" is displayed at position "3"
    And bullet Text "any other reference numbers you might have received from HMRC about unpaid tax" is displayed at position "4"

  Scenario: Home Page - Hyperlink Navigation Let us know as soon as possible
    Given I am on the Home page
    When I click on the hyperlink with text "let us know as soon as possible and before you send in your disclosure by calling the helpline (opens in a new tab)"
    Then I am navigated to new tab with page title "How to make a voluntary disclosure to HMRC - GOV.UK"

  Scenario: Home Page - Hyperlink Navigation Read the guidance
    Given I am on the Home page
    When I click on the hyperlink with text "Read the guidance on making a disclosure (opens in a new tab)"
    Then I am navigated to new tab with page title "How to make a voluntary disclosure to HMRC - GOV.UK"

  Scenario: Home Page - Hyperlink Navigation authorise someone else
    Given I am on the Home page
    When I click on the hyperlink with text "authorise someone else to deal with HMRC for you (opens in a new tab)"
    Then I am navigated to new tab with page title "Appoint someone to deal with HMRC on your behalf - GOV.UK"

  Scenario: Home Page - Hyperlink Navigation how to calculate
    Given I am on the Home page
    When I click on the hyperlink with text "how to calculate these figures in the guidance on making a voluntary disclosure (opens in a new tab)"
    Then I am navigated to new tab with page title "How to make a voluntary disclosure to HMRC - GOV.UK"

  Scenario: Home Page - Hyperlink Navigation authorise someone else
    Given I am on the Home page
    When I click on the hyperlink with text "authorise someone else to deal with HMRC for you (opens in a new tab)"
    Then I am navigated to new tab with page title "Appoint someone to deal with HMRC on your behalf - GOV.UK"

  Scenario: Home Page - Continue takes to the first question
    Given I am on the Home page
    When I click on continue button
    Then I am navigated to page with title "Are you making a disclosure because you have received a letter from HMRC? - Digital Disclosure Service - GOV.UK"



