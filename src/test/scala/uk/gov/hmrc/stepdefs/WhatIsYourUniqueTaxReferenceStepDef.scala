/*
 * Copyright 2023 HM Revenue & Customs
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

class WhatIsYourUniqueTaxReferenceStepDef extends BasePage{

  Given("""I am on What is your Unique Tax Reference Page""") { () =>
    navigateToSpecificPage("notification/your-utr")
  }

  Given("""I am on What is the individual Unique Tax Reference Page""") { () =>
    navigateToSpecificPage("notification/individual-utr")
  }

  Then("""I should navigate to UTR number TextBox field""") { () =>
    verifyFocusOnTextbox()
  }
}