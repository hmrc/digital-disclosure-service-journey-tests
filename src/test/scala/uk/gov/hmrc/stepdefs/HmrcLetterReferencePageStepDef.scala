/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import io.cucumber.scala.{EN, PendingException, ScalaDsl}
import uk.gov.hmrc.pages.{BasePage, ReceivedALetterPage}

class HmrcLetterReferencePageStepDef extends BasePage with ReceivedALetterPage {

  Given("""I am on What is the reference number of the letter you received from HMRC Page""") { () =>
    navigateToSpecificPage("notification/hmrc-letter-reference")
  }

  When("""I enter anything in reference number TextBox field""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  When("""I enter no data in reference number TextBox field""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  When("""I click on {string} button""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  Then("""I should navigate to Screen {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  Then("""Error summary popup should be displayed with text {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  Then("""Error message should be displayed with text {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  Then("""Header with text {string} is displayed""") { (string: String) =>
    verifyPageTitle(string)
  }

  Then("""Input TextBox is displayed""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  Then("""Save and Continue Button is displayed""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }

  Then("""Back Button Link is displayed""") { () =>
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
  }



}