/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage}

class NotificationSubmittedStepDef extends BasePage {

  When("""I click on send notification button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    SendNotification()
  }


  Then("""the case reference should be {string}""") { (string:String) =>
    verifySubmittedCaseRef(string)
  }
}