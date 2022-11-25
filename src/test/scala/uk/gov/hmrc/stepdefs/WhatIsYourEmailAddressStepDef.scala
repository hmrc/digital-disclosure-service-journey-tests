/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs
import uk.gov.hmrc.pages.{BasePage,WhatIsYourEmailAddressPage}

class WhatIsYourEmailAddressStepDef extends BasePage with WhatIsYourEmailAddressPage {

  Given("""I am What is your email address Page""") { () =>
    navigateToSpecificPage("notification/your-email-address")
  }

  Then("""hint with text {string} is displayed""") { (string: String) =>
    verifyHintText(string)
  }

  Then("""hint with text {string} is not displayed""") { (string: String) =>
    verifyHintTextNotDisplayed(string)
  }

  When("""I enter {string} email TextBox field""") { (string:String) =>
    enterInputInTextBox(string)
  }

  When("""I enter data with max length of {string} in Email TextBox field""") { (string: String) =>
    enterEmailInTextBoxWithMaxLength(string)
  }

  When("""I enter no data in email TextBox field""") { () =>
    enterInputInTextBox("")
  }

  When("""I enter invalid email TextBox field""") { () =>
    enterInputInTextBox("name@example.comname@example.com")
  }

  Then("""I should navigate to email TextBox field""") { () =>
    verifyFocusOnTextbox()
  }
}