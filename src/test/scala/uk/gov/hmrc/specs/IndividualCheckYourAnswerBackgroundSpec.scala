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
import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps._
import uk.gov.hmrc.specsteps.HomePageStepDefSteps._
import uk.gov.hmrc.specsteps.IndividualAreYouRegisteredForSelfAssessmentStepDefSteps._
import uk.gov.hmrc.specsteps.IndividualDoesIndividualHaveNINumStepDefSteps.givenIAmOnDoesTheIndividualHaveANationalInsuranceNumberPage
import uk.gov.hmrc.specsteps.NotificationSubmittedStepDefSteps._
import uk.gov.hmrc.specsteps.OnshoreDisclosureStepDefSteps._
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsDisclosureStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsTheCountryOfYourAddressStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsYourFullNameStepDefSteps._
import uk.gov.hmrc.specsteps.WhatIsYourMainOccupationStepDefSteps._


class IndividualCheckYourAnswerBackgroundSpec extends BaseSpec {

  Feature("An individual UK tax payer is able to check their answers for background section before submitting page") {

    Scenario("On behalf of Individual - Change Route validation -  From Yes to No on behalf of the individual - Are you the individual that the disclosure will be about?") {
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

      And("I select Radio Button Yes, I am the individual at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
        // whenISelectRadioButtonStringAtPositionString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I select Radio Button {string} at Position {string}
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page
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

      And("I select Checkbox Property capital gains at Position 4")
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

      And("I enter My full name in the TextBox field")
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

      And("I enter individual@email.com in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringEmailTextBoxField() [0.78] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter {string} email TextBox field
        // whenIEnterInvalidEmailTextBoxField() [0.78] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter invalid email TextBox field
        // whenIEnterNoDataInEmailTextBoxField() [0.72] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter no data in email TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.64] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterAnythingInReferenceNumberTextBoxField() [0.64] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter anything in reference number TextBox field
        // whenIEnterAnythingInFullNameTextBoxField() [0.64] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter anything in Full Name TextBox field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // thenIShouldNavigateToEmailTextBoxField() [0.60] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I should navigate to email TextBox field
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
        // whenIEnterDataWithMaxLengthOfStringInEmailTextBoxField() [0.50] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter data with max length of {string} in Email TextBox field
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

      And("I enter 07777 777778 in the TextBox field")
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

      And("I enter 1981 in the Year text box field")
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

      And("I enter Doctor in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")
        // --- Other possible matches ---
        // whenIEnterStringEmailTextBoxField() [0.67] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter {string} email TextBox field
        // whenIEnterInvalidEmailTextBoxField() [0.67] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter invalid email TextBox field
        // thenIShouldNavigateToTextBoxField() [0.67] (WhatIsYourMainOccupationStepDefSteps.scala) pattern: I should navigate to TextBox field
        // whenIEnterStringInTheStringTextBoxField() [0.64] (WhatIsYouDOBStepDefSteps.scala) pattern: I enter {string} in the {string} text box field
        // whenIEnterNoDataInEmailTextBoxField() [0.64] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I enter no data in email TextBox field
        // whenIEnterAnythingInReferenceNumberTextBoxField() [0.64] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I enter anything in reference number TextBox field
        // whenIEnterAnythingInFullNameTextBoxField() [0.64] (WhatIsYourFullNameStepDefSteps.scala) pattern: I enter anything in Full Name TextBox field
        // whenIEnterStringInWhatHasHappenedToPropertyTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in whatHasHappenedToProperty text box field
        // whenIEnterStringInYearNotSelectedTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in yearNotSelected text box field
        // whenIEnterStringInPercentageTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in percentage text box field
        // whenIEnterStringInTypeOfMortageTextBoxField() [0.62] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in typeOfMortage text box field
        // thenIShouldNavigateToEmailTextBoxField() [0.60] (WhatIsYourEmailAddressStepDefSteps.scala) pattern: I should navigate to email TextBox field
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
        // thenIShouldNavigateToReferenceNumberTextBoxField() [0.55] (HmrcLetterReferencePageStepDefSteps.scala) pattern: I should navigate to reference number TextBox field
        // thenFocusNavigatesTextBoxField() [0.55] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: focus navigates TextBox field
        // thenIShouldNavigateToNINumberTextBoxField() [0.55] (WhatIsYourNationalInsuranceNumStepDefSteps.scala) pattern: I should navigate to NI number TextBox field
        // thenIShouldNavigateToOrganisationNameTextBoxField() [0.55] (AreYouRepresentingOrganisationStepDefSteps.scala) pattern: I should navigate to Organisation Name TextBox field
        // thenIShouldNavigateToUTRNumberTextBoxField() [0.55] (WhatIsYourUniqueTaxReferenceStepDefSteps.scala) pattern: I should navigate to UTR number TextBox field
        // whenIEnterStringInTheTextArea() [0.50] (OffshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in the text area
        // whenIEnterStringInTheStringField() [0.50] (InternationalAddressStepDefSteps.scala) pattern: I enter {string} in the {string} field
        // whenIEnterStringInTaxOwedReasonTextBoxField() [0.50] (OnshoreDisclosureStepDefSteps.scala) pattern: I enter {string} in tax owed reason text box field

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

      And("I select Radio Button Yes, and I know my National Insurance number at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.70] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
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

      And("I enter AZ 12 34 56 D in the TextBox field")
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

      And("I select Radio Button Yes, and I know my VAT registration number at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.70] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
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

      And("I enter 123456788 in the TextBox field")
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

      And("I select Radio Button Yes, and I know my Unique Taxpayer Reference (UTR) at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.70] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
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

      And("I enter 1234567810 in the TextBox field")
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

      And("I enter 4 Testing Lane in the Address line 1 field")
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

      And("answers page should have h2 header About you")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")
        // --- Other possible matches ---
        // thenAnswersPageShouldNotHaveH2HeaderString() [0.52] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should not have h2 header {string}

      And("answers page should not have h2 header About the individual")
        // Possible match (best=0.61)
        thenAnswersPageShouldNotHaveH2HeaderString("")
        // --- Other possible matches ---
        // thenAnswersPageShouldHaveH2HeaderString() [0.60] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should have h2 header {string}

      When("I click on change button for Are you the individual that the disclosure will be about?")
        // Possible match (best=0.60)
        givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage()
        // --- Other possible matches ---
        // whenIClickOnMakeADisclosureButton() [0.60] (OffshoreDisclosureStepDefSteps.scala) pattern: I click on Make a disclosure button
        // whenIClickOnChangeButtonForString() [0.60] (CheckYourAnswersStepDefSteps.scala) pattern: I click on change button for {string}
        // whenIClickOnContinueButton() [0.56] (HomePageStepDefSteps.scala) pattern: I click on continue button
        // whenClickOnIConfirmButton() [0.56] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: click on I confirm button
        // givenIAmNavigatedToAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.56] (AreYouTheIndividualStepDefSteps.scala) pattern: I am navigated to Are you the individual that the disclosure will be about? Page
        // whenIClickOnBackButton() [0.56] (ReceivedALetterStepDefSteps.scala) pattern: I click on Back button
        // whenClickOnSubmitButton() [0.52] (HomePageStepDefSteps.scala) pattern: click on submit button
        // whenClickOnContinueButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on continue button
        // whenClickOnConfirmButton() [0.52] (WhatIsTheCountryOfYourAddressStepDefSteps.scala) pattern: click on confirm button
        // whenIClickOnSendNotificationButton() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: I click on send notification button

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

      And("I select Checkbox Self-employment income at Position 5")
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

      And("I select Radio Button Yes, and I know their National Insurance number at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.70] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
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

      And("I enter AZ 12 34 56 D in the TextBox field")
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

      And("I select Radio Button Yes, and I know their VAT registration number at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.70] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
        // whenISelectRadioButtonStringAtPositionString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I select Radio Button {string} at Position {string}
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenISelectRadioOptionAnIndividual() [0.47] (WhatIsDisclosureStepDefSteps.scala) pattern: I select radio option An Individual
        // givenIAmOnWhatIsTheIndividualSVATRegistrationNumberPage() [0.47] (WhatIsYourVATNumberStepDefSteps.scala) pattern: I am on What is the individual’s VAT registration number page

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

      And("I enter 123456789 in the TextBox field")
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

      And("I select Radio Button Yes, and I know their Unique Taxpayer Reference (UTR) at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()
        // --- Other possible matches ---
        // thenISelectNoRadioButton() [0.70] (ReceivedALetterStepDefSteps.scala) pattern: I select No radio button
        // whenISelectRadioButtonStringAtPositionString() [0.52] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I select Radio Button {string} at Position {string}
        // whenISelectString() [0.47] (AreYouTheIndividualStepDefSteps.scala) pattern: I select {string}
        // whenISelectRadioOptionAnIndividual() [0.47] (WhatIsDisclosureStepDefSteps.scala) pattern: I select radio option An Individual
        // thenOnTheXPageISelectXAndClickSaveAndContinue() [0.47] (CaseManagementStepDefSteps.scala) pattern: on the (.*) page I select (.*) and click save and continue

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

      And("I enter 1234567890 in the TextBox field")
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

      And("I enter 2 Testing Lane in the Address line 1 field")
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

      And("line 1 should have a label Your full name an answer with Individual full name and change URL ends with your-full-name/change")
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

      And("answers page should have h2 header About the individual")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")
        // --- Other possible matches ---
        // thenAnswersPageShouldNotHaveH2HeaderString() [0.52] (CheckYourAnswersStepDefSteps.scala) pattern: answers page should not have h2 header {string}

      And("About The Individual section should have a label Individual’s full name at line 1 an answer with Individual full name and change URL ends with individual-full-name/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnTheHomePage() [0.47] (HomePageStepDefSteps.scala) pattern: I am on the Home page

      And("About The Individual section should have a label Individual’s date of birth at line 2 an answer with 01 January 1980 and change URL ends with individual-date-of-birth/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}

      And("About The Individual section should have a label Individual’s main occupation at line 3 an answer with Dentist and change URL ends with individual-main-occupation/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}

      And("About The Individual section should have a label Does the individual have a National Insurance number, as far as you’re aware? at line 4 an answer with Yes, and I know their National Insurance number and change URL ends with individual-have-national-insurance-number/change")
        // Possible match (best=0.58)
        givenIAmOnDoesTheIndividualHaveANationalInsuranceNumberPage()
        // --- Other possible matches ---
        // givenIAmOnDoYouHaveANationalInsuranceNumberPage() [0.57] (DoYouHaveNationalInsuranceNumStepDefSteps.scala) pattern: I am on Do you have a National Insurance number Page
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.45] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page

      And("About The Individual section should have a label Individual’s National Insurance number at line 5 an answer with AZ123456D and change URL ends with individual-national-insurance-number/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnDoesTheIndividualHaveANationalInsuranceNumberPage() [0.52] (IndividualDoesIndividualHaveNINumStepDefSteps.scala) pattern: I am on Does the individual have a National Insurance number Page
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}

      And("About The Individual section should have a label Is the individual registered for VAT, as far you’re aware? at line 6 an answer with Yes, and I know their VAT registration number and change URL ends with individual-registered-for-vat/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // givenIAmOnAreYouRegisteredForVATPage() [0.54] (AreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Are you registered for VAT Page
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualSVATRegistrationNumberPage() [0.52] (WhatIsYourVATNumberStepDefSteps.scala) pattern: I am on What is the individual’s VAT registration number page
        // givenIAmOnIsTheIndividualRegisteredForVATAsFarYouReAwarePageAsStringTaxPayer() [0.52] (IndividualAreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Is the individual registered for VAT, as far you’re aware page as {string} tax payer
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer() [0.47] (IndividualAreYouRegisteredForSelfAssessmentStepDefSteps.scala) pattern: I am on Is the individual registered for Self Assessment, as far as you’re aware page as {string} tax payer
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.45] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page

      And("About The Individual section should have a label Individual’s VAT registration number at line 7 an answer with 123456789 and change URL ends with individual-vat-registration/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualSVATRegistrationNumberPage() [0.52] (WhatIsYourVATNumberStepDefSteps.scala) pattern: I am on What is the individual’s VAT registration number page
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}

      And("About The Individual section should have a label Is the individual registered for Self Assessment, as far as you’re aware? at line 8 an answer with Yes, and I know their Unique Taxpayer Reference (UTR) and change URL ends with individual-self-assessment/change")
        // Possible match (best=0.75)
        givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer("")
        // --- Other possible matches ---
        // givenIAmOnIsTheIndividualRegisteredForVATAsFarYouReAwarePageAsStringTaxPayer() [0.70] (IndividualAreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Is the individual registered for VAT, as far you’re aware page as {string} tax payer
        // givenIAmOnWhatIsTheIndividualSMainOccupationAsStringTaxPayer() [0.60] (IndividualWhatIsYourMainOccupationStepDefSteps.scala) pattern: I am on What is the individual’s main occupation as {string} tax payer
        // thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.57] (CheckYourAnswersStepDefSteps.scala) pattern: About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnAreYouRegisteredForSelfAssessmentPage() [0.56] (AreYouRegisteredForSelfAssessmentStepDefSteps.scala) pattern: I am on Are you registered for Self Assessment Page
        // givenIAmOnWhatIsTheIndividualSDateOfBirthPageAsStringTaxPayer() [0.54] (IndividualWhatIsYourDOBStepDefSteps.scala) pattern: I am on What is the individual’s date of birth page as {string} tax payer
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualUniqueTaxReferencePage() [0.51] (WhatIsYourUniqueTaxReferenceStepDefSteps.scala) pattern: I am on What is the individual Unique Tax Reference Page
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsYourFullNamePageForStringTaxPayer() [0.47] (IndividualWhatIsYourFullNameStepDefSteps.scala) pattern: I am on What is your full name page for {string} tax payer
        // thenTheCaseReferenceShouldBeString() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: the case reference should be {string}
        // givenIAmOnAreYouRegisteredForVATPage() [0.47] (AreYouRegisteredForVATStepDefSteps.scala) pattern: I am on Are you registered for VAT Page
        // givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage() [0.45] (DiscloseOffshoreLiabilitiesStepDefSteps.scala) pattern: I am on Are you the individual that the disclosure will be about? Page

      And("About The Individual section should have a label Individual’s Unique Taxpayer Reference at line 9 an answer with 1234567890 and change URL ends with individual-utr/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: line {string} should have a label {string} an answer with {string} and change URL ends with {string}
        // givenIAmOnWhatIsTheIndividualSMainOccupationAsStringTaxPayer() [0.50] (IndividualWhatIsYourMainOccupationStepDefSteps.scala) pattern: I am on What is the individual’s main occupation as {string} tax payer
        // thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.50] (CheckYourAnswersStepDefSteps.scala) pattern: About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
        // thenTheCaseReferenceShouldBeString() [0.47] (NotificationSubmittedStepDefSteps.scala) pattern: the case reference should be {string}
        // givenIAmOnWhatIsTheIndividualSDateOfBirthPageAsStringTaxPayer() [0.46] (IndividualWhatIsYourDOBStepDefSteps.scala) pattern: I am on What is the individual’s date of birth page as {string} tax payer

      And("About The Individual section should have a label Individual’s address at line 10 an answer with 2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with individual-address/lookup/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")
        // --- Other possible matches ---
        // thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString() [0.54] (CheckYourAnswersStepDefSteps.scala) pattern: About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
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
