/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.BasePage

class AreYouRegisteredForVATStepDef extends BasePage{

  Given("""I am on Are you registered for VAT Page""") { () =>
    navigateToSpecificPage("notification/registered-for-vat")
  }
}
