/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.BasePage

class WhatIsYourUniqueTaxReferenceStepDef extends BasePage{

  Given("""I am on What is your Unique Tax Reference Page""") { () =>
    navigateToSpecificPage("notification/your-utr")
  }
}