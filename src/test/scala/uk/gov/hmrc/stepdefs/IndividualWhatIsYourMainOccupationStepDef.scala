/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.BasePage

class IndividualWhatIsYourMainOccupationStepDef extends BasePage {

  Given("""I am on What is the individual’s main occupation as {string} tax payer""") { (string: String) =>
    if (string == "Individual"){
      navigateToSpecificPage("notification/individual-main-occupation")
    } else {
      navigateToSpecificPage("notification/your-full-name")
    }
  }

}
