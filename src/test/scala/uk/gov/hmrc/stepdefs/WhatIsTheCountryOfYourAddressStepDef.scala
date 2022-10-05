/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage,WhatIsTheCountryOfAddressPage}

class WhatIsTheCountryOfYourAddressStepDef extends BasePage with WhatIsTheCountryOfAddressPage {

  Given("""I am on What is the country of your address Page""") { () =>
    navigateToSpecificURL("http://localhost:9028/lookup-address/a16928b5-a942-4b93-bbc5-c56ed0b864c0/country-picker")
  }

  When("""enter country name {string},dropdown is displayed""") { (string:String) =>
    enterInputInTextBox(string)
    verifyDropdownDisplayed()
  }
}
