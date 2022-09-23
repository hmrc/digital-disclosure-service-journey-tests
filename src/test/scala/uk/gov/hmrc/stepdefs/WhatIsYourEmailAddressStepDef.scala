/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs
import uk.gov.hmrc.pages.{BasePage,WhatIsYourEmailAddressPage}

class WhatIsYourEmailAddressStepDef extends BasePage with WhatIsYourEmailAddressPage {

  Given("""I am on What is your telephone number page""") { () =>
    navigateToSpecificPage("notification/your-telephone-number")
  }

  Then("""hint with text {string} is displayed""") { (string: String) =>
    verifyHintText(string)
  }
}