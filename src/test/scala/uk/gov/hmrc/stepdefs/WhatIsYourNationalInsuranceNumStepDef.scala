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

  Given("""I am on What is individual National Insurance number Page""") { () =>
    navigateToSpecificPage("notification/individual-national-insurance-number")
  }

  When("""I enter no data in NI Number TextBox field""") { () =>
    enterInputInTextBox("")
  }

  When("""I enter valid NI Number TextBox field""") { () =>
    enterInputInTextBox("AA123456A")
  }

  When("""I enter invalid NI Number TextBox field""") { () =>
    enterInputInTextBox("QQyyyyyyC")
  }
  When("""I enter {string} NI Number TextBox field""") { (string:String) =>
    enterInputInTextBox(string)
  }

  Then("""I should navigate to NI number TextBox field""") { () =>
    verifyFocusOnTextbox()
  }
}
