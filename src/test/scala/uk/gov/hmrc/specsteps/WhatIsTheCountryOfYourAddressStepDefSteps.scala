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

import uk.gov.hmrc.pages.{BasePage,WhatIsTheCountryOfAddressPage}

object WhatIsTheCountryOfYourAddressStepDefSteps extends BasePage with WhatIsTheCountryOfAddressPage {

  // I am on What is the country of your address Page
  def givenIAmOnWhatIsTheCountryOfYourAddressPage(): Unit = {
    navigateToSpecificPage("notification/your-address/lookup")
  }

  // I am on What is the country of the individual address Page
  def givenIAmOnWhatIsTheCountryOfTheIndividualAddressPage(): Unit = {
    navigateToSpecificPage("notification/individual-address/lookup")
  }

  // enter country name {string},dropdown is displayed
  def whenEnterCountryNameStringDropdownIsDisplayed(string:String): Unit = {
    enterInputInTextBox(string)
        verifyDropdownDisplayed()
  }

  // enter country name {string},select country {string}
  def whenEnterCountryNameStringSelectCountryString(inputString: String,stringToSelect: String): Unit = {
    enterInputInTextBox(inputString)
        selectfromDropdown(stringToSelect)
  }

  // enter postcode {string}
  def whenEnterPostcodeString(string: String): Unit = {
    enterInputInTextBox(string)
  }

  // enter Property name as {string}
  def whenEnterPropertyNameAsString(string: String): Unit = {
    enterPropertyInput(string)
  }

  // enter Property number as {string}
  def whenEnterPropertyNumberAsString(string: String): Unit = {
    enterPropertyInput(string)
  }

  // address at line {string} is {string}
  def whenAddressAtLineStringIsString(linePosition: String,string: String): Unit = {
    verifyAddress(linePosition,string)
  }

  // click on Try a Different Postcode
  def whenClickOnTryADifferentPostcode(): Unit = {
    saveAndContinue()
  }

  // click on continue button
  def whenClickOnContinueButton(): Unit = {
    saveAndContinue()
  }

  // click on confirm button
  def whenClickOnConfirmButton(): Unit = {
    saveAndContinue()
  }

  // Continue Button displayed
  def thenContinueButtonDisplayed(): Unit = {
    isSaveAndContinueButtonDisplayed()
  }

  // hyperlink of {string} is displayed
  def thenHyperlinkOfStringIsDisplayed(string:String): Unit = {
    verifyAddressHyperlink(string)
  }

  // shows message {string}
  def thenShowsMessageString(string:String): Unit = {
    verifyMessage(string)
  }

  // list of matching option is displayed
  def thenListOfMatchingOptionIsDisplayed(): Unit = {
    verifyRadioButtonAndTextNotSelected()
  }

  // focus navigates TextBox field
  def thenFocusNavigatesTextBoxField(): Unit = {
    verifyFocusOnTextbox()
  }

}
