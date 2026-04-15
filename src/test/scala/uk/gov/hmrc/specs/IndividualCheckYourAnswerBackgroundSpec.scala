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

import org.scalatest.prop.Tables.Table
import uk.gov.hmrc.specsteps.CheckYourAnswersStepDefSteps.{clickOnChangeButton, thenBackgroundSectionHasFollowing, verifyAboutTheIndividualAnswers, verifyAboutYouAnswers}
import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.whenISelectRadioButtonStringAtPositionString
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{clickOnCheckBox, clickOnRadioButton, enterInputInTextBox, saveAndContinue, _}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.givenIAmNavigatedToReceivedALetterPage
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps.enterInputInDOBPage

class IndividualCheckYourAnswerBackgroundSpec extends BaseSpec {

  Feature("An individual UK tax payer is able to check their answers for background section before submitting page") {

    Scenario("On behalf of Individual - Change Route validation - Are you the individual that the disclosure will be about?") {
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

      And("I select Radio Button An individual at Position 1")
       clickOnRadioButton("An individual","1")

      And("click on Save and Continue button")
       saveAndContinue()

      And("I select Radio Button Yes, I am the individual at Position 1")
       clickOnRadioButton("Yes, I am the individual","1")

      And("click on Save and Continue button")
       saveAndContinue()

      Then("""I select Radio Button Yes at Position 1""")
       clickOnRadioButton("Yes","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I select Radio Button Yes at Position 1""")
       clickOnRadioButton("Yes","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""And I select Checkbox Property capital gains at Position 4""")
       clickOnCheckBox("Property capital gains", "4")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I enter My full name in the TextBox field")
       enterInputInTextBox("My full name")

      And("""click on Save and Continue button""")
       saveAndContinue()

      When("""I select Checkbox Email at Position 1""")
       clickOnCheckBox("Email", "1")

      Then("""I select Checkbox Telephone at Position 2""")
       clickOnCheckBox("Telephone", "2")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I enter individual@email.com in the TextBox field""")
       enterInputInTextBox("individual@email.com")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I enter 07777 777777 in the TextBox field""")
       enterInputInTextBox("07777 777777")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I enter 01 in the Day text box field")
       enterInputInDOBPage("01","Day")

      And("I enter 01 in the Month text box field")
       enterInputInDOBPage("01","Month")

      And("I enter 1981 in the Year text box field")
       enterInputInDOBPage("1981","Year")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("""I enter Doctor in the TextBox field""")
       enterInputInTextBox("Doctor")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I select Radio Button Yes, and I know my National Insurance number at Position 1")
       clickOnRadioButton("Yes, and I know my National Insurance number","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I enter AZ 12 34 56 D in the TextBox field")
       enterInputInTextBox("AZ 12 34 56 D")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I select Radio Button Yes, and I know my VAT registration number at Position 1")
       clickOnRadioButton("Yes, and I know my VAT registration number","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I enter 123456788 in the TextBox field")
       enterInputInTextBox("123456788")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I select Radio Button Yes, and I know my Unique Taxpayer Reference (UTR) at Position 1")
       clickOnRadioButton("Yes, and I know my Unique Taxpayer Reference (UTR)","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I enter 1234567810 in the TextBox field")
       enterInputInTextBox("1234567810")

      And("""click on Save and Continue button""")
       saveAndContinue()

      When("""enter country name United Kingdom, then select country United Kingdom""")
       enterInputInTextBox("United Kingdom")
       selectfromDropdown("United Kingdom")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""And I click on the hyperlink with text Enter the address manually""")
       clickOnLink("Enter the address manually")

      And("""I enter 4 Testing Lane in the Address line 1 field""")
       enterInputInManualAddressPage("4 Testing Lane", "Address line 1")

      And("""I enter Royal Madeuptown in the Town or city field""")
       enterInputInManualAddressPage("Royal Madeuptown", "Town or city")

      And("""I enter ZZ9Z 9TT in the Postcode field""")
       enterInputInManualAddressPage("ZZ9Z 9TT", "Postcode")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""click on confirm button""")
       saveAndContinue()

      Then("page navigates to Check Your Answers")
       verifyPageHeading("Check Your Answers")

      And("answers page should have h2 header Background")
       verifyH2Header("Background")

      And("answers page should have h2 header About you")
       verifyH2Header("About you")

      And("answers page should not have h2 header About the individual")
       verifyH2HeaderNotDisplayed("About the individual")

      When("I click on change button for Are you the individual that the disclosure will be about?")
       clickOnChangeButton("Are you the individual that the disclosure will be about?")

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

      And("I select Checkbox Self-employment income at Position 5")
       clickOnCheckBox("Self-employment income", "5")

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

      And("I select Radio Button Yes, and I know their National Insurance number at Position 1")
       clickOnRadioButton("Yes, and I know their National Insurance number","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I enter AZ 12 34 56 D in the TextBox field")
       enterInputInTextBox("AZ 12 34 56 D")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I select Radio Button Yes, and I know their VAT registration number at Position 1")
       clickOnRadioButton("Yes, and I know their VAT registration number","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I enter 123456789 in the TextBox field")
       enterInputInTextBox("123456789")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I select Radio Button Yes, and I know their Unique Taxpayer Reference (UTR) at Position 1")
       clickOnRadioButton("Yes, and I know their Unique Taxpayer Reference (UTR)","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I enter 1234567890 in the TextBox field")
       enterInputInTextBox("1234567890")

      And("""click on Save and Continue button""")
       saveAndContinue()

      When("""And enter country name United Kingdom, then select country United Kingdom""")
       enterInputInTextBox("United Kingdom")
       selectfromDropdown("United Kingdom")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""And I click on the hyperlink with text Enter the address manually""")
       clickOnLink("Enter the address manually")

      And("""I enter 2 Testing Lane in the Address line 1 field""")
       enterInputInManualAddressPage("2 Testing Lane", "Address line 1")

      And("""I enter Royal Madeuptown in the Town or city field""")
       enterInputInManualAddressPage("Royal Madeuptown", "Town or city")

      And("""I enter ZZ9Z 9TT in the Postcode field""")
       enterInputInManualAddressPage("ZZ9Z 9TT", "Postcode")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""click on confirm button""")
       saveAndContinue()

      And("I enter Individual full name in the TextBox field")
       enterInputInTextBox("Individual full name")

      And("click on Save and Continue button")
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

      Then("page navigates to Check Your Answers")
       verifyPageHeading("Check Your Answers")

      And("answers page should have h2 header Background")
       verifyH2Header("Background")

      And("Background section has following")
       val backgroundRows =
        Table(
          ("lineNo", "label", "answer", "url"),
          ("1", "Will you be making a disclosure because you received a letter from HMRC?", "Yes", "letter-from-hmrc/change"),
          ("2", "Case reference", "CFSS-1234567", "hmrc-letter-reference/change"),
          ("3", "Who this disclosure is for", "An individual", "what-is-this-disclosure-about/change"),
          ("4", "Are you the individual that the disclosure will be about?", "I am an accountant or tax agent", "are-you-the-entity/change"),
          ("5", "Are you representing an organisation?", "Yes", "representing-organisation/change"),
          ("6", "Name of the organisation you represent", "represent org", "representing-organisation-name/change"),
          ("7", "The disclosure will be about", "Offshore and onshore liabilities", "disclose-offshore-liabilities/change")
        )
      thenBackgroundSectionHasFollowing(backgroundRows)

      And("answers page should have h2 header About you")
       verifyH2Header("About you")

      And("line 1 should have a label Your full name an answer with Individual full name and change URL ends with your-full-name/change")
       verifyAboutYouAnswers("1", "Your full name", "Individual full name", "your-full-name/change")

      And("line 2 should have a label Your contact preference an answer with Email,Telephone and change URL ends with contact-preference/change")
       verifyAboutYouAnswers("2", "Your contact preference", "Email,Telephone", "contact-preference/change")

      And("line 3 should have a label Your email address an answer with abc@abc.com and change URL ends with your-email-address/change")
       verifyAboutYouAnswers("3", "Your email address", "abc@abc.com", "your-email-address/change")

      And("line 4 should have a label Your telephone number an answer with 07777 777777 and change URL ends with your-telephone-number/change")
       verifyAboutYouAnswers("4", "Your telephone number", "07777 777777", "your-telephone-number/change")

      And("line 5 should have a label Your address an answer with 1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with your-address/lookup/change")
       verifyAboutYouAnswers("5", "Your address", "1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom", "your-address/lookup/change")

      And("answers page should have h2 header About the individual")
       verifyH2Header("About the individual")

      And("About The Individual section should have a label Individual’s full name at line 1 an answer with Individual full name and change URL ends with individual-full-name/change")
       verifyAboutTheIndividualAnswers("Individual’s full name", "1", "Individual full name", "individual-full-name/change")

      And("About The Individual section should have a label Individual’s date of birth at line 2 an answer with 01 January 1980 and change URL ends with individual-date-of-birth/change")
       verifyAboutTheIndividualAnswers("Individual’s date of birth", "2", "01 January 1980", "individual-date-of-birth/change")

      And("About The Individual section should have a label Individual’s main occupation at line 3 an answer with Dentist and change URL ends with individual-main-occupation/change")
       verifyAboutTheIndividualAnswers("Individual’s main occupation", "3", "Dentist", "individual-main-occupation/change")

      And("About The Individual section should have a label Does the individual have a National Insurance number, as far as you’re aware? at line 4 an answer with Yes, and I know their National Insurance number and change URL ends with individual-have-national-insurance-number/change")
       verifyAboutTheIndividualAnswers("Does the individual have a National Insurance number, as far as you’re aware?", "4", "Yes, and I know their National Insurance number", "individual-have-national-insurance-number/change")

      And("About The Individual section should have a label Individual’s National Insurance number at line 5 an answer with AZ123456D and change URL ends with individual-national-insurance-number/change")
       verifyAboutTheIndividualAnswers("Individual’s National Insurance number", "5", "AZ123456D", "individual-national-insurance-number/change")

      And("About The Individual section should have a label Is the individual registered for VAT, as far you’re aware? at line 6 an answer with Yes, and I know their VAT registration number and change URL ends with individual-registered-for-vat/change")
       verifyAboutTheIndividualAnswers("Is the individual registered for VAT, as far you’re aware?", "6", "Yes, and I know their VAT registration number", "individual-registered-for-vat/change")

      And("About The Individual section should have a label Individual’s VAT registration number at line 7 an answer with 123456789 and change URL ends with individual-vat-registration/change")
       verifyAboutTheIndividualAnswers("Individual’s VAT registration number", "7", "123456789", "individual-vat-registration/change")

      And("About The Individual section should have a label Is the individual registered for Self Assessment, as far as you’re aware? at line 8 an answer with Yes, and I know their Unique Taxpayer Reference (UTR) and change URL ends with individual-self-assessment/change")
       verifyAboutTheIndividualAnswers("Is the individual registered for Self Assessment, as far as you’re aware?","8","Yes, and I know their Unique Taxpayer Reference (UTR)","individual-self-assessment/change")

      And("About The Individual section should have a label Individual’s Unique Taxpayer Reference at line 9 an answer with 1234567890 and change URL ends with individual-utr/change")
       verifyAboutTheIndividualAnswers("Individual’s Unique Taxpayer Reference", "9", "1234567890", "individual-utr/change")

      And("About The Individual section should have a label Individual’s address at line 10 an answer with 2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with individual-address/lookup/change")
       verifyAboutTheIndividualAnswers("Individual’s address", "10", "2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom", "individual-address/lookup/change")

      When("I click on send notification button")
       SendNotification()

      Then("page navigates to You have sent the notification")
       verifyPageHeading("You have sent the notification")

      And("the case reference should be CFSS-1234567")
       verifySubmittedCaseRef("CFSS-1234567")
    }
  }
}
