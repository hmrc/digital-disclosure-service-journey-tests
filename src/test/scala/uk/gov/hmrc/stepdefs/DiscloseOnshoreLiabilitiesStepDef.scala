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
import uk.gov.hmrc.pages.{BasePage, DiscloseOnshoreLiabilitiesPage}
class DiscloseOnshoreLiabilitiesStepDef extends BasePage with DiscloseOnshoreLiabilitiesPage {

  Given("""I am on Do you also want to disclose onshore liabilities page""") { () =>
    navigateToSpecificPage("notification/disclose-onshore-liabilities")
  }
  Then("""text {string} is displayed at Fourth Paragraph""") { (string: String) =>
    verifyTextAtFourthPara(string)
  }

  Then("""text {string} is displayed at Third Paragraph""") { (string: String) =>
    verifyTextAtThirdPara(string)
  }

  When("""I enter {string} into the {string} text field""") { (inputString: String, element: String) =>
    enterInputInTextBox(inputString, element)
  }
}
