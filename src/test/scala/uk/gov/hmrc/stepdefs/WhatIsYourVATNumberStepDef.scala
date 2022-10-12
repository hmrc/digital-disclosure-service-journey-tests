/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, WhatIsYourVATNumberPage}

class WhatIsYourVATNumberStepDef extends BasePage with WhatIsYourVATNumberPage {

  Given("""I am on What is your VAT registration number page""") { () =>
    navigateToSpecificPage("notification/your-vat-registration")
  }

  Given("""I am on What is the individual's VAT registration number page""") { () =>
    navigateToSpecificPage("notification/individual-vat-registration")
  }
}