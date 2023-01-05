/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.stepdefs

import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import uk.gov.hmrc.pages.{BasePage, WhatIsDisclosurePage}


@RunWith(classOf[Cucumber])
class WhatIsDisclosureStepDef extends BasePage with WhatIsDisclosurePage {
  Given("""I am navigated to What is the disclosure Page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    navigateToPage()
  }

  Then("""verify that An individual, An estate, A company, A limited liability partnership, A trust are not selected by default""") { () =>
    // Write code here that turns the phrase above into concrete actions
    verifyNoRadioSelected()
  }

  When("""I select radio option An Individual""") { () =>
    // Write code here that turns the phrase above into concrete actions
    selectAnIndividual()
  }

  Then("""I am navigated back to the page with title {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageTitle(string)
  }

  Then("""the option An Individual is still selected""") { () =>
    // Write code here that turns the phrase above into concrete actions
    isIndividualSelected()
  }

}
