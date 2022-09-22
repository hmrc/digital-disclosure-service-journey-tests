/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import io.cucumber.scala.{EN, PendingException, ScalaDsl}
import uk.gov.hmrc.pages.{BasePage, HmrcLetterReferencePage}

class HmrcLetterReferencePageStepDef extends BasePage with HmrcLetterReferencePage{

  Given("""I am on What is the reference number of the letter you received from HMRC Page""") { () =>
    navigateToSpecificPage("notification/hmrc-letter-reference")
  }

  When("""I enter anything in reference number TextBox field""") { () =>
    enterInputInRefNumTextBox("ABCdef123!@£")
  }

  When("""I enter no data in reference number TextBox field""") { () =>
    enterInputInRefNumTextBox("")
  }

  Then("""error summary popup should be displayed with text {string}""") { (string: String) =>
    verifyErrorSummary(string)
  }

  Then("""error message should be displayed with text {string}""") { (string: String) =>
    verifyErrorMessage(string)
  }

  When("""I enter data with max length of {string} in reference number TextBox field""") { (string: String) =>
    enterInputInRefNumTextBoxWithMaxLength(string)
  }

  When("""I click on problem message {string}""") { (string: String) =>
    clickErrorMessage(string)
  }

  Then("""I should navigate to reference number TextBox field""") { () =>
    verifyFocusOnTextbox()
  }

  Then("""header with text {string} is displayed""") { (string: String) =>
    verifyPageHeader(string)
  }

  Then("""user is navigated to the page with title {string}""") { (string: String) =>
    verifyPageHeader(string)
  }

  Then("""input TextBox is displayed""") { () =>
    isInputTextBoxDisplayed()
  }

  Then("""save and Continue Button is displayed""") { () =>
    isSaveAndContinueButtonDisplayed()
  }

  Then("""back Button Link is displayed""") { () =>
    isBackButtonDisplayed()
  }
}