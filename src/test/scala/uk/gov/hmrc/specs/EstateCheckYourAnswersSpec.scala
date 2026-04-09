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
import uk.gov.hmrc.specsteps.AreYouRepresentingOrganisationStepDefSteps.givenINavigateToStringPage
import uk.gov.hmrc.specsteps.CaseManagementStepDefSteps.andOnTheHomepageIClickContinueToNavigateToTheXPage
import uk.gov.hmrc.specsteps.CheckYourAnswersStepDefSteps.{givenIAmOnStringPage, thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString, thenAnswersPageShouldHaveH2HeaderString, thenBackgroundSectionHasFollowing, thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString}
import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.whenISelectRadioButtonStringAtPositionString
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{clickOnCheckBox, clickOnLink, clickOnRadioButton, enterInputInTextBox, saveAndContinue, verifyH2Header, verifyPageHeading}
import uk.gov.hmrc.specsteps.IndividualAreYouRegisteredForSelfAssessmentStepDefSteps.givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.NotificationSubmittedStepDefSteps.{thenTheCaseReferenceShouldBeString, whenIClickOnSendNotificationButton}
import uk.gov.hmrc.specsteps.OffshoreDisclosureStepDefSteps.whenIClickOnMakeADisclosureButton
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.{givenIAmNavigatedToReceivedALetterPage, whenClickOnSaveAndContinueButton, whenISelectYesRadioButton}

class EstateCheckYourAnswersSpec extends BaseSpec {

  Feature("An Estate is able to check their answers for About the person who died section before submitting page") {
// this needs to match the original background. 
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

      Given("I am on Check Your Answers page")
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
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")

      And("line 1 should have a label Your full name an answer with Estate full name and change URL ends with your-full-name/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 2 should have a label Your contact preference an answer with Email,Telephone and change URL ends with contact-preference/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 3 should have a label Your email address an answer with abc@abc.com and change URL ends with your-email-address/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 4 should have a label Your telephone number an answer with 07777 777777 and change URL ends with your-telephone-number/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 5 should have a label Your address an answer with 1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with your-address/lookup/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("answers page should have h2 header About the person who died")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")

      And("About the person who died section should have a label Person’s full name at line 1 an answer with Estate Person and change URL ends with estates-individual-full-name/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Person’s date of birth at line 2 an answer with 01 January 1980 and change URL ends with estates-individual-date-of-birth/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Person’s main occupation at line 3 an answer with Dentist and change URL ends with estates-individual-main-occupation/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Did the person have a National Insurance number, as far as you’re aware? at line 4 an answer with Yes, and I know their National Insurance number and change URL ends with estates-have-national-insurance-number/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Person’s National Insurance number at line 5 an answer with AZ123456D and change URL ends with estates-individual-national-insurance-number/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Was the person registered for VAT, as far as you’re aware? at line 6 an answer with Yes, and I know their VAT registration number and change URL ends with estates-individual-registered-for-vat/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Person’s VAT registration number at line 7 an answer with 123456789 and change URL ends with estates-individual-vat-registration/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Was the person registered for Self Assessment, as far as you’re aware? at line 8 an answer with Yes, and I know their Unique Taxpayer Reference (UTR) and change URL ends with estates-individual-self-assessment/change")
        // Possible match (best=0.75)
        givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer("")

      And("About the person who died section should have a label Person’s Unique Taxpayer Reference at line 9 an answer with 1234567890 and change URL ends with estates-individual-utr/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      When("I click on send notification button")
        // Possible match (best=1.00)
        whenIClickOnSendNotificationButton()

      Then("page navigates to You have sent the notification")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")

      And("the case reference should be CFSS-1234567")
        // Possible match (best=0.58)
        thenTheCaseReferenceShouldBeString("")
    }

    Scenario("An Estate - Background - Change route - Are you the executor or administrator of the estate that the disclosure will be about? from No to Yes") {
      Given("I am on Check Your Answers page")
        // Possible match (best=0.56)
        givenIAmOnStringPage("")

      When("I click on change button for Are you the executor or administrator of the estate that the disclosure will be about?")
        // Possible match (best=0.60)
        whenIClickOnMakeADisclosureButton()

      And("I select Radio Button Yes, I am the executor or administrator at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      Then("page navigates to Check Your Answers")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")

      And("answers page should have h2 header Background")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")

      And("Background section has following")
        // Possible match (best=1.00)
        thenBackgroundSectionHasFollowing(null)

      And("answers page should have h2 header About you")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")

      And("line 1 should have a label Your full name an answer with Estate full name and change URL ends with your-full-name/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 2 should have a label Your contact preference an answer with Email,Telephone and change URL ends with contact-preference/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 3 should have a label Your email address an answer with abc@abc.com and change URL ends with your-email-address/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 4 should have a label Your telephone number an answer with 07777 777777 and change URL ends with your-telephone-number/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 5 should have a label Your address an answer with 1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with your-address/lookup/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("answers page should have h2 header About the person who died")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")

      And("About the person who died section should have a label Person’s full name at line 1 an answer with Estate Person and change URL ends with estates-individual-full-name/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Person’s date of birth at line 2 an answer with 01 January 1980 and change URL ends with estates-individual-date-of-birth/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Person’s main occupation at line 3 an answer with Dentist and change URL ends with estates-individual-main-occupation/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Did the person have a National Insurance number, as far as you’re aware? at line 4 an answer with Yes, and I know their National Insurance number and change URL ends with estates-have-national-insurance-number/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Person’s National Insurance number at line 5 an answer with AZ123456D and change URL ends with estates-individual-national-insurance-number/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Was the person registered for VAT, as far as you’re aware? at line 6 an answer with Yes, and I know their VAT registration number and change URL ends with estates-individual-registered-for-vat/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Person’s VAT registration number at line 7 an answer with 123456789 and change URL ends with estates-individual-vat-registration/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About the person who died section should have a label Was the person registered for Self Assessment, as far as you’re aware? at line 8 an answer with Yes, and I know their Unique Taxpayer Reference (UTR) and change URL ends with estates-individual-self-assessment/change")
        // Possible match (best=0.75)
        givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer("")

      And("About the person who died section should have a label Person’s Unique Taxpayer Reference at line 9 an answer with 1234567890 and change URL ends with estates-individual-utr/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      When("I click on send notification button")
        // Possible match (best=1.00)
        whenIClickOnSendNotificationButton()

      Then("page navigates to You have sent your notification")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")

      And("the case reference should be CFSS-1234567")
        // Possible match (best=0.58)
        thenTheCaseReferenceShouldBeString("")
    }
  }
}
