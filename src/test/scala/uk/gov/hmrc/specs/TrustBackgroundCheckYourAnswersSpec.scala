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
import uk.gov.hmrc.specsteps.CheckYourAnswersStepDefSteps.{clickOnChangeButton, givenIAmOnStringPage, thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString, thenAnswersPageShouldHaveH2HeaderString, thenBackgroundSectionHasFollowing, thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString, verifyAboutTheTrustAnswers, verifyAboutYouAnswers}
import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.whenISelectRadioButtonStringAtPositionString
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{SendNotification, clickOnCheckBox, clickOnLink, clickOnRadioButton, enterInputInTextBox, saveAndContinue, verifyH2Header, verifyPageHeading, verifySubmittedCaseRef}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.NotificationSubmittedStepDefSteps.{thenTheCaseReferenceShouldBeString, whenIClickOnSendNotificationButton}
import uk.gov.hmrc.specsteps.OffshoreDisclosureStepDefSteps.whenIClickOnMakeADisclosureButton
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.{givenIAmNavigatedToReceivedALetterPage, whenClickOnSaveAndContinueButton, whenISelectYesRadioButton}

class TrustBackgroundCheckYourAnswersSpec extends BaseSpec {

  Feature("A trust is able to check their answers for background section before submitting page") {

    Scenario("Trust - Background - Change route verification") {
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

      Then("""I enter Your full name in the TextBox field""")
      enterInputInTextBox("Your full name")

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

      Then("""I enter 2 Testing Lane in the Address line 1 field""")
      enterInputInManualAddressPage("2 Testing Lane", "Address line 1")

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

      When("I click on change button for Are you a trustee of the trust that the disclosure will be about?")
      clickOnChangeButton("Are you a trustee of the trust that the disclosure will be about?")

      And("I select Radio Button Yes, I am a trustee at Position 1")
      clickOnRadioButton("Yes, I am a trustee","1")

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
          ("3", "Who this disclosure is for", "A trust", "what-is-this-disclosure-about/change"),
          ("4", "Are you a trustee of the trust that the disclosure will be about?", "Yes, I am a trustee", "are-you-the-entity/change"),
          ("5", "The disclosure will be about", "Offshore and onshore liabilities", "disclose-offshore-liabilities/change")
        )
      thenBackgroundSectionHasFollowing(backgroundRows)

      And("answers page should have h2 header About you")
      verifyH2Header("About you")

      And("line 1 should have a label Your full name an answer with Your full name and change URL ends with your-full-name/change")
      verifyAboutYouAnswers("1", "Your full name", "Your full name", "your-full-name/change")

      And("line 2 should have a label Your contact preference an answer with Email,Telephone and change URL ends with contact-preference/change")
      verifyAboutYouAnswers("2", "Your contact preference", "Email,Telephone", "contact-preference/change")

      And("line 3 should have a label Your email address an answer with abc@abc.com and change URL ends with your-email-address/change")
      verifyAboutYouAnswers("3", "Your email address", "abc@abc.com", "your-email-address/change")

      And("line 4 should have a label Your telephone number an answer with 07777 777777 and change URL ends with your-telephone-number/change")
      verifyAboutYouAnswers("4", "Your telephone number", "07777 777777", "your-telephone-number/change")

      And("line 5 should have a label Your address an answer with 2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with your-address/lookup/change")
      verifyAboutYouAnswers("5", "Your address", "2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom", "your-address/lookup/change")

      And("answers page should have h2 header About the trust")
      verifyH2Header("About the trust")

      And("About The Trust section should have a label Trust’s Name at line 1 an answer with Trust name and change URL ends with trust-name/change")
      verifyAboutTheTrustAnswers("Trust’s Name", "1", "Trust name", "trust-name/change")

      And("About The Trust section should have a label Trust address at line 2 an answer with The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with trust-address/lookup/change")
      verifyAboutTheTrustAnswers("Trust address", "2", "The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom", "trust-address/lookup/change")

      When("I click on change button for Are you a trustee of the trust that the disclosure will be about?")
      clickOnChangeButton("Are you a trustee of the trust that the disclosure will be about?")

      And("click on Save and Continue button")
      saveAndContinue()

      Then("page navigates to Check Your Answers")
      verifyPageHeading("Check Your Answers")

      And("Background section has following")
      val backgroundRow =
        Table(
          ("lineNo", "label", "answer", "url"),
          ("4", "Are you a trustee of the trust that the disclosure will be about?", "Yes, I am a trustee", "are-you-the-entity/change"),
        )
      thenBackgroundSectionHasFollowing(backgroundRow)

      When("I click on send notification button")
      SendNotification()

      Then("page navigates to You have sent your notification")
      verifyPageHeading("You have sent your notification")

      And("the case reference should be CFSS-1234567")
      verifySubmittedCaseRef("CFSS-1234567")
    }
  }
}
