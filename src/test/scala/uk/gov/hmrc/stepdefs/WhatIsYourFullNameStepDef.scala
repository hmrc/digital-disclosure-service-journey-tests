/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs
import uk.gov.hmrc.pages.{BasePage,WhatIsYourFullNamePage}

class WhatIsYourFullNameStepDef extends BasePage with WhatIsYourFullNamePage {

  Given("""I am What is your full name Page""") { () =>
    navigateToSpecificPage("notification/your-full-name")
  }

  When("""I enter data with max length of {string} in Full Name TextBox field""") { (string: String) =>
    enterInputInTextBoxWithMaxLength(string)
  }

  When("""I enter anything in Full Name TextBox field""") { () =>
    enterInputInTextBox("ABCdef123!@£")
  }

  When("""I enter no data in Full Name TextBox field""") { () =>
    enterInputInTextBox("")
  }
}
