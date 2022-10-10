/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.BasePage
class IndividualDoesIndividualHaveNINumStepDef extends BasePage{

  Given("""I am on Does the individual have a National Insurance number Page""") { () =>
    navigateToSpecificPage("notification/individual-have-national-insurance-number")
  }
}