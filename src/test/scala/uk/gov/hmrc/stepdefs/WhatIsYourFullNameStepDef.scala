/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs
import uk.gov.hmrc.pages.{BasePage,WhatIsYourFullNamePage}

class WhatIsYourFullNameStepDef extends BasePage with WhatIsYourFullNamePage {

  Given("""I am What is your full name Page""") { () =>
    navigateToSpecificPage("notification/your-full-name")
  }
}
