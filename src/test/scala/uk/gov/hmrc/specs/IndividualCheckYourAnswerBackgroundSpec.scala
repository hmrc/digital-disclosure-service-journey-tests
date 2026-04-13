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

      When("I select Radio Button Yes at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter CFSS-1234567 in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button An individual at Position 1")
        // Possible match (best=0.58)
        whenISelectRadioOptionAnIndividual()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes, I am the individual at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Checkbox Property capital gains at Position 4")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter My full name in the TextBox field")
        // Possible match (best=0.81)
        whenIEnterAnythingInFullNameTextBoxField()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Checkbox Email at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")

      And("I select Checkbox Telephone at Position 2")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter individual@email.com in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter 07777 777778 in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter 01 in the Day text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopDayTextBoxField("")

      And("I enter 01 in the Month text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopMonthTextBoxField("")

      And("I enter 1981 in the Year text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopYearTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter Doctor in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes, and I know my National Insurance number at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter AZ 12 34 56 D in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes, and I know my VAT registration number at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter 123456788 in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes, and I know my Unique Taxpayer Reference (UTR) at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter 1234567810 in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("enter country name United Kingdom,select country United Kingdom")
        // Possible match (best=0.50)
        whenEnterCountryNameStringSelectCountryString("", "")

      And("click on continue button")
        // Possible match (best=1.00)
        whenClickOnContinueButton()

      And("I click on the hyperlink with text Enter the address manually")
        // Possible match (best=0.76)
        whenIClickOnTheHyperlinkWithTextString("")

      And("I enter 4 Testing Lane in the Address line 1 field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")

      And("I enter Royal Madeuptown in the Town or city field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")

      And("I enter ZZ9Z 9TT in the Postcode field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("click on confirm button")
        // Possible match (best=1.00)
        whenClickOnConfirmButton()

      Then("page navigates to Check Your Answers")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")

      And("answers page should have h2 header Background")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")

      And("answers page should have h2 header About you")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")

      And("answers page should not have h2 header About the individual")
        // Possible match (best=0.61)
        thenAnswersPageShouldNotHaveH2HeaderString("")

      When("I click on change button for Are you the individual that the disclosure will be about?")
        // Possible match (best=0.60)
        givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage()

      And("I select Radio Button I am an accountant or tax agent at Position 2")
        // Possible match (best=0.56)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter represent org in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Checkbox Self-employment income at Position 5")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter Individual full name in the TextBox field")
        // Possible match (best=0.81)
        whenIEnterAnythingInFullNameTextBoxField()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter 01 in the Day text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopDayTextBoxField("")

      And("I enter 01 in the Month text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopMonthTextBoxField("")

      And("I enter 1980 in the Year text box field")
        // Possible match (best=0.74)
        whenIEnterStringInStopYearTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter Dentist in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes, and I know their National Insurance number at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter AZ 12 34 56 D in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes, and I know their VAT registration number at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter 123456789 in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Radio Button Yes, and I know their Unique Taxpayer Reference (UTR) at Position 1")
        // Possible match (best=0.70)
        whenISelectYesRadioButton()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter 1234567890 in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("enter country name United Kingdom,select country United Kingdom")
        // Possible match (best=0.50)
        whenEnterCountryNameStringSelectCountryString("", "")

      And("click on continue button")
        // Possible match (best=1.00)
        whenClickOnContinueButton()

      And("I click on the hyperlink with text Enter the address manually")
        // Possible match (best=0.76)
        whenIClickOnTheHyperlinkWithTextString("")

      And("I enter 2 Testing Lane in the Address line 1 field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")

      And("I enter Royal Madeuptown in the Town or city field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")

      And("I enter ZZ9Z 9TT in the Postcode field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("click on confirm button")
        // Possible match (best=1.00)
        whenClickOnConfirmButton()

      And("I enter Individual full name in the TextBox field")
        // Possible match (best=0.81)
        whenIEnterAnythingInFullNameTextBoxField()

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I select Checkbox Email at Position 1")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")

      And("I select Checkbox Telephone at Position 2")
        // Possible match (best=0.65)
        whenISelectCheckboxStringAtPositionString("", "")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter abc@abc.com in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("I enter 07777 777777 in the TextBox field")
        // Possible match (best=0.80)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("enter country name United Kingdom,select country United Kingdom")
        // Possible match (best=0.50)
        whenEnterCountryNameStringSelectCountryString("", "")

      And("click on continue button")
        // Possible match (best=1.00)
        whenClickOnContinueButton()

      And("I click on the hyperlink with text Enter the address manually")
        // Possible match (best=0.76)
        whenIClickOnTheHyperlinkWithTextString("")

      And("I enter 1 Testing Lane in the Address line 1 field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")

      And("I enter Royal Madeuptown in the Town or city field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")

      And("I enter ZZ9Z 9TT in the Postcode field")
        // Possible match (best=0.60)
        thenIEnterStringInTheTextBoxField("")

      And("click on Save and Continue button")
        // Possible match (best=1.00)
        whenClickOnSaveAndContinueButton()

      And("click on confirm button")
        // Possible match (best=1.00)
        whenClickOnConfirmButton()

      Then("page navigates to Check Your Answers")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")

      And("answers page should have h2 header Background")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")

      And("Background section has following")
        // Possible match (best=1.00)
        thenBackgroundSectionHasFollowing(null)

      And("answers page should have h2 header About you")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")

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

      And("About The Individual section should have a label Individual’s full name at line 1 an answer with Individual full name and change URL ends with individual-full-name/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About The Individual section should have a label Individual’s date of birth at line 2 an answer with 01 January 1980 and change URL ends with individual-date-of-birth/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About The Individual section should have a label Individual’s main occupation at line 3 an answer with Dentist and change URL ends with individual-main-occupation/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About The Individual section should have a label Does the individual have a National Insurance number, as far as you’re aware? at line 4 an answer with Yes, and I know their National Insurance number and change URL ends with individual-have-national-insurance-number/change")
        // Possible match (best=0.58)
        givenIAmOnDoesTheIndividualHaveANationalInsuranceNumberPage()

      And("About The Individual section should have a label Individual’s National Insurance number at line 5 an answer with AZ123456D and change URL ends with individual-national-insurance-number/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About The Individual section should have a label Is the individual registered for VAT, as far you’re aware? at line 6 an answer with Yes, and I know their VAT registration number and change URL ends with individual-registered-for-vat/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About The Individual section should have a label Individual’s VAT registration number at line 7 an answer with 123456789 and change URL ends with individual-vat-registration/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About The Individual section should have a label Is the individual registered for Self Assessment, as far as you’re aware? at line 8 an answer with Yes, and I know their Unique Taxpayer Reference (UTR) and change URL ends with individual-self-assessment/change")
        // Possible match (best=0.75)
        givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer("")

      And("About The Individual section should have a label Individual’s Unique Taxpayer Reference at line 9 an answer with 1234567890 and change URL ends with individual-utr/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("About The Individual section should have a label Individual’s address at line 10 an answer with 2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with individual-address/lookup/change")
        // Possible match (best=0.57)
        thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      When("I click on send notification button")
        // Possible match (best=1.00)
        whenIClickOnSendNotificationButton()

      Then("page navigates to You have sent the notification")
        // Possible match (best=0.62)
        andOnTheHomepageIClickContinueToNavigateToTheXPage("")

      And("the case reference should be CFSS-1234567")
        // Possible match (best=0.58)
        thenTheCaseReferenceShouldBeString("")
    }
  }
}
