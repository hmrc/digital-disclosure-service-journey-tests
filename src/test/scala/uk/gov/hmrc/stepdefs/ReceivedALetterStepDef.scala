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
  Given("""^user is navigated to Received A Letter Page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    navigateToPage()
  }

  When("""the page is loaded successfully and verifies the page title is {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageTitle(string)
  }

  Then("""verify the question should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageQuestion(string)
  }

  Then("""verify both the radio buttons are not selected""") { () =>
    // Write code here that turns the phrase above into concrete actions
    verifyYesNoAreNotSelected()
  }

  When("""the user selects Yes radio button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    selectYes()
  }

  When("""click on Save and Continue button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    saveAndContinue()
  }

  Then("""user is navigated to the next page with title {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageTitle(string)
  }

  When("""^user click on Back button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    clickOnBack()
  }

  Then("""user is navigated back to Received A letter page with title {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageTitle(string)
  }

  Then("""^verify that Yes radio option is still selected""") { () =>
      // Write code here that turns the phrase above into concrete actions
    yesIsSelected()
  }

  Then("""^the user selects No radio button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    selectNo()
  }

  Then("""^user is navigated to the next page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("user should be able to navigate to the next page")
  }

}
