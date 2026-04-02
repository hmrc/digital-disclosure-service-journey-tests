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
import uk.gov.hmrc.specsteps.NotificationSubmittedStepDefSteps._
import uk.gov.hmrc.specsteps.OffshoreDisclosureStepDefSteps._
import uk.gov.hmrc.specsteps.OnshoreDisclosureStepDefSteps._
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsDisclosureStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsTheCountryOfYourAddressStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsYouDOBStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsYourFullNameStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsYourMainOccupationStepDefSteps._

class IndividualSendOffshoreOnshoreDisclosureSpec extends BaseSpec {

  Feature("An Individual - On behalf of - is able to notify and submit offshore disclosure") {

    Scenario("Individual -Complete flow - Onshore & offshore - Letting income") {
      Given("I am navigated to Received A Letter Page")
        // Possible match (best=1.00)
        givenIAmNavigatedToReceivedALetterPage()
        // --- Other possible matches ---
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // thenIAmNavigatedBackToReceivedALetterPageWithTitleString() [0.47] (ReceivedALetterStepDefSteps.scala) pattern: I am navigated back to Received A letter page with title {string}

      When("I select Radio Button Yes at Position 1")
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

      And("I enter CFSS-1234567 in the TextBox field")
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

      And("I select Radio Button An individual at Position 1")
        // Possible match (best=0.58)
        whenISelectRadioOptionAnIndividual()
        // --- Other possible matches ---
        // whenISelectYesRadioButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I select Yes radio button
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

      And("I select Radio Button I am an accountant or tax agent at Position 2")
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

      And("I enter represent org in the TextBox field")
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

      And("I select Checkbox Let property income at Position 3")
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

      And("I enter Individual full name in the TextBox field")
        // Possible match (best=0.81)
        whenIEnterAnythingInFullNameTextBoxField()
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.80] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterNoDataInFullNameTextBoxField() [0.74] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter no data in Full Name TextBox field
        // whenIEnterStringEmailTextBoxField() [0.67] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter {string} email TextBox field
        // whenIEnterInvalidEmailTextBoxField() [0.67] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter invalid email TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.64] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterNoDataInEmailTextBoxField() [0.64] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter no data in email TextBox field
        // whenIEnterAnythingInReferenceNumberTextBoxField() [0.64] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter anything in reference number TextBox field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterValidNINumberTextBoxField() [0.60] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter valid NI Number TextBox field
        // whenIEnterInvalidNINumberTextBoxField() [0.60] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter invalid NI Number TextBox field
        // whenIEnterStringNINumberTextBoxField() [0.60] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter {string} NI Number TextBox field
        // whenIEnterNoDataInReferenceNumberTextBoxField() [0.59] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter no data in reference number TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.59] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field
        // whenIEnterStringInStopDayTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIShouldNavigateToTextBoxField() [0.55] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I should navigate to TextBox field
        // thenFocusNavigatesTextBoxField() [0.55] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: focus navigates TextBox field
        // thenIShouldNavigateToOrganisationNameTextBoxField() [0.55] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I should navigate to Organisation Name TextBox field
        // whenIEnterDataWithMaxLengthOfStringInFullNameTextBoxField() [0.53] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter data with max length of {string} in Full Name TextBox field
        // thenIShouldNavigateToEmailTextBoxField() [0.50] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I should navigate to email TextBox field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.50] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterDataWithMaxLengthOfStringInOrganisationNameTextBoxField() [0.47] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I enter data with max length of {string} in Organisation Name TextBox field
        // thenIShouldNavigateToReferenceNumberTextBoxField() [0.46] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I should navigate to reference number TextBox field
        // thenIShouldNavigateToNINumberTextBoxField() [0.46] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I should navigate to NI number TextBox field
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

      And("I enter Dentist in the TextBox field")
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
        // thenTextStringIsDisplayed() [0.50] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: text {string} is displayed
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

      And("I select Radio Button No at Position 3")
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

      And("I select Radio Button No at Position 3")
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

      And("I select Radio Button No at Position 3")
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

      And("enter country name United Kingdom,select country United Kingdom")
        // Possible match (best=0.50)
        whenEnterCountryNameStringSelectCountryString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

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

      And("I enter Agent full name in the TextBox field")
        // Possible match (best=0.81)
        whenIEnterAnythingInFullNameTextBoxField()
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.80] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field
        // whenIEnterNoDataInFullNameTextBoxField() [0.74] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter no data in Full Name TextBox field
        // whenIEnterStringEmailTextBoxField() [0.67] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter {string} email TextBox field
        // whenIEnterInvalidEmailTextBoxField() [0.67] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter invalid email TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.64] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterNoDataInEmailTextBoxField() [0.64] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter no data in email TextBox field
        // whenIEnterAnythingInReferenceNumberTextBoxField() [0.64] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter anything in reference number TextBox field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // whenIEnterValidNINumberTextBoxField() [0.60] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter valid NI Number TextBox field
        // whenIEnterInvalidNINumberTextBoxField() [0.60] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter invalid NI Number TextBox field
        // whenIEnterStringNINumberTextBoxField() [0.60] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter {string} NI Number TextBox field
        // whenIEnterNoDataInReferenceNumberTextBoxField() [0.59] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter no data in reference number TextBox field
        // whenIEnterNoDataInNINumberTextBoxField() [0.59] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I enter no data in NI Number TextBox field
        // whenIEnterStringInStopDayTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop day text box field
        // whenIEnterStringInStopMonthTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop month text box field
        // whenIEnterStringInStopYearTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in stop year text box field
        // whenIEnterStringInLandloardAssociationTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in landloard association text box field
        // whenIEnterStringInPropertyCountTextBoxField() [0.57] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in property count text box field
        // thenIShouldNavigateToTextBoxField() [0.55] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I should navigate to TextBox field
        // thenFocusNavigatesTextBoxField() [0.55] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: focus navigates TextBox field
        // thenIShouldNavigateToOrganisationNameTextBoxField() [0.55] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I should navigate to Organisation Name TextBox field
        // whenIEnterDataWithMaxLengthOfStringInFullNameTextBoxField() [0.53] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter data with max length of {string} in Full Name TextBox field
        // thenIShouldNavigateToEmailTextBoxField() [0.50] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I should navigate to email TextBox field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.50] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field
        // whenIEnterDataWithMaxLengthOfStringInOrganisationNameTextBoxField() [0.47] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I enter data with max length of {string} in Organisation Name TextBox field
        // thenIShouldNavigateToReferenceNumberTextBoxField() [0.46] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I should navigate to reference number TextBox field
        // thenIShouldNavigateToNINumberTextBoxField() [0.46] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I should navigate to NI number TextBox field
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

      And("I select Checkbox Email at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox Telephone at Position 2")
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

      And("I enter abc@abc.com in the TextBox field")
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

      And("I enter 07777 777777 in the TextBox field")
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

      And("enter country name United Kingdom,select country United Kingdom")
        // Possible match (best=0.50)
        whenEnterCountryNameStringSelectCountryString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

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

      And("I click on the hyperlink with text Enter the address manually")
        // Possible match (best=0.76)
        whenIClickOnTheHyperlinkWithTextString("")
        // --- Other possible matches ---
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.71] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink
        // whenClickOnHyperlinkString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on Hyperlink {string}
        // thenOnTheXPageIClickXAndClickSaveAndContinue() [0.51] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click (.*) and click save and continue
        // thenHyperlinkWithTextStringIsDisplayed() [0.50] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: hyperlink with text {string} is displayed
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area

      And("I enter 1 Testing Lane in the Address line 1 field")
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

      And("I click on send notification button")
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

      When("I am on You have sent the notification page")
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

      And("status is marked as Not started for field Add offshore liability details")
        // Possible match (best=0.52)
        thenStatusIsMarkedAsStringForFieldString("", "")

      And("click on Hyperlink Add offshore liability details")
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

      And("I select Checkbox The individual did not notify HMRC about a tax liability at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox The individual did not file a tax return on time at Position 2")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox The individual submitted an inaccurate return at Position 3")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
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

      Then("page navigates to Why the individual did not notify HMRC about a tax liability")
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

      Then("page navigates to Why the individual did not file a return on time")
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

      Then("page navigates to Why the individual submitted an inaccurate return")
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

      And("I select Checkbox They took reasonable care but made a mistake at Position 2")
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

      Then("page navigates to Contractual Disclosure Facility")
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

      When("I select Radio Button Continue using this digital disclosure service at Position 1")
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

      Then("page navigates to Reasonable excuse for not filing a return")
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

      And("I enter Reasonable excuse in the reason for reasonable excuse text area")
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

      And("I enter tax year ending 2020 in the Which tax years does this apply to? text box field")
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
        // thenTextStringIsDisplayed() [0.50] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: text {string} is displayed
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

      Then("page navigates to What reasonable care was taken when submitting the inaccurate return?")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")
        // --- Other possible matches ---
        // whenINavigateToStringReasonPage() [0.58] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      And("I enter Reasonable care in the reasonable care text area")
        // Possible match (best=0.77)
        whenIEnterStringInTheReasonableCareTextArea("")
        // --- Other possible matches ---
        // whenIEnterStringInTheTextArea() [0.75] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheAdviceTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the advice text area
        // whenIEnterStringInTheMonthTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheYearTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheReasonableExcuseTextArea() [0.64] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable excuse text area
        // whenIEnterStringInTheReasonForReasonableExcuseTextArea() [0.61] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for reasonable excuse text area
        // whenIEnterStringInTheReasonForExcuseTextArea() [0.59] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for excuse text area
        // whenIEnterStringInTheReasonForMakingADisclosureNowTextArea() [0.58] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for making a disclosure now text area
        // whenIEnterStringInTheCanYouDescribeTheGiftTextArea() [0.56] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the can you describe the gift text area
        // whenIEnterStringInTheWhyWasTheDisclosureNotMadeBeforeNowTextArea() [0.48] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the why was the disclosure not made before now text area

      And("I enter tax year ending 2020 in the Which tax years does this apply to? text box field")
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
        // thenTextStringIsDisplayed() [0.50] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: text {string} is displayed
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

      And("page should display checkboxes for the 20 tax years before the current tax year")
        // Possible match (best=0.88)
        whenPageShouldDisplayCheckboxesForTheStringTaxYearsBeforeTheCurrentTaxYear("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // thenThePageTitleShouldBeString() [0.47] (HomePageStepDefSteps.scala) pattern: the page title should be {string}

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

      And("I enter Penalty Rate Reason for year 2023 in the penaltyRateReason text box field")
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

      And("status is marked as Completed for field Edit offshore liability details")
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

      And("I select Checkbox The individual did not notify HMRC about a tax liability at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox The individual did not file a tax return on time at Position 2")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}

      And("I select Checkbox The individual submitted an inaccurate return at Position 3")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")
        // --- Other possible matches ---
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

      Then("page navigates to Why the individual did not notify HMRC about a tax liability")
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

      Then("page navigates to Why the individual did not file a return on time")
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

      Then("page navigates to Why the individual submitted an inaccurate return")
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

      And("I select Checkbox They took reasonable care but made a mistake at Position 2")
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

      Then("page navigates to Reasonable excuse for not filing a return")
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

      And("I enter Reasonable excuse in the reason for reasonable excuse text area")
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

      And("I enter tax year ending 2020 in the Which tax years does this apply to? text box field")
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
        // thenTextStringIsDisplayed() [0.50] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: text {string} is displayed
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

      Then("page navigates to What reasonable care was taken when submitting the inaccurate return?")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")
        // --- Other possible matches ---
        // whenINavigateToStringReasonPage() [0.58] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page

      And("I enter Reasonable care in the reasonable care text area")
        // Possible match (best=0.77)
        whenIEnterStringInTheReasonableCareTextArea("")
        // --- Other possible matches ---
        // whenIEnterStringInTheTextArea() [0.75] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheAdviceTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the advice text area
        // whenIEnterStringInTheMonthTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheYearTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheReasonableExcuseTextArea() [0.64] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable excuse text area
        // whenIEnterStringInTheReasonForReasonableExcuseTextArea() [0.61] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for reasonable excuse text area
        // whenIEnterStringInTheReasonForExcuseTextArea() [0.59] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for excuse text area
        // whenIEnterStringInTheReasonForMakingADisclosureNowTextArea() [0.58] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for making a disclosure now text area
        // whenIEnterStringInTheCanYouDescribeTheGiftTextArea() [0.56] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the can you describe the gift text area
        // whenIEnterStringInTheWhyWasTheDisclosureNotMadeBeforeNowTextArea() [0.48] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the why was the disclosure not made before now text area

      And("I enter tax year ending 2020 in the Which tax years does this apply to? text box field")
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
        // thenTextStringIsDisplayed() [0.50] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: text {string} is displayed
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

      Then("page navigates to Is the individual a member of any landlord associations?")
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
        // givenIAmOnWhatIsTheCountryOfTheIndividualAddressPage() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: I am on What is the country of the individual address Page

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

      Then("page navigates to Onshore liabilities — Tax year 6 April 2021 to 5 April 2022")
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

      And("I enter Penalty Rate Reason for year 2023 in the penaltyRateReason text box field")
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

      And("I enter Penalty Rate Reason for year 2023 in the penaltyRateReason text box field")
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

      Then("status is marked as Not started for field Confirm if you have other liability issues or not")
        // Possible match (best=0.52)
        thenStatusIsMarkedAsStringForFieldString("", "")

      And("click on Hyperlink Confirm if you have other liability issues or not")
        // Possible match (best=0.56)
        whenClickOnIConfirmButton()
        // --- Other possible matches ---
        // whenClickOnHyperlinkString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on Hyperlink {string}
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.49] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink

      Then("page navigates to Do you have any other liability issues?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      When("I select Checkbox No, I do not have any other liability issues at Position 6")
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

      Then("page navigates to Did the individual receive tax credits for any of the years covered by this disclosure?")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")
        // --- Other possible matches ---
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenPageShouldDisplayCheckboxesForTheStringTaxYearsBeforeTheCurrentTaxYear() [0.48] (OffshoreDisclosureStepDefSteps.scala) pattern: page should display checkboxes for the {string} tax years before the current tax year
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page
        // givenIAmNavigatedToWhatIsTheDisclosurePage() [0.47] (WhatIsDisclosureStepDefSteps.scala) pattern: I am navigated to What is the disclosure Page

      When("I select Radio Button No at Position 2")
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

      Then("page navigates to Review other liability issues")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenINavigateToStringOtherLiabilitiesPage() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} other liabilities page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      When("click on continue button on summary page")
        // Possible match (best=1.00)
        whenClickOnContinueButtonOnSummaryPage()
        // --- Other possible matches ---
        // whenClickOnContinueButton() [1.00] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenIClickOnContinueButton() [0.70] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // andOnTheHomepageIClickContinueToNavigateToTheXPage() [0.56] (CaseManagementStepDefSteps.scala) pattern: on the homepage I click continue to navigate to the (.*) page
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenIClickOnMakeADisclosureButton() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // thenContinueButtonDisplayed() [0.47] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: Continue Button displayed
        // whenClickOnSubmitOnWizardPage() [0.47] (CaseManagementStepDefSteps.scala) pattern: click on submit on wizard page
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

      And("status is marked as Completed for field Edit other liability issues")
        // Possible match (best=0.52)
        thenStatusIsMarkedAsStringForFieldString("", "")

      Then("status is marked as Not started for field Add the reason for coming forward now")
        // Possible match (best=0.52)
        thenStatusIsMarkedAsStringForFieldString("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

      And("click on Hyperlink Add the reason for coming forward now")
        // Possible match (best=0.52)
        whenClickOnHyperlinkString("")
        // --- Other possible matches ---
        // whenOnTheXPageIClickOnTheHeaderHyperlink() [0.49] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I click on the header hyperlink

      Then("page navigates to Why are you making a disclosure now?")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReasonPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      And("I select Checkbox Other at Position 8")
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

      Then("page navigates to What is the reason for making a disclosure now?")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")
        // --- Other possible matches ---
        // whenINavigateToStringReasonPage() [0.58] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reason page
        // andVerifyOnTheXPage() [0.57] (CaseManagementStepDefSteps.scala) pattern: verify on the (.*) page
        // givenINavigateToStringPage() [0.56] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I navigate to {string} page
        // givenIAmNavigatedToWhatIsTheDisclosurePage() [0.54] (WhatIsDisclosureStepDefSteps.scala) pattern: I am navigated to What is the disclosure Page
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
        // whenIEnterStringInTheReasonForMakingADisclosureNowTextArea() [0.48] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for making a disclosure now text area
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
        // givenINavigateToAuthorityWizardPage() [0.47] (HomePageStepDefSteps.scala) pattern: I navigate to authority wizard page
        // whenINavigateToStringSpecificPage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} specific page
        // whenINavigateToStringOffshorePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} offshore page
        // whenINavigateToStringReferencePage() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I navigate to {string} reference page

      When("I enter reason for making a disclosure now in the reason for making a disclosure now text area")
        // Possible match (best=0.80)
        whenIEnterStringInTheReasonForMakingADisclosureNowTextArea("")
        // --- Other possible matches ---
        // whenIEnterStringInTheTextArea() [0.75] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheAdviceTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the advice text area
        // whenIEnterStringInTheMonthTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheYearTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheReasonForExcuseTextArea() [0.66] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for excuse text area
        // whenIEnterStringInTheReasonableCareTextArea() [0.62] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable care text area
        // whenIEnterStringInTheReasonForReasonableExcuseTextArea() [0.61] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for reasonable excuse text area
        // whenIEnterStringInTheWhyWasTheDisclosureNotMadeBeforeNowTextArea() [0.57] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the why was the disclosure not made before now text area
        // whenIEnterStringInTheReasonableExcuseTextArea() [0.57] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable excuse text area
        // whenIEnterStringInTheCanYouDescribeTheGiftTextArea() [0.56] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the can you describe the gift text area
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

      Then("page navigates to Why was the disclosure not made before now?")
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
        // whenIEnterStringInTheWhyWasTheDisclosureNotMadeBeforeNowTextArea() [0.47] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the why was the disclosure not made before now text area
        // givenIAmNavigatedToWhatIsTheDisclosurePage() [0.47] (WhatIsDisclosureStepDefSteps.scala) pattern: I am navigated to What is the disclosure Page

      When("I enter reason for why was the disclosure not made before now in the why was the disclosure not made before now text area")
        // Possible match (best=0.80)
        whenIEnterStringInTheWhyWasTheDisclosureNotMadeBeforeNowTextArea("")
        // --- Other possible matches ---
        // whenIEnterStringInTheTextArea() [0.75] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheReasonForMakingADisclosureNowTextArea() [0.74] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for making a disclosure now text area
        // whenIEnterStringInTheAdviceTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the advice text area
        // whenIEnterStringInTheMonthTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the month text area
        // whenIEnterStringInTheYearTextArea() [0.67] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the year text area
        // whenIEnterStringInTheReasonForExcuseTextArea() [0.66] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for excuse text area
        // whenIEnterStringInTheReasonableCareTextArea() [0.62] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable care text area
        // whenIEnterStringInTheReasonForReasonableExcuseTextArea() [0.61] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reason for reasonable excuse text area
        // whenIEnterStringInTheReasonableExcuseTextArea() [0.57] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the reasonable excuse text area
        // whenIEnterStringInTheCanYouDescribeTheGiftTextArea() [0.56] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the can you describe the gift text area
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

      Then("page navigates to Did someone give the individual advice that led them to not declare these tax issues previously?")
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

      When("I select Radio Button No at Position 2")
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

      Then("page navigates to Summary")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
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

      And("status is marked as Completed for field Edit the reason for coming forward now")
        // Possible match (best=0.52)
        thenStatusIsMarkedAsStringForFieldString("", "")
        // --- Other possible matches ---
        // thenIEnterStringInTheTextBoxField() [0.50] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I enter {string} in the TextBox field

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

      When("click on Save and Continue button")
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

      When("I enter 15 in the TextBox field")
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

      And("I click on Send offer and disclosure button")
        // Possible match (best=1.00)
        whenIClickOnSendOfferAndDisclosureButton()
        // --- Other possible matches ---
        // whenIClickOnMakeADisclosureButton() [0.60] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // whenIClickOnSendNotificationButton() [0.58] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenClickOnSaveAndContinueButton() [0.47] (ReceivedALetterStepDefSteps.scala) pattern: click on Save and Continue button

      Then("page navigates to You have sent your disclosure")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")
        // --- Other possible matches ---
        // thenPageNavigatesToString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: page navigates to {string}
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
