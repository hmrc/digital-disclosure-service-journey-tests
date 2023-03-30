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

import uk.gov.hmrc.pages.BasePage
import uk.gov.hmrc.pages.CaseManagementPage

class CaseManagementStepDef extends BasePage with CaseManagementPage {

  When("""select {string} from affinityGroup drop down""") { (value: String) =>
    selectValueFromAffinityGroupDropdown(value)
  }

  When("""select {string} from confidenceLevel drop down""") { (value: String) =>
    selectValueFromConfidenceLevelDropdown(value)
  }

  When("""click on submit on wizard page""") { () =>
    clickOnSubmitButtonOnWizardPage
  }

  When("""I click on {string} button""") { (string:String) =>
    selectFormOption(string)
  }

  When("""click on Header Hyperlink""") { () =>
    clickOnHeader()
  }

  Then("""reference at position {string} is {string}""") { (position: String ,expectedValue:String ) =>
    validateReference(position,expectedValue)
  }

  Then("""type at position {string} is {string}""") { (position: String, expectedValue: String) =>
    validateType(position, expectedValue)
  }

  Then("""status at position {string} is {string}""") { (position: String, expectedValue: String) =>
    validateStatus(position, expectedValue)
  }

  When("""click on Edit link at position {string}""") { (position: String) =>
    clickEditCaseLink(position)
  }

  When("""I click on create a new case""") { () =>
    clickOnCreateNewCase()
  }

  When("""I click on case management link""") { () =>
    clickOnCaseManagementLink()
  }

}
