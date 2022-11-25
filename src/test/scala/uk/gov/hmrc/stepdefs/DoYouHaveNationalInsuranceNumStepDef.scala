/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage}
class DoYouHaveNationalInsuranceNumStepDef extends BasePage{

  Given("""I am on Do you have a National Insurance number Page""") { () =>
    navigateToSpecificPage("notification/have-national-insurance-number")
  }
}
