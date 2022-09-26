/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, WhatIsYourDOBPage}

class WhatIsYouDOBStepDef extends BasePage with WhatIsYourDOBPage {

  Given("""I am on What is your date of birth page""") { () =>
    navigateToSpecificPage("notification/your-date-of-birth")
  }
  Then("""input TextBox with value {string} is displayed""") { (string: String) =>
    isInputTextBoxDisplayed(string)
  }

}