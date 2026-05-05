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

import uk.gov.hmrc.specpage.{BasePage, WhatIsYourFullNamePage}

object WhatIsYourFullNameStepDefSteps extends BasePage with WhatIsYourFullNamePage {

  // I am What is your full name Page
  def givenIAmWhatIsYourFullNamePage(): Unit = {
    navigateToSpecificPage("notification/your-full-name")
  }

  // I enter data with max length of {string} in Full Name TextBox field
  def whenIEnterDataWithMaxLengthOfStringInFullNameTextBoxField(string: String): Unit = {
    enterInputInTextBoxWithMaxLength(string)
  }

  // I enter anything in Full Name TextBox field
  def whenIEnterAnythingInFullNameTextBoxField(): Unit = {
    enterInputInTextBox("ABCdef123!@£")
  }

  // I enter no data in Full Name TextBox field
  def whenIEnterNoDataInFullNameTextBoxField(): Unit = {
    enterInputInTextBox("")
  }

}
