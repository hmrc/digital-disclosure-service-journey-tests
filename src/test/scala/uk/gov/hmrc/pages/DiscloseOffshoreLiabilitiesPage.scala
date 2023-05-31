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

import org.openqa.selenium.By
import org.junit.Assert
import uk.gov.hmrc.utils.Configuration
import scala.util.control.Breaks

trait DiscloseOffshoreLiabilitiesPage extends BasePage{

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
      case e =>
        var actualHeader = ""
        val element = driver.findElements(By.xpath("//span[contains(@class,\"app-task-list__task-name\")]/a[@href]"))
        val outloop = new Breaks;
        outloop.breakable {
          element.forEach(e =>
            if (e.getText == expectedQHeader) {
              actualHeader = e.getText
              e.click()
              outloop.break()
            }
          )
        }

      case e=>
        val element = driver.findElement(By.xpath("//a[contains(@class,\"govuk-link\") and contains(@id,'differentAddress')]"))
        val actualQHeader = element.getText
        Assert.assertTrue("Body Text is not Verified. --- Expected: " + expectedQHeader + "--- Actual: " + actualQHeader, expectedQHeader == actualQHeader)
        element.click()
    }
  }
}
