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

import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.clickOnHyperlinkText
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{SendNotification, clickOnCheckBox, clickOnLink, clickOnRadioButton, enterInputInTextBox, iConfirmButton, makeADisclosure, navigateToSpecificPage, navigateToSpecificURL, saveAndContinue, sendOfferAndDisclosure, verifyDisplayedCheckbox, verifyPageHeading, verifySubmittedCaseRef}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.OnshoreDisclosureStepDefSteps.{checkTaskStatus, continueButtonOnSummaryPage, enterCountry, enterTextInDescription, enterTextInExcuse, enterTextInReasonableCare, enterTextInReasonableExcuse, enterTextInTextArea, enterValueInStopDay, enterValueInStopMonth, enterValueInStopYear, enterValueInwhatHasHappenedToPropertyTextArea, selectFromCountryDropdown}
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps.enterInputInDOBPage

class IndividualSendOffshoreOnshoreDisclosureSpec extends BaseSpec {

  Feature("An Individual - On behalf of - is able to notify and submit offshore disclosure") {

    Scenario("Individual -Complete flow - Onshore & offshore - Letting income") {
      Given("I am navigated to Received A Letter Page")
       navigateToSpecificPage("")

      When("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I enter CFSS-1234567 in the TextBox field")
       enterInputInTextBox("CFSS-1234567")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I select Radio Button An individual at Position 1")
       clickOnRadioButton("An individual","1")

      And("click on Save and Continue button")
        saveAndContinue()

      And("I select Radio Button I am an accountant or tax agent at Position 2")
       clickOnRadioButton("I am an accountant or tax agent","2")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I enter represent org in the TextBox field")
       enterInputInTextBox("represent org")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I select Checkbox Let property income at Position 3")
        clickOnCheckBox("Let property income", "3")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I enter Individual full name in the TextBox field")
        enterInputInTextBox("Individual full name")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I enter 01 in the Day text box field")
        enterInputInDOBPage("01","Day")

      And("I enter 01 in the Month text box field")
        enterInputInDOBPage("01","Month")

      And("I enter 1980 in the Year text box field")
        enterInputInDOBPage("1980","Year")

      And("click on Save and Continue button")
        saveAndContinue()

      And("I enter Dentist in the TextBox field")
       enterInputInTextBox("Dentist")

      And("click on Save and Continue button")
        saveAndContinue()

      And("I select Radio Button No at Position 3")
       clickOnRadioButton("No","3")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I select Radio Button No at Position 3")
       clickOnRadioButton("No","3")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I select Radio Button No at Position 3")
       clickOnRadioButton("No","3")

      And("click on Save and Continue button")
       saveAndContinue()

      And("enter country name United Kingdom,select country United Kingdom")
       enterInputInTextBox("United Kingdom")
       selectfromDropdown("United Kingdom")

      And("click on continue button")
       saveAndContinue()

      And("I click on the hyperlink with text Enter the address manually")
       clickOnLink("Enter the address manually")

      And("I enter The Farm in the Address line 1 field")
       enterInputInManualAddressPage("The Farm","Address line 1")

      And("I enter Royal Madeuptown in the Town or city field")
       enterInputInManualAddressPage("Royal Madeuptown","Town or city")

      And("I enter ZZ9Z 9TT in the Postcode field")
       enterInputInManualAddressPage("ZZ9Z 9TT","Postcode")

      And("click on Save and Continue button")
        saveAndContinue()

      And("click on confirm button")
       saveAndContinue()

      And("I enter Agent full name in the TextBox field")
       enterInputInTextBox("Agent full name")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I select Checkbox Email at Position 1")
       clickOnCheckBox("Email", "1")

      And("I select Checkbox Telephone at Position 2")
        clickOnCheckBox("Telephone", "2")

      And("click on Save and Continue button")
        saveAndContinue()

      And("I enter abc@abc.com in the TextBox field")
       enterInputInTextBox("abc@abc.com")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I enter 07777 777777 in the TextBox field")
        enterInputInTextBox("07777 777777")

      And("click on Save and Continue button")
       saveAndContinue()

      And("enter country name United Kingdom,select country United Kingdom")
       enterInputInTextBox("United Kingdom")
       selectfromDropdown("United Kingdom")

      And("click on continue button")
       saveAndContinue()

      And("I click on the hyperlink with text Enter the address manually")
       clickOnLink("Enter the address manually")

      And("I enter 1 Testing Lane in the Address line 1 field")
       enterInputInManualAddressPage("1 Testing Lane","Address line 1")

      And("I enter Royal Madeuptown in the Town or city field")
       enterInputInManualAddressPage("Royal Madeuptown","Town or city")

      And("I enter ZZ9Z 9TT in the Postcode field")
       enterInputInManualAddressPage("ZZ9Z 9TT","Postcode")

      And("click on Save and Continue button")
       saveAndContinue()

      And("click on confirm button")
       saveAndContinue()

      And("I click on send notification button")
       SendNotification()

      When("I am on You have sent the notification page")
       verifyPageHeading("You have sent the notification")

      And("I navigate to make-a-disclosure specific page")
       navigateToSpecificURL("make-a-disclosure")

      When("I click on Make a disclosure button")
        makeADisclosure()

      And("click on Hyperlink Make your declaration")
       clickOnHyperlinkText("Make your declaration")

      And("click on I confirm button")
       iConfirmButton()

      Then("page navigates to List of tasks")
        verifyPageHeading("List of tasks")

      And("status is marked as Completed for field Review your declaration")
       checkTaskStatus("Completed", "Review your declaration")

      And("status is marked as Not started for field Add offshore liability details")
        checkTaskStatus("Not started", "Add offshore liability details")

      And("click on Hyperlink Add offshore liability details")
        clickOnHyperlinkText("Add offshore liability details")

      Then("page navigates to Why you are making this disclosure")
        verifyPageHeading("Why you are making this disclosure")

      And("I select Checkbox The individual did not notify HMRC about a tax liability at Position 1")
       clickOnCheckBox("The individual did not notify HMRC about a tax liability", "1")

      And("I select Checkbox The individual did not file a tax return on time at Position 2")
        clickOnCheckBox("The individual did not file a tax return on time", "2")

      And("I select Checkbox The individual submitted an inaccurate return at Position 3")
       clickOnCheckBox("The individual submitted an inaccurate return", "3")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the individual did not notify HMRC about a tax liability")
       verifyPageHeading("Why the individual did not notify HMRC about a tax liability")

      And("I select Checkbox They deliberately failed to notify HMRC of a tax liability at Position 3")
       clickOnCheckBox("They deliberately failed to notify HMRC of a tax liability", "3")

      And("I select Checkbox They have a reasonable excuse at Position 2")
       clickOnCheckBox("They have a reasonable excuse", "2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the individual did not file a return on time")
        verifyPageHeading("Why the individual did not file a return on time")

      And("I select Checkbox They have a reasonable excuse at Position 2")
       clickOnCheckBox("They have a reasonable excuse", "2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the individual submitted an inaccurate return")
       verifyPageHeading("Why the individual submitted an inaccurate return")

      And("I select Checkbox They took reasonable care but made a mistake at Position 2")
       clickOnCheckBox("They took reasonable care but made a mistake", "2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Contractual Disclosure Facility")
       verifyPageHeading("Contractual Disclosure Facility")

      When("I select Radio Button Continue using this digital disclosure service at Position 1")
       clickOnRadioButton("Continue using this digital disclosure service","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Reasonable excuse for not notifying HMRC about a tax liability")
        verifyPageHeading("Reasonable excuse for not notifying HMRC about a tax liability")

      And("I enter Reasonable excuse in the reason for excuse text area")
        enterTextInExcuse("Reasonable excuse")

      And("I enter tax year ending 2020 in the Which tax years does this apply to?for not notifying HMRC text box field")
       enterInputInDOBPage("tax year ending 2020","Which tax years does this apply to?for not notifying HMRC")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Reasonable excuse for not filing a return")
        verifyPageHeading("Reasonable excuse for not filing a return")

      And("I enter Reasonable excuse in the reason for reasonable excuse text area")
        enterTextInReasonableExcuse("Reasonable excuse")

      And("I enter tax year ending 2020 in the Which tax years does this apply to? text box field")
       enterInputInDOBPage("tax year ending 2020","Which tax years does this apply to?")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What reasonable care was taken when submitting the inaccurate return?")
       verifyPageHeading("What reasonable care was taken when submitting the inaccurate return?")

      And("I enter Reasonable care in the reasonable care text area")
       enterTextInReasonableCare("Reasonable care")

      And("I enter tax year ending 2020 in the Which tax years does this apply to? text box field")
       enterInputInDOBPage("tax year ending 2020","Which tax years does this apply to?")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Which year does this offshore disclosure relate to?")
       verifyPageHeading("Which year does this offshore disclosure relate to?")

      And("page should display checkboxes for the 20 tax years before the current tax year")
        verifyDisplayedCheckbox("20")

      And("I select Checkbox 6 April 2024 to 5 April 2025 at Position 1")
       clickOnCheckBox("6 April 2024 to 5 April 2025", "1")

      And("I select Checkbox 6 April 2022 to 5 April 2023 at Position 3")
        clickOnCheckBox("6 April 2022 to 5 April 2023", "3")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to You have not included the tax year ending 2024")
       verifyPageHeading("You have not included the tax year ending 2024")

      And("I enter Reason for including year in the disclosure in the text area")
        enterTextInTextArea("Reason for including year in the disclosure")

      And("click on Save and Continue button")
        saveAndContinue()

      When("I enter country or territory United Arab Emirates and select United Arab Emirates")
       enterCountry("United Arab Emirates")
       selectFromCountryDropdown("United Arab Emirates")

      And("click on Save and Continue button")
        saveAndContinue()

      And("I select Radio Button No at Position 2")
        clickOnRadioButton("No","2")

      And("click on Save and Continue button")
        saveAndContinue()

      Then("page navigates to Offshore liabilities — Tax year 6 April 2024 to 5 April 2025")
       verifyPageHeading("Offshore liabilities — Tax year 6 April 2024 to 5 April 2025")

      And("I enter 10 in the income text box field")
       enterInputInDOBPage("10", "income")

      And("I enter 20 in the chargeableTransfers text box field")
       enterInputInDOBPage("20", "chargeableTransfers")

      And("I enter 30 in the capitalGains text box field")
       enterInputInDOBPage("30", "capitalGains")

      And("I enter 40 in the unpaidTax text box field")
       enterInputInDOBPage("40", "unpaidTax")

      And("I enter 50 in the interest text box field")
       enterInputInDOBPage("50", "interest")

      And("I enter 50 in the penaltyRate text box field")
       enterInputInDOBPage("50", "penaltyRate")

      And("I enter Penalty Rate Reason for year 2024 in the penaltyRateReason text box field")
       enterInputInDOBPage("Penalty Rate Reason for year 2024","penaltyRateReason")

      And("I enter undeclaredIncomeOrGain in the undeclaredIncomeOrGain text box field")
       enterInputInDOBPage("undeclaredIncomeOrGain", "undeclaredIncomeOrGain")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to How much foreign tax credit relief have you deducted from your calculations for the tax year ending 2025, in pounds?")
        verifyPageHeading("How much foreign tax credit relief have you deducted from your calculations for the tax year ending 2025, in pounds?")

      And("I enter 10 in the TextBox field")
       enterInputInTextBox("10")

      And("click on Save and Continue button")
        saveAndContinue()

      Then("page navigates to Offshore liabilities — Tax year 6 April 2022 to 5 April 2023")
       verifyPageHeading("Offshore liabilities — Tax year 6 April 2022 to 5 April 2023")

      And("I enter 70 in the income text box field")
       enterInputInDOBPage("70", "income")

      And("I enter 80 in the chargeableTransfers text box field")
       enterInputInDOBPage("80", "chargeableTransfers")

      And("I enter 90 in the capitalGains text box field")
       enterInputInDOBPage("90", "capitalGains")

      And("I enter 10 in the unpaidTax text box field")
       enterInputInDOBPage("10", "unpaidTax")

      And("I enter 20 in the interest text box field")
       enterInputInDOBPage("20", "interest")

      And("I enter 30 in the penaltyRate text box field")
       enterInputInDOBPage("30", "penaltyRate")

      And("I enter Penalty Rate Reason for year 2019 in the penaltyRateReason text box field")
       enterInputInDOBPage("Penalty Rate Reason for year 2019","penaltyRateReason")

      And("I enter undeclaredIncomeOrGain in the undeclaredIncomeOrGain text box field")
       enterInputInDOBPage("undeclaredIncomeOrGain", "undeclaredIncomeOrGain")

      And("I select Radio Button No at Position 2")
       clickOnRadioButton("No","2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Your legal interpretation")
       verifyPageHeading("Your legal interpretation")

      And("I select Checkbox Another issue at Position 9")
       clickOnCheckBox("Another issue", "9")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Under what consideration of the law led you to not include some tax in this disclosure?")
       verifyPageHeading("Under what consideration of the law led you to not include some tax in this disclosure?")

      And("I enter consideration of the law in the text area")
       enterTextInTextArea("consideration of the law")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to How much tax has not been included in this disclosure as a result of your interpretation?")
       verifyPageHeading("How much tax has not been included in this disclosure as a result of your interpretation?")

      And("I select Radio Button £10,000 or less at Position 1")
       clickOnRadioButton("£10,000 or less","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What was the maximum value of all assets held outside the UK at any point over the last 5 years?")
       verifyPageHeading("What was the maximum value of all assets held outside the UK at any point over the last 5 years?")

      And("I select Radio Button Between £1 million and £100 million at Position 3")
       clickOnRadioButton("Between £1 million and £100 million","3")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Offshore liabilities summary")
       verifyPageHeading("Offshore liabilities summary")

      When("click on continue button")
       saveAndContinue()

      Then("page navigates to List of tasks")
       verifyPageHeading("List of tasks")

      And("status is marked as Completed for field Edit offshore liability details")
       checkTaskStatus("Completed", "Edit offshore liability details")

      And("status is marked as Not started for field Add onshore liability details")
       checkTaskStatus("Not started", "Add onshore liability details")

      And("click on Hyperlink Add onshore liability details")
       clickOnHyperlinkText("Add onshore liability details")

      Then("page navigates to Why you are making this disclosure")
       verifyPageHeading("Why you are making this disclosure")

      And("I select Checkbox The individual did not notify HMRC about a tax liability at Position 1")
       clickOnCheckBox("The individual did not notify HMRC about a tax liability", "1")

      And("I select Checkbox The individual did not file a tax return on time at Position 2")
       clickOnCheckBox("The individual did not file a tax return on time", "2")

      And("I select Checkbox The individual submitted an inaccurate return at Position 3")
       clickOnCheckBox("The individual submitted an inaccurate return", "3")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the individual did not notify HMRC about a tax liability")
       verifyPageHeading("Why the individual did not notify HMRC about a tax liability")

      And("I select Checkbox They have a reasonable excuse at Position 2")
       clickOnCheckBox("They have a reasonable excuse", "2")

      And("I select Checkbox They deliberately failed to notify HMRC of a tax liability at Position 3")
       clickOnCheckBox("They deliberately failed to notify HMRC of a tax liability", "3")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the individual did not file a return on time")
       verifyPageHeading("Why the individual did not file a return on time")

      And("I select Checkbox They have a reasonable excuse at Position 2")
       clickOnCheckBox("They have a reasonable excuse", "2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the individual submitted an inaccurate return")
       verifyPageHeading("Why the individual submitted an inaccurate return")

      And("I select Checkbox They took reasonable care but made a mistake at Position 2")
       clickOnCheckBox("They took reasonable care but made a mistake", "2")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I select Radio Button Continue using this digital disclosure service at Position 1")
       clickOnRadioButton("Continue using this digital disclosure service","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Reasonable excuse for not notifying HMRC about a tax liability")
       verifyPageHeading("Reasonable excuse for not notifying HMRC about a tax liability")

      And("I enter Reasonable excuse in the reason for excuse text area")
       enterTextInExcuse("Reasonable excuse")

      And("I enter tax year ending 2020 in the Which tax years does this apply to?for not notifying HMRC text box field")
       enterInputInDOBPage("tax year ending 2020","Which tax years does this apply to?for not notifying HMRC")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Reasonable excuse for not filing a return")
       verifyPageHeading("Reasonable excuse for not filing a return")

      And("I enter Reasonable excuse in the reason for reasonable excuse text area")
       enterTextInReasonableExcuse("Reasonable excuse")

      And("I enter tax year ending 2020 in the Which tax years does this apply to? text box field")
       enterInputInDOBPage("tax year ending 2020","Which tax years does this apply to?")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What reasonable care was taken when submitting the inaccurate return?")
       verifyPageHeading("What reasonable care was taken when submitting the inaccurate return?")

      And("I enter Reasonable care in the reasonable care text area")
       enterTextInReasonableCare("Reasonable care")

      And("I enter tax year ending 2020 in the Which tax years does this apply to? text box field")
       enterInputInDOBPage("tax year ending 2020","Which tax years does this apply to?")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What onshore liabilities do you need to disclose?")
       verifyPageHeading("What onshore liabilities do you need to disclose?")

      And("I select Checkbox Letting income from residential property or land at Position 1")
       clickOnCheckBox("Letting income from residential property or land", "1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Which year does this onshore disclosure relate to?")
       verifyPageHeading("Which year does this onshore disclosure relate to?")

      And("page should display checkboxes for the 20 tax years before the current tax year")
       verifyDisplayedCheckbox("20")

      And("I select Checkbox 6 April 2024 to 5 April 2025 at Position 1")
       clickOnCheckBox("6 April 2024 to 5 April 2025", "1")

      And("I select Checkbox 6 April 2022 to 5 April 2023 at Position 3")
       clickOnCheckBox("6 April 2022 to 5 April 2023", "3")

      And("I select Checkbox 6 April 2020 to 5 April 2021 at Position 5")
       clickOnCheckBox("6 April 2020 to 5 April 2021", "5")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to You have not selected certain years")
       verifyPageHeading("You have not selected certain years")

      When("I enter Do not want to include in yearNotSelected text box field")
       enterTextInDescription("Do not want to include")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What is the postcode and property name or number of property 1?")
       verifyPageHeading("What is the postcode and property name or number of property 1?")

      And("I click on the hyperlink with text Enter the address manually")
       clickOnLink("Enter the address manually")

      And("I enter The Farm in the Address line 1 field")
       enterInputInManualAddressPage("The Farm","Address line 1")

      And("I enter Royal Madeuptown in the Town or city field")
       enterInputInManualAddressPage("Royal Madeuptown","Town or city")

      And("I enter ZZ9Z 9TT in the Postcode field")
       enterInputInManualAddressPage("ZZ9Z 9TT","Postcode")

      And("click on Save and Continue button")
       saveAndContinue()

      And("click on confirm button")
       saveAndContinue()

      Then("page navigates to When was property 1 first let out?")
       verifyPageHeading("When was property 1 first let out?")

      And("I enter 02 in the Day text box field")
       enterInputInDOBPage("02","Day")

      And("I enter 02 in the Month text box field")
       enterInputInDOBPage("02","Month")

      And("I enter 1982 in the Year text box field")
       enterInputInDOBPage("1982","Year")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Has property 1 stopped being let out?")
       verifyPageHeading("Has property 1 stopped being let out?")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Property 1 is no longer being let out")
       verifyPageHeading("Property 1 is no longer being let out")

      And("I enter 03 in stop day text box field")
       enterValueInStopDay("03")

      And("I enter 03 in stop month text box field")
       enterValueInStopMonth("03")

      And("I enter 1993 in stop year text box field")
       enterValueInStopYear("1993")

      And("I enter Nothing 2 in whatHasHappenedToProperty text box field")
       enterValueInwhatHasHappenedToPropertyTextArea("Nothing 2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to At the time of letting, was property 1 furnished?")
       verifyPageHeading("At the time of letting, was property 1 furnished?")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Furnished Holiday Let (FHL)")
       verifyPageHeading("Furnished Holiday Let (FHL)")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to At the time of letting, was property 1 jointly owned with another person?")
       verifyPageHeading("At the time of letting, was property 1 jointly owned with another person?")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What was the percentage share of the income you received from property 1?")
       verifyPageHeading("What was the percentage share of the income you received from property 1?")

      And("I enter 5 in percentage text box field")
       enterTextInDescription("5")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to At the time of letting, did you have a mortgage on property 1?")
       verifyPageHeading("At the time of letting, did you have a mortgage on property 1?")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What type of mortgage did you have for property 1?")
       verifyPageHeading("What type of mortgage did you have for property 1?")

      And("I select Radio Button Other at Position 3")
       clickOnRadioButton("Other","3")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What was the type of mortgage you had on property 1?")
       verifyPageHeading("What was the type of mortgage you had on property 1?")

      And("I enter Type of mortgage in typeOfMortage text box field")
       enterTextInDescription("Type of mortgage")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Was a letting agent used to let out or manage property 1?")
       verifyPageHeading("Was a letting agent used to let out or manage property 1?")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Did the letting agent collect rent on your behalf?")
       verifyPageHeading("Did the letting agent collect rent on your behalf?")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Review property 1 details")
        verifyPageHeading("Review property 1 details")

      And("click on continue button")
       saveAndContinue()

      Then("page navigates to You have added 1 property")
       verifyPageHeading("You have added 1 property")

      And("I select Radio Button No at Position 2")
       clickOnRadioButton("No","2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Is the individual a member of any landlord associations?")
       verifyPageHeading("Is the individual a member of any landlord associations?")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Which landlord associations are you a member of?")
       verifyPageHeading("Which landlord associations are you a member of?")

      When("I enter landlord associations in landloard association text box field")
       enterTextInDescription("landlord associations")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to How many properties do you currently let out?")
       verifyPageHeading("How many properties do you currently let out?")

      When("I enter 2 in property count text box field")
       enterTextInDescription("2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Onshore liabilities — Tax year 6 April 2024 to 5 April 2025")
       verifyPageHeading("Onshore liabilities — Tax year 6 April 2024 to 5 April 2025")

      And("I enter 10 in the lettingIncome text box field")
       enterInputInDOBPage("10", "lettingIncome")

      And("I enter 20 in the unpaidTax text box field")
       enterInputInDOBPage("20", "unpaidTax")

      And("I enter 20 in the niContributions text box field")
       enterInputInDOBPage("20", "niContributions")

      And("I enter 50 in the interest text box field")
       enterInputInDOBPage("50", "interest")

      And("I enter 50 in the penaltyRate text box field")
       enterInputInDOBPage("50", "penaltyRate")

      And("I enter Penalty Rate Reason for year 2021 in the penaltyRateReason text box field")
       enterInputInDOBPage("Penalty Rate Reason for year 2021","penaltyRateReason")

      And("I enter undeclared Income Or Gain in the undeclaredIncomeOrGain text box field")
       enterInputInDOBPage("undeclared Income Or Gain", "undeclaredIncomeOrGain")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to How much residential finance costs were used to calculate the tax reduction for the tax year ending 2025, in pounds?")
       verifyPageHeading("How much residential finance costs were used to calculate the tax reduction for the tax year ending 2025, in pounds?")

      And("I enter 5 in the TextBox field")
       enterInputInTextBox("5")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Onshore liabilities — Tax year 6 April 2022 to 5 April 2023")
       verifyPageHeading("Onshore liabilities — Tax year 6 April 2022 to 5 April 2023")

      And("I enter 10 in the lettingIncome text box field")
       enterInputInDOBPage("10", "lettingIncome")

      And("I enter 20 in the unpaidTax text box field")
       enterInputInDOBPage("20", "unpaidTax")

      And("I enter 20 in the niContributions text box field")
       enterInputInDOBPage("20", "niContributions")

      And("I enter 50 in the interest text box field")
       enterInputInDOBPage("50", "interest")

      And("I enter 50 in the penaltyRate text box field")
       enterInputInDOBPage("50", "penaltyRate")

      And("I enter Penalty Rate Reason for year 2023 in the penaltyRateReason text box field")
       enterInputInDOBPage("Penalty Rate Reason for year 2023","penaltyRateReason")

      And("I enter undeclared Income Or Gain in the undeclaredIncomeOrGain text box field")
       enterInputInDOBPage("undeclared Income Or Gain", "undeclaredIncomeOrGain")

      And("I select Radio Button No at Position 2")
       clickOnRadioButton("No","2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Onshore liabilities — Tax year 6 April 2020 to 5 April 2021")
       verifyPageHeading("Onshore liabilities — Tax year 6 April 2020 to 5 April 2021")

      And("I enter 10 in the lettingIncome text box field")
       enterInputInDOBPage("10", "lettingIncome")

      And("I enter 20 in the unpaidTax text box field")
       enterInputInDOBPage("20", "unpaidTax")

      And("I enter 20 in the niContributions text box field")
       enterInputInDOBPage("20", "niContributions")

      And("I enter 50 in the interest text box field")
       enterInputInDOBPage("50", "interest")

      And("I enter 50 in the penaltyRate text box field")
       enterInputInDOBPage("50", "penaltyRate")

      And("I enter Penalty Rate Reason for year 2024 in the penaltyRateReason text box field")
       enterInputInDOBPage("Penalty Rate Reason for year 2024","penaltyRateReason")

      And("I enter undeclared Income Or Gain in the undeclaredIncomeOrGain text box field")
       enterInputInDOBPage("undeclared Income Or Gain", "undeclaredIncomeOrGain")

      And("I select Radio Button No at Position 2")
       clickOnRadioButton("No","2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Onshore liabilities summary")
       verifyPageHeading("Onshore liabilities summary")

      When("click on continue button")
       saveAndContinue()

      Then("page navigates to List of tasks")
       verifyPageHeading("List of tasks")

      And("status is marked as Completed for field Edit onshore liability details")
       checkTaskStatus("Completed", "Edit onshore liability details")

      Then("status is marked as Not started for field Confirm if you have other liability issues or not")
       checkTaskStatus("Not started", "Confirm if you have other liability issues or not")

      And("click on Hyperlink Confirm if you have other liability issues or not")
       clickOnHyperlinkText("Confirm if you have other liability issues or not")

      Then("page navigates to Do you have any other liability issues?")
       verifyPageHeading("Do you have any other liability issues?")

      When("I select Checkbox No, I do not have any other liability issues at Position 6")
       clickOnCheckBox("No, I do not have any other liability issues", "6")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Did the individual receive tax credits for any of the years covered by this disclosure?")
       verifyPageHeading("Did the individual receive tax credits for any of the years covered by this disclosure?")

      When("I select Radio Button No at Position 2")
       clickOnRadioButton("No","2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Review other liability issues")
       verifyPageHeading("Review other liability issues")

      When("click on continue button on summary page")
       continueButtonOnSummaryPage()

      Then("page navigates to List of tasks")
       verifyPageHeading("List of tasks")

      And("status is marked as Completed for field Edit other liability issues")
       checkTaskStatus("Completed", "Edit other liability issues")

      Then("status is marked as Not started for field Add the reason for coming forward now")
       checkTaskStatus("Not started", "Add the reason for coming forward now")

      And("click on Hyperlink Add the reason for coming forward now")
       clickOnHyperlinkText("Add the reason for coming forward now")

      Then("page navigates to Why are you making a disclosure now?")
       verifyPageHeading("Why are you making a disclosure now?")

      And("I select Checkbox Other at Position 8")
       clickOnCheckBox("Other", "8")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What is the reason for making a disclosure now?")
       verifyPageHeading("What is the reason for making a disclosure now?")

      When("I enter reason for making a disclosure now in the reason for making a disclosure now text area")
       enterTextInTextArea("reason for making a disclosure now")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why was the disclosure not made before now?")
       verifyPageHeading("Why was the disclosure not made before now?")

      When("I enter reason for why was the disclosure not made before now in the why was the disclosure not made before now text area")
       enterTextInTextArea("reason for why was the disclosure not made before now")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Did someone give the individual advice that led them to not declare these tax issues previously?")
       verifyPageHeading("Did someone give the individual advice that led them to not declare these tax issues previously?")

      When("I select Radio Button No at Position 2")
       clickOnRadioButton("No","2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Summary")
       verifyPageHeading("Summary")

      When("click on continue button")
       saveAndContinue()

      Then("page navigates to List of tasks")
       verifyPageHeading("List of tasks")

      And("status is marked as Completed for field Edit the reason for coming forward now")
       checkTaskStatus("Completed", "Edit the reason for coming forward now")

      Then("page navigates to List of tasks")
       verifyPageHeading("List of tasks")

      When("click on Save and Continue button")
       saveAndContinue()

      When("I enter 15 in the TextBox field")
       enterInputInTextBox("15")

      And("I click on Send offer and disclosure button")
       sendOfferAndDisclosure()

      Then("page navigates to You have sent your disclosure")
       verifyPageHeading("You have sent your disclosure")

      And("the case reference should be CFSS-1234567")
       verifySubmittedCaseRef("CFSS-1234567")
    }
  }
}
