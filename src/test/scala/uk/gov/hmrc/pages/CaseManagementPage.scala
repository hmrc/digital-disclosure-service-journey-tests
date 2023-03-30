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
import org.openqa.selenium.support.ui.ISelect
import org.openqa.selenium.{By, WebElement}
import uk.gov.hmrc.utils.Configuration

trait CaseManagementPage extends BasePage {

  val currentEnvironment: String = Configuration.environment.toString

  //locators for the page
  def radioFirst: WebElement = findByID("value_0")

  def radioSecond: WebElement = findByID("value_1")

  def createNewCase: WebElement = findByID("create-case")
  def caseManagementLink: WebElement = findByID("case-management-link")


  def table: WebElement = findByID("case-table")

  def verifyNumberCases(expectedCount: Int): Unit = {
    val countOfCases = table.findElements(By.cssSelector("tbody > tr")).size()
    Assert.assertTrue("Count of cases different to expected. Expected: " + expectedCount + "--- Actual: " + countOfCases, expectedCount.equals(countOfCases))
  }

  def clickEditCaseLink(position: String): Unit = {
    val element = driver.findElements(By.xpath("//tbody[@class='govuk-table__body']/tr/td[5]/a"))
    element.get(position.toInt - 1).click()
  }

  def selectValueFromAffinityGroupDropdown(stringtoSelect: String): Unit = {
    val element = driver.findElements(By.xpath("//select[contains(@id,'affinityGroupSelect')]/option"))
    val count = element.size()
    Assert.assertTrue("Dropdown is displayed", element.get(count - 1).getText.equals(stringtoSelect))
    element.get(count - 1).click()
  }

  def selectValueFromConfidenceLevelDropdown(stringtoSelect: String): Unit = {
    val element = driver.findElements(By.xpath("//select[contains(@id,'confidenceLevel')]/option"))
    val count = element.size()
    Assert.assertTrue("Dropdown is displayed", element.get(count - 1).getText.equals(stringtoSelect))
    element.get(count - 1).click()
  }

  def clickOnSubmitButtonOnWizardPage(): Unit = {
    driver.findElement(By.id("submit-top")).click()
  }

  def selectFormOption(option: String): Unit = {
    var flag=false
    if (option.toLowerCase() == "make a notification first") {
      radioFirst.click()
      flag=true
    } else if (option.toLowerCase() == "continue or edit this notification") {
      radioFirst.click()
      flag=true
    } else if (option.toLowerCase() == "make a disclosure") {
      radioSecond.click()
      flag=true
    }
    Assert.assertTrue(flag)
  }

    def validateReference(position: String,expecteValue: String ): Unit = {
      val element = driver.findElements(By.xpath("//tbody[@class='govuk-table__body']/tr/th"))
      val count = element.size()
      Assert.assertTrue("Reference is not matched", element.get(position.toInt - 1).getText.equals(expecteValue))
      element.get(count - 1).click()
    }

  def validateType(position: String, expecteValue: String): Unit = {
    val element = driver.findElements(By.xpath("//tbody[@class='govuk-table__body']/tr/td[1]"))
    val count = element.size()
    Assert.assertTrue("Type is not matched", element.get(position.toInt - 1).getText.equals(expecteValue))
    element.get(count - 1).click()
  }

  def validateStatus(position: String, expecteValue: String): Unit = {
    val element = driver.findElements(By.xpath("//tbody[@class='govuk-table__body']/tr/td[3]"))
    val count = element.size()
    Assert.assertTrue("Status is not matched", element.get(position.toInt - 1).getText.equals(expecteValue))
    element.get(count - 1).click()
  }

  def clickOnHeader(): Unit = {
    val element = driver.findElement(By.xpath("//div[@class='govuk-header__content']/a[@href]"))
    element.click()
  }

  def clickOnCreateNewCase(): Unit = {
     createNewCase.click()
  }

  def clickOnCaseManagementLink(): Unit = {
    caseManagementLink.click()
  }


}
