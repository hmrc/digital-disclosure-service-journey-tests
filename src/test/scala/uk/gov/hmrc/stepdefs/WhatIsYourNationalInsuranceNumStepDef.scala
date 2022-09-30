/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.BasePage

class WhatIsYourNationalInsuranceNumStepDef extends BasePage{

  Given("""I am on What is your National Insurance number Page""") { () =>
    navigateToSpecificPage("notification/your-national-insurance-number")
  }

  When("""I enter no data in NI Number TextBox field""") { () =>
    enterInputInTextBox("")
  }

  When("""I enter anything in NI Number TextBox field""") { () =>
    enterInputInTextBox("QQ123456A")
  }

  When("""I enter data with max length of {string} in NI Number TextBox field""") { (string: String) =>
    enterInputInTextBoxWithMaxLength(string)
  }

  Then("""I should navigate to NI number TextBox field""") { () =>
    verifyFocusOnTextbox()
  }
}
