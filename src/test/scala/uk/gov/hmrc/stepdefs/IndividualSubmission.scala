/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs
import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import uk.gov.hmrc.pages.{BasePage, LoginPage}



@RunWith(classOf[Cucumber])
class IndividualSubmission extends BasePage with LoginPage {
  Given("""^User login with his government gateway id""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("Given User login with his government gateway id")
    login()
  }

  And("""the HMRC username is displayed on welcome page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("And the HMRC username is displayed on welcome page")
  }

  And("""user clicks on submit new disclosure service""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("And user clicks on submit new disclosure service")
  }

  When("""the user enters all below mandatory customer details on the customer search page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("When the user enters all below mandatory customer details on the customer search page")

  }

  And("""the HMRC user clicks on next button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("And user clicks on submit new disclosure service")
  }

  Then("""the HMRC user will be presented with more details page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("Then the HMRC user will be presented with more details page")
  }
}

