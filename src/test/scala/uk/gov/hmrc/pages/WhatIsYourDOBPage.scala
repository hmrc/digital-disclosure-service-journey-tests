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

package uk.gov.hmrc.pages

import org.junit.Assert
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration
import java.time.Duration

trait WhatIsYourDOBPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, Duration.ofSeconds(20))

  val currentEnvironment: String = Configuration.environment.toString

  //locators for the page
  def day: WebElement = findByID("value.day")
  def month: WebElement = findByID("value.month")
  def year: WebElement = findByID("value.year")

  def isInputTextBoxDisplayed(textBoxName: String): Unit = {
    if (textBoxName == "Day") {
      Assert.assertTrue("Input Text Box is not displayed", day.isDisplayed.==(true))
    } else if (textBoxName == "Month") {
      Assert.assertTrue("Input Text Box is not displayed", month.isDisplayed.==(true))
    } else if (textBoxName == "Year") {
      Assert.assertTrue("Input Text Box is not displayed", year.isDisplayed.==(true))
    } else {
      Assert.assertTrue("Invalid text box name", false)
    }
  }

  def enterInputInDOBPage(text: String, textBoxName: String): Unit = {
    if (textBoxName == "Day") {
      day.clear()
      day.sendKeys(text)
    } else if (textBoxName == "Month") {
      month.clear()
      month.sendKeys(text)
    } else if (textBoxName == "Year") {
      year.clear()
      year.sendKeys(text)
    } else {
      Assert.assertTrue("Invalid text box name", false)
    }
  }
}