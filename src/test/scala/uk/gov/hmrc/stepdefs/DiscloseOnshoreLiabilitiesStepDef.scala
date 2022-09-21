/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs
import uk.gov.hmrc.pages.{BasePage, DiscloseOnshoreLiabilitiesPage}
class DiscloseOnshoreLiabilitiesStepDef extends BasePage with DiscloseOnshoreLiabilitiesPage {

  Given("""I am on Do you also want to disclose onshore liabilities page""") { () =>
    navigateToSpecificPage("notification/disclose-onshore-liabilities")
  }
  Then("""Text {string} is displayed at Third Paragraph""") { (string: String) =>
    verifyTextAtThirdPara(string)
  }
}
