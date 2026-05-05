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

import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.{clickOnHyperlinkText, whenISelectCheckboxStringAtPositionString, whenISelectRadioButtonStringAtPositionString}
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{clickOnCheckBox, clickOnRadioButton, enterInputInTextBox, saveAndContinue, _}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.OnshoreDisclosureStepDefSteps.{checkTaskStatus, enterTextInDescription, enterValueInStopDay, enterValueInStopMonth, enterValueInStopYear, enterValueInwhatHasHappenedToPropertyTextArea}
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.givenIAmNavigatedToReceivedALetterPage
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps.enterInputInDOBPage

class TrustOnshoreDisclosureSpec extends BaseSpec {

  Feature("A trust is able to notify and submit onshore disclosure") {
    Scenario("Trust - Onshore Journey- Letting Income") {
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

      Then("""I select Radio Button A trust at Position 5""")
       clickOnRadioButton("A trust","5")

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

      Then("""And I select Checkbox Other capital gains at Position 6""")
       clickOnCheckBox("Other capital gains", "6")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I enter Trust name in the TextBox field""")
       enterInputInTextBox("Trust name")

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

      Then("""I enter Trust full name in the TextBox field""")
       enterInputInTextBox("Trust full name")

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

      And("I select Checkbox The trust did not notify HMRC about a tax liability at Position 1")
       clickOnCheckBox("The trust did not notify HMRC about a tax liability", "1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the trust did not notify HMRC about a tax liability")
       verifyPageHeading("Why the trust did not notify HMRC about a tax liability")

      And("I select Checkbox They deliberately failed to notify HMRC of a tax liability at Position 3")
       whenISelectCheckboxStringAtPositionString("They deliberately failed to notify HMRC of a tax liability", "3")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I select Radio Button Continue using this digital disclosure service at Position 1")
       clickOnRadioButton("Continue using this digital disclosure service","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What onshore liabilities do you need to disclose?")
       verifyPageHeading("What onshore liabilities do you need to disclose?")

      And("I select Checkbox Letting income from residential property or land at Position 1")
       clickOnCheckBox("Letting income from residential property or land", "1")

      And("I select Checkbox Non-business income liabilities at Position 4")
       clickOnCheckBox("Non-business income liabilities", "4")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Which year does this onshore disclosure relate to?")
       verifyPageHeading("Which year does this onshore disclosure relate to?")

      And("page should display checkboxes for the 20 tax years before the current tax year")
       verifyDisplayedCheckbox("20")

      When("I select Checkbox 6 April 2023 to 5 April 2024 at Position 1")
       clickOnCheckBox("6 April 2024 to 5 April 2025", "1")

      And("I select Checkbox 6 April 2019 to 5 April 2020 at Position 5")
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

      And("I enter 01 in the Day text box field")
       enterInputInDOBPage("01","Day")

      And("I enter 01 in the Month text box field")
       enterInputInDOBPage("01","Month")

      And("I enter 1980 in the Year text box field")
       enterInputInDOBPage("1980","Year")

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

      And("I enter 02 in stop day text box field")
       enterValueInStopDay("02")

      And("I enter 02 in stop month text box field")
       enterValueInStopMonth("02")

      And("I enter 1990 in stop year text box field")
       enterValueInStopYear("1990")

      And("I enter Nothing in whatHasHappenedToProperty text box field")
       enterValueInwhatHasHappenedToPropertyTextArea("Nothing")

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

      When("I enter 5 in percentage text box field")
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

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What is the postcode and property name or number of property 2?")
       verifyPageHeading("What is the postcode and property name or number of property 2?")

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

      Then("page navigates to When was property 2 first let out?")
       verifyPageHeading("When was property 2 first let out?")

      And("I enter 02 in the Day text box field")
       enterInputInDOBPage("02","Day")

      And("I enter 02 in the Month text box field")
       enterInputInDOBPage("02","Month")

      And("I enter 1982 in the Year text box field")
       enterInputInDOBPage("1982","Year")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Has property 2 stopped being let out?")
       verifyPageHeading("Has property 2 stopped being let out?")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Property 2 is no longer being let out")
       verifyPageHeading("Property 2 is no longer being let out")

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

      Then("page navigates to At the time of letting, was property 2 furnished?")
       verifyPageHeading("At the time of letting, was property 2 furnished?")

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

      Then("page navigates to At the time of letting, was property 2 jointly owned with another person?")
       verifyPageHeading("At the time of letting, was property 2 jointly owned with another person?")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What was the percentage share of the income you received from property 2?")
       verifyPageHeading("What was the percentage share of the income you received from property 2?")

      And("I enter 5 in percentage text box field")
       enterTextInDescription("5")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to At the time of letting, did you have a mortgage on property 2?")
       verifyPageHeading("At the time of letting, did you have a mortgage on property 2?")

      And("I select Radio Button Yes at Position 1")
       clickOnRadioButton("Yes","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What type of mortgage did you have for property 2?")
       verifyPageHeading("What type of mortgage did you have for property 2?")

      And("I select Radio Button Other at Position 3")
       clickOnRadioButton("Other","3")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What was the type of mortgage you had on property 2?")
       verifyPageHeading("What was the type of mortgage you had on property 2?")

      And("I enter Type of mortgage in typeOfMortage text box field")
       enterTextInDescription("Type of mortgage")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Was a letting agent used to let out or manage property 2?")
       verifyPageHeading("Was a letting agent used to let out or manage property 2?")

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

      Then("page navigates to Review property 2 details")
       verifyPageHeading("Review property 2 details")

      And("click on continue button")
       saveAndContinue()

      Then("page navigates to You have added 2 properties")
       verifyPageHeading("You have added 2 properties")

      And("I select Radio Button No at Position 2")
       clickOnRadioButton("No","2")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Is the trust a member of any landlord associations?")
      verifyPageHeading("Is the trust a member of any landlord associations?")

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

      And("I enter 10 in the nonBusinessIncome text box field")
       enterInputInDOBPage("10", "nonBusinessIncome")

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

      And("I enter Penalty Rate Reason for year 2022 in the penaltyRateReason text box field")
       enterInputInDOBPage("Penalty Rate Reason for year 2022","penaltyRateReason")

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

      Then("page navigates to Onshore liabilities — Tax year 6 April 2020 to 5 April 2021")
       verifyPageHeading("Onshore liabilities — Tax year 6 April 2020 to 5 April 2021")

      And("I enter 10 in the nonBusinessIncome text box field")
       enterInputInDOBPage("10", "nonBusinessIncome")

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

      And("I enter Penalty Rate Reason for year 2019 in the penaltyRateReason text box field")
       enterInputInDOBPage("Penalty Rate Reason for year 2019","penaltyRateReason")

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
    }

    Scenario("Trust - Onshore Journey- There are no onshore liabilities to disclose") {
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

      Then("""I select Radio Button A trust at Position 5""")
       clickOnRadioButton("A trust","5")

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

      Then("""And I select Checkbox Other capital gains at Position 6""")
       clickOnCheckBox("Other capital gains", "6")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I enter Trust name in the TextBox field""")
       enterInputInTextBox("Trust name")

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

      Then("""I enter Trust full name in the TextBox field""")
       enterInputInTextBox("Trust full name")

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

      And("I select Checkbox The trust submitted an inaccurate return at Position 3")
       clickOnCheckBox("The trust submitted an inaccurate return", "3")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Why the trust submitted an inaccurate return")
       verifyPageHeading("Why the trust submitted an inaccurate return")

      And("I select Checkbox They did not take reasonable care at Position 1")
       clickOnCheckBox("They did not take reasonable care", "1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to What onshore liabilities do you need to disclose?")
       verifyPageHeading("What onshore liabilities do you need to disclose?")

      And("I select Checkbox Business income liabilities at Position 2")
       clickOnCheckBox("Business income liabilities", "2")

      And("I select Checkbox Capital Gains Tax liabilities at Position 3")
       clickOnCheckBox("Capital Gains Tax liabilities", "3")

      And("I select Checkbox Non-business income liabilities at Position 4")
       clickOnCheckBox("Non-business income liabilities", "4")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Which year does this onshore disclosure relate to?")
       verifyPageHeading("Which year does this onshore disclosure relate to?")

      And("page should display checkboxes for the 6 tax years before the current tax year")
       verifyDisplayedCheckbox("6")

      When("I select Checkbox Any tax year before 6 April 2020 at Position 6")
       clickOnCheckBox("Any tax year before 6 April 2020", "6")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to Can you tell us more about any tax owed before 6 April 2020?")
       verifyPageHeading("Can you tell us more about any tax owed before 6 April 2020?")

      When("I enter tax owed details in tax owed reason text box field")
       enterTextInDescription("tax owed details")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("page navigates to There are no onshore liabilities to disclose")
       verifyPageHeading("There are no onshore liabilities to disclose")

      And("body should be The trust only needs to pay HMRC what it owes for up to 20 years for onshore liabilities. Based on the information you have given, you do not need to provide any figures or calculations for onshore liabilities.")
       verifyBody("The trust only needs to pay HMRC what it owes for up to 20 years for onshore liabilities. Based on the information you have given, you do not need to provide any figures or calculations for onshore liabilities.")

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
    }
  }
}