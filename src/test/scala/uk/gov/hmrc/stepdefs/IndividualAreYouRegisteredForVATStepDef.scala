/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, WhatIsYourDOBPage}

class IndividualAreYouRegisteredForVATStepDef extends BasePage with WhatIsYourDOBPage {

  Given("""I am on Is the individual registered for VAT, as far you're aware page as {string} tax payer""") { (string: String) =>
    if (string == "Individual"){
      navigateToSpecificPage("notification/individual-registered-for-vat")
    } else {
      navigateToSpecificPage("notification/registered-for-vat")
    }
  }
}