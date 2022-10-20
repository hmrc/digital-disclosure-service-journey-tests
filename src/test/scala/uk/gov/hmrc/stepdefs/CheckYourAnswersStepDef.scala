/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, CheckYourAnswersPage}

class CheckYourAnswersStepDef extends BasePage with CheckYourAnswersPage {

  Then("""answers page should have h2 header {string}""") { (string: String) =>
    verifyH2Header(string)
  }

  Then("""line {string} should have a label {string} an answer with {string} and change URL ends with {string}""") { (string: String, string2: String, string3: String, string4: String) =>
    verifyAboutYouAnswers(string, string2, string3, string4)
  }

}
