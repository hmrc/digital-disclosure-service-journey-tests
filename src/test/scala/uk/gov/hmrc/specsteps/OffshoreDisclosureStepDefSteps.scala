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

package uk.gov.hmrc.specsteps

import uk.gov.hmrc.specpage.{BasePage, OffshoreDisclosurePage}

object OffshoreDisclosureStepDefSteps extends BasePage with OffshoreDisclosurePage {

  // I click on Make a disclosure button
  def whenIClickOnMakeADisclosureButton(): Unit = {
    makeADisclosure()
  }

  // I navigate to {string} specific page
  def whenINavigateToStringSpecificPage(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        navigateToSpecificURL(string)
  }

  // I navigate to {string} offshore page
  def whenINavigateToStringOffshorePage(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        navigateToSpecificURL("offshore/"+string)
  }

  // I navigate to {string} other liabilities page
  def whenINavigateToStringOtherLiabilitiesPage(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        navigateToSpecificURL("other-liabilities/"+string)
  }

  // I navigate to {string} reason page
  def whenINavigateToStringReasonPage(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        navigateToSpecificURL("reason/"+string)
  }

  // I navigate to {string} reference page
  def whenINavigateToStringReferencePage(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        navigateToSpecificURL("reference/"+string)
  }

  // page should display checkboxes for the {string} tax years before the current tax year
  def whenPageShouldDisplayCheckboxesForTheStringTaxYearsBeforeTheCurrentTaxYear(string: String): Unit = {
    verifyDisplayedCheckbox(string)
  }

  // I enter {string} in the reason for excuse text area
  def whenIEnterStringInTheReasonForExcuseTextArea(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        enterTextInExcuse(string)
  }

  // I enter {string} in the reason for reasonable excuse text area
  def whenIEnterStringInTheReasonForReasonableExcuseTextArea(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        enterTextInReasonableExcuse(string)
  }

  // I enter {string} in the can you describe the gift text area
  def whenIEnterStringInTheCanYouDescribeTheGiftTextArea(string: String): Unit = {
    enterTextInDescription(string)
  }

  // I enter {string} in the can you describe what other liability issues text area
  def whenIEnterStringInTheCanYouDescribeWhatOtherLiabilityIssuesTextArea(string: String): Unit = {
    enterTextInDescription(string)
  }

  // I enter {string} in the reasonable care text area
  def whenIEnterStringInTheReasonableCareTextArea(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        enterTextInReasonableCare(string)
  }

  // I enter {string} in the reasonable excuse text area
  def whenIEnterStringInTheReasonableExcuseTextArea(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        enterTextInReasonableExcuse(string)
  }

  // I enter {string} in the advice text area
  def whenIEnterStringInTheAdviceTextArea(string: String): Unit = {
    enterTextInAdviceTextArea(string)
  }

  // I enter {string} in the month text area
  def whenIEnterStringInTheMonthTextArea(string: String): Unit = {
    enterTextInAdviceMonthTextArea(string)
  }

  // I enter {string} in the year text area
  def whenIEnterStringInTheYearTextArea(string: String): Unit = {
    enterTextInAdviceYearTextArea(string)
  }

  // I enter {string} in the reason for making a disclosure now text area
  def whenIEnterStringInTheReasonForMakingADisclosureNowTextArea(string: String): Unit = {
    enterTextInTextArea(string)
  }

  // I enter {string} in the why was the disclosure not made before now text area
  def whenIEnterStringInTheWhyWasTheDisclosureNotMadeBeforeNowTextArea(string: String): Unit = {
    enterTextInTextArea(string)
  }

  // verify the radio option at position {string} is {string}
  def thenVerifyTheRadioOptionAtPositionStringIsString(positionNum: String,expectedText: String): Unit = {
    verifyRadioButtonAndText(expectedText,positionNum)
  }

  // I enter {string} in the text area
  def whenIEnterStringInTheTextArea(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        enterTextInTextArea(string)
  }

  // I enter country or territory {string} and select {string}
  def whenIEnterCountryOrTerritoryStringAndSelectString(inputString: String,stringToSelect: String): Unit = {
    enterCountry(inputString)
        selectFromCountryDropdown(stringToSelect)
  }

  // click on continue button on summary page
  def whenClickOnContinueButtonOnSummaryPage(): Unit = {
    continueButtonOnSummaryPage()
  }

  // status is marked as {string} for field {string}
  def thenStatusIsMarkedAsStringForFieldString(status: String, fieldName: String): Unit = {
    checkTaskStatus(status,fieldName)
  }

  // I click on Send offer and disclosure button
  def whenIClickOnSendOfferAndDisclosureButton(): Unit = {
    sendOfferAndDisclosure()
  }

}
