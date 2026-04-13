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

// DONE
package uk.gov.hmrc.specs

import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.{clickOnHyperlinkText, whenISelectCheckboxStringAtPositionString, whenISelectRadioButtonStringAtPositionString}
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{SendNotification, clickOnCheckBox, clickOnLink, clickOnRadioButton, enterInputInTextBox, iConfirmButton, makeADisclosure, navigateToSpecificURL, saveAndContinue, verifyPageHeading}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.OffshoreDisclosureStepDefSteps.whenIClickOnMakeADisclosureButton
import uk.gov.hmrc.specsteps.OnshoreDisclosureStepDefSteps.{checkTaskStatus, enterTextInExcuse}
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.givenIAmNavigatedToReceivedALetterPage
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps.enterInputInDOBPage

class CompanyOnBehalfOnshoreDisclosureSpec extends BaseSpec {

  Feature("A Company - On behalf of - is able to notify and submit onshore disclosure") {

    Scenario("Company On behalf of - Complete onshore disclosure with reasonable excuse journey with 2 director loan accounting periods.") {

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

      When("I am on You have sent the notification page")
       verifyPageHeading("You have sent the notification")

      And("I navigate to make-a-disclosure specific page")
       navigateToSpecificURL("make-a-disclosure")

      When("I click on Make a disclosure button")
        whenIClickOnMakeADisclosureButton()

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

      And("I select Checkbox The company did not notify HMRC about a tax liability at Position 1")
       clickOnCheckBox("The company did not notify HMRC about a tax liability", "1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the company did not notify HMRC about a tax liability")
       verifyPageHeading("Why the company did not notify HMRC about a tax liability")

      And("I select Checkbox They have a reasonable excuse at Position 2")
       clickOnCheckBox("They have a reasonable excuse", "2")

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

      Then("page navigates to What onshore liabilities do you need to disclose?")
        verifyPageHeading("What onshore liabilities do you need to disclose?")

      And("I select Checkbox Director’s loan account liabilities at Position 5")
       clickOnCheckBox("Director’s loan account liabilities", "5")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Onshore director’s loan account liabilities 1")
       verifyPageHeading("Onshore director’s loan account liabilities 1")

      And("I enter Director Name into the name text field")
        enterInputInTextBox("Director Name", "name")

      And("I enter 01 into the periodEnd.day text field")
        enterInputInTextBox("01", "periodEnd.day")

      And("I enter 01 into the periodEnd.month text field")
        enterInputInTextBox("01", "periodEnd.month")

      And("I enter 2019 into the periodEnd.year text field")
        enterInputInTextBox("2019", "periodEnd.year")

      And("I enter 0 into the overdrawn text field")
       enterInputInTextBox("0", "overdrawn")

      And("I enter 1000 into the unpaidTax text field")
       enterInputInTextBox("1000", "unpaidTax")

      And("I enter 0 into the interest text field")
       enterInputInTextBox("0", "interest")

      And("click on Save and Continue button")
        saveAndContinue()

      Then("page navigates to Review onshore director loans account liabilities")
        verifyPageHeading("Review onshore director loans account liabilities")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to You have added 1 accounting period for director loan account liabilities")
        verifyPageHeading("You have added 1 accounting period for director loan account liabilities")

      And("I select Radio Button Yes at Position 1")
        clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Onshore director’s loan account liabilities 2")
        verifyPageHeading("Onshore director’s loan account liabilities 2")

      And("I enter Director Name into the name text field")
        enterInputInTextBox("Director Name", "name")

      And("I enter 02 into the periodEnd.day text field")
       enterInputInTextBox("02", "periodEnd.day")

      And("I enter 02 into the periodEnd.month text field")
        enterInputInTextBox("02", "periodEnd.month")

      And("I enter 2019 into the periodEnd.year text field")
        enterInputInTextBox("2019", "periodEnd.year")

      And("I enter 0 into the overdrawn text field")
        enterInputInTextBox("0", "overdrawn")

      And("I enter 1000 into the unpaidTax text field")
       enterInputInTextBox("1000", "unpaidTax")

      And("I enter 0 into the interest text field")
        enterInputInTextBox("0", "interest")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Review onshore director loans account liabilities")
       verifyPageHeading("Review onshore director loans account liabilities")

      And("click on Save and Continue button")
        saveAndContinue()

      Then("page navigates to You have added 2 accounting periods for director loan account liabilities")
       verifyPageHeading("You have added 2 accounting periods for director loan account liabilities")

      And("I select Radio Button No at Position 2")
       clickOnRadioButton("No","2")

      And("click on Save and Continue button")
        saveAndContinue()

      Then("page navigates to Onshore liabilities summary")
       verifyPageHeading("Onshore liabilities summary")
    }

    Scenario("Company On behalf of - Complete onshore disclosure with no reasonable excuse journey with 2 corporation tax accounting periods.") {
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

      When("I am on You have sent the notification page")
        verifyPageHeading("You have sent the notification page")

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

      And("I select Checkbox The company did not notify HMRC about a tax liability at Position 1")
       clickOnCheckBox("The company did not notify HMRC about a tax liability", "1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the company did not notify HMRC about a tax liability")
       verifyPageHeading("Why the company did not notify HMRC about a tax liability")

      And("I select Checkbox This was not deliberate, but they do not have a reasonable excuse at Position 1")
       clickOnCheckBox("This was not deliberate, but they do not have a reasonable excuse", "1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What onshore liabilities do you need to disclose?")
       verifyPageHeading("What onshore liabilities do you need to disclose?")

      And("I select Checkbox Corporation Tax liabilities at Position 4")
        whenISelectCheckboxStringAtPositionString("Corporation Tax liabilities", "4")

      And("click on Save and Continue button")
        saveAndContinue()

      Then("page navigates to Onshore Corporation Tax liability 1")
        verifyPageHeading("Onshore Corporation Tax liability 1")

      And("I enter 01 into the periodEnd.day text field")
       enterInputInTextBox("01", "periodEnd.day")

      And("I enter 01 into the periodEnd.month text field")
       enterInputInTextBox("01", "periodEnd.month")

      And("I enter 2019 into the periodEnd.year text field")
       enterInputInTextBox("2019", "periodEnd.year")

      And("I enter 0 into the howMuchIncome text field")
       enterInputInTextBox("0", "howMuchIncome")

      And("I enter 1000 into the howMuchUnpaid text field")
       enterInputInTextBox("1000", "howMuchUnpaid")

      And("I enter 0 into the howMuchInterest text field")
       enterInputInTextBox("0", "howMuchInterest")

      And("I enter 10 into the penaltyRate text field")
       enterInputInTextBox("10", "penaltyRate")

      And("I enter Reason into the penaltyRateReason text field")
       enterInputInTextBox("Reason", "penaltyRateReason")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Review onshore Corporation Tax liabilities")
       verifyPageHeading("Review onshore Corporation Tax liabilities")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to You have added 1 accounting period for Corporation Tax liabilities")
       verifyPageHeading("You have added 1 accounting period for Corporation Tax liabilities")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
        saveAndContinue()

      Then("page navigates to Onshore Corporation Tax liability 2")
       verifyPageHeading("Onshore Corporation Tax liability 2")

      And("I enter 02 into the periodEnd.day text field")
       enterInputInTextBox("02", "periodEnd.day")

      And("I enter 02 into the periodEnd.month text field")
       enterInputInTextBox("02", "periodEnd.month")

      And("I enter 2019 into the periodEnd.year text field")
       enterInputInTextBox("2019", "periodEnd.year")

      And("I enter 0 into the howMuchIncome text field")
       enterInputInTextBox("0", "howMuchIncome")

      And("I enter 1000 into the howMuchUnpaid text field")
       enterInputInTextBox("1000", "howMuchUnpaid")

      And("I enter 0 into the howMuchInterest text field")
       enterInputInTextBox("0", "howMuchInterest")

      And("I enter 10 into the penaltyRate text field")
       enterInputInTextBox("10", "penaltyRate")

      And("I enter Reason into the penaltyRateReason text field")
       enterInputInTextBox("Reason", "penaltyRateReason")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Review onshore Corporation Tax liabilities")
        verifyPageHeading("Review onshore Corporation Tax liabilities")

      And("click on Save and Continue button")
        saveAndContinue()

      Then("page navigates to You have added 2 accounting periods for Corporation Tax liabilities")
       verifyPageHeading("You have added 2 accounting periods for Corporation Tax liabilities")

      And("I select Radio Button No at Position 2")
       clickOnRadioButton("No","2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Onshore liabilities summary")
       verifyPageHeading("Onshore liabilities summary")
    }
  }
}
