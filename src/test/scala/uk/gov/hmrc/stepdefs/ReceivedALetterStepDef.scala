/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs
import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import uk.gov.hmrc.pages.{BasePage, ReceivedALetterPage}



@RunWith(classOf[Cucumber])
class ReceivedALetterStepDef extends BasePage with ReceivedALetterPage {
  Given("""^User is navigated to Received A Letter Page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("User is navigated to Received A Letter Page")
    navigateToPage()
  }

  When("""the page is loaded successfully""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("the page is loaded successfully")
  }

  Then("""verify the page title should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    println()
  }

  Then("""verify the question should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    println()
  }

  Then("""verify both the radio buttons are not selected""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println()
  }

}
