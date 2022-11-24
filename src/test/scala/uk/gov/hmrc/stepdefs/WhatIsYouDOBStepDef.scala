/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, WhatIsYourDOBPage}

class WhatIsYouDOBStepDef extends BasePage with WhatIsYourDOBPage {

  Given("""I am on What is your date of birth page""") { () =>
    navigateToSpecificPage("notification/your-date-of-birth")
  }

  When("""I enter {string} in the {string} text box field""") { (string: String, string2: String) =>
    enterInputInDOBPage(string, string2)
  }

  Then("""input TextBox with value {string} is displayed""") { (string: String) =>
    isInputTextBoxDisplayed(string)
  }
}