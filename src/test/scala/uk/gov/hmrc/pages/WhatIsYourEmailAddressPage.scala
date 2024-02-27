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
import org.apache.commons.lang3.StringUtils
import org.junit.Assert
import org.openqa.selenium.By
import uk.gov.hmrc.utils.Configuration

trait WhatIsYourEmailAddressPage extends BasePage {

  val currentEnvironment: String = Configuration.environment.toString

  def verifyHintTextNotDisplayed(expectedQHeader: String): Unit = {
    var actualQHeader = ""
    try {
      val element = driver.findElement(By.xpath("//*[@class='govuk-hint']"))
      actualQHeader = element.getText
    }
    catch {
      case e: Throwable =>
        val element = driver.findElement(By.xpath("//label[@class=\"govuk-label\"]"))
        actualQHeader = element.getText
    }
    Assert.assertTrue("Hint text is not Verified", expectedQHeader.toString() != actualQHeader.toString())
  }

  def enterEmailInTextBoxWithMaxLength(length: String): Unit = {
    val textInput = StringUtils.repeat("a",length.toInt + 1)
    driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).sendKeys(textInput+"example.com")
  }
}