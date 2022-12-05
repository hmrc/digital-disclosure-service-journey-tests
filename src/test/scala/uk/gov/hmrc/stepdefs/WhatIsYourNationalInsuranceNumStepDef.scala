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

import uk.gov.hmrc.pages.BasePage

class WhatIsYourNationalInsuranceNumStepDef extends BasePage{

  Given("""I am on What is your National Insurance number Page""") { () =>
    navigateToSpecificPage("notification/your-national-insurance-number")
  }

  Given("""I am on What is individual National Insurance number Page""") { () =>
    navigateToSpecificPage("notification/individual-national-insurance-number")
  }

  When("""I enter no data in NI Number TextBox field""") { () =>
    enterInputInTextBox("")
  }

  When("""I enter valid NI Number TextBox field""") { () =>
    enterInputInTextBox("AA123456A")
  }

  When("""I enter invalid NI Number TextBox field""") { () =>
    enterInputInTextBox("QQyyyyyyC")
  }
  When("""I enter {string} NI Number TextBox field""") { (string:String) =>
    enterInputInTextBox(string)
  }

  Then("""I should navigate to NI number TextBox field""") { () =>
    verifyFocusOnTextbox()
  }
}
