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
import uk.gov.hmrc.specsteps.DiscloseOnshoreLiabilitiesStepDefSteps._
import uk.gov.hmrc.specsteps.HomePageStepDefSteps._
import uk.gov.hmrc.specsteps.OffshoreDisclosureStepDefSteps._
import uk.gov.hmrc.specsteps.OnshoreDisclosureStepDefSteps.whenIEnterStringInStopYearTextBoxField
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps._


class CompanyOnBehalfOnshoreDisclosureSpec extends BaseSpec {

  Feature("A Company - On behalf of - is able to notify and submit onshore disclosure") {

    Scenario("Company On behalf of - Complete onshore disclosure with reasonable excuse journey with 2 director loan accounting periods.") {
      Given("I am on You have sent the notification page")
        // Possible match (best=0.58)
        givenIAmOnTheHomePage()
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

      And("I select Checkbox The company did not notify HMRC about a tax liability at Position 1")
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

      And("I select Checkbox They have a reasonable excuse at Position 2")
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

      Then("page navigates to Reasonable excuse for not notifying HMRC about a tax liability")
        // Possible match (best=0.58)
        whenINavigateToStringReasonPage("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I enter Reasonable excuse in the reason for excuse text area")
        // Possible match (best=0.84)
        whenIEnterStringInTheReasonForReasonableExcuseTextArea("")
        // --- Other possible matches ---
        // whenIEnterStringInTheReasonForExcuseTextArea() [0.83] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for excuse text area
        // whenIEnterStringInTheReasonableExcuseTextArea() [0.82] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable excuse text area
        // whenIEnterStringInTheTextArea() [0.75] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheReasonableCareTextArea() [0.69] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable care text area
        // whenIEnterStringInTheAdviceTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the advice text area
        // whenIEnterStringInTheMonthTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheYearTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheReasonForMakingADisclosureNowTextArea() [0.63] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for making a disclosure now text area
        // whenIEnterStringInTheCanYouDescribeTheGiftTextArea() [0.56] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the can you describe the gift text area
        // whenIEnterStringInTheWhyWasTheDisclosureNotMadeBeforeNowTextArea() [0.48] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the why was the disclosure not made before now text area

      And("I enter tax year ending 2020 in the Which tax years does this apply to?for not notifying HMRC text box field")
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
        // whenIEnterNoDataInEmailTextBoxField() [0.54] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter no data in email TextBox field
        // whenIEnterStringInTheYearTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // thenTextStringIsDisplayed() [0.50] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: text {string} is displayed
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
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

      And("I select Checkbox Director’s loan account liabilities at Position 5")
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

      Then("page navigates to Onshore director’s loan account liabilities 1")
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

      And("I enter Director Name into the name text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterAnythingInFullNameTextBoxField() [0.54] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter anything in Full Name TextBox field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterNoDataInFullNameTextBoxField() [0.49] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter no data in Full Name TextBox field

      And("I enter 01 into the periodEnd.day text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopDayTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 01 into the periodEnd.month text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopMonthTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheMonthTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 2019 into the periodEnd.year text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopYearTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheYearTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 0 into the overdrawn text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 1000 into the unpaidTax text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.50] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 0 into the interest text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

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

      Then("page navigates to Review onshore director loans account liabilities")
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

      Then("page navigates to You have added 1 accounting period for director loan account liabilities")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
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

      Then("page navigates to Onshore director’s loan account liabilities 2")
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

      And("I enter Director Name into the name text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterAnythingInFullNameTextBoxField() [0.54] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter anything in Full Name TextBox field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // whenIEnterNoDataInFullNameTextBoxField() [0.49] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter no data in Full Name TextBox field

      And("I enter 02 into the periodEnd.day text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopDayTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 02 into the periodEnd.month text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopMonthTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheMonthTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 2019 into the periodEnd.year text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopYearTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheYearTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 0 into the overdrawn text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 1000 into the unpaidTax text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.50] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 0 into the interest text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

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

      Then("page navigates to Review onshore director loans account liabilities")
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

      Then("page navigates to You have added 2 accounting periods for director loan account liabilities")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
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

    }

    Scenario("Company On behalf of - Complete onshore disclosure with no reasonable excuse journey with 2 corporation tax accounting periods.") {
      Given("I am on You have sent the notification page")
        // Possible match (best=0.58)
        givenIAmOnTheHomePage()
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

      And("I select Checkbox The company did not notify HMRC about a tax liability at Position 1")
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

      And("I select Checkbox Corporation Tax liabilities at Position 4")
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

      Then("page navigates to Onshore Corporation Tax liability 1")
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

      And("I enter 01 into the periodEnd.day text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopDayTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 01 into the periodEnd.month text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopMonthTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheMonthTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 2019 into the periodEnd.year text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopYearTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheYearTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 0 into the howMuchIncome text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 1000 into the howMuchUnpaid text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 0 into the howMuchInterest text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 10 into the penaltyRate text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter Reason into the penaltyRateReason text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.50] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

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

      Then("page navigates to Review onshore Corporation Tax liabilities")
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

      Then("page navigates to You have added 1 accounting period for Corporation Tax liabilities")
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

      Then("page navigates to Onshore Corporation Tax liability 2")
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

      And("I enter 02 into the periodEnd.day text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopDayTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 02 into the periodEnd.month text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopMonthTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheMonthTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 2019 into the periodEnd.year text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInStopYearTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheYearTextArea() [0.52] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 0 into the howMuchIncome text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 1000 into the howMuchUnpaid text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 0 into the howMuchInterest text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter 10 into the penaltyRate text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

      And("I enter Reason into the penaltyRateReason text field")
        // Possible match (best=0.67)
        whenIEnterStringIntoTheStringTextField("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.60] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.57] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.54] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.50] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterStringInStopDayTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.49] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field

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

      Then("page navigates to Review onshore Corporation Tax liabilities")
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

      Then("page navigates to You have added 2 accounting periods for Corporation Tax liabilities")
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

    }
  }
}
