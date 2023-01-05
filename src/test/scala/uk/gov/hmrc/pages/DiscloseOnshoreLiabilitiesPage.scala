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
import uk.gov.hmrc.utils.Configuration

trait DiscloseOnshoreLiabilitiesPage extends BasePage {

  def verifyTextAtFourthPara(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//*[contains(@class,\"govuk-body\") and contains(@id,\"forth-paragraph\")]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }

  def verifyTextAtThirdPara(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//*[contains(@class,\"govuk-body\") and contains(@id,\"third-paragraph\")]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }
}
