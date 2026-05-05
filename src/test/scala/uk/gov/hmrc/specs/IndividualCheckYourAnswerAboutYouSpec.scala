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
import uk.gov.hmrc.specsteps.CheckYourAnswersStepDefSteps.{thenBackgroundSectionHasFollowing, verifyAboutYouAnswers}
import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.whenISelectRadioButtonStringAtPositionString
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{SendNotification, clickOnCheckBox, clickOnLink, clickOnRadioButton, enterInputInTextBox, saveAndContinue, verifyH2Header, verifyH2HeaderNotDisplayed, verifyPageHeading, verifySubmittedCaseRef}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.givenIAmNavigatedToReceivedALetterPage
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps.enterInputInDOBPage

class IndividualCheckYourAnswerAboutYouSpec extends BaseSpec {

  Feature("An individual UK tax payer is able to check their answers for About you section before submitting page") {

    Scenario("For Individual - About You Section Verification") {

      Given("I am navigated to Received A Letter Page")
       givenIAmNavigatedToReceivedALetterPage()

      Then("I select Radio Button Yes at Position 1")
       whenISelectRadioButtonStringAtPositionString("Yes","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      Then("""I enter CFSS-12345678" in the TextBox field""")
       enterInputInTextBox("CFSS-12345678")

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

      Then("""And I select Checkbox Self-employment income" at Position 5""")
       clickOnCheckBox("Self-employment income", "5")

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

      Then("""I enter abc@abc.com in the TextBox field""")
       enterInputInTextBox("abc@abc.com")

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

      And("I enter 1980 in the Year text box field")
       enterInputInDOBPage("1980","Year")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("""I enter Dentist in the TextBox field""")
       enterInputInTextBox("Dentist")

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

      And("I enter 123456789 in the TextBox field")
       enterInputInTextBox("123456789")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I select Radio Button Yes, and I know my Unique Taxpayer Reference (UTR) at Position 1")
       clickOnRadioButton("Yes, and I know my Unique Taxpayer Reference (UTR)","1")

      And("""click on Save and Continue button""")
       saveAndContinue()

      And("I enter 1234567890 in the TextBox field")
       enterInputInTextBox("1234567890")

      And("""click on Save and Continue button""")
       saveAndContinue()

      When("""enter country name United Kingdom, then select country United Kingdom""")
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

      When("I am on Check Your Answers page")
       verifyPageHeading("Check Your Answers")

      Then("page navigates to Check Your Answers")
       verifyPageHeading("Check Your Answers")

      And("answers page should have h2 header Background")
       verifyH2Header("Background")

      And("Background section has following")
      val backgroundRows =
        Table(
          ("lineNo", "label", "answer", "url"),
          ("1", "Will you be making a disclosure because you received a letter from HMRC?", "Yes", "letter-from-hmrc/change"),
          ("2", "Case reference", "CFSS-12345678", "hmrc-letter-reference/change"),
          ("3", "Who this disclosure is for", "An individual", "what-is-this-disclosure-about/change"),
          ("4", "Are you the individual that the disclosure will be about?", "Yes, I am the individual", "are-you-the-entity/change"),
          ("5", "The disclosure will be about", "Offshore and onshore liabilities", "disclose-offshore-liabilities/change")
        )
      thenBackgroundSectionHasFollowing(backgroundRows)

      Then("answers page should have h2 header About you")
       verifyH2Header("About you")

      And("line 1 should have a label Your full name an answer with My full name and change URL ends with your-full-name/change")
       verifyAboutYouAnswers("1", "Your full name", "My full name", "your-full-name/change")

      And("line 2 should have a label Your contact preference an answer with Email,Telephone and change URL ends with contact-preference/change")
       verifyAboutYouAnswers("2", "Your contact preference", "Email,Telephone", "contact-preference/change")

      And("line 3 should have a label Your email address an answer with abc@abc.com and change URL ends with your-email-address/change")
       verifyAboutYouAnswers("3", "Your email address", "abc@abc.com", "your-email-address/change")

      And("line 4 should have a label Your telephone number an answer with 07777 777777 and change URL ends with your-telephone-number/change")
       verifyAboutYouAnswers("4", "Your telephone number", "07777 777777", "your-telephone-number/change")

      And("line 5 should have a label Your address an answer with 2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with your-address/lookup/change")
       verifyAboutYouAnswers("5", "Your address", "2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom", "your-address/lookup/change")

      And("line 6 should have a label Your date of birth an answer with 01 January 1980 and change URL ends with your-date-of-birth/change")
       verifyAboutYouAnswers("6", "Your date of birth", "01 January 1980", "your-date-of-birth/change")

      And("line 7 should have a label Your main occupation an answer with Dentist and change URL ends with your-main-occupation/change")
       verifyAboutYouAnswers("7", "Your main occupation", "Dentist", "your-main-occupation/change")

      And("line 8 should have a label Do you have a National Insurance number? an answer with Yes, and I know my National Insurance number and change URL ends with have-national-insurance-number/change")
       verifyAboutYouAnswers("8", "Do you have a National Insurance number?", "Yes, and I know my National Insurance number", "have-national-insurance-number/change")

      And("line 9 should have a label Your National Insurance number an answer with AZ123456D and change URL ends with your-national-insurance-number/change")
       verifyAboutYouAnswers("9", "Your National Insurance number", "AZ123456D", "your-national-insurance-number/change")

      And("line 10 should have a label Are you registered for VAT? an answer with Yes, and I know my VAT registration number and change URL ends with registered-for-vat/change")
       verifyAboutYouAnswers("10", "Are you registered for VAT?", "Yes, and I know my VAT registration number", "registered-for-vat/change")

      And("line 11 should have a label Your VAT registration number an answer with 123456789 and change URL ends with your-vat-registration/change")
       verifyAboutYouAnswers("11", "Your VAT registration number", "123456789", "your-vat-registration/change")

      And("line 12 should have a label Are you registered for Self Assessment? an answer with Yes, and I know my Unique Taxpayer Reference (UTR) and change URL ends with registered-for-self-assessment/change")
       verifyAboutYouAnswers("12", "Are you registered for Self Assessment?", "Yes, and I know my Unique Taxpayer Reference (UTR)", "registered-for-self-assessment/change")

      And("line 13 should have a label Your Unique Taxpayer Reference an answer with 1234567890 and change URL ends with your-utr/change")
       verifyAboutYouAnswers("13", "Your Unique Taxpayer Reference", "1234567890", "your-utr/change")

      And("answers page should not have h2 header About the individual")
       verifyH2HeaderNotDisplayed("About the individual")

      When("I click on send notification button")
       SendNotification()

      Then("page navigates to You have sent your notification")
       verifyPageHeading("You have sent your notification")

      And("the case reference should be CFSS-12345678")
       verifySubmittedCaseRef("CFSS-12345678")
    }
  }
}
