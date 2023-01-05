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

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.junit.Assert
import org.openqa.selenium.By.ByXPath
import uk.gov.hmrc.utils.Configuration
import org.apache.commons.lang3.StringUtils
import java.time.Duration

trait HmrcLetterReferencePage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, Duration.ofSeconds(20))

  val currentEnvironment: String = Configuration.environment.toString

  def isInputTextBoxDisplayed(): Unit = {
    Assert.assertTrue("Input Text Box is not displayed",driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).isDisplayed.==(true))
  }
  def isBackButtonDisplayed(): Unit = {
    Assert.assertTrue("Back Button is not displayed", driver.findElement(By.className("govuk-back-link")).isDisplayed.==(true))
  }

  def enterInputInRefNumTextBox(textInput:String): Unit = {
    driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).sendKeys(textInput)
  }

  def enterInputInRefNumTextBoxWithMaxLength(length: String): Unit = {
    val textInput = StringUtils.repeat("*", length.toInt + 1)
    driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).sendKeys(textInput)
  }


}
