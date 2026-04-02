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
import uk.gov.hmrc.specsteps.IndividualWhatIsYourFullNameStepDefSteps.thenBodyShouldBeString
import uk.gov.hmrc.specsteps.OffshoreDisclosureStepDefSteps._
import uk.gov.hmrc.specsteps.OnshoreDisclosureStepDefSteps._
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsTheCountryOfYourAddressStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsYourMainOccupationStepDefSteps._


class TrustOnshoreDisclosureSpec extends BaseSpec {

  Feature("A trust is able to notify and submit onshore disclosure") {

    Scenario("Trust - Onshore Journey- Letting Income") {
      Given("I am on You have sent the notification page")
        // Possible match (best=0.58)
      ThenIAmOnTheHomePage()
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenIAmOnStringPage() [0.56] (CheckYourAnswersStepDefSteps.scala) pattern: I am on {string} page

      And("I navigate to make-a-disclosure specific page")
        // Possible match (best=0.58)
        whenINavigateToStringSpecificPage("")
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to List of tasks")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("status is marked as Completed for field Review your declaration")
        // Possible match (best=0.52)
        thenStatusIsMarkedAsStringForFieldString("", "")

      And("status is marked as Not started for field Add onshore liability details")
        // Possible match (best=0.52)
        thenStatusIsMarkedAsStringForFieldString("", "")

      And("click on Hyperlink Add onshore liability details")
        // Possible match (best=0.52)
        whenClickOnHyperlinkString("")

      Then("page navigates to Why you are making this disclosure")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Checkbox The trust did not notify HMRC about a tax liability at Position 1")
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

      Then("page navigates to Why the trust did not notify HMRC about a tax liability")
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

      And("I select Checkbox They deliberately failed to notify HMRC of a tax liability at Position 3")
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

      And("I select Radio Button Continue using this digital disclosure service at Position 1")
        // Possible match (best=0.56)
        whenIClickOnContinueButton()
        // --- Other possible matches ---
        // whenISelectYesRadioButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I select Yes radio button
        // thenISelectNoRadioButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
        // whenISelectRadioButtonStringAtPositionString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I select Radio Button {string} at Position {string}
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // thenContinueButtonDisplayed() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: Continue Button displayed

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

      Then("page navigates to What onshore liabilities do you need to disclose?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenIAmOnDoYouAlsoWantToDiscloseOnshoreLiabilitiesPage() [0.52] (DiscloseOnshoreLiabilitiesStepDefSteps.scala) pattern: I am on Do you also want to disclose onshore liabilities page
        // givenIAmOnDoYouWantToDiscloseOffshoreLiabilitiesPage() [0.51] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Do you want to disclose offshore liabilities Page
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Checkbox Letting income from residential property or land at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox Non-business income liabilities at Position 4")
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

      Then("page navigates to Which year does this onshore disclosure relate to?")
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

      And("page should display checkboxes for the 20 tax years before the current tax year")
        // Possible match (best=0.88)
        whenPageShouldDisplayCheckboxesForTheStringTaxYearsBeforeTheCurrentTaxYear("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // thenThePageTitleShouldBeString() [0.47] (HomePageStepDefSteps.scala) pattern: the page title should be {string}

      When("I select Checkbox 6 April 2023 to 5 April 2024 at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox 6 April 2019 to 5 April 2020 at Position 5")
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

      Then("page navigates to You have not selected certain years")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      When("I enter Do not want to include in yearNotSelected text box field")
        // Possible match (best=0.81)
        whenIEnterStringInYearNotSelectedTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInStopYearTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterNoDataInEmailTextBoxField() [0.54] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter no data in email TextBox field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterNoDataInReferenceNumberTextBoxField() [0.49] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter no data in reference number TextBox field
        // whenIEnterNoDataInFullNameTextBoxField() [0.49] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter no data in Full Name TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.49] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field
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

      Then("page navigates to What is the postcode and property name or number of property 1?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenIAmNavigatedToWhatIsTheDisclosurePage() [0.54] (WhatIsDisclosureStepDefSteps.scala) pattern: I am navigated to What is the disclosure Page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenIAmWhatIsYourFullNamePage() [0.52] (WhatIsYourFullNameStepDefSteps.scala) pattern: I am What is your full name Page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // givenIAmOnWhatIsTheCountryOfTheIndividualAddressPage() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: I am on What is the country of the individual address Page
        // givenIAmOnWhatIsYourTelephoneNumberPage() [0.47] (WhatIsYourTelephoneNumberStepDefSteps.scala) pattern: I am on What is your telephone number page
        // givenIAmOnWhatIsTheIndividualSVATRegistrationNumberPage() [0.47] (WhatIsYourVATNumberStepDefSteps.scala) pattern: I am on What is the individual’s VAT registration number page

      And("I click on the hyperlink with text Enter the address manually")
        // Possible match (best=0.76)
        whenIClickOnTheHyperlinkWithTextString("")
        // --- Other possible matches ---
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.71] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // whenClickOnHyperlinkString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on Hyperlink {string}
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.51] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // thenHyperlinkWithTextStringIsDisplayed() [0.50] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: hyperlink with text {string} is displayed
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area

      And("I enter The Farm in the Address line 1 field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTheStringTextBoxField() [0.49] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field

      And("I enter Royal Madeuptown in the Town or city field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTheStringTextBoxField() [0.49] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field

      And("I enter ZZ9Z 9TT in the Postcode field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTheStringTextBoxField() [0.49] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenEnterPostcodeString() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: enter postcode {string}

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

      And("click on confirm button")
        // Possible match (best=1.00)
        whenClickOnConfirmButton()
        // --- Other possible matches ---
        // whenClickOnIConfirmButton() [0.70] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button

      Then("page navigates to When was property 1 first let out?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I enter 01 in the Day text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopDayTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringTextBoxField() [0.74] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 01 in the Month text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopMonthTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringTextBoxField() [0.74] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheMonthTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 1980 in the Year text box field")
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
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheYearTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

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

      Then("page navigates to Has property 1 stopped being let out?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to Property 1 is no longer being let out")
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

      And("I enter 02 in stop day text box field")
        // Possible match (best=0.82)
        whenIEnterStringInStopDayTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInStopMonthTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

      And("I enter 02 in stop month text box field")
        // Possible match (best=0.82)
        whenIEnterStringInStopMonthTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInStopDayTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopYearTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

      And("I enter 1990 in stop year text box field")
        // Possible match (best=0.82)
        whenIEnterStringInStopYearTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInStopDayTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

      And("I enter Nothing in whatHasHappenedToProperty text box field")
        // Possible match (best=0.81)
        whenIEnterStringInWhatHasHappenedToPropertyTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInPropertyCountTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterNoDataInEmailTextBoxField() [0.54] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter no data in email TextBox field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterNoDataInReferenceNumberTextBoxField() [0.49] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter no data in reference number TextBox field
        // whenIEnterNoDataInFullNameTextBoxField() [0.49] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter no data in Full Name TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.49] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field

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

      Then("page navigates to At the time of letting, was property 1 furnished?")
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

      Then("page navigates to Furnished Holiday Let (FHL)")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to At the time of letting, was property 1 jointly owned with another person?")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to What was the percentage share of the income you received from property 1?")
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

      When("I enter 5 in percentage text box field")
        // Possible match (best=0.81)
        whenIEnterStringInPercentageTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

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

      Then("page navigates to At the time of letting, did you have a mortgage on property 1?")
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

      Then("page navigates to What type of mortgage did you have for property 1?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Radio Button Other at Position 3")
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

      Then("page navigates to What was the type of mortgage you had on property 1?")
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

      And("I enter Type of mortgage in typeOfMortage text box field")
        // Possible match (best=0.81)
        whenIEnterStringInTypeOfMortageTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

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

      Then("page navigates to Was a letting agent used to let out or manage property 1?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to Did the letting agent collect rent on your behalf?")
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

      Then("page navigates to Review property 1 details")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("click on continue button")
        // Possible match (best=1.00)
        whenClickOnContinueButton()
        // --- Other possible matches ---
        // whenIClickOnContinueButton() [0.70] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // thenContinueButtonDisplayed() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: Continue Button displayed
        // whenClickOnSaveAndContinueButton() [0.47] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button

      Then("page navigates to You have added 1 property")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to What is the postcode and property name or number of property 2?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenIAmNavigatedToWhatIsTheDisclosurePage() [0.54] (WhatIsDisclosureStepDefSteps.scala) pattern: I am navigated to What is the disclosure Page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenIAmWhatIsYourFullNamePage() [0.52] (WhatIsYourFullNameStepDefSteps.scala) pattern: I am What is your full name Page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // givenIAmOnWhatIsTheCountryOfTheIndividualAddressPage() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: I am on What is the country of the individual address Page
        // givenIAmOnWhatIsYourTelephoneNumberPage() [0.47] (WhatIsYourTelephoneNumberStepDefSteps.scala) pattern: I am on What is your telephone number page
        // givenIAmOnWhatIsTheIndividualSVATRegistrationNumberPage() [0.47] (WhatIsYourVATNumberStepDefSteps.scala) pattern: I am on What is the individual’s VAT registration number page

      And("I click on the hyperlink with text Enter the address manually")
        // Possible match (best=0.76)
        whenIClickOnTheHyperlinkWithTextString("")
        // --- Other possible matches ---
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.71] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // whenClickOnHyperlinkString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on Hyperlink {string}
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.51] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // thenHyperlinkWithTextStringIsDisplayed() [0.50] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: hyperlink with text {string} is displayed
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area

      And("I enter The Farm in the Address line 1 field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTheStringTextBoxField() [0.49] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field

      And("I enter Royal Madeuptown in the Town or city field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTheStringTextBoxField() [0.49] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field

      And("I enter ZZ9Z 9TT in the Postcode field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTheStringTextBoxField() [0.49] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenEnterPostcodeString() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: enter postcode {string}

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

      And("click on confirm button")
        // Possible match (best=1.00)
        whenClickOnConfirmButton()
        // --- Other possible matches ---
        // whenClickOnIConfirmButton() [0.70] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button

      Then("page navigates to When was property 2 first let out?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I enter 02 in the Day text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopDayTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringTextBoxField() [0.74] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 02 in the Month text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopMonthTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInTheStringTextBoxField() [0.74] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheMonthTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

      And("I enter 1982 in the Year text box field")
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
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInTheYearTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field

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

      Then("page navigates to Has property 2 stopped being let out?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to Property 2 is no longer being let out")
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

      And("I enter 03 in stop day text box field")
        // Possible match (best=0.82)
        whenIEnterStringInStopDayTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInStopMonthTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

      And("I enter 03 in stop month text box field")
        // Possible match (best=0.82)
        whenIEnterStringInStopMonthTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInStopDayTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopYearTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

      And("I enter 1993 in stop year text box field")
        // Possible match (best=0.82)
        whenIEnterStringInStopYearTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInStopDayTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

      And("I enter Nothing 2 in whatHasHappenedToProperty text box field")
        // Possible match (best=0.81)
        whenIEnterStringInWhatHasHappenedToPropertyTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInPropertyCountTextBoxField() [0.74] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterNoDataInEmailTextBoxField() [0.54] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter no data in email TextBox field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterNoDataInReferenceNumberTextBoxField() [0.49] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter no data in reference number TextBox field
        // whenIEnterNoDataInFullNameTextBoxField() [0.49] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter no data in Full Name TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.49] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field

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

      Then("page navigates to At the time of letting, was property 2 furnished?")
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

      Then("page navigates to Furnished Holiday Let (FHL)")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to At the time of letting, was property 2 jointly owned with another person?")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to What was the percentage share of the income you received from property 2?")
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

      And("I enter 5 in percentage text box field")
        // Possible match (best=0.81)
        whenIEnterStringInPercentageTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

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

      Then("page navigates to At the time of letting, did you have a mortgage on property 2?")
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

      Then("page navigates to What type of mortgage did you have for property 2?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Radio Button Other at Position 3")
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

      Then("page navigates to What was the type of mortgage you had on property 2?")
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

      And("I enter Type of mortgage in typeOfMortage text box field")
        // Possible match (best=0.81)
        whenIEnterStringInTypeOfMortageTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

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

      Then("page navigates to Was a letting agent used to let out or manage property 2?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to Did the letting agent collect rent on your behalf?")
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

      Then("page navigates to Review property 2 details")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("click on continue button")
        // Possible match (best=1.00)
        whenClickOnContinueButton()
        // --- Other possible matches ---
        // whenIClickOnContinueButton() [0.70] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // thenContinueButtonDisplayed() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: Continue Button displayed
        // whenClickOnSaveAndContinueButton() [0.47] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button

      Then("page navigates to You have added 2 properties")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to Is the trust a member of any landlord associations?")
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

      Then("page navigates to Which landlord associations are you a member of?")
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

      When("I enter landlord associations in landloard association text box field")
        // Possible match (best=0.82)
        whenIEnterStringInLandloardAssociationTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

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

      Then("page navigates to How many properties do you currently let out?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      When("I enter 2 in property count text box field")
        // Possible match (best=0.82)
        whenIEnterStringInPropertyCountTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.72] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInStopDayTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.67] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

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

      Then("page navigates to Onshore liabilities — Tax year 6 April 2023 to 5 April 2024")
        // Possible match (best=0.57)
        andVerifyOnTheXPage("")
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I enter 10 in the nonBusinessIncome text box field")
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
        // whenIEnterNoDataInEmailTextBoxField() [0.54] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter no data in email TextBox field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterNoDataInReferenceNumberTextBoxField() [0.49] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter no data in reference number TextBox field
        // whenIEnterNoDataInFullNameTextBoxField() [0.49] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter no data in Full Name TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.49] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field

      And("I enter 10 in the lettingIncome text box field")
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

      And("I enter 20 in the unpaidTax text box field")
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

      And("I enter 20 in the niContributions text box field")
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
        // whenIEnterValidNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter valid NI Number TextBox field
        // whenIEnterInvalidNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter invalid NI Number TextBox field
        // whenIEnterStringNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter {string} NI Number TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.49] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field

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

      And("I enter Penalty Rate Reason for year 2022 in the penaltyRateReason text box field")
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

      And("I enter undeclared Income Or Gain in the undeclaredIncomeOrGain text box field")
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

      Then("page navigates to How much residential finance costs were used to calculate the tax reduction for the tax year ending 2024, in pounds?")
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

      And("I enter 5 in the TextBox field")
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

      Then("page navigates to Onshore liabilities — Tax year 6 April 2019 to 5 April 2020")
        // Possible match (best=0.57)
        andVerifyOnTheXPage("")
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I enter 10 in the nonBusinessIncome text box field")
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
        // whenIEnterNoDataInEmailTextBoxField() [0.54] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter no data in email TextBox field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterNoDataInReferenceNumberTextBoxField() [0.49] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter no data in reference number TextBox field
        // whenIEnterNoDataInFullNameTextBoxField() [0.49] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter no data in Full Name TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.49] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field

      And("I enter 10 in the lettingIncome text box field")
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

      And("I enter 20 in the unpaidTax text box field")
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

      And("I enter 20 in the niContributions text box field")
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
        // whenIEnterValidNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter valid NI Number TextBox field
        // whenIEnterInvalidNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter invalid NI Number TextBox field
        // whenIEnterStringNINumberTextBoxField() [0.50] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter {string} NI Number TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.49] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field

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

      And("I enter Penalty Rate Reason for year 2019 in the penaltyRateReason text box field")
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

      And("I enter undeclared Income Or Gain in the undeclaredIncomeOrGain text box field")
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

      Then("page navigates to Onshore liabilities summary")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      When("click on continue button")
        // Possible match (best=1.00)
        whenClickOnContinueButton()
        // --- Other possible matches ---
        // whenIClickOnContinueButton() [0.70] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // thenContinueButtonDisplayed() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: Continue Button displayed
        // whenClickOnSaveAndContinueButton() [0.47] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button

      Then("page navigates to List of tasks")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("status is marked as Completed for field Edit onshore liability details")
        // Possible match (best=0.52)
        thenStatusIsMarkedAsStringForFieldString("", "")

    }

    Scenario("Trust - Onshore Journey- There are no onshore liabilities to disclose") {
      Given("I am on You have sent the notification page")
        // Possible match (best=0.58)
      ThenIAmOnTheHomePage()
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenIAmOnStringPage() [0.56] (CheckYourAnswersStepDefSteps.scala) pattern: I am on {string} page

      And("I navigate to make-a-disclosure specific page")
        // Possible match (best=0.58)
        whenINavigateToStringSpecificPage("")
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

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

      Then("page navigates to List of tasks")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("status is marked as Completed for field Review your declaration")
        // Possible match (best=0.52)
        thenStatusIsMarkedAsStringForFieldString("", "")

      And("status is marked as Not started for field Add onshore liability details")
        // Possible match (best=0.52)
        thenStatusIsMarkedAsStringForFieldString("", "")

      And("click on Hyperlink Add onshore liability details")
        // Possible match (best=0.52)
        whenClickOnHyperlinkString("")

      Then("page navigates to Why you are making this disclosure")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Checkbox The trust submitted an inaccurate return at Position 3")
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

      Then("page navigates to Why the trust submitted an inaccurate return")
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

      Then("page navigates to What onshore liabilities do you need to disclose?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenIAmOnDoYouAlsoWantToDiscloseOnshoreLiabilitiesPage() [0.52] (DiscloseOnshoreLiabilitiesStepDefSteps.scala) pattern: I am on Do you also want to disclose onshore liabilities page
        // givenIAmOnDoYouWantToDiscloseOffshoreLiabilitiesPage() [0.51] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Do you want to disclose offshore liabilities Page
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Checkbox Business income liabilities at Position 2")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox Capital Gains Tax liabilities at Position 3")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox Non-business income liabilities at Position 4")
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

      Then("page navigates to Which year does this onshore disclosure relate to?")
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

      And("page should display checkboxes for the 6 tax years before the current tax year")
        // Possible match (best=0.88)
        whenPageShouldDisplayCheckboxesForTheStringTaxYearsBeforeTheCurrentTaxYear("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // thenThePageTitleShouldBeString() [0.47] (HomePageStepDefSteps.scala) pattern: the page title should be {string}

      When("I select Checkbox Any tax year before 6 April 2019 at Position 6")
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

      Then("page navigates to Can you tell us more about any tax owed before 6 April 2019?")
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

      When("I enter tax owed details in tax owed reason text box field")
        // Possible match (best=0.86)
        whenIEnterStringInTaxOwedReasonTextBoxField("")
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
        // whenIEnterStringInTheStringTextBoxField() [0.67] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

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

      Then("page navigates to There are no onshore liabilities to disclose")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("body should be The trust only needs to pay HMRC what it owes for up to 20 years for onshore liabilities. Based on the information you have given, you do not need to provide any figures or calculations for onshore liabilities.")
        // Possible match (best=0.52)
        thenBodyShouldBeString("")
        // --- Other possible matches ---
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink

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

      Then("page navigates to Onshore liabilities summary")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.50] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      When("click on continue button")
        // Possible match (best=1.00)
        whenClickOnContinueButton()
        // --- Other possible matches ---
        // whenIClickOnContinueButton() [0.70] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenClickOnContinueButtonOnSummaryPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: click on continue button on summary page
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // thenContinueButtonDisplayed() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: Continue Button displayed
        // whenClickOnSaveAndContinueButton() [0.47] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button

      Then("page navigates to List of tasks")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("status is marked as Completed for field Edit onshore liability details")
        // Possible match (best=0.52)
        thenStatusIsMarkedAsStringForFieldString("", "")

    }
  }
}
