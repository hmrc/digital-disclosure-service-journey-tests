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

import uk.gov.hmrc.specsteps.CaseManagementStepDefSteps.andOnTheHomepageIClickContinueToNavigateToTheXPage
import uk.gov.hmrc.specsteps.CheckYourAnswersStepDefSteps.{thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString, thenAnswersPageShouldHaveH2HeaderString, thenBackgroundSectionHasFollowing, thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString}
import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.whenISelectRadioButtonStringAtPositionString
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{SendNotification, clickOnCheckBox, clickOnLink, clickOnRadioButton, enterInputInTextBox, saveAndContinue, verifyH2Header, verifyPageHeading}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.NotificationSubmittedStepDefSteps.{thenTheCaseReferenceShouldBeString, whenIClickOnSendNotificationButton}
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.givenIAmNavigatedToReceivedALetterPage

class CompanyCheckYourAnswerAboutTheCompanySpec extends BaseSpec {

  Feature("A company tax payer is able to check their answers for About the Company section before submitting page") {

    Scenario("About the company - CYA - Send notification") {

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

      When("I am on Check Your Answers page")
        verifyPageHeading("Check Your Answers")

      And("answers page should have h2 header Background")
        verifyH2Header("Background")

      And("Background section has following")
        // Possible match (best=1.00)
        thenBackgroundSectionHasFollowing(null)

      And("answers page should have h2 header About you")
        thenAnswersPageShouldHaveH2HeaderString("")

      And("line 1 should have a label Your full name an answer with Agent full name and change URL ends with your-full-name/change")
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

      Then("answers page should have h2 header About the company")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")
        // --- Other possible matches ---
        // thenAnswersPageShouldNotHaveH2HeaderString() [0.52] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should not have h2 header {string}

      And("About The Company section should have a label Company’s name at line 1 an answer with Company name and change URL ends with company-name/change")
        // Possible match (best=0.57)
        thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page

      And("About The Company section should have a label Company registration number at line 2 an answer with 12345678 and change URL ends with company-registration/change")
        // Possible match (best=0.57)
        thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}

      And("About The Company section should have a label Company’s address at line 3 an answer with The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with company-address/lookup/change")
        // Possible match (best=0.57)
        thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}

      When("I click on send notification button")
        // Possible match (best=1.00)
        whenIClickOnSendNotificationButton()
        // --- Other possible matches ---
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button

      Then("page navigates to You have sent the notification")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("the case reference should be CFSS-1234567")
        // Possible match (best=0.58)
        thenTheCaseReferenceShouldBeString("")

    }
  }
}
