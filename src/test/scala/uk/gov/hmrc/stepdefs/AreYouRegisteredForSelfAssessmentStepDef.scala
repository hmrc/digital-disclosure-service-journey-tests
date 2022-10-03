/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.BasePage

class AreYouRegisteredForSelfAssessmentStepDef extends BasePage{

  Given("""I am on Are you registered for Self Assessment Page""") { () =>
    navigateToSpecificPage("notification/registered-for-self-assessment")
  }
}
