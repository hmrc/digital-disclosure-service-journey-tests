/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, WhatIsYourDOBPage}

class IndividualWhatIsYourDOBStepDef extends BasePage with WhatIsYourDOBPage {

  Given("""I am on What is the individual's date of birth page as {string} tax payer""") { (string: String) =>
    if (string == "Individual"){
      navigateToSpecificPage("notification/individual-date-of-birth")
    } else {
      navigateToSpecificPage("notification/your-date-of-birth")
    }
  }
}