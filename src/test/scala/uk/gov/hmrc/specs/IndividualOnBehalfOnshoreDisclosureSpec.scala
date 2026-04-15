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

import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.{clickOnHyperlinkText, whenISelectRadioButtonStringAtPositionString}
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{SendNotification, clickOnCheckBox, clickOnLink, clickOnRadioButton, enterInputInTextBox, iConfirmButton, makeADisclosure, navigateToSpecificURL, saveAndContinue, verifyDisplayedCheckbox, verifyPageHeading}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.OnshoreDisclosureStepDefSteps.{checkTaskStatus, enterTextInExcuse, enterTextInReasonableCare, enterTextInReasonableExcuse, whenIEnterStringInStopYearTextBoxField}
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.givenIAmNavigatedToReceivedALetterPage
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps.enterInputInDOBPage

class IndividualOnBehalfOnshoreDisclosureSpec extends BaseSpec {

  Feature("An Individual - On behalf of - is able to notify and submit onshore disclosure") {

    Scenario("Individual On behalf of - Complete onshore with reasonable excuse disclosure journey - Complete flow") {

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

      Then("""I select Radio Button An individual at Position 1""")
        clickOnRadioButton("An individual","1")

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

      Then("""And I enter represent org in the TextBox field""")
       enterInputInTextBox("represent org")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I select Radio Button No at Position 2""")
       clickOnRadioButton("No","2")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""page navigates to The disclosure will only be about onshore liabilities""")
      verifyPageHeading("The disclosure will only be about onshore liabilities")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""And I select Checkbox Self-employment income" at Position 5""")
        clickOnCheckBox("Self-employment income", "5")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I enter Individual full name in the TextBox field""")
       enterInputInTextBox("Individual full name")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I enter 01 in the Day text box field")
      enterInputInDOBPage("01","Day")

      And("I enter 01 in the Month text box field")
      enterInputInDOBPage("01","Month")

      And("I enter 1980 in the Year text box field")
      enterInputInDOBPage("1980","Year")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("""I enter Dentist in the TextBox field""")
      enterInputInTextBox("Dentist")

      And("""click on Save and Continue button""")
      saveAndContinue()

      And("""I select Radio Button No at Position 3""")
      clickOnRadioButton("No","3")

      And("""click on Save and Continue button""")
      saveAndContinue()

      And("""I select Radio Button No at Position 3""")
      clickOnRadioButton("No","3")

      And("""click on Save and Continue button""")
      saveAndContinue()

      And("""I select Radio Button No at Position 3""")
      clickOnRadioButton("No","3")

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

      Given("I am on You have sent the notification page")
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

      And("I select Checkbox Capital Gains Tax liabilities at Position 3")
        clickOnCheckBox("Capital Gains Tax liabilities", "3")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Which year does this onshore disclosure relate to?")
       verifyPageHeading("Which year does this onshore disclosure relate to?")

      And("page should display checkboxes for the 4 tax years before the current tax year")
       verifyDisplayedCheckbox("4")

      And("I select Checkbox 6 April 2024 to 5 April 2025 at Position 1")
       clickOnCheckBox("6 April 2024 to 5 April 2025", "1")

      And("I select Checkbox 6 April 2023 to 5 April 2024 at Position 2")
        clickOnCheckBox("6 April 2023 to 5 April 2024", "2")

      And("click on Save and Continue button")
        saveAndContinue()

      Then("page navigates to Onshore liabilities — Tax year 6 April 2024 to 5 April 2025")
       verifyPageHeading("Onshore liabilities — Tax year 6 April 2024 to 5 April 2025")

      And("I enter 10 in the gains text box field")
       enterInputInDOBPage("10", "gains")

      And("I enter 20 in the unpaidTax text box field")
       enterInputInDOBPage("20", "unpaidTax")

      And("I enter 20 in the niContributions text box field")
       enterInputInDOBPage("20", "niContributions")

      And("I enter 50 in the interest text box field")
      enterInputInDOBPage("50", "interest")

      And("I enter undeclared Income Or Gain in the undeclaredIncomeOrGain text box field")
       enterInputInDOBPage("undeclared Income Or Gain", "undeclaredIncomeOrGain")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Onshore liabilities — Tax year 6 April 2023 to 5 April 2024")
       verifyPageHeading("Onshore liabilities — Tax year 6 April 2023 to 5 April 2024")

      And("I enter 70 in the gains text box field")
       enterInputInDOBPage("70", "gains")

      And("I enter 80 in the unpaidTax text box field")
       enterInputInDOBPage("80", "unpaidTax")

      And("I enter 90 in the niContributions text box field")
       enterInputInDOBPage("90", "niContributions")

      And("I enter 10 in the interest text box field")
       enterInputInDOBPage("10", "interest")

      And("I enter undeclared Income Or Gain in the undeclaredIncomeOrGain text box field")
       enterInputInDOBPage("undeclared Income Or Gain", "undeclaredIncomeOrGain")

      And("click on Save and Continue button")
        saveAndContinue()

      Then("page navigates to Onshore liabilities summary")
       verifyPageHeading("Onshore liabilities summary")
    }
  }
}
