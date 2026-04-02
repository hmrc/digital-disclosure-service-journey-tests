/*
 * Copyright 2026 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.specs

import uk.gov.hmrc.specsteps.AreYouRepresentingOrganisationStepDefSteps.givenINavigateToStringPage
import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.{thenPageHeadingContainsString, whenClickOnHyperlinkString, whenClickOnIConfirmButton, whenISelectCheckboxStringAtPositionString, whenISelectRadioButtonStringAtPositionString}
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{SendNotification, clickOnCheckBox, clickOnLink, clickOnRadioButton, enterInputInTextBox, saveAndContinue, verifyPageHeading, whenIClickOnTheHyperlinkWithTextString}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.OffshoreDisclosureStepDefSteps.{whenIClickOnMakeADisclosureButton, whenIEnterCountryOrTerritoryStringAndSelectString, whenIEnterStringInTheTextArea, whenINavigateToStringSpecificPage}
import uk.gov.hmrc.specsteps.OnshoreDisclosureStepDefSteps.enterTextInTextArea
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.{givenIAmNavigatedToReceivedALetterPage, thenISelectNoRadioButton, whenClickOnSaveAndContinueButton, whenISelectYesRadioButton}
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps.{enterInputInDOBPage, whenIEnterStringInTheStringTextBoxField}
import uk.gov.hmrc.specsteps.WhatIsYourMainOccupationStepDefSteps.thenIEnterStringInTheTextBoxField

class CompanyOffshoreDisclosureSpec extends BaseSpec {

  Feature("A Company tax payer is able to notify and submit offshore disclosure") {

    Scenario("Company - On Behalf of - complete offshore with no reasonable excuse disclosure journey") {

      Given("I am navigated to Received A Letter Page")
        givenIAmNavigatedToReceivedALetterPage()

      Then("I select Radio Button Yes at Position 1")
        whenISelectRadioButtonStringAtPositionString("Yes","1")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I enter CFSS-1234567" in the TextBox field""")
        enterInputInTextBox("CFSS-1234567")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I select Radio Button A company at Position 3""")
        clickOnRadioButton("A company","3")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I select Radio Button I am an accountant or tax agent at Position 2""")
        clickOnRadioButton("I am an accountant or tax agent","2")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I select Radio Button Yes at Position 1""")
        clickOnRadioButton("Yes","1")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""And I enter Organization name in the TextBox field""")
        enterInputInTextBox("Organization name")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I select Radio Button Yes at Position 1""")
        clickOnRadioButton("Yes","1")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I select Radio Button Yes at Position 1""")
        clickOnRadioButton("Yes","1")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""And I select Checkbox Self-employment income" at Position 5""")
        clickOnCheckBox("Self-employment income", "5")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I enter Company name in the TextBox field""")
        enterInputInTextBox("Company name")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I enter 12345678 in the TextBox field""")
        enterInputInTextBox("12345678")

      And("""click on Save and Continue button""")
        saveAndContinue()

      When("""And enter country name United Kingdom, then select country United Kingdom""")
        enterInputInTextBox("United Kingdom")
        selectfromDropdown("United Kingdom")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""And I click on the hyperlink with text Enter the address manually""")
        clickOnLink("Enter the address manually")

      And("""I enter The Farm in the Address line 1 field""")
        enterInputInManualAddressPage("The Farm", "Address line 1")

      And("""I enter Royal Madeuptown in the Town or city field""")
        enterInputInManualAddressPage("Royal Madeuptown", "Town or city")

      And("""I enter ZZ9Z 9TT in the Postcode field""")
        enterInputInManualAddressPage("ZZ9Z 9TT", "Postcode")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""click on confirm button""")
        saveAndContinue()

      Then("""I enter Agent full name in the TextBox field""")
        enterInputInTextBox("Agent full name")

      And("""click on Save and Continue button""")
        saveAndContinue()

      When("""I select Checkbox Email at Position 1""")
        clickOnCheckBox("Email", "1")

      Then("""I select Checkbox Telephone at Position 2""")
        clickOnCheckBox("Telephone", "2")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I enter abc@abc.com in the TextBox field""")
        enterInputInTextBox("abc@abc.com")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I enter 07777 777777 in the TextBox field""")
        enterInputInTextBox("07777 777777")

      And("""click on Save and Continue button""")
        saveAndContinue()

      When("""enter country name United Kingdom, then select country United Kingdom""")
        enterInputInTextBox("United Kingdom")
        selectfromDropdown("United Kingdom")

      And("""click on Save and Continue button""")
        saveAndContinue()

      When("""I click on the hyperlink with text Enter the address manually """)
        clickOnLink("Enter the address manually")

      Then("""I enter 1 Testing Lane in the Address line 1 field""")
        enterInputInManualAddressPage("1 Testing Lane", "Address line 1")

      And("""I enter Royal Madeuptown in the Town or city field""")
        enterInputInManualAddressPage("Royal Madeuptown", "Town or city")

      And("""I enter ZZ9Z 9TT in the Postcode field""")
        enterInputInManualAddressPage("ZZ9Z 9TT", "Postcode")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""click on confirm button""")
        saveAndContinue()

      And("""I click on send notification button""")
        SendNotification()

      Then("""I am on You have sent the notification page""")
        verifyPageHeading("You have sent the notification")

      When("I navigate to make-a-disclosure specific page")
        whenINavigateToStringSpecificPage("make-a-disclosure")

      Then("page heading contains You sent a notification on")
        // Possible match (best=0.52)
        thenPageHeadingContainsString("You sent a notification on")

      When("I click on Make a disclosure button")
        whenIClickOnMakeADisclosureButton()

      Then("page navigates to List of tasks - Tell HMRC about underpaid tax from previous years")
        givenINavigateToStringPage("List of tasks - Tell HMRC about underpaid tax from previous years")

      And("click on Hyperlink Make your declaration")
        whenClickOnHyperlinkString("Make your declaration")

      And("click on I confirm button")
        whenClickOnIConfirmButton()

      When("I click on the hyperlink with text Add offshore liability details")
        whenIClickOnTheHyperlinkWithTextString("Add offshore liability details")

      And("I select Checkbox The company did not notify HMRC about a tax liability at Position 1")
        whenISelectCheckboxStringAtPositionString("The company did not notify HMRC about a tax liability", "1")

      And("I select Checkbox The company did not file a tax return on time at Position 2")
        whenISelectCheckboxStringAtPositionString("The company did not file a tax return on time", "2")

      And("I select Checkbox The company submitted an inaccurate return at Position 3")
        whenISelectCheckboxStringAtPositionString("The company submitted an inaccurate return", "3")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to Why the company did not notify HMRC about a tax liability")
        verifyPageHeading("Why the company did not notify HMRC about a tax liability")

      And("I select Checkbox This was not deliberate, but they do not have a reasonable excuse at Position 1")
        whenISelectCheckboxStringAtPositionString("This was not deliberate, but they do not have a reasonable excuse", "1")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to Why the company did not file a return on time")
      verifyPageHeading("Why the company did not file a return on time")

      And("I select Checkbox They did not file a return but did not withhold any information on purpose at Position 1")
        whenISelectCheckboxStringAtPositionString("They did not file a return but did not withhold any information on purpose", "1")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to Why the company submitted an inaccurate return")
        verifyPageHeading("Why the company submitted an inaccurate return")

      And("I select Checkbox They did not take reasonable care at Position 1")
        whenISelectCheckboxStringAtPositionString("They did not take reasonable care", "1")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to Which year does this offshore disclosure relate to?")
        verifyPageHeading("Which year does this offshore disclosure relate to?")

      And("I select Checkbox 6 April 2023 to 5 April 2024 at Position 1")
        whenISelectCheckboxStringAtPositionString("6 April 2023 to 5 April 2024", "1")

      And("I select Checkbox 6 April 2021 to 5 April 2022 at Position 3")
        whenISelectCheckboxStringAtPositionString("6 April 2021 to 5 April 2022", "3")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to You have not included the tax year ending 2023")
        verifyPageHeading("You have not included the tax year ending 2023")

      And("I enter Reason for including year in the disclosure in the text area")
        enterTextInTextArea("Reason for including year in the disclosure")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      When("I enter country or territory United Arab Emirates and select United Arab Emirates")
        whenIEnterCountryOrTerritoryStringAndSelectString("United Arab Emirates", "United Arab Emirates")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes at Position 1")
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      And("I enter country or territory Australia and select Australia")
        whenIEnterCountryOrTerritoryStringAndSelectString("Australia", "Australia")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button No at Position 2")
        thenISelectNoRadioButton()

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to Offshore liabilities — Tax year 6 April 2023 to 5 April 2024")
        verifyPageHeading("Offshore liabilities — Tax year 6 April 2023 to 5 April 2024")

      And("I enter 10 in the income text box field")
        whenIEnterStringInTheStringTextBoxField("10", "income")

      And("I enter 20 in the chargeableTransfers text box field")
        whenIEnterStringInTheStringTextBoxField("20", "chargeableTransfers")

      And("I enter 30 in the capitalGains text box field")
        whenIEnterStringInTheStringTextBoxField("30", "capitalGains")

      And("I enter 40 in the unpaidTax text box field")
        whenIEnterStringInTheStringTextBoxField("40", "unpaidTax")

      And("I enter 50 in the interest text box field")
        whenIEnterStringInTheStringTextBoxField("50", "interest")

      And("I enter 50 in the penaltyRate text box field")
        whenIEnterStringInTheStringTextBoxField("50", "penaltyRate")

      And("I enter undeclaredIncomeOrGain in the undeclaredIncomeOrGain text box field")
        whenIEnterStringInTheStringTextBoxField("undeclaredIncomeOrGain", "undeclaredIncomeOrGain")

      And("I enter Penalty Rate Reason for year 2021 in the penaltyRateReason text box field")
        enterInputInDOBPage("Penalty Rate Reason for year 2021","penaltyRateReason")

      And("I select Radio Button Yes at Position 1")
      clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to How much foreign tax credit relief have you deducted from your calculations for the tax year ending 2024, in pounds?")
        verifyPageHeading("How much foreign tax credit relief have you deducted from your calculations for the tax year ending 2024, in pounds?")

      And("I enter 10 in the TextBox field")
        thenIEnterStringInTheTextBoxField("10")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to Offshore liabilities — Tax year 6 April 2021 to 5 April 2022")
        verifyPageHeading("Offshore liabilities — Tax year 6 April 2021 to 5 April 2022")

      And("I enter 70 in the income text box field")
        whenIEnterStringInTheStringTextBoxField("70", "income")

      And("I enter 80 in the chargeableTransfers text box field")
        whenIEnterStringInTheStringTextBoxField("80", "chargeableTransfers")

      And("I enter 90 in the capitalGains text box field")
        whenIEnterStringInTheStringTextBoxField("90", "capitalGains")

      And("I enter 10 in the unpaidTax text box field")
        whenIEnterStringInTheStringTextBoxField("10", "unpaidTax")

      And("I enter 20 in the interest text box field")
        whenIEnterStringInTheStringTextBoxField("20", "interest")

      And("I enter 30 in the penaltyRate text box field")
        whenIEnterStringInTheStringTextBoxField("30", "penaltyRate")

      And("I enter undeclaredIncomeOrGain in the undeclaredIncomeOrGain text box field")
        whenIEnterStringInTheStringTextBoxField("undeclaredIncomeOrGain", "undeclaredIncomeOrGain")

      And("I enter Penalty Rate Reason for year 2020 in the penaltyRateReason text box field")
        whenIEnterStringInTheStringTextBoxField("Penalty Rate Reason for year 2021","penaltyRateReason")

      And("I select Radio Button No at Position 2")
        clickOnRadioButton("No","2")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to Your legal interpretation")
        verifyPageHeading("page navigates to Your legal interpretation")

      And("I select Checkbox Another issue at Position 9")
        whenISelectCheckboxStringAtPositionString("Another issue", "9")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to Under what consideration of the law led you to not include some tax in this disclosure?")
        verifyPageHeading("page navigates to Under what consideration of the law led you to not include some tax in this disclosure?")

      And("I enter consideration of the law in the text area")
        whenIEnterStringInTheTextArea("consideration of the law")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to How much tax has not been included in this disclosure as a result of your interpretation?")
       verifyPageHeading("How much tax has not been included in this disclosure as a result of your interpretation??")

      And("I select Radio Button £10,000 or less at Position 1")
        clickOnRadioButton("£10,000 or less","1")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to What was the maximum value of all assets held outside the UK at any point over the last 5 years?")
        verifyPageHeading("What was the maximum value of all assets held outside the UK at any point over the last 5 years?")

      And("I select Radio Button Between £1 million and £100 million at Position 3")
        clickOnRadioButton("Between £1 million and £100 million","3")

      And("click on Save and Continue button")
        whenClickOnSaveAndContinueButton()

      Then("page navigates to Offshore liabilities summary")
        verifyPageHeading("page navigates to Offshore liabilities summary")
    }
  }
}
