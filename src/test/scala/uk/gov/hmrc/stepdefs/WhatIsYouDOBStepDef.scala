/*
 * Copyright 2022 HM Revenue & Customs
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

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, WhatIsYourDOBPage}

class WhatIsYouDOBStepDef extends BasePage with WhatIsYourDOBPage {

  Given("""I am on What is your date of birth page""") { () =>
    navigateToSpecificPage("notification/your-date-of-birth")
  }

  When("""I enter {string} in the {string} text box field""") { (string: String, string2: String) =>
    enterInputInDOBPage(string, string2)
  }

  Then("""input TextBox with value {string} is displayed""") { (string: String) =>
    isInputTextBoxDisplayed(string)
  }
}