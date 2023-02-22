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
import uk.gov.hmrc.utils.Configuration

import java.time.Duration


trait OffshoreDisclosurePage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, Duration.ofSeconds(20))

  def excuse: WebElement = findByID("excuse")
  def reasonableCare: WebElement = findByID("reasonableCare")
  def reasonableExcuse: WebElement = findByID("reasonableExcuse")
  def valueTextArea: WebElement = findByID("value")

  def enterTextInExcuse(text:String): Unit = {
    excuse.sendKeys(text)
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

  def enterCountry(textInput: String): Unit = {
    driver.findElement(By.id("country")).clear()
    driver.findElement(By.id("country")).sendKeys(textInput)
  }

  def selectFromCountryDropdown(stringtoSelect: String): Unit = {
    val element = driver.findElements(By.xpath("//li[contains(@id,'country__option')]"))
    val count = element.size()
    Assert.assertTrue("Dropdown is displayed", element.get(count - 1).getText.equals(stringtoSelect))
    element.get(count - 1).click()
  }

}
