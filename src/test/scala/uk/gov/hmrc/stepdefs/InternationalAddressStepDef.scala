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

import uk.gov.hmrc.pages.{BasePage, WhatIsTheCountryOfAddressPage, InternationalAddressPage}

class InternationalAddressStepDef extends BasePage with WhatIsTheCountryOfAddressPage with InternationalAddressPage {

  Given("""I am on UK What is your address Page""") { () =>
    navigateToUKManualAddressPage()
  }

  Given("""I am on International What is your address Page""") { () =>
    navigateToIntManualAddressPage()
  }

  When("""I enter country name {string},dropdown is displayed""") { (string:String) =>
    enterInputInTextBox(string)
    verifyDropdownDisplayed()
  }
  When("""I enter {string} in the {string} field""") { (string: String, string2: String) =>
    enterInputInManualAddressPage(string, string2)
  }
}
