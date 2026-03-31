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
import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps._
import uk.gov.hmrc.specsteps.HomePageStepDefSteps._
import uk.gov.hmrc.specsteps.OffshoreDisclosureStepDefSteps._
import uk.gov.hmrc.specsteps.OnshoreDisclosureStepDefSteps.whenIEnterStringInStopYearTextBoxField
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsYourMainOccupationStepDefSteps._

class CompanyOffshoreDisclosureSpec extends BaseSpec {

  Feature("A Company tax payer is able to notify and submit offshore disclosure") {

    Scenario("Company - On Behalf of - complete offshore with no reasonable excuse disclosure journey") {
      Given("I am on You have sent the notification page")
        // Possible match (best=0.58)
        givenIAmOnTheHomePage()
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenIAmOnStringPage() [0.56] (CheckYourAnswersStepDefSteps.scala) pattern: I am on {string} page

      When("I navigate to make-a-disclosure specific page")
        // Possible match (best=0.58)
        whenINavigateToStringSpecificPage("")
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      Then("page heading contains You sent a notification on")
        // Possible match (best=0.52)
        thenPageHeadingContainsString("")

      When("I click on Make a disclosure button")
        // Possible match (best=1.00)
        whenIClickOnMakeADisclosureButton()
        // --- Other possible matches ---
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button

      Then("page navigates to List of tasks - Tell HMRC about underpaid tax from previous years")
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

      And("click on Hyperlink Make your declaration")
        // Possible match (best=0.52)
        whenClickOnHyperlinkString("")
        // --- Other possible matches ---
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button

      And("click on I confirm button")
        // Possible match (best=1.00)
        whenClickOnIConfirmButton()
        // --- Other possible matches ---
        // whenClickOnConfirmButton() [0.70] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button

      When("I click on the hyperlink with text Add offshore liability details")
        // Possible match (best=0.76)
        whenIClickOnTheHyperlinkWithTextString("")
        // --- Other possible matches ---
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.71] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // whenClickOnHyperlinkString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on Hyperlink {string}
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.51] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // thenHyperlinkWithTextStringIsDisplayed() [0.50] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: hyperlink with text {string} is displayed
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case

      And("I select Checkbox The company did not notify HMRC about a tax liability at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox The company did not file a tax return on time at Position 2")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox The company submitted an inaccurate return at Position 3")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
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

      Then("page navigates to Why the company did not notify HMRC about a tax liability")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Checkbox This was not deliberate, but they do not have a reasonable excuse at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
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

      Then("page navigates to Why the company did not file a return on time")
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

      And("I select Checkbox They did not file a return but did not withhold any information on purpose at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
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

      Then("page navigates to Why the company submitted an inaccurate return")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Checkbox They did not take reasonable care at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
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

      Then("page navigates to Which year does this offshore disclosure relate to?")
        // Possible match (best=0.58)
        whenINavigateToStringOffshorePage("")
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Checkbox 6 April 2023 to 5 April 2024 at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox 6 April 2021 to 5 April 2022 at Position 3")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
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

      Then("page navigates to You have not included the tax year ending 2023")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I enter Reason for including year in the disclosure in the text area")
        // Possible match (best=0.76)
        whenIEnterStringInTheYearTextArea("")
        // --- Other possible matches ---
        // whenIEnterStringInTheTextArea() [0.75] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheReasonForMakingADisclosureNowTextArea() [0.69] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for making a disclosure now text area
        // whenIEnterStringInTheAdviceTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the advice text area
        // whenIEnterStringInTheMonthTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheReasonForExcuseTextArea() [0.66] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for excuse text area
        // whenIEnterStringInTheReasonableCareTextArea() [0.62] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable care text area
        // whenIEnterStringInTheReasonForReasonableExcuseTextArea() [0.61] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for reasonable excuse text area
        // whenIEnterStringInTheReasonableExcuseTextArea() [0.57] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable excuse text area
        // whenIEnterStringInTheCanYouDescribeTheGiftTextArea() [0.56] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the can you describe the gift text area
        // whenIEnterStringInTheWhyWasTheDisclosureNotMadeBeforeNowTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the why was the disclosure not made before now text area
        // thenTextStringIsDisplayed() [0.50] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: text {string} is displayed

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

      When("I enter country or territory United Arab Emirates and select United Arab Emirates")
        // Possible match (best=0.54)
        whenIEnterCountryOrTerritoryStringAndSelectString("", "")
        // --- Other possible matches ---
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

      And("I select Radio Button Yes at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
        // whenISelectRadioButtonStringAtPositionString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I select Radio Button {string} at Position {string}
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

      And("I enter country or territory Australia and select Australia")
        // Possible match (best=0.54)
        whenIEnterCountryOrTerritoryStringAndSelectString("", "")
        // --- Other possible matches ---
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

      And("I select Radio Button No at Position 2")
        // Possible match (best=0.70)
        thenISelectNoRadioButton()
        // --- Other possible matches ---
        // whenISelectYesRadioButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I select Yes radio button
        // whenISelectRadioButtonStringAtPositionString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I select Radio Button {string} at Position {string}
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

      Then("page navigates to Offshore liabilities — Tax year 6 April 2023 to 5 April 2024")
        // Possible match (best=0.58)
        whenINavigateToStringOffshorePage("")
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I enter 10 in the income text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 20 in the chargeableTransfers text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 30 in the capitalGains text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 40 in the unpaidTax text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.64] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 50 in the interest text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 50 in the penaltyRate text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter undeclaredIncomeOrGain in the undeclaredIncomeOrGain text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter Penalty Rate Reason for year 2021 in the penaltyRateReason text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopYearTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringTextBoxField() [0.74] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.64] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheYearTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTheReasonForExcuseTextArea() [0.49] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for excuse text area

      And("I select Radio Button Yes at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
        // whenISelectRadioButtonStringAtPositionString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I select Radio Button {string} at Position {string}
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

      Then("page navigates to How much foreign tax credit relief have you deducted from your calculations for the tax year ending 2024, in pounds?")
        // Possible match (best=0.71)
        andVerifyOnTheXPage("")
        // --- Other possible matches ---
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.67] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.49] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // thenOnTheXPageIClickReturnToViewEditOrCreateACase() [0.45] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click Return to view, edit or create a case

      And("I enter 10 in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringEmailTextBoxField() [0.67] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter {string} email TextBox field
        // whenIEnterInvalidEmailTextBoxField() [0.67] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter invalid email TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.64] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterNoDataInEmailTextBoxField() [0.64] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter no data in email TextBox field
        // whenIEnterAnythingInReferenceNumberTextBoxField() [0.64] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter anything in reference number TextBox field
        // whenIEnterAnythingInFullNameTextBoxField() [0.64] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter anything in Full Name TextBox field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterValidNINumberTextBoxField() [0.60] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter valid NI Number TextBox field
        // whenIEnterInvalidNINumberTextBoxField() [0.60] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter invalid NI Number TextBox field
        // whenIEnterStringNINumberTextBoxField() [0.60] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter {string} NI Number TextBox field
        // whenIEnterNoDataInReferenceNumberTextBoxField() [0.59] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter no data in reference number TextBox field
        // whenIEnterNoDataInFullNameTextBoxField() [0.59] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter no data in Full Name TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.59] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field
        // whenIEnterStringInStopDayTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIShouldNavigateToTextBoxField() [0.55] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I should navigate to TextBox field
        // thenFocusNavigatesTextBoxField() [0.55] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: focus navigates TextBox field
        // thenIShouldNavigateToEmailTextBoxField() [0.50] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I should navigate to email TextBox field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.50] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIShouldNavigateToReferenceNumberTextBoxField() [0.46] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I should navigate to reference number TextBox field
        // thenIShouldNavigateToNINumberTextBoxField() [0.46] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I should navigate to NI number TextBox field
        // thenIShouldNavigateToOrganisationNameTextBoxField() [0.46] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I should navigate to Organisation Name TextBox field
        // thenIShouldNavigateToUTRNumberTextBoxField() [0.46] (WhatIsYourUniqueTaxReferenceStepDefSteps.scala) pattern: I should navigate to UTR number TextBox field

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

      Then("page navigates to Offshore liabilities — Tax year 6 April 2021 to 5 April 2022")
        // Possible match (best=0.58)
        whenINavigateToStringOffshorePage("")
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I enter 70 in the income text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 80 in the chargeableTransfers text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 90 in the capitalGains text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 10 in the unpaidTax text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.64] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 20 in the interest text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 30 in the penaltyRate text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter undeclaredIncomeOrGain in the undeclaredIncomeOrGain text box field")
        // Possible match (best=0.74)
        whenIEnterStringInTheStringTextBoxField("", "")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter Penalty Rate Reason for year 2020 in the penaltyRateReason text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopYearTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringTextBoxField() [0.74] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.64] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheYearTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTheReasonForExcuseTextArea() [0.49] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for excuse text area

      And("I select Radio Button No at Position 2")
        // Possible match (best=0.70)
        thenISelectNoRadioButton()
        // --- Other possible matches ---
        // whenISelectYesRadioButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I select Yes radio button
        // whenISelectRadioButtonStringAtPositionString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I select Radio Button {string} at Position {string}
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

      Then("page navigates to Your legal interpretation")
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

      And("I select Checkbox Another issue at Position 9")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
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

      Then("page navigates to Under what consideration of the law led you to not include some tax in this disclosure?")
        // Possible match (best=0.71)
        andVerifyOnTheXPage("")
        // --- Other possible matches ---
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.67] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // givenIAmNavigatedToWhatIsTheDisclosurePage() [0.54] (WhatIsDisclosureStepDefSteps.scala) pattern: I am navigated to What is the disclosure Page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.49] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // givenIAmOnWhatIsTheCountryOfTheIndividualAddressPage() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: I am on What is the country of the individual address Page

      And("I enter consideration of the law in the text area")
        // Possible match (best=0.75)
        whenIEnterStringInTheTextArea("")
        // --- Other possible matches ---
        // whenIEnterStringInTheAdviceTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the advice text area
        // whenIEnterStringInTheMonthTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheYearTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheReasonableCareTextArea() [0.62] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable care text area
        // whenIEnterStringInTheReasonableExcuseTextArea() [0.57] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable excuse text area
        // whenIEnterStringInTheCanYouDescribeTheGiftTextArea() [0.56] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the can you describe the gift text area
        // whenIEnterStringInTheReasonForMakingADisclosureNowTextArea() [0.53] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for making a disclosure now text area
        // whenIEnterStringInTheReasonForExcuseTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for excuse text area
        // whenIEnterStringInTheReasonForReasonableExcuseTextArea() [0.48] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for reasonable excuse text area
        // whenIEnterStringInTheWhyWasTheDisclosureNotMadeBeforeNowTextArea() [0.48] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the why was the disclosure not made before now text area

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

      Then("page navigates to How much tax has not been included in this disclosure as a result of your interpretation?")
        // Possible match (best=0.57)
        andVerifyOnTheXPage("")
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Radio Button £10,000 or less at Position 1")
        // Possible match (best=0.56)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
        // whenISelectRadioButtonStringAtPositionString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I select Radio Button {string} at Position {string}
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

      Then("page navigates to What was the maximum value of all assets held outside the UK at any point over the last 5 years?")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Radio Button Between £1 million and £100 million at Position 3")
        // Possible match (best=0.56)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
        // whenISelectRadioButtonStringAtPositionString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I select Radio Button {string} at Position {string}
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenISelectRadioOptionAnIndividual() [0.47] (WhatIsDisclosureStepDefSteps.scala) pattern: I select radio option An Individual

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

      Then("page navigates to Offshore liabilities summary")
        // Possible match (best=0.58)
        whenINavigateToStringOffshorePage("")
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

    }
  }
}
