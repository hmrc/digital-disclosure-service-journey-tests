/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import io.cucumber.scala.{EN, PendingException, ScalaDsl}
import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import uk.gov.hmrc.pages.{BasePage, HomePage}

@RunWith(classOf[Cucumber])
class HomePageStepDef extends BasePage with HomePage {

  Given("""user is on the Home page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    navigateToHomePage()
  }

  Then("""the page title should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageTitle(string)
  }

  Then("""first heading should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageHeaderH1(string)
  }

  Then("""first paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphOne(string)
  }

  Then("""second paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphTwo(string)
  }

  Then("""third paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphThree(string)
  }

  Then("""second heading should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageHeaderH2(string)
  }

  Then("""fourth paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphFour(string)
  }

  Then("""fifth paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphFive(string)
  }


  Then("""third heading should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageHeaderH3(string)
  }


  Then("""sixth paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphSix(string)
  }

  When("""user clicks on continue button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    clickOnContinue()
  }

  When("""user clicks on hyperlink with text {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    clickOnLink(string)
  }

  Then("""user is navigated to new tab with page title {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyNewTabTitleAndCloseTab(string)
  }

  Then("""user is navigated to page with title {string}""") { (string: String) =>
    verifyPageTitle(string)
  }
}