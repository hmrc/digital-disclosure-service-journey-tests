/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, WhatIsYourTelephoneNumberPage}

class WhatIsYourTelephoneNumberStepDef extends BasePage with WhatIsYourTelephoneNumberPage {

  Given("""I am on What is your telephone number page""") { () =>
    navigateToSpecificPage("notification/your-telephone-number")
  }
  Then("""body Text should be {string}""") { (string: String) =>
    verifyBodyText(string)
  }

}