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
import org.openqa.selenium.support.ui.WebDriverWait

import java.time.Duration
import scala.util.control.Breaks


trait OffshoreDisclosurePage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, Duration.ofSeconds(20))

  def excuse: WebElement = findByID("excuse")
  def reasonableCare: WebElement = findByID("reasonableCare")
  def reasonableExcuse: WebElement = findByID("reasonableExcuse")
  def valueTextArea: WebElement = findByID("value")
  def valueDescriptionTextArea: WebElement = findByID("value")
  def adviceTextArea: WebElement = findByID("adviceGiven")
  def adviceMonthTextArea: WebElement = findByID("date.month")
  def adviceYearTextArea: WebElement = findByID("date.year")

  def enterTextInExcuse(text:String): Unit = {
    excuse.sendKeys(text)
  }

  def enterTextInDescription(text: String): Unit = {
    valueDescriptionTextArea.sendKeys(text)
  }

  def enterTextInReasonableCare(text:String): Unit = {
    reasonableCare.sendKeys(text)
  }

  def enterTextInReasonableExcuse(text:String): Unit = {
    reasonableExcuse.sendKeys(text)
  }

  def enterTextInTextArea(text:String): Unit = {
    valueTextArea.sendKeys(text)
  }

  def enterTextInAdviceTextArea(text: String): Unit = {
    adviceTextArea.sendKeys(text)
  }

  def enterTextInAdviceMonthTextArea(text: String): Unit = {
    adviceMonthTextArea.sendKeys(text)
  }

  def enterTextInAdviceYearTextArea(text: String): Unit = {
    adviceYearTextArea.sendKeys(text)
  }

  def enterCountry(textInput: String): Unit = {
    //driver.findElement(By.id("country")).clear()
    try {
      driver.findElement(By.id("country")).sendKeys(textInput)
    } catch
    {
      case e =>driver.findElement(By.id("country")).sendKeys(textInput)
    }
  }

  def selectFromCountryDropdown(stringtoSelect: String): Unit = {
    val element = driver.findElements(By.xpath("//li[contains(@id,'country__option')]"))
    val count = element.size()
    Assert.assertTrue("Dropdown is displayed", element.get(count - 1).getText.equals(stringtoSelect))
    element.get(count - 1).click()
  }

  def continueButtonOnSummaryPage(): Unit = {
    driver.findElement(By.id("govuk-button")).click()
  }

  def checkTaskStatus(expectedStatus: String,fieldName: String): Unit = {
    val element = driver.findElements(By.xpath("//span[contains(@class,\"app-task-list__task-name\")]/a[@href]"))
    val outloop = new Breaks;
    var count=1;
    outloop.breakable {
      element.forEach(e =>
        if (e.getText == fieldName) {
          outloop.break()
        }
        else
        {
          count=count+1
        }
      )
    }
    val actualStatus = driver.findElement(By.xpath("(//span[contains(@class,\"hmrc-status-tag\")])["+count+"]")).getText
    Assert.assertTrue("Status is not as expected", actualStatus.equals(expectedStatus))
  }
}
