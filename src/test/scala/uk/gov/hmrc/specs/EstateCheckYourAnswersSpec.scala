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
import uk.gov.hmrc.specsteps.CheckYourAnswersStepDefSteps.{clickOnChangeButton, thenBackgroundSectionHasFollowing, verifyAboutThePersonDiedAnswers, verifyAboutYouAnswers}
import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.whenISelectRadioButtonStringAtPositionString
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{SendNotification, clickOnCheckBox, clickOnLink, clickOnRadioButton, enterInputInTextBox, saveAndContinue, verifyH2Header, verifyPageHeading, verifySubmittedCaseRef}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.givenIAmNavigatedToReceivedALetterPage
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps.enterInputInDOBPage

class EstateCheckYourAnswersSpec extends BaseSpec {

  Feature("An Estate is able to check their answers for About the person who died section before submitting page") {
    Scenario("An Estate - CYA and send notification") {
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

      Then("""I select Radio Button An estate at Position 2""")
       clickOnRadioButton("An estate","2")

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

      Then("""And I select Checkbox Let property income at Position 3""")
       clickOnCheckBox("Let property income", "3")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I enter Estate Person in the TextBox field""")
       enterInputInTextBox("Estate Person")

      And("""click on Save and Continue button""")
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

      Then("""I enter Estate full name in the TextBox field""")
       enterInputInTextBox("Estate full name")

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

      When("I am on Check Your Answers page")
       verifyPageHeading("Check Your Answers")

      Then("answers page should have h2 header Background")
       verifyH2Header("Background")

      And("Background section has following")
       val backgroundRows =
        Table(
          ("lineNo", "label", "answer", "url"),
          ("1", "Will you be making a disclosure because you received a letter from HMRC?", "Yes", "letter-from-hmrc/change"),
          ("2", "Case reference", "CFSS-1234567", "hmrc-letter-reference/change"),
          ("3", "Who this disclosure is for", "An estate", "what-is-this-disclosure-about/change"),
          ("4", "Are you the executor or administrator of the estate that the disclosure will be about?", "I am an accountant or tax agent", "are-you-the-entity/change"),
          ("5", "Are you representing an organisation?", "Yes", "representing-organisation/change"),
          ("6", "Name of the organisation you represent", "Organization name", "representing-organisation-name/change"),
          ("7", "The disclosure will be about", "Offshore and onshore liabilities", "disclose-offshore-liabilities/change")
        )
      thenBackgroundSectionHasFollowing(backgroundRows)

      And("answers page should have h2 header About you")
        verifyH2Header("About you")

      And("line 1 should have a label Your full name an answer with Estate full name and change URL ends with your-full-name/change")
        verifyAboutYouAnswers("1", "Your full name", "Estate full name", "your-full-name/change")

      And("line 2 should have a label Your contact preference an answer with Email,Telephone and change URL ends with contact-preference/change")
       verifyAboutYouAnswers("2", "Your contact preference", "Email,Telephone", "contact-preference/change")

      And("line 3 should have a label Your email address an answer with abc@abc.com and change URL ends with your-email-address/change")
       verifyAboutYouAnswers("3", "Your email address", "abc@abc.com", "your-email-address/change")

      And("line 4 should have a label Your telephone number an answer with 07777 777777 and change URL ends with your-telephone-number/change")
       verifyAboutYouAnswers("4", "Your telephone number", "07777 777777", "your-telephone-number/change")

      And("line 5 should have a label Your address an answer with 1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with your-address/lookup/change")
       verifyAboutYouAnswers("5", "Your address", "1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom", "your-address/lookup/change")

      And("answers page should have h2 header About the person who died")
       verifyH2Header("About the person who died")

      And("About the person who died section should have a label Person’s full name at line 1 an answer with Estate Person and change URL ends with estates-individual-full-name/change")
       verifyAboutThePersonDiedAnswers("Person’s full name", "1", "Estate Person", "estates-individual-full-name/change")

      And("About the person who died section should have a label Person’s date of birth at line 2 an answer with 01 January 1980 and change URL ends with estates-individual-date-of-birth/change")
       verifyAboutThePersonDiedAnswers("Person’s date of birth", "2", "01 January 1980", "estates-individual-date-of-birth/change")

      And("About the person who died section should have a label Person’s main occupation at line 3 an answer with Dentist and change URL ends with estates-individual-main-occupation/change")
       verifyAboutThePersonDiedAnswers("Person’s main occupation", "3", "Dentist", "estates-individual-main-occupation/change")

      And("About the person who died section should have a label Did the person have a National Insurance number, as far as you’re aware? at line 4 an answer with Yes, and I know their National Insurance number and change URL ends with estates-have-national-insurance-number/change")
       verifyAboutThePersonDiedAnswers("Did the person have a National Insurance number, as far as you’re aware?", "4", "Yes, and I know their National Insurance number", "estates-have-national-insurance-number/change")

      And("About the person who died section should have a label Person’s National Insurance number at line 5 an answer with AZ123456D and change URL ends with estates-individual-national-insurance-number/change")
       verifyAboutThePersonDiedAnswers("Person’s National Insurance number", "5", "AZ123456D", "estates-individual-national-insurance-number/change")

      And("About the person who died section should have a label Was the person registered for VAT, as far as you’re aware? at line 6 an answer with Yes, and I know their VAT registration number and change URL ends with estates-individual-registered-for-vat/change")
       verifyAboutThePersonDiedAnswers("Was the person registered for VAT, as far as you’re aware?", "6", "Yes, and I know their VAT registration number", "estates-individual-registered-for-vat/change")

      And("About the person who died section should have a label Person’s VAT registration number at line 7 an answer with 123456789 and change URL ends with estates-individual-vat-registration/change")
       verifyAboutThePersonDiedAnswers("Person’s VAT registration number", "7", "123456789", "estates-individual-vat-registration/change")

      And("About the person who died section should have a label Was the person registered for Self Assessment, as far as you’re aware? at line 8 an answer with Yes, and I know their Unique Taxpayer Reference (UTR) and change URL ends with estates-individual-self-assessment/change")
       verifyAboutThePersonDiedAnswers("Was the person registered for Self Assessment, as far as you’re aware?", "8", "Yes, and I know their Unique Taxpayer Reference (UTR)", "estates-individual-self-assessment/change")

      And("About the person who died section should have a label Person’s Unique Taxpayer Reference at line 9 an answer with 1234567890 and change URL ends with estates-individual-utr/change")
       verifyAboutThePersonDiedAnswers("Person’s Unique Taxpayer Reference", "9", "1234567890", "estates-individual-utr/change")

      When("I click on send notification button")
       SendNotification()

      Then("page navigates to You have sent the notification")
       verifyPageHeading("You have sent the notification")

      And("the case reference should be CFSS-1234567")
       verifySubmittedCaseRef("CFSS-1234567")
    }

    Scenario("An Estate - Background - Change route - Are you the executor or administrator of the estate that the disclosure will be about? from No to Yes") {
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

      Then("""I select Radio Button An estate at Position 2""")
       clickOnRadioButton("An estate","2")

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

      Then("""And I select Checkbox Let property income at Position 3""")
       clickOnCheckBox("Let property income", "3")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I enter Estate Person in the TextBox field""")
       enterInputInTextBox("Estate Person")

      And("""click on Save and Continue button""")
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

      Then("""I enter Estate full name in the TextBox field""")
       enterInputInTextBox("Estate full name")

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

      When("I am on Check Your Answers page")
       verifyPageHeading("Check Your Answers page")

      When("I click on change button for Are you the executor or administrator of the estate that the disclosure will be about?")
       clickOnChangeButton("Are you the executor or administrator of the estate that the disclosure will be about?")

      And("I select Radio Button Yes, I am the executor or administrator at Position 1")
       clickOnRadioButton("Yes, I am the executor or administrator","1")

      And("click on Save and Continue button")
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
          ("3", "Who this disclosure is for", "An estate", "what-is-this-disclosure-about/change"),
          ("4", "Are you the executor or administrator of the estate that the disclosure will be about?", "Yes, I am the executor or administrator", "are-you-the-entity/change"),
          ("5", "The disclosure will be about", "Offshore and onshore liabilities", "disclose-offshore-liabilities/change")
        )
      thenBackgroundSectionHasFollowing(backgroundRows)

      And("answers page should have h2 header About you")
       verifyH2Header("About you")

      And("line 1 should have a label Your full name an answer with Estate full name and change URL ends with your-full-name/change")
       verifyAboutYouAnswers("1", "Your full name", "Estate full name", "your-full-name/change")

      And("line 2 should have a label Your contact preference an answer with Email,Telephone and change URL ends with contact-preference/change")
       verifyAboutYouAnswers("2", "Your contact preference", "Email,Telephone", "contact-preference/change")

      And("line 3 should have a label Your email address an answer with abc@abc.com and change URL ends with your-email-address/change")
       verifyAboutYouAnswers("3", "Your email address", "abc@abc.com", "your-email-address/change")

      And("line 4 should have a label Your telephone number an answer with 07777 777777 and change URL ends with your-telephone-number/change")
       verifyAboutYouAnswers("4", "Your telephone number", "07777 777777", "your-telephone-number/change")

      And("line 5 should have a label Your address an answer with 1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with your-address/lookup/change")
       verifyAboutYouAnswers("5", "Your address", "1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom", "your-address/lookup/change")

      And("answers page should have h2 header About the person who died")
       verifyH2Header("About the person who died")

      And("About the person who died section should have a label Person’s full name at line 1 an answer with Estate Person and change URL ends with estates-individual-full-name/change")
       verifyAboutThePersonDiedAnswers("Person’s full name", "1", "Estate Person", "estates-individual-full-name/change")

      And("About the person who died section should have a label Person’s date of birth at line 2 an answer with 01 January 1980 and change URL ends with estates-individual-date-of-birth/change")
       verifyAboutThePersonDiedAnswers("Person’s date of birth", "2", "01 January 1980", "estates-individual-date-of-birth/change")

      And("About the person who died section should have a label Person’s main occupation at line 3 an answer with Dentist and change URL ends with estates-individual-main-occupation/change")
       verifyAboutThePersonDiedAnswers("Person’s main occupation", "3", "Dentist", "estates-individual-main-occupation/change")

      And("About the person who died section should have a label Did the person have a National Insurance number, as far as you’re aware? at line 4 an answer with Yes, and I know their National Insurance number and change URL ends with estates-have-national-insurance-number/change")
       verifyAboutThePersonDiedAnswers("Did the person have a National Insurance number, as far as you’re aware?", "4", "Yes, and I know their National Insurance number", "estates-have-national-insurance-number/change")

      And("About the person who died section should have a label Person’s National Insurance number at line 5 an answer with AZ123456D and change URL ends with estates-individual-national-insurance-number/change")
       verifyAboutThePersonDiedAnswers("Person’s National Insurance number", "5", "AZ123456D", "estates-individual-national-insurance-number/change")

      And("About the person who died section should have a label Was the person registered for VAT, as far as you’re aware? at line 6 an answer with Yes, and I know their VAT registration number and change URL ends with estates-individual-registered-for-vat/change")
       verifyAboutThePersonDiedAnswers("Was the person registered for VAT, as far as you’re aware?", "6", "Yes, and I know their VAT registration number", "estates-individual-registered-for-vat/change")

      And("About the person who died section should have a label Person’s VAT registration number at line 7 an answer with 123456789 and change URL ends with estates-individual-vat-registration/change")
       verifyAboutThePersonDiedAnswers("Person’s VAT registration number", "7", "123456789", "estates-individual-vat-registration/change")

      And("About the person who died section should have a label Was the person registered for Self Assessment, as far as you’re aware? at line 8 an answer with Yes, and I know their Unique Taxpayer Reference (UTR) and change URL ends with estates-individual-self-assessment/change")
       verifyAboutThePersonDiedAnswers("Was the person registered for Self Assessment, as far as you’re aware?", "8", "Yes, and I know their Unique Taxpayer Reference (UTR)", "estates-individual-self-assessment/change")

      And("About the person who died section should have a label Person’s Unique Taxpayer Reference at line 9 an answer with 1234567890 and change URL ends with estates-individual-utr/change")
       verifyAboutThePersonDiedAnswers("Person’s Unique Taxpayer Reference", "9", "1234567890", "estates-individual-utr/change")

      When("I click on send notification button")
       SendNotification()

      Then("page navigates to You have sent your notification")
       verifyPageHeading("You have sent your notification")

      And("the case reference should be CFSS-1234567")
       verifySubmittedCaseRef("CFSS-1234567")
    }
  }
}
