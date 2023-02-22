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

import uk.gov.hmrc.pages.{BasePage, OffshoreDisclosurePage}

class OffshoreDisclosureStepDef extends BasePage with OffshoreDisclosurePage {

  When("""I click on Make a disclosure button""") { () =>
    makeADisclosure()
  }

  When("""I navigate to {string} specific page""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    navigateToSpecificURL(string)
  }

  When("""I navigate to {string} offshore page""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    navigateToSpecificURL("offshore/"+string)
  }

  When("""I navigate to {string} other liabilities page""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    navigateToSpecificURL("other-liabilities/"+string)
  }

  When("""I navigate to {string} reason page""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    navigateToSpecificURL("reason/"+string)
  }

  When("""I navigate to {string} reference page""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    navigateToSpecificURL("reference/"+string)
  }

  When("""page should display checkboxes for the {string} tax years before the current tax year""") { (string: String) =>
    verifyDisplayedCheckbox(string)
  }

  When("""I enter {string} in the reason for excuse text area""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    enterTextInExcuse(string)
  }


  When("""I enter {string} in the reasonable care text area""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    enterTextInReasonableCare(string)
  }


  When("""I enter {string} in the reasonable excuse text area""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    enterTextInReasonableExcuse(string)
  }

  When("""I enter {string} in the reason for including year text area""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    enterTextInIncludingYear(string)
  }

}