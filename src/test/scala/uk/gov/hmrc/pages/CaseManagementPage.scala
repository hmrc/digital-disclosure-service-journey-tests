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

package uk.gov.hmrc.pages

import org.junit.Assert
import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.utils.Configuration

trait CaseManagementPage extends BasePage {

  val currentEnvironment: String = Configuration.environment.toString

  val pageAddress = "igital-disclosure/case-management/cases"

  //locators for the page
  def table: WebElement = findByID("case-table")

  def navigateToPage(): Unit =
    navigateToSpecificPage(pageAddress)

  def verifyNumberCases(expectedCount: Int): Unit = {
    val countOfCases = table.findElements(By.cssSelector("tbody > tr")).size()
    Assert.assertTrue("Count of cases different to expected. Expected: " + expectedCount + "--- Actual: " + countOfCases, expectedCount.equals(countOfCases))
  }

  def clickEditCaseLink(rowNumber: Int): Unit = {
    table
      .findElements(By.cssSelector("tbody > tr"))
      .get(rowNumber)
      .findElements(By.cssSelector("td"))
      .get(5)
      .findElements(By.cssSelector("a"))
      .get(0)
      .click()
  }

  def selectMakeADisclosureRadioButton(): Unit = {
      clickOnRadioButton("Make a notification first", "1")
  }
}
