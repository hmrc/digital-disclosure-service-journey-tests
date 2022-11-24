/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs
import uk.gov.hmrc.pages.{BasePage}
class DiscloseOnshoreLiabilitiesOnlyStepDef extends BasePage {

  Given("""I am on The disclosure is only about onshore liabilities page""") { () =>
    navigateToSpecificPage("notification/disclose-onshore-liabilities-only")
  }
}