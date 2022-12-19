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

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.junit.Assert
import uk.gov.hmrc.utils.Configuration
import java.time.Duration


trait DiscloseOffshoreLiabilitiesPage extends BasePage{

  private lazy val webdriverWait = new WebDriverWait(driver, Duration.ofSeconds(20))

  val currentEnvironment: String = Configuration.environment.toString

  def verifyBodyText(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//*[contains(@class,\"govuk-body\") and contains(@id,\"first-paragraph\")]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified. --- Expected: " + expectedQHeader + "--- Actual: " + actualQHeader, expectedQHeader == actualQHeader)
  }

  def verifyText(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//*[contains(@class,\"govuk-body\") and contains(@id,\"second-paragraph\")]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified. --- Expected: " + expectedQHeader + "--- Actual: " + actualQHeader, expectedQHeader == actualQHeader)
  }

  def verifyHyperlinkText(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//a[contains(@class,\"govuk-link\") and contains(@id,'guidance-link')]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified. --- Expected: " + expectedQHeader + "--- Actual: " + actualQHeader, expectedQHeader == actualQHeader)
  }

  def verifyBulletListHyperlinkText(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//a[contains(@class,\"govuk-link\") and contains(@id,'bullet-list-forth-link')]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified. --- Expected: " + expectedQHeader + "--- Actual: " + actualQHeader, expectedQHeader == actualQHeader)
  }

  def clickOnHyperlinkText(expectedQHeader: String): Unit = {
    try{
      val element = driver.findElement(By.xpath("//a[contains(@class,\"govuk-link\") and contains(@id,'guidance-link')]"))
      val actualQHeader = element.getText
      Assert.assertTrue("Body Text is not Verified. --- Expected: " + expectedQHeader + "--- Actual: " + actualQHeader, expectedQHeader == actualQHeader)
      element.click()
    }
    catch
    {
      case e=>
        val element = driver.findElement(By.xpath("//a[contains(@class,\"govuk-link\") and contains(@id,'differentAddress')]"))
        val actualQHeader = element.getText
        Assert.assertTrue("Body Text is not Verified. --- Expected: " + expectedQHeader + "--- Actual: " + actualQHeader, expectedQHeader == actualQHeader)
        element.click()
    }


  }
}
