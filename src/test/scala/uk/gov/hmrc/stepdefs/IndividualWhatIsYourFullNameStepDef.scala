/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, WhatIsYourFullNamePage}

class IndividualWhatIsYourFullNameStepDef extends BasePage {

  Given("""I am on What is your full name page for {string} tax payer""") { (string: String) =>
    if (string == "Individual"){
      navigateToSpecificPage("notification/individual-full-name")
    } else {
      navigateToSpecificPage("notification/your-full-name")
    }
  }

  Then("""body should be {string}""") { (string: String) =>
    verifyBody(string)
  }

}
