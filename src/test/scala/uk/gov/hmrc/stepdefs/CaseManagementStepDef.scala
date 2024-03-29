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

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import uk.gov.hmrc.pages.{BasePage, CaseManagementPage}

class CaseManagementStepDef extends BasePage with CaseManagementPage {

  When("""select {string} from affinityGroup drop down""") { (value: String) =>
    selectValueFromAffinityGroupDropdown(value)
  }

  When("""select {string} from confidenceLevel drop down""") { (value: String) =>
    selectValueFromConfidenceLevelDropdown(value)
  }

  When("""click on submit on wizard page""") { () =>
    clickOnSubmitButtonOnWizardPage()
  }

  Then("""^on the (.*) page I click (.*) and click save and continue""") { (prettyUrl: String, answer: String) =>
    urlVerify(prettyUrl)
    selectServiceType(answer)
    clickBy(By.className("govuk-button"))
  }

  Given("""^the values within the datatable are verified$""") {
    dataTable: DataTable =>
      testDataTable(dataTable)
  }

  Then("""^on the (.*) page I select (.*) and click save and continue""") {
    (prettyUrl: String, option: String) =>
      urlVerify(prettyUrl)

      option match {
        case "Yes" => clickYesNoSelection(option)
        case "No" => clickYesNoSelection(option)
        case "An Individual" => driver.findElement(By.id("value_0")).click()
        case "Yes, I am the individual" => driver.findElement(By.id("value_0")).click()
        case "An Estate" => driver.findElement(By.id("value_1")).click()
        case "Yes, I am the executor or administrator" => driver.findElement(By.id("value_0")).click()
        case "Other capital gains" => driver.findElement(By.id("value_5")).click()
      }
      clickBy(By.className("govuk-button"))
  }

  Then("""^on the (.*) page I click Return to view, edit or create a case""") {
    (prettyUrl: String) =>
      urlVerify(prettyUrl)

      clickBy(By.id("case-management-link"))
  }

  And("""^on the homepage I click continue to navigate to the (.*) page""") { (prettyUrl: String) =>
    clickBy(By.id("start"))
    urlVerify(prettyUrl)
  }

  And("""^verify on the (.*) page""") {
    (prettyUrl: String) =>
      urlVerify(prettyUrl)
  }

  Then("""^on the (.*) page I enter (.*) into the textbox and click save and continue""") { (prettyUrl: String, details: String) =>
    urlVerify(prettyUrl)

    enterCustomerDetails(details)
    clickBy(By.className("govuk-button"))
  }

  When("""^on the (.*) page I click on the header hyperlink""") { (prettyUrl: String) =>
    urlVerify(prettyUrl)
    clickBy(By.xpath("//div[@class='govuk-header__content']/a[@href]"))
  }

  And("""I click the Edit link within the case table""") { () =>
    clickEditCaseLink()
  }

  When("""I select create a new case""") { () =>
    clickOnCreateNewCase()
  }
}


