/*
 * Copyright 2026 HM Revenue & Customs
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

package uk.gov.hmrc.specsteps

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import org.scalatest.concurrent.Eventually.eventually
import org.scalatest.time.{Seconds, Span}
import uk.gov.hmrc.pages.{BasePage, CaseManagementPage}
import uk.gov.hmrc.selenium.webdriver.Driver

object CaseManagementStepDefSteps extends BasePage with CaseManagementPage {

  // select {string} from affinityGroup drop down
  def whenSelectStringFromAffinityGroupDropDown(value: String): Unit = {
    selectValueFromAffinityGroupDropdown(value)
  }

  // select {string} from confidenceLevel drop down
  def whenSelectStringFromConfidenceLevelDropDown(value: String): Unit = {
    selectValueFromConfidenceLevelDropdown(value)
  }

  // click on submit on wizard page
  def whenClickOnSubmitOnWizardPage(): Unit = {
    clickOnSubmitButtonOnWizardPage()
  }

  // ^on the (.*) page I click (.*) and click save and continue
  def thenOnTheXPageIClickXAndClickSaveAndContinue(prettyUrl: String, answer: String): Unit = {
    eventually(timeout(Span(25, Seconds)), interval(Span(5, Seconds))) {
          urlVerify(prettyUrl)
          selectServiceType(answer)
          Driver.instance.findElement(By.id("continue")).click()
        }
  }

  // ^the values within the datatable are verified$
  def givenTheValuesWithinTheDatatableAreVerified(): Unit = {
    dataTable: DataTable =>
          testDataTable(dataTable)
  }

  // ^on the (.*) page I select (.*) and click save and continue
  def thenOnTheXPageISelectXAndClickSaveAndContinue(prettyUrl: String, option: String): Unit = {
    urlVerify(prettyUrl)
          option match {
            case "Yes" => clickYesNoSelection(option)
            case "No" => clickYesNoSelection(option)
            case "An Individual" => Driver.instance.findElement(By.id("value_0")).click()
            case "Yes, I am the individual" => Driver.instance.findElement(By.id("value_0")).click()
            case "An Estate" => Driver.instance.findElement(By.id("value_1")).click()
            case "Yes, I am the executor or administrator" => Driver.instance.findElement(By.id("value_0")).click()
            case "Other capital gains" => Driver.instance.findElement(By.id("value_5")).click()
          }
             Driver.instance.findElement(By.id("continue")).click()
  }

  // ^on the (.*) page I click Return to view, edit or create a case
  def thenOnTheXPageIClickReturnToViewEditOrCreateACase(prettyUrl: String): Unit = {
    urlVerify(prettyUrl)
          clickBy(By.id("case-management-link"))
  }

  // ^on the homepage I click continue to navigate to the (.*) page
  def andOnTheHomepageIClickContinueToNavigateToTheXPage(prettyUrl: String): Unit = {
    clickBy(By.id("start"))
        urlVerify(prettyUrl)
  }

  // ^verify on the (.*) page
  def andVerifyOnTheXPage(prettyUrl: String): Unit = {
    urlVerify(prettyUrl)
  }

  // ^on the (.*) page I enter (.*) into the textbox and click save and continue
  def thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue(prettyUrl: String, details: String): Unit = {
    eventually(timeout(Span(15, Seconds)), interval(Span(5, Seconds))) {
          urlVerify(prettyUrl)
          enterCustomerDetails(details)
          Driver.instance.findElement(By.id("continue")).click()
        }
  }

  // ^on the (.*) page I click on the header hyperlink
  def whenOnTheXPageIClickOnTheHeaderHyperlink(prettyUrl: String): Unit = {
    urlVerify(prettyUrl)
        clickBy(By.xpath("//div[@class='govuk-header__content']/a[@href]"))
  }

  // I click the Edit link within the case table
  def andIClickTheEditLinkWithinTheCaseTable(): Unit = {
    clickEditCaseLink()
  }

  // I select create a new case
  def whenISelectCreateANewCase(): Unit = {
    clickOnCreateNewCase()
  }

}
