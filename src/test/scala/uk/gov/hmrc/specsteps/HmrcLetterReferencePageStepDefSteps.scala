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

import uk.gov.hmrc.pages.{BasePage, HmrcLetterReferencePage}

object HmrcLetterReferencePageStepDefSteps extends BasePage with HmrcLetterReferencePage {

  // I am on What is the case reference number provided on the letter you received from HMRC Page
  def givenIAmOnWhatIsTheCaseReferenceNumberProvidedOnTheLetterYouReceivedFromHMRCPage(): Unit = {
    navigateToSpecificPage("notification/hmrc-letter-reference")
  }

  // I enter anything in reference number TextBox field
  def whenIEnterAnythingInReferenceNumberTextBoxField(): Unit = {
    enterInputInRefNumTextBox("ABCdef123!@£")
  }

  // I enter no data in reference number TextBox field
  def whenIEnterNoDataInReferenceNumberTextBoxField(): Unit = {
    enterInputInRefNumTextBox("")
  }

  // error summary popup should be displayed with text {string}
  def thenErrorSummaryPopupShouldBeDisplayedWithTextString(string: String): Unit = {
    verifyErrorSummary(string)
  }

  // error message should be displayed with text {string}
  def thenErrorMessageShouldBeDisplayedWithTextString(string: String): Unit = {
    verifyErrorMessage(string)
  }

  // I enter data with max length of {string} in reference number TextBox field
  def whenIEnterDataWithMaxLengthOfStringInReferenceNumberTextBoxField(string: String): Unit = {
    enterInputInRefNumTextBoxWithMaxLength(string)
  }

  // I click on problem message {string}
  def whenIClickOnProblemMessageString(string: String): Unit = {
    clickErrorMessage(string)
  }

  // I should navigate to reference number TextBox field
  def thenIShouldNavigateToReferenceNumberTextBoxField(): Unit = {
    verifyFocusOnTextbox()
  }

  // header with text {string} is displayed
  def thenHeaderWithTextStringIsDisplayed(string: String): Unit = {
    verifyPageHeader(string)
  }

  // user is navigated to the page with title {string}
  def thenUserIsNavigatedToThePageWithTitleString(string: String): Unit = {
    verifyPageHeader(string)
  }

  // input TextBox is displayed
  def thenInputTextBoxIsDisplayed(): Unit = {
    isInputTextBoxDisplayed()
  }

  // save and Continue Button is displayed
  def thenSaveAndContinueButtonIsDisplayed(): Unit = {
    isSaveAndContinueButtonDisplayed()
  }

  // back Button Link is displayed
  def thenBackButtonLinkIsDisplayed(): Unit = {
    isBackButtonDisplayed()
  }

}
