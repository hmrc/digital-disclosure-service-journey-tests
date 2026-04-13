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
// DONE
import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.clickOnHyperlinkText
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{SendNotification, clickOnCheckBox, clickOnLink, clickOnRadioButton, enterInputInTextBox, iConfirmButton, makeADisclosure, navigateToSpecificURL, saveAndContinue, sendOfferAndDisclosure, verifyDisplayedCheckbox, verifyPageHeading, verifySubmittedCaseRef}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.OnshoreDisclosureStepDefSteps.{checkTaskStatus, continueButtonOnSummaryPage, enterCountry, enterTextInAdviceMonthTextArea, enterTextInAdviceTextArea, enterTextInAdviceYearTextArea, enterTextInDescription, enterTextInExcuse, enterTextInReasonableCare, enterTextInReasonableExcuse, enterTextInTextArea, selectFromCountryDropdown}
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.{givenIAmNavigatedToReceivedALetterPage, whenClickOnSaveAndContinueButton}
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps.{enterInputInDOBPage, whenIEnterStringInTheStringTextBoxField}


class IndividualOnBehalfOffshoreDisclosureSpec extends BaseSpec {

  Feature("An Individual - On behalf of - is able to notify and submit offshore disclosure") {

    Scenario("Individual On behalf of - Complete offshore disclosure with reasonable excuse journey - First 3 selections - Complete flow") {

      Given("I am navigated to Received A Letter Page")
        givenIAmNavigatedToReceivedALetterPage()

      Then("""I select Radio Button No at Position 2""")
       clickOnRadioButton("No","2")

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

      Then("""And I enter represent org name in the TextBox field""")
       enterInputInTextBox("represent name")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I select Radio Button Yes at Position 1""")
       clickOnRadioButton("Yes","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I select Radio Button No at Position 2""")
       clickOnRadioButton("No","2")

      And("""click on Save and Continue button""")
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

      When("I click on send notification button")
       SendNotification()

      Then("I am on You have sent the notification page")
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

      And("I enter tax year ending 2021 in the Which tax years does this apply to? text box field")
       enterInputInDOBPage("tax year ending 2021","Which tax years does this apply to?")

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

      And("I select Checkbox 6 April 2024 to 5 April 2025 at Position 1")
       clickOnCheckBox("6 April 2024 to 5 April 2025", "1")

      And("I select Checkbox 6 April 2023 to 5 April 2024 at Position 2")
       clickOnCheckBox("6 April 2023 to 5 April 2024", "2")

      And("click on Save and Continue button")
       saveAndContinue()

      When("I enter country or territory United Arab Emirates and select United Arab Emirates")
       enterCountry("United Arab Emirates")
       selectFromCountryDropdown("United Arab Emirates")


      And("click on Save and Continue button")
       saveAndContinue()

      Then("""I select Radio Button No at Position 2""")
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

      Then("page navigates to Offshore liabilities — Tax year 6 April 2023 to 5 April 2024")
       verifyPageHeading("Offshore liabilities — Tax year 6 April 2023 to 5 April 2024")

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

      And("I enter undeclaredIncomeOrGain in the undeclaredIncomeOrGain text box field")
       whenIEnterStringInTheStringTextBoxField("undeclaredIncomeOrGain", "undeclaredIncomeOrGain")

      And("I select Radio Button No at Position 2")
       clickOnRadioButton("No","2")

      And("click on Save and Continue button")
       whenClickOnSaveAndContinueButton()

      Then("page navigates to Your legal interpretation")
       verifyPageHeading("page navigates to Your legal interpretation")

      And("I select Checkbox Your residence status for tax purposes in the UK at Position 1")
       clickOnCheckBox("Your residence status for tax purposes in the UK", "1")

      And("I select Checkbox Your domicile status for UK tax purposes at Position 2")
       clickOnCheckBox("Your domicile status for UK tax purposes", "2")

      And("I select Checkbox The remittance basis for taxing income for people not domiciled in the UK at Position 3")
       clickOnCheckBox("The remittance basis for taxing income for people not domiciled in the UK", "3")

      And("I select Checkbox How income arising in a trust should be taxed at Position 4")
       clickOnCheckBox("How income arising in a trust should be taxed", "4")

      And("I select Checkbox How income arising in an offshore corporate structure should be taxed at Position 6")
       clickOnCheckBox("How income arising in an offshore corporate structure should be taxed", "6")

      And("I select Checkbox Inheritance Tax issues at Position 7")
       clickOnCheckBox("Inheritance Tax issues", "7")

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

      Then("status is marked as Not started for field Confirm if you have other liability issues or not")
       checkTaskStatus("Not started", "Confirm if you have other liability issues or not")

      And("click on Hyperlink Confirm if you have other liability issues or not")
       clickOnHyperlinkText("Confirm if you have other liability issues or not")

      Then("page navigates to Do you have any other liability issues?")
       verifyPageHeading("Do you have any other liability issues?")

      When("I select Checkbox Employer liability issues at Position 1")
       clickOnCheckBox("Employer liability issues", "1")

      And("I select Checkbox Class 2 National Insurance contributions issues at Position 2")
       clickOnCheckBox("Class 2 National Insurance contributions issues", "2")

      And("I select Checkbox Inheritance Tax issues at Position 3")
       clickOnCheckBox("Inheritance Tax issues", "3")

      And("I select Checkbox VAT issues at Position 4")
       clickOnCheckBox("VAT issues", "4")

      And("I select Checkbox Other at Position 5")
       clickOnCheckBox("Other", "5")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Can you describe the gift (known as a chargeable transfer) that your issue is about?")
       verifyPageHeading("Can you describe the gift (known as a chargeable transfer) that your issue is about?")

      When("I enter Description for gift/chargeable transfer) in the can you describe the gift text area")
       enterTextInDescription("Description for gift/chargeable transfer)")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Can you describe what other liability issues you have?")
       verifyPageHeading("Can you describe what other liability issues you have?")

      When("I enter Description for other liability issues in the can you describe what other liability issues text area")
       enterTextInDescription("Description for other liability issues")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Did the individual receive tax credits for any of the years covered by this disclosure?")
       verifyPageHeading("Did the individual receive tax credits for any of the years covered by this disclosure?")

      Then("""I select Radio Button Yes at Position 1""")
       clickOnRadioButton("Yes","1")

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

      When("I select Checkbox Advised by guidance on the GOV.UK website at Position 1")
       clickOnCheckBox("Advised by guidance on the GOV.UK website", "1")

      And("I select Checkbox Prompted by a letter from HMRC advising to make a disclosure at Position 2")
       clickOnCheckBox("Prompted by a letter from HMRC advising to make a disclosure", "2")

      And("I select Checkbox Advised by employer at Position 3")
       clickOnCheckBox("Advised by employer", "3")

      And("I select Checkbox After reading an online or newspaper article at Position 4")
       clickOnCheckBox("After reading an online or newspaper article", "4")

      And("I select Checkbox After reading an article from a professional association website or publication at Position 5")
       clickOnCheckBox("After reading an article from a professional association website or publication", "5")

      And("I select Checkbox Advised by an accountant, or other type of third party agent at Position 6")
       clickOnCheckBox("Advised by an accountant, or other type of third party agent", "6")

      And("I select Checkbox After reading about the Register of Overseas Entities at Position 7")
       clickOnCheckBox("After reading about the Register of Overseas Entities", "7")

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

      When("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What was the name of the person who gave the advice?")
       verifyPageHeading("What was the name of the person who gave the advice?")

      When("I enter person in the TextBox field")
       enterInputInTextBox("person")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Did the person who gave advice work on behalf of a business or organisation?")
       verifyPageHeading("Did the person who gave advice work on behalf of a business or organisation?")

      When("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What was the name of the business or organisation the person who gave the advice was working on behalf of?")
       verifyPageHeading("What was the name of the business or organisation the person who gave the advice was working on behalf of?")

      When("I enter organisation in the TextBox field")
       enterInputInTextBox("organisation")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What was the profession of the person who gave this advice?")
       verifyPageHeading("What was the profession of the person who gave this advice?")

      When("I enter accountant in the TextBox field")
       enterInputInTextBox("accountant")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Advice given")
       verifyPageHeading("Advice given")

      When("I enter accountant's advice in the advice text area")
       enterTextInAdviceTextArea("accountant's advice")

      And("I enter 01 in the month text area")
       enterTextInAdviceMonthTextArea("01")

      And("I enter 1980 in the year text area")
       enterTextInAdviceYearTextArea("1980")

      And("I select Radio Button Yes, by email at Position 1")
       clickOnRadioButton("Yes, by email","1")

      And("click on Save and Continue button")
        saveAndContinue()

      Then("page navigates to Which email address can we contact you with?")
       verifyPageHeading("Which email address can we contact you with?")

      When("I select Radio Button abc@abc.com at Position 1")
       clickOnRadioButton("abc@abc.com","1")

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

      Then("status is marked as Not started for field Add case reference")
       checkTaskStatus("Not started", "Add case reference")

      When("click on Hyperlink Add case reference")
       clickOnHyperlinkText("Add case reference")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I enter CFSS-1234567 in the TextBox field")
       enterInputInTextBox("CFSS-1234567")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to List of tasks")
       verifyPageHeading("List of tasks")

      And("status is marked as Completed for field Edit case reference")
       checkTaskStatus("Completed", "Edit case reference")

      When("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Your offer")
       verifyPageHeading("Your offer")

      When("I enter 15 in the TextBox field")
       enterInputInTextBox("15")

      And("I click on Send offer and disclosure button")
       sendOfferAndDisclosure()

      Then("page navigates to You have sent your disclosure")
       verifyPageHeading("You have sent your disclosure")

      And("the case reference should be CFSS-1234567")
       verifySubmittedCaseRef("CFSS-1234567")
    }

    Scenario("Individual - On behalf of - offshore disclosure with no reasonable excuse journey") {
      Given("I am navigated to Received A Letter Page")
       givenIAmNavigatedToReceivedALetterPage()

      Then("""I select Radio Button No at Position 2""")
       clickOnRadioButton("No","2")

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

      Then("""And I enter represent org name in the TextBox field""")
       enterInputInTextBox("represent name")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I select Radio Button Yes at Position 1""")
       clickOnRadioButton("Yes","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I select Radio Button No at Position 2""")
       clickOnRadioButton("No","2")

      And("""click on Save and Continue button""")
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

      When("I click on send notification button")
       SendNotification()

      Then("I am on You have sent the notification page")
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

      When("click on Hyperlink Add offshore liability details")
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

      And("I select Checkbox This was not deliberate, but they do not have a reasonable excuse at Position 1")
       clickOnCheckBox("This was not deliberate, but they do not have a reasonable excuse", "1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the individual did not file a return on time")
       verifyPageHeading("Why the individual did not file a return on time")

      And("I select Checkbox They did not file a return but did not withhold any information on purpose at Position 1")
       clickOnCheckBox("They did not file a return but did not withhold any information on purpose", "1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the individual submitted an inaccurate return")
       verifyPageHeading("Why the individual submitted an inaccurate return")

      And("I select Checkbox They did not take reasonable care at Position 1")
       clickOnCheckBox("They did not take reasonable care", "1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Which year does this offshore disclosure relate to?")
       verifyPageHeading("Which year does this offshore disclosure relate to?")

      And("page should display checkboxes for the 20 tax years before the current tax year")
       verifyDisplayedCheckbox("20")

      When("I select Checkbox 6 April 2024 to 5 April 2025 at Position 1")
       clickOnCheckBox("6 April 2024 to 5 April 2025", "1")

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

      When("I enter consideration of the law in the text area")
       enterTextInTextArea("consideration of the law")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to How much tax has not been included in this disclosure as a result of your interpretation?")
       verifyPageHeading("How much tax has not been included in this disclosure as a result of your interpretation?")

      When("I select Radio Button £10,000 or less at Position 1")
       clickOnRadioButton("£10,000 or less","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What was the maximum value of all assets held outside the UK at any point over the last 5 years?")
       verifyPageHeading("What was the maximum value of all assets held outside the UK at any point over the last 5 years?")

      When("I select Radio Button Between £1 million and £100 million at Position 3")
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
    }

    Scenario("Individual - On behalf of- Complete offshore disclosure journey - Nil disclosure") {
      Given("I am navigated to Received A Letter Page")
        givenIAmNavigatedToReceivedALetterPage()

      Then("""I select Radio Button No at Position 2""")
       clickOnRadioButton("No","2")

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

      Then("""And I enter represent org name in the TextBox field""")
       enterInputInTextBox("represent name")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I select Radio Button Yes at Position 1""")
       clickOnRadioButton("Yes","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I select Radio Button No at Position 2""")
       clickOnRadioButton("No","2")

      And("""click on Save and Continue button""")
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

      When("I click on send notification button")
       SendNotification()

      Then("I am on You have sent the notification page")
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

      And("status is marked as Not started for field Add case reference")
       checkTaskStatus("Not started", "Add case reference")

      And("status is marked as Not started for field Add offshore liability details")
       checkTaskStatus("Not started", "Add offshore liability details")

      When("click on Hyperlink Add offshore liability details")
       clickOnHyperlinkText("Add offshore liability details")

      Then("page navigates to Why you are making this disclosure")
       verifyPageHeading("Why you are making this disclosure")

      When("I select Checkbox The individual submitted an inaccurate return at Position 3")
       clickOnCheckBox("The individual submitted an inaccurate return", "3")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the individual submitted an inaccurate return")
       verifyPageHeading("Why the individual submitted an inaccurate return")

      When("I select Checkbox They took reasonable care but made a mistake at Position 2")
       clickOnCheckBox("They took reasonable care but made a mistake", "2")

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

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Which year does this offshore disclosure relate to?")
       verifyPageHeading("Which year does this offshore disclosure relate to?")

      When("I select Checkbox Any tax year before 6 April 2015 at Position 10")
       clickOnCheckBox("Any tax year before 6 April 2015", "11")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Can you tell us more about any tax owed before 6 April 2015?")
       verifyPageHeading("Can you tell us more about any tax owed before 6 April 2015?")

      And("I enter Provide the amount, when it was owed, and where the income or gain came from in the text area")
       enterTextInTextArea("Provide the amount, when it was owed, and where the income or gain came from")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to You are making a nil disclosure")
       verifyPageHeading("You are making a nil disclosure")

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
    }
  }
}
