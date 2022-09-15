/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import uk.gov.hmrc.pages.{BasePage, WhatIsDisclosurePage}


@RunWith(classOf[Cucumber])
class WhatIsDisclosureStepDef extends BasePage with WhatIsDisclosurePage {
  Given("""^user is navigated to What is the disclosure Page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    navigateToPage()
  }

  Then("""verify that An individual, An estate, A company, A limited liability partnership, A trust are not selected by default""") { () =>
    // Write code here that turns the phrase above into concrete actions
    verifyNoRadioSelected()
  }

  When("""user selects An Individual""") { () =>
    // Write code here that turns the phrase above into concrete actions
    selectAnIndividual()
  }

  Then("""user is navigated back to the page with title {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageTitle(string)
  }

  Then("""the option An Individual is still selected""") { () =>
    // Write code here that turns the phrase above into concrete actions
    isIndividualSelected()
  }

}
