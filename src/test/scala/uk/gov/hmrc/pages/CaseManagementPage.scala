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

import io.cucumber.datatable.DataTable
import org.junit.Assert
import org.openqa.selenium.{By, WebElement}
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import uk.gov.hmrc.utils.Configuration
import uk.gov.hmrc.utils.MessageReader.getElement

import scala.jdk.CollectionConverters.CollectionHasAsScala

trait CaseManagementPage extends BasePage {

  val currentEnvironment: String = Configuration.environment.toString

  //locators for the page
  def radioFirst: WebElement = findByID("value_0")

  def radioSecond: WebElement = findByID("value_1")

  def selectServiceType(option: String): Unit = option match {
    case "Make a notification first" | "Continue or edit this notification" => click on id("value_0")
    case "Make a disclosure" => click on id("value_1")
  }


  def enterCustomerDetails(text: String): Unit = {
    findByID("value")
    text match {
      case "the CRN" => driver.findElement(By.id("value")).sendKeys("CFSS-1234567")
      case "Estate Person" => driver.findElement(By.id("value")).sendKeys("Estate Person")
    }
  }

  def createNewCase: WebElement = findByID("create-case")

  def caseManagementLink: WebElement = findByID("case-management-link")

  def table: WebElement = findByID("case-table")

  def verifyNumberCases(expectedCount: Int): Unit = {
    val countOfCases = table.findElements(By.cssSelector("tbody > tr")).size()
    Assert.assertTrue("Count of cases different to expected. Expected: " + expectedCount + "--- Actual: " + countOfCases, expectedCount.equals(countOfCases))
  }

  def clickEditCaseLink(): Unit = {
    driver.findElements(By.partialLinkText("Edit")).get(0).click()
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
    var flag = false
    if (option.toLowerCase() == "make a notification first") {
      radioFirst.click()
      flag = true
    } else if (option.toLowerCase() == "continue or edit this notification") {
      radioFirst.click()
      flag = true
    } else if (option.toLowerCase() == "make a disclosure") {
      radioSecond.click()
      flag = true
    }
    Assert.assertTrue(flag)
  }

  def validateReference(position: String, expecteValue: String): Unit = {
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

  def testDataTable(dataTable: DataTable): Unit =
    dataTable.asMaps(classOf[String], classOf[String]).asScala.foreach { (data: java.util.Map[String, String]) =>
      val tableHeading = driver.findElements(By.className("govuk-table__row")).get(data.get("Row").toInt)
      val getReferenceText = tableHeading.findElements(By.className("govuk-table__header")).get(0).getText
      val getCellText = tableHeading.findElements(By.className("govuk-table__cell"))
      getReferenceText shouldBe data.get("Reference")
      getCellText.get(0).getText shouldBe data.get("Type")
      getCellText.get(2).getText shouldBe data.get("Status")
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
