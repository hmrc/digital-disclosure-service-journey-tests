/*
 * Copyright 2022 HM Revenue & Customs
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

import io.cucumber.datatable.DataTable
import uk.gov.hmrc.pages.{BasePage, CheckYourAnswersPage}

class CheckYourAnswersStepDef extends BasePage with CheckYourAnswersPage {

  Then("""answers page should have h2 header {string}""") { (string: String) =>
    verifyH2Header(string)
  }

  Then("""answers page should not have h2 header {string}""") { (string: String) =>
    verifyH2HeaderNotDisplayed(string)
  }
  Then("""line {string} should have a label {string} an answer with {string} and change URL ends with {string}""") { (string: String, string2: String, string3: String, string4: String) =>
    verifyAboutYouAnswers(string, string2, string3, string4)
  }

  Then("""label {string} is not displayed on check your answer page""") { (string: String) =>
    labelIsNotDisplayed(string)
  }

  Then("""About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}""") { (string: String, string2: String, string3: String, string4: String) =>
    verifyAboutTheIndividualAnswers(string, string2, string3, string4)
  }

  Then("""About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}""") { (string: String, string2: String, string3: String, string4: String) =>
    verifyAboutTheCompanyAnswers(string, string2, string3, string4)
  }

  Then("""About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}""") { (string: String, string2: String, string3: String, string4: String) =>
    verifyAboutTheLLPAnswers(string, string2, string3, string4)
  }

  Then("""About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}""") { (string: String, string2: String, string3: String, string4: String) =>
    verifyAboutTheTrustAnswers(string, string2, string3, string4)
  }

  Then("""Background section has following""") { (dataTable: DataTable) =>
    verifyBackgroundAnswers(dataTable)
  }

  Then("""clicking on change button navigates as following:""") { (dataTable: DataTable) =>
    verifyChangeButtonNavigation(dataTable)
  }

  Then("""clicking on change button to validate changed value as following:""") { (dataTable: DataTable) =>
    validateChangedValue(dataTable)
  }

  Given("""I am on {string} page""") { (string: String) =>
    verifyPageHeading(string)
  }

  When("""I click on change button for {string}""") { (string: String) =>
    clickOnChangeButton(string)
  }

  Then("""country dropdown is empty""") { () =>
    verifyDropdownTextBoxIsEmpty()
  }

  Then("""About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}""") { (string: String, string2: String, string3: String, string4: String) =>
    verifyAboutThePersonDiedAnswers(string, string2, string3, string4)
  }

}
