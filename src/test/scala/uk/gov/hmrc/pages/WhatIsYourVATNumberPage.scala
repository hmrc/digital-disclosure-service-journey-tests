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
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration
import java.time.Duration

trait WhatIsYourVATNumberPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, Duration.ofSeconds(20))

  val currentEnvironment: String = Configuration.environment.toString

  def verifyBodyText(expectedText: String): Unit = {
    val element = driver.findElement(By.xpath("//*[@id=\'main-content\']/div/div/form/div/label"))
    val actualText = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedText == actualText)
  }

}