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
    println("User is navigated to Received A Letter Page")
    navigateToPage()
  }

  When("""the page is loaded successfully""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("the page is loaded successfully")
  }

  Then("""verify the page title should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    println("verify the page title should be ")
    //verifyPageTitle(string)
  }

  Then("""verify the question should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    println("verify the question should be " + string)
    verifyPageQuestion(string)
  }

  Then("""verify both the radio buttons are not selected""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("verify both the radio buttons are not selected")
    verifyYesNoAreNotSelected()
  }

  When("""the user selects Yes radio button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("the user selects Yes radio button")
    selectYes()
  }

  When("""click on Save and Continue button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("click on Save and Continue button")
    saveAndContinue()
  }

  Then("""user should be able to navigate to the next page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("user should be able to navigate to the next page")
  }

  Given("""^user is navigated to Received A Letter Page by clicking Back button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("user is navigated to Received A Letter Page by clicking Back button")
    clickOnBack()
    Thread.sleep(5000)
  }
  When("""the user selects No radio button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("the user selects No radio button")
    selectNo()
  }




}
