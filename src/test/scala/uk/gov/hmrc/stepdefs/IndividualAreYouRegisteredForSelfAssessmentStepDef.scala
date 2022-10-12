/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, WhatIsYourDOBPage}

class IndividualAreYouRegisteredForSelfAssessmentStepDef extends BasePage with WhatIsYourDOBPage {

  Given("""I am on Is the individual registered for Self Assessment, as far as you are aware page as {string} tax payer""") { (string: String) =>
    if (string == "Individual"){
      navigateToSpecificPage("notification/individual-self-assessment")
    } else {
      navigateToSpecificPage("notification/registered-for-self-assessment")
    }
  }
}