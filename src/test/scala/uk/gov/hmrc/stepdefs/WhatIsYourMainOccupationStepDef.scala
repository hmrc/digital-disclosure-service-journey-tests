/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, WhatIsYourDOBPage, WhatIsYourMainOccupationPage}

class WhatIsYourMainOccupationStepDef extends BasePage with WhatIsYourMainOccupationPage {

  Given("""I am on What is your main occupation page""") { () =>
    navigateToSpecificPage("notification/your-main-occupation")
  }

  Then("""I enter {string} in the TextBox field""") { (string: String) =>
    enterInputInTextBox(string)
  }

  Then("""I should navigate to TextBox field""") { () =>
    verifyFocusOnTextbox()
  }


}