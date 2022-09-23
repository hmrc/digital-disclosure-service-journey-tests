/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, WhatIsYourTelephoneNumberPage}

class WhatIsYourTelephoneNumberStepDef extends BasePage with WhatIsYourTelephoneNumberPage {

  Given("""I am on What is your email address Page""") { () =>
    navigateToSpecificPage("notification/your-email-address")
  }

  Then("""hint with text {string} is displayed""") { (string: String) =>
    verifyHintText(string)
  }
}