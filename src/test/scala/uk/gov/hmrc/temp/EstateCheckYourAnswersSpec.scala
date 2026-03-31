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

import uk.gov.hmrc.specsteps.AreYouRepresentingOrganisationStepDefSteps._
import uk.gov.hmrc.specsteps.CaseManagementStepDefSteps._
import uk.gov.hmrc.specsteps.CheckYourAnswersStepDefSteps._
import uk.gov.hmrc.specsteps.IndividualAreYouRegisteredForSelfAssessmentStepDefSteps._
import uk.gov.hmrc.specsteps.NotificationSubmittedStepDefSteps._
import uk.gov.hmrc.specsteps.OffshoreDisclosureStepDefSteps._
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps._

class EstateCheckYourAnswersSpec extends BaseSpec {

  Feature("An Estate is able to check their answers for About the person who died section before submitting page") {

    Scenario("An Estate - CYA and send notification") {
      Given("I am on Check Your Answers page")
        // Possible match (best=0.56)
        givenIAmOnStringPage("")
        // --- Other possible matches ---
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page

      Then("answers page should have h2 header Background")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")
        // --- Other possible matches ---
        // thenAnswersPageShouldNotHaveH2HeaderString() [0.52] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should not have h2 header {string}

      And("Background section has following")
        // Possible match (best=1.00)
        thenBackgroundSectionHasFollowing(null)

      And("answers page should have h2 header About you")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")
        // --- Other possible matches ---
        // thenAnswersPageShouldNotHaveH2HeaderString() [0.52] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should not have h2 header {string}

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
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // thenAnswersPageShouldNotHaveH2HeaderString() [0.52] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should not have h2 header {string}
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.49] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page

      And("About the person who died section should have a label Person’s full name at line 1 an answer with Estate Person and change URL ends with estates-individual-full-name/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page

      And("About the person who died section should have a label Person’s date of birth at line 2 an answer with 01 January 1980 and change URL ends with estates-individual-date-of-birth/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}

      And("About the person who died section should have a label Person’s main occupation at line 3 an answer with Dentist and change URL ends with estates-individual-main-occupation/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}

      And("About the person who died section should have a label Did the person have a National Insurance number, as far as you’re aware? at line 4 an answer with Yes, and I know their National Insurance number and change URL ends with estates-have-national-insurance-number/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnDoYouHaveANationalInsuranceNumberPage() [0.51] (DoYouHaveNationalInsuranceNumStepDefSteps.scala) pattern: I am on Do you have a National Insurance number Page
        // givenIAmOnDoesTheIndividualHaveANationalInsuranceNumberPage() [0.47] (IndividualDoesIndividualHaveNINumStepDefSteps.scala) pattern: I am on Does the individual have a National Insurance number Page

      And("About the person who died section should have a label Person’s National Insurance number at line 5 an answer with AZ123456D and change URL ends with estates-individual-national-insurance-number/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnDoesTheIndividualHaveANationalInsuranceNumberPage() [0.52] (IndividualDoesIndividualHaveNINumStepDefSteps.scala) pattern: I am on Does the individual have a National Insurance number Page

      And("About the person who died section should have a label Was the person registered for VAT, as far as you’re aware? at line 6 an answer with Yes, and I know their VAT registration number and change URL ends with estates-individual-registered-for-vat/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnAreYouRegisteredForVATPage() [0.54] (AreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Are you registered for VAT Page
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualSVATRegistrationNumberPage() [0.52] (WhatIsYourVATNumberStepDefSteps.scala) pattern: I am on What is the individual’s VAT registration number page
        // givenIAmOnIsTheIndividualRegisteredForVATAsFarYouReAwarePageAsStringTaxPayer() [0.52] (IndividualAreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Is the individual registered for VAT, as far you’re aware page as {string} tax payer
        // givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer() [0.47] (IndividualAreYouRegisteredForSelfAssessmentStepDefSteps.scala) pattern: I am on Is the individual registered for Self Assessment, as far as you’re aware page as {string} tax payer
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.45] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page

      And("About the person who died section should have a label Person’s VAT registration number at line 7 an answer with 123456789 and change URL ends with estates-individual-vat-registration/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualSVATRegistrationNumberPage() [0.52] (WhatIsYourVATNumberStepDefSteps.scala) pattern: I am on What is the individual’s VAT registration number page

      And("About the person who died section should have a label Was the person registered for Self Assessment, as far as you’re aware? at line 8 an answer with Yes, and I know their Unique Taxpayer Reference (UTR) and change URL ends with estates-individual-self-assessment/change")
        // Possible match (best=0.75)
        givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer("")
        // --- Other possible matches ---
        // givenIAmOnIsTheIndividualRegisteredForVATAsFarYouReAwarePageAsStringTaxPayer() [0.70] (IndividualAreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Is the individual registered for VAT, as far you’re aware page as {string} tax payer
        // givenIAmOnWhatIsTheIndividualSMainOccupationAsStringTaxPayer() [0.60] (IndividualWhatIsYourMainOccupationStepDefSteps.scala) pattern: I am on What is the individual’s main occupation as {string} tax payer
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.58] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnAreYouRegisteredForSelfAssessmentPage() [0.56] (AreYouRegisteredForSelfAssessmentStepDefSteps.scala) pattern: I am on Are you registered for Self Assessment Page
        // givenIAmOnWhatIsTheIndividualSDateOfBirthPageAsStringTaxPayer() [0.54] (IndividualWhatIsYourDOBStepDefSteps.scala) pattern: I am on What is the individual’s date of birth page as {string} tax payer
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualUniqueTaxReferencePage() [0.51] (WhatIsYourUniqueTaxReferenceStepDefSteps.scala) pattern: I am on What is the individual Unique Tax Reference Page
        // givenIAmOnWhatIsYourFullNamePageForStringTaxPayer() [0.47] (IndividualWhatIsYourFullNameStepDefSteps.scala) pattern: I am on What is your full name page for {string} tax payer
        // thenTheCaseReferenceShouldBeString() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: the case reference should be {string}
        // givenIAmOnAreYouRegisteredForVATPage() [0.47] (AreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Are you registered for VAT Page
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.45] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page

      And("About the person who died section should have a label Person’s Unique Taxpayer Reference at line 9 an answer with 1234567890 and change URL ends with estates-individual-utr/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualSMainOccupationAsStringTaxPayer() [0.50] (IndividualWhatIsYourMainOccupationStepDefSteps.scala) pattern: I am on What is the individual’s main occupation as {string} tax payer
        // thenTheCaseReferenceShouldBeString() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: the case reference should be {string}
        // givenIAmOnWhatIsTheIndividualSDateOfBirthPageAsStringTaxPayer() [0.46] (IndividualWhatIsYourDOBStepDefSteps.scala) pattern: I am on What is the individual’s date of birth page as {string} tax payer

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

    Scenario("An Estate - Background - Change route - Are you the executor or administrator of the estate that the disclosure will be about? from No to Yes") {
      Given("I am on Check Your Answers page")
        // Possible match (best=0.56)
        givenIAmOnStringPage("")
        // --- Other possible matches ---
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page

      When("I click on change button for Are you the executor or administrator of the estate that the disclosure will be about?")
        // Possible match (best=0.60)
        whenIClickOnMakeADisclosureButton()
        // --- Other possible matches ---
        // whenIClickOnChangeButtonForString() [0.60] (CheckYourAnswersStepDefSteps.scala) pattern: I click on change button for {string}
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.55] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // givenIAmNavigatedToAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.51] (AreYouTheIndividualStepDefSteps.scala) pattern: I am navigated to Are you the individual that the disclosure will be about? Page
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.49] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page

      And("I select Radio Button Yes, I am the executor or administrator at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
        // whenISelectRadioButtonStringAtPositionString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I select Radio Button {string} at Position {string}
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()
        // --- Other possible matches ---
        // whenIClickOnContinueButton() [0.70] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenClickOnContinueButton() [0.70] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // thenSaveAndContinueButtonIsDisplayed() [0.47] (HmrcLetterReferencePageStepDefSteps.scala) pattern: save and Continue Button is displayed
        // thenContinueButtonDisplayed() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: Continue Button displayed
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.47] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue

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

      And("answers page should have h2 header About you")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")
        // --- Other possible matches ---
        // thenAnswersPageShouldNotHaveH2HeaderString() [0.52] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should not have h2 header {string}

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
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // thenAnswersPageShouldNotHaveH2HeaderString() [0.52] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should not have h2 header {string}
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.49] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page

      And("About the person who died section should have a label Person’s full name at line 1 an answer with Estate Person and change URL ends with estates-individual-full-name/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page

      And("About the person who died section should have a label Person’s date of birth at line 2 an answer with 01 January 1980 and change URL ends with estates-individual-date-of-birth/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}

      And("About the person who died section should have a label Person’s main occupation at line 3 an answer with Dentist and change URL ends with estates-individual-main-occupation/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}

      And("About the person who died section should have a label Did the person have a National Insurance number, as far as you’re aware? at line 4 an answer with Yes, and I know their National Insurance number and change URL ends with estates-have-national-insurance-number/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnDoYouHaveANationalInsuranceNumberPage() [0.51] (DoYouHaveNationalInsuranceNumStepDefSteps.scala) pattern: I am on Do you have a National Insurance number Page
        // givenIAmOnDoesTheIndividualHaveANationalInsuranceNumberPage() [0.47] (IndividualDoesIndividualHaveNINumStepDefSteps.scala) pattern: I am on Does the individual have a National Insurance number Page

      And("About the person who died section should have a label Person’s National Insurance number at line 5 an answer with AZ123456D and change URL ends with estates-individual-national-insurance-number/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnDoesTheIndividualHaveANationalInsuranceNumberPage() [0.52] (IndividualDoesIndividualHaveNINumStepDefSteps.scala) pattern: I am on Does the individual have a National Insurance number Page

      And("About the person who died section should have a label Was the person registered for VAT, as far as you’re aware? at line 6 an answer with Yes, and I know their VAT registration number and change URL ends with estates-individual-registered-for-vat/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnAreYouRegisteredForVATPage() [0.54] (AreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Are you registered for VAT Page
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualSVATRegistrationNumberPage() [0.52] (WhatIsYourVATNumberStepDefSteps.scala) pattern: I am on What is the individual’s VAT registration number page
        // givenIAmOnIsTheIndividualRegisteredForVATAsFarYouReAwarePageAsStringTaxPayer() [0.52] (IndividualAreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Is the individual registered for VAT, as far you’re aware page as {string} tax payer
        // givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer() [0.47] (IndividualAreYouRegisteredForSelfAssessmentStepDefSteps.scala) pattern: I am on Is the individual registered for Self Assessment, as far as you’re aware page as {string} tax payer
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.45] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page

      And("About the person who died section should have a label Person’s VAT registration number at line 7 an answer with 123456789 and change URL ends with estates-individual-vat-registration/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualSVATRegistrationNumberPage() [0.52] (WhatIsYourVATNumberStepDefSteps.scala) pattern: I am on What is the individual’s VAT registration number page

      And("About the person who died section should have a label Was the person registered for Self Assessment, as far as you’re aware? at line 8 an answer with Yes, and I know their Unique Taxpayer Reference (UTR) and change URL ends with estates-individual-self-assessment/change")
        // Possible match (best=0.75)
        givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer("")
        // --- Other possible matches ---
        // givenIAmOnIsTheIndividualRegisteredForVATAsFarYouReAwarePageAsStringTaxPayer() [0.70] (IndividualAreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Is the individual registered for VAT, as far you’re aware page as {string} tax payer
        // givenIAmOnWhatIsTheIndividualSMainOccupationAsStringTaxPayer() [0.60] (IndividualWhatIsYourMainOccupationStepDefSteps.scala) pattern: I am on What is the individual’s main occupation as {string} tax payer
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.58] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnAreYouRegisteredForSelfAssessmentPage() [0.56] (AreYouRegisteredForSelfAssessmentStepDefSteps.scala) pattern: I am on Are you registered for Self Assessment Page
        // givenIAmOnWhatIsTheIndividualSDateOfBirthPageAsStringTaxPayer() [0.54] (IndividualWhatIsYourDOBStepDefSteps.scala) pattern: I am on What is the individual’s date of birth page as {string} tax payer
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualUniqueTaxReferencePage() [0.51] (WhatIsYourUniqueTaxReferenceStepDefSteps.scala) pattern: I am on What is the individual Unique Tax Reference Page
        // givenIAmOnWhatIsYourFullNamePageForStringTaxPayer() [0.47] (IndividualWhatIsYourFullNameStepDefSteps.scala) pattern: I am on What is your full name page for {string} tax payer
        // thenTheCaseReferenceShouldBeString() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: the case reference should be {string}
        // givenIAmOnAreYouRegisteredForVATPage() [0.47] (AreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Are you registered for VAT Page
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.45] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page

      And("About the person who died section should have a label Person’s Unique Taxpayer Reference at line 9 an answer with 1234567890 and change URL ends with estates-individual-utr/change")
        // Possible match (best=0.58)
        thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualSMainOccupationAsStringTaxPayer() [0.50] (IndividualWhatIsYourMainOccupationStepDefSteps.scala) pattern: I am on What is the individual’s main occupation as {string} tax payer
        // thenTheCaseReferenceShouldBeString() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: the case reference should be {string}
        // givenIAmOnWhatIsTheIndividualSDateOfBirthPageAsStringTaxPayer() [0.46] (IndividualWhatIsYourDOBStepDefSteps.scala) pattern: I am on What is the individual’s date of birth page as {string} tax payer

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

      And("the case reference should be CFSS-1234567")
        // Possible match (best=0.58)
        thenTheCaseReferenceShouldBeString("")

    }
  }
}
