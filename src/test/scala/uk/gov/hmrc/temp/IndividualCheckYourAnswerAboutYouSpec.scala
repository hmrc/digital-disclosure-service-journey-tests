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

import uk.gov.hmrc.specsteps.AreYouRegisteredForVATStepDefSteps._
import uk.gov.hmrc.specsteps.AreYouRepresentingOrganisationStepDefSteps._
import uk.gov.hmrc.specsteps.CheckYourAnswersStepDefSteps._
import uk.gov.hmrc.specsteps.DoYouHaveNationalInsuranceNumStepDefSteps._
import uk.gov.hmrc.specsteps.IndividualAreYouRegisteredForSelfAssessmentStepDefSteps._
import uk.gov.hmrc.specsteps.NotificationSubmittedStepDefSteps._

class IndividualCheckYourAnswerAboutYouSpec extends BaseSpec {

  Feature("An individual UK tax payer is able to check their answers for About you section before submitting page") {

    Scenario("For Individual - About You Section Verification") {
      Given("I am on Check Your Answers page")
        // Possible match (best=0.56)
        givenIAmOnStringPage("")
        // --- Other possible matches ---
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page

      Then("page navigates to Check Your Answers")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("answers page should have h2 header Background")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")
        // --- Other possible matches ---
        // thenAnswersPageShouldNotHaveH2HeaderString() [0.52] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should not have h2 header {string}

      And("Background section has following")
        // Possible match (best=1.00)
        thenBackgroundSectionHasFollowing(null)

      Then("answers page should have h2 header About you")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")
        // --- Other possible matches ---
        // thenAnswersPageShouldNotHaveH2HeaderString() [0.52] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should not have h2 header {string}

      And("line 1 should have a label Your full name an answer with my full name and change URL ends with your-full-name/change")
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

      And("line 5 should have a label Your address an answer with 2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with your-address/lookup/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 6 should have a label Your date of birth an answer with 01 January 1980 and change URL ends with your-date-of-birth/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 7 should have a label Your main occupation an answer with Dentist and change URL ends with your-main-occupation/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // givenIAmOnWhatIsYourMainOccupationPage() [0.47] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I am on What is your main occupation page

      And("line 8 should have a label Do you have a National Insurance number? an answer with Yes, and I know my National Insurance number and change URL ends with have-national-insurance-number/change")
        // Possible match (best=0.57)
        givenIAmOnDoYouHaveANationalInsuranceNumberPage()
        // --- Other possible matches ---
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}

      And("line 9 should have a label Your National Insurance number an answer with AZ123456D and change URL ends with your-national-insurance-number/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // givenIAmOnDoYouHaveANationalInsuranceNumberPage() [0.51] (DoYouHaveNationalInsuranceNumStepDefSteps.scala) pattern: I am on Do you have a National Insurance number Page

      And("line 10 should have a label Are you registered for VAT? an answer with Yes, and I know my VAT registration number and change URL ends with registered-for-vat/change")
        // Possible match (best=0.54)
        givenIAmOnAreYouRegisteredForVATPage()
        // --- Other possible matches ---
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}

      And("line 11 should have a label Your VAT registration number an answer with 123456789 and change URL ends with your-vat-registration/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // givenIAmOnWhatIsYourVATRegistrationNumberPage() [0.49] (WhatIsYourVATNumberStepDefSteps.scala) pattern: I am on What is your VAT registration number page

      And("line 12 should have a label Are you registered for Self Assessment? an answer with Yes, and I know my Unique Taxpayer Reference (UTR) and change URL ends with registered-for-self-assessment/change")
        // Possible match (best=0.58)
        givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer("")
        // --- Other possible matches ---
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnIsTheIndividualRegisteredForVATAsFarYouReAwarePageAsStringTaxPayer() [0.52] (IndividualAreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Is the individual registered for VAT, as far you’re aware page as {string} tax payer
        // givenIAmOnAreYouRegisteredForSelfAssessmentPage() [0.49] (AreYouRegisteredForSelfAssessmentStepDefSteps.scala) pattern: I am on Are you registered for Self Assessment Page

      And("line 13 should have a label Your Unique Taxpayer Reference an answer with 1234567890 and change URL ends with your-utr/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("answers page should not have h2 header About the individual")
        // Possible match (best=0.61)
        thenAnswersPageShouldNotHaveH2HeaderString("")
        // --- Other possible matches ---
        // thenAnswersPageShouldHaveH2HeaderString() [0.60] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should have h2 header {string}

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

      Then("page navigates to You have sent your notification")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("the case reference should be CFSS-12345678")
        // Possible match (best=0.58)
        thenTheCaseReferenceShouldBeString("")

    }
  }
}
