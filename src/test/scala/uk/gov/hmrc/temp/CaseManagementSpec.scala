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

import uk.gov.hmrc.specsteps.CaseManagementStepDefSteps._
import uk.gov.hmrc.specsteps.HomePageStepDefSteps._


class CaseManagementSpec extends BaseSpec {

  Feature("An agent is able to edit and create case") {

    Scenario("Case validation - Edit and create a new case") {
      Given("I navigate to authority wizard page")
        // Possible match (best=1.00)
        givenINavigateToAuthorityWizardPage()
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      When("select Agent from affinityGroup drop down")
        // Possible match (best=0.58)
        whenSelectStringFromAffinityGroupDropDown("Agent")
        // --- Other possible matches ---
        // whenISelectStringFromDropDownString() [0.50] (HomePageStepDefSteps.scala) pattern: I select {string} from drop down {string}
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenSelectStringFromConfidenceLevelDropDown() [0.47] (CaseManagementStepDefSteps.scala) pattern: select {string} from confidenceLevel drop down

      And("select 250 from confidenceLevel drop down")
        // Possible match (best=0.58)
        whenSelectStringFromConfidenceLevelDropDown("")
        // --- Other possible matches ---
        // whenISelectStringFromDropDownString() [0.50] (HomePageStepDefSteps.scala) pattern: I select {string} from drop down {string}
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenSelectStringFromAffinityGroupDropDown() [0.47] (CaseManagementStepDefSteps.scala) pattern: select {string} from affinityGroup drop down

      And("click on submit on wizard page")
        // Possible match (best=1.00)
        whenClickOnSubmitOnWizardPage()
        // --- Other possible matches ---
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button

      And("I click on continue button")
        // Possible match (best=1.00)
        whenIClickOnContinueButton()
        // --- Other possible matches ---
        // whenClickOnContinueButton() [1.00] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // thenContinueButtonDisplayed() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: Continue Button displayed
        // whenClickOnSaveAndContinueButton() [0.47] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button

      Then("on the UsingThisService page I click Make a notification first and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageIClickXAndClickSaveAndContinue("UsingThisService", "Make a notification first")
        // --- Other possible matches ---
        // thenOnTheXPageISelectXAndClickSaveAndContinue() [0.72] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I select (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // thenSaveAndContinueButtonIsDisplayed() [0.47] (HmrcLetterReferencePageStepDefSteps.scala) pattern: save and Continue Button is displayed
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the WillYouBeMakingADisclosure page I select Yes and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageISelectXAndClickSaveAndContinue("WillYouBeMakingADisclosure", "Yes")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.78] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // thenSaveAndContinueButtonIsDisplayed() [0.47] (HmrcLetterReferencePageStepDefSteps.scala) pattern: save and Continue Button is displayed
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.45] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page

      Then("on the CaseReferenceNumber page I enter the CRN into the textbox and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue("CaseReferenceNumber", "the CRN")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.90] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // thenOnTheXPageISelectXAndClickSaveAndContinue() [0.84] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I select (.*) and click save and continue
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.73] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // andVerifyOnTheXPage() [0.71] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.71] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // whenIEnterAnythingInReferenceNumberTextBoxField() [0.62] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter anything in reference number TextBox field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.60] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // whenIEnterNoDataInReferenceNumberTextBoxField() [0.57] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter no data in reference number TextBox field
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // thenIShouldNavigateToReferenceNumberTextBoxField() [0.54] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I should navigate to reference number TextBox field
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // whenIEnterValidNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter valid NI Number TextBox field
        // whenIEnterInvalidNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter invalid NI Number TextBox field
        // whenIEnterStringNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter {string} NI Number TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.49] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // thenTheCaseReferenceShouldBeString() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: the case reference should be {string}
        // whenIEnterStringInTheStringTextBoxField() [0.47] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the DisclosureAbout page I select An Individual and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageISelectXAndClickSaveAndContinue("DisclosureAbout", "An Individual")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.78] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenISelectRadioOptionAnIndividual() [0.47] (WhatIsDisclosureStepDefSteps.scala) pattern: I select radio option An Individual
        // thenSaveAndContinueButtonIsDisplayed() [0.47] (HmrcLetterReferencePageStepDefSteps.scala) pattern: save and Continue Button is displayed
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the AreYouTheEntity page I select Yes, I am the individual and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageISelectXAndClickSaveAndContinue("AreYouTheEntity", "Yes, I am the individual")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.78] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // givenIAmOnTheHomePage() [0.58] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // givenIAmOnStringPage() [0.56] (CheckYourAnswersStepDefSteps.scala) pattern: I am on {string} page
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenISelectRadioOptionAnIndividual() [0.47] (WhatIsDisclosureStepDefSteps.scala) pattern: I select radio option An Individual
        // givenIAmOnAreYouRegisteredForVATPage() [0.47] (AreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Are you registered for VAT Page
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.45] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page

      Then("on the OffshoreLiabilities page I select Yes and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageISelectXAndClickSaveAndContinue("OffshoreLiabilities", "Yes")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.78] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the OnshoreLiabilities page I select No and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageISelectXAndClickSaveAndContinue("OnshoreLiabilities", "No")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.78] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      When("on the WhereDidTheIncomeComeFrom page I click on the header hyperlink")
        // Possible match (best=1.00)
        whenOnTheXPageIClickOnTheHeaderHyperlink("WhereDidTheIncomeComeFrom")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.55] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenClickOnHyperlinkString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on Hyperlink {string}
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      And("on the homepage I click continue to navigate to the ViewEditCreateCase page")
        // Possible match (best=1.00)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("ViewEditCreateCase")
        // --- Other possible matches ---
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.70] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.61] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // givenIAmOnTheHomePage() [0.58] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page
        // andIClickTheEditLinkWithinTheCaseTable() [0.47] (CaseManagementStepDefSteps.scala) pattern: I click the Edit link within the case table
        // whenISelectCreateANewCase() [0.47] (CaseManagementStepDefSteps.scala) pattern: I select create a new case

      Then("the values within the datatable are verified")
        // Possible match (best=1.00)
        givenTheValuesWithinTheDatatableAreVerified()

      And("I click the Edit link within the case table")
        // Possible match (best=1.00)
        andIClickTheEditLinkWithinTheCaseTable()

      Then("on the YouHaveStartedNotification page I click Continue or edit this notification and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageIClickXAndClickSaveAndContinue("YouHaveStartedNotification", "Continue or edit this notification")
        // --- Other possible matches ---
        // thenOnTheXPageISelectXAndClickSaveAndContinue() [0.72] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I select (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.55] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // thenSaveAndContinueButtonIsDisplayed() [0.47] (HmrcLetterReferencePageStepDefSteps.scala) pattern: save and Continue Button is displayed
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      And("on the WillYouBeMakingADisclosure page I click on the header hyperlink")
        // Possible match (best=1.00)
        whenOnTheXPageIClickOnTheHeaderHyperlink("WillYouBeMakingADisclosure")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.55] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenClickOnHyperlinkString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on Hyperlink {string}
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.45] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page

      And("on the homepage I click continue to navigate to the ViewEditCreateCase page")
        // Possible match (best=1.00)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("ViewEditCreateCase")
        // --- Other possible matches ---
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.70] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.61] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // givenIAmOnTheHomePage() [0.58] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page
        // andIClickTheEditLinkWithinTheCaseTable() [0.47] (CaseManagementStepDefSteps.scala) pattern: I click the Edit link within the case table
        // whenISelectCreateANewCase() [0.47] (CaseManagementStepDefSteps.scala) pattern: I select create a new case

      And("I select create a new case")
        // Possible match (best=1.00)
        whenISelectCreateANewCase()
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      Then("on the UsingThisService page I click Make a notification first and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageIClickXAndClickSaveAndContinue("UsingThisService", "Make a notification first")
        // --- Other possible matches ---
        // thenOnTheXPageISelectXAndClickSaveAndContinue() [0.72] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I select (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // thenSaveAndContinueButtonIsDisplayed() [0.47] (HmrcLetterReferencePageStepDefSteps.scala) pattern: save and Continue Button is displayed
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the WillYouBeMakingADisclosure page I select Yes and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageISelectXAndClickSaveAndContinue("WillYouBeMakingADisclosure", "Yes")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.78] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // thenSaveAndContinueButtonIsDisplayed() [0.47] (HmrcLetterReferencePageStepDefSteps.scala) pattern: save and Continue Button is displayed
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.45] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page

      Then("on the CaseReferenceNumber page I enter the CRN into the textbox and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue("CaseReferenceNumber", "the CRN")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.90] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // thenOnTheXPageISelectXAndClickSaveAndContinue() [0.84] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I select (.*) and click save and continue
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.73] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // andVerifyOnTheXPage() [0.71] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.71] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // whenIEnterAnythingInReferenceNumberTextBoxField() [0.62] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter anything in reference number TextBox field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.60] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // whenIEnterNoDataInReferenceNumberTextBoxField() [0.57] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter no data in reference number TextBox field
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // thenIShouldNavigateToReferenceNumberTextBoxField() [0.54] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I should navigate to reference number TextBox field
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // whenIEnterValidNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter valid NI Number TextBox field
        // whenIEnterInvalidNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter invalid NI Number TextBox field
        // whenIEnterStringNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter {string} NI Number TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.49] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // thenTheCaseReferenceShouldBeString() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: the case reference should be {string}
        // whenIEnterStringInTheStringTextBoxField() [0.47] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the DisclosureAbout page I select An Estate and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageISelectXAndClickSaveAndContinue("DisclosureAbout", "An Estate")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.78] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // thenSaveAndContinueButtonIsDisplayed() [0.47] (HmrcLetterReferencePageStepDefSteps.scala) pattern: save and Continue Button is displayed
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the AreYouTheEntity page I select Yes, I am the executor or administrator and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageISelectXAndClickSaveAndContinue("AreYouTheEntity", "Yes, I am the executor or administrator")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.90] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.73] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // andVerifyOnTheXPage() [0.71] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.71] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.68] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.60] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // givenIAmOnTheHomePage() [0.58] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // givenIAmOnStringPage() [0.56] (CheckYourAnswersStepDefSteps.scala) pattern: I am on {string} page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // givenIAmNavigatedToWhatIsTheDisclosurePage() [0.47] (WhatIsDisclosureStepDefSteps.scala) pattern: I am navigated to What is the disclosure Page
        // thenSaveAndContinueButtonIsDisplayed() [0.47] (HmrcLetterReferencePageStepDefSteps.scala) pattern: save and Continue Button is displayed
        // givenIAmOnAreYouRegisteredForVATPage() [0.47] (AreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Are you registered for VAT Page
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the OffshoreLiabilities page I select Yes and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageISelectXAndClickSaveAndContinue("OffshoreLiabilities", "Yes")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.78] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the OnshoreLiabilities page I select Yes and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageISelectXAndClickSaveAndContinue("OnshoreLiabilities", "Yes")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.78] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the WhereDidTheIncomeComeFrom page I select Other capital gains and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageISelectXAndClickSaveAndContinue("WhereDidTheIncomeComeFrom", "Other capital gains")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.78] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the NameOfIndividual page I enter Estate Person into the textbox and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue("NameOfIndividual", "Estate Person")
        // --- Other possible matches ---
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.90] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // thenOnTheXPageISelectXAndClickSaveAndContinue() [0.84] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I select (.*) and click save and continue
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.73] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // andVerifyOnTheXPage() [0.71] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.71] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // givenIAmOnTheHomePage() [0.58] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // givenIAmOnStringPage() [0.56] (CheckYourAnswersStepDefSteps.scala) pattern: I am on {string} page
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.55] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // whenIEnterAnythingInFullNameTextBoxField() [0.54] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter anything in Full Name TextBox field
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // whenIEnterNoDataInFullNameTextBoxField() [0.49] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter no data in Full Name TextBox field
        // givenIAmOnWhatIsTheCountryOfTheIndividualAddressPage() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: I am on What is the country of the individual address Page
        // whenIEnterStringInTheStringTextBoxField() [0.47] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      And("on the IndividualDob page I click on the header hyperlink")
        // Possible match (best=1.00)
        whenOnTheXPageIClickOnTheHeaderHyperlink("IndividualDob")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.55] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // whenClickOnHyperlinkString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on Hyperlink {string}
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      And("on the homepage I click continue to navigate to the ViewEditCreateCase page")
        // Possible match (best=1.00)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("ViewEditCreateCase")
        // --- Other possible matches ---
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.70] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.61] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // givenIAmOnTheHomePage() [0.58] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page
        // andIClickTheEditLinkWithinTheCaseTable() [0.47] (CaseManagementStepDefSteps.scala) pattern: I click the Edit link within the case table
        // whenISelectCreateANewCase() [0.47] (CaseManagementStepDefSteps.scala) pattern: I select create a new case

      Then("the values within the datatable are verified")
        // Possible match (best=1.00)
        givenTheValuesWithinTheDatatableAreVerified()

      And("I click the Edit link within the case table")
        // Possible match (best=1.00)
        andIClickTheEditLinkWithinTheCaseTable()

      Then("on the YouHaveStartedNotification page I click Make a disclosure and click save and continue")
        // Possible match (best=1.00)
        thenOnTheXPageIClickXAndClickSaveAndContinue("YouHaveStartedNotification", "Make a disclosure")
        // --- Other possible matches ---
        // thenOnTheXPageISelectXAndClickSaveAndContinue() [0.72] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I select (.*) and click save and continue
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // whenIClickOnMakeADisclosureButton() [0.60] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue() [0.59] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I enter (.*) into the textbox and click save and continue
        // whenClickOnSaveAndContinueButton() [0.58] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // thenSaveAndContinueButtonIsDisplayed() [0.47] (HmrcLetterReferencePageStepDefSteps.scala) pattern: save and Continue Button is displayed
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      Then("on the ListOfTasks page I click Return to view, edit or create a case")
        // Possible match (best=0.85)
        thenOnTheXPageIClickReturnToViewEditOrCreateACase("ListOfTasks")
        // --- Other possible matches ---
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.64] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.62] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.55] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page
        // andIClickTheEditLinkWithinTheCaseTable() [0.47] (CaseManagementStepDefSteps.scala) pattern: I click the Edit link within the case table
        // whenISelectCreateANewCase() [0.47] (CaseManagementStepDefSteps.scala) pattern: I select create a new case

      And("verify on the ViewEditCreateCase page")
        // Possible match (best=1.00)
        andVerifyOnTheXPage("ViewEditCreateCase")
        // --- Other possible matches ---
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.60] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.57] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // whenISelectCreateANewCase() [0.47] (CaseManagementStepDefSteps.scala) pattern: I select create a new case

    }
  }
}
