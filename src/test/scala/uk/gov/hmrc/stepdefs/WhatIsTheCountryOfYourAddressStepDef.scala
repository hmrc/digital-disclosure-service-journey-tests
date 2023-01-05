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

import uk.gov.hmrc.pages.{BasePage,WhatIsTheCountryOfAddressPage}

class WhatIsTheCountryOfYourAddressStepDef extends BasePage with WhatIsTheCountryOfAddressPage {

  Given("""I am on What is the country of your address Page""") { () =>
    navigateToSpecificPage("notification/your-address/lookup")
  }

  Given("""I am on What is the country of the individual address Page""") { () =>
    navigateToSpecificPage("notification/individual-address/lookup")
  }

  When("""enter country name {string},dropdown is displayed""") { (string:String) =>
    enterInputInTextBox(string)
    verifyDropdownDisplayed()
  }

  When("""enter country name {string},select country {string}""") { (inputString: String,stringToSelect: String ) =>
    enterInputInTextBox(inputString)
    selectfromDropdown(stringToSelect)
  }

  When("""enter postcode {string}""") { (string: String) =>
    enterInputInTextBox(string)
  }

  When("""enter Property name as {string}""") { (string: String) =>
    enterPropertyInput(string)
  }

  When("""enter Property number as {string}""") { (string: String) =>
    enterPropertyInput(string)
  }

  When("""address at line {string} is {string}""") { (linePosition: String,string: String) =>
    verifyAddress(linePosition,string)
  }

  When("""click on Try a Different Postcode""") { () =>
    saveAndContinue()
  }

  When("""click on continue button""") { () =>
    saveAndContinue()
  }

  When("""click on confirm button""") { () =>
    saveAndContinue()
  }

  Then("""Continue Button displayed""") { () =>
    isSaveAndContinueButtonDisplayed()
  }

  Then("""hyperlink of {string} is displayed""") { (string:String) =>
    verifyAddressHyperlink(string)
  }

  Then("""shows message {string}""") { (string:String) =>
    verifyMessage(string)
  }

  Then("""list of matching option is displayed""") { () =>
    verifyRadioButtonAndTextNotSelected()
  }

  Then("""focus navigates TextBox field""") { () =>
    verifyFocusOnTextbox()
  }
}
