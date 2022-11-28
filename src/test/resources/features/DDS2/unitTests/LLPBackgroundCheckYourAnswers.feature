@page @regression
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

    @smoke
  Scenario: LLP - Check your answers page - Background
    Given I am on "Check Your Answers" page
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for?|A limited liability partnership|what-is-this-disclosure-about/change|
      |4|Are you a designated member of the limited liability partnership that the disclosure will be about?|No, I will be making a disclosure on behalf of a designated member|are-you-a-designated-member/change|
      |5|Are you representing an organisation?|Yes|representing-organisation/change|
      |6|Name of the organisation you represent|Organization name|representing-organisation-name/change|
      |7|Will the disclosure be about offshore liabilities?|Yes|disclose-offshore-liabilities/change|
      |8|Will the disclosure also be about onshore liabilities?|Yes|disclose-onshore-liabilities/change|

  Scenario: LLP - Background - Change route - Are you a designated member of the limited liability partnership that the disclosure will be about? from Yes to No
    Given I am on "Check Your Answers" page
    When I click on change button for "Are you a designated member of the limited liability partnership that the disclosure will be about?"
    And I select Radio Button "Yes, I am a designated member of the limited liability partnership" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    When I click on change button for "Are you a designated member of the limited liability partnership that the disclosure will be about?"
    And I select Radio Button "No, I will be making a disclosure on behalf of a designated member" at Position "2"
    And click on Save and Continue button
    And I select Yes radio button
    And click on Save and Continue button
    And I enter "New Org Name" in the TextBox field
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for?|A limited liability partnership|what-is-this-disclosure-about/change|
      |4|Are you a designated member of the limited liability partnership that the disclosure will be about?|No, I will be making a disclosure on behalf of a designated member|are-you-a-designated-member/change|
      |5|Are you representing an organisation?|Yes|representing-organisation/change|
      |6|Name of the organisation you represent|New Org Name|representing-organisation-name/change|
      |7|Will the disclosure be about offshore liabilities?|Yes|disclose-offshore-liabilities/change|
      |8|Will the disclosure also be about onshore liabilities?|Yes|disclose-onshore-liabilities/change|

  Scenario: LLP - Background - Change route - Are you a designated member of the limited liability partnership that the disclosure will be about? from No to Yes
    Given I am on "Check Your Answers" page
    When I click on change button for "Are you a designated member of the limited liability partnership that the disclosure will be about?"
    And I select Radio Button "Yes, I am a designated member of the limited liability partnership" at Position "1"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for?|A limited liability partnership|what-is-this-disclosure-about/change|
      |4|Are you a designated member of the limited liability partnership that the disclosure will be about?|Yes, I am a designated member of the limited liability partnership|are-you-a-designated-member/change|
      |5|Will the disclosure be about offshore liabilities?|Yes|disclose-offshore-liabilities/change|
      |6|Will the disclosure also be about onshore liabilities?|Yes|disclose-onshore-liabilities/change|

  Scenario: LLP - Background - Change route - Are you a designated member of the limited liability partnership that the disclosure will be about? - No change
    Given I am on "Check Your Answers" page
    When I click on change button for "Are you a designated member of the limited liability partnership that the disclosure will be about?"
    And click on Save and Continue button
    Then page navigates to "Check Your Answers"
    And answers page should have h2 header "Background"
    And Background section has following
      |Line|Label|Answer|URL|
      |1|Will you be making a disclosure because you received a letter from HMRC?|Yes|letter-from-hmrc/change|
      |2|Letter reference number|CFSS-1234567|hmrc-letter-reference/change|
      |3|Who this disclosure is for?|A limited liability partnership|what-is-this-disclosure-about/change|
      |4|Are you a designated member of the limited liability partnership that the disclosure will be about?|No, I will be making a disclosure on behalf of a designated member|are-you-a-designated-member/change|
      |5|Are you representing an organisation?|Yes|representing-organisation/change|
      |6|Name of the organisation you represent|Organization name|representing-organisation-name/change|
      |7|Will the disclosure be about offshore liabilities?|Yes|disclose-offshore-liabilities/change|
      |8|Will the disclosure also be about onshore liabilities?|Yes|disclose-onshore-liabilities/change|