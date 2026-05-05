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

object WhatIsYourUniqueTaxReferenceStepDefSteps extends BasePage {

  // I am on What is your Unique Tax Reference Page
  def givenIAmOnWhatIsYourUniqueTaxReferencePage(): Unit = {
    navigateToSpecificPage("notification/your-utr")
  }

  // I am on What is the individual Unique Tax Reference Page
  def givenIAmOnWhatIsTheIndividualUniqueTaxReferencePage(): Unit = {
    navigateToSpecificPage("notification/individual-utr")
  }

  // I should navigate to UTR number TextBox field
  def thenIShouldNavigateToUTRNumberTextBoxField(): Unit = {
    verifyFocusOnTextbox()
  }

}
