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

import uk.gov.hmrc.pages.{BasePage, WhatIsYourDOBPage, WhatIsYourMainOccupationPage}

class WhatIsYourMainOccupationStepDef extends BasePage with WhatIsYourMainOccupationPage {

  Given("""I am on What is your main occupation page""") { () =>
    navigateToSpecificPage("notification/your-main-occupation")
  }

  Then("""I enter {string} in the TextBox field""") { (string: String) =>
    enterInputInTextBox(string)
  }

  Then("""I should navigate to TextBox field""") { () =>
    verifyFocusOnTextbox()
  }


}