/*
 * Copyright 2022 HM Revenue & Customs
 *
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
