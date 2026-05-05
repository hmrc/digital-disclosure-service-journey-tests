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

import uk.gov.hmrc.specpage.BasePage

object WhatIsYourNationalInsuranceNumStepDefSteps extends BasePage {

  // I am on What is your National Insurance number Page
  def givenIAmOnWhatIsYourNationalInsuranceNumberPage(): Unit = {
    navigateToSpecificPage("notification/your-national-insurance-number")
  }

  // I am on What is individual National Insurance number Page
  def givenIAmOnWhatIsIndividualNationalInsuranceNumberPage(): Unit = {
    navigateToSpecificPage("notification/individual-national-insurance-number")
  }

  // I enter no data in NI Number TextBox field
  def whenIEnterNoDataInNINumberTextBoxField(): Unit = {
    enterInputInTextBox("")
  }

  // I enter valid NI Number TextBox field
  def whenIEnterValidNINumberTextBoxField(): Unit = {
    enterInputInTextBox("AA123456A")
  }

  // I enter invalid NI Number TextBox field
  def whenIEnterInvalidNINumberTextBoxField(): Unit = {
    enterInputInTextBox("QQyyyyyyC")
  }

  // I enter {string} NI Number TextBox field
  def whenIEnterStringNINumberTextBoxField(string:String): Unit = {
    enterInputInTextBox(string)
  }

  // I should navigate to NI number TextBox field
  def thenIShouldNavigateToNINumberTextBoxField(): Unit = {
    verifyFocusOnTextbox()
  }

}
