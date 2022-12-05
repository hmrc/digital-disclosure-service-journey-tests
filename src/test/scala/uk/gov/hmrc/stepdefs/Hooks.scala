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

package uk.gov.hmrc.stepdefs

import io.cucumber.java.{After, AfterAll, AfterStep, Before, BeforeAll, Scenario}
import org.junit.{AfterClass, BeforeClass}
import org.openqa.selenium.{OutputType, TakesScreenshot, WebDriver, WebDriverException}
import uk.gov.hmrc.driver.{BrowserDriver, StartUpTearDown}
import uk.gov.hmrc.utils.{ApiLogin, Configuration}

class Hooks extends StartUpTearDown{

  @Before
  def initialize(): Unit = {
    if (driver.getWindowHandles.size() == 0) {
      implicit val driver: WebDriver = BrowserDriver.webDriver
    }
    driver.manage().deleteAllCookies()
    driver.navigate.refresh()
    driver.manage.window.maximize()
  }

  @After
  def cleanup(): Unit = {
    sys.addShutdownHook(driver.quit())
  }
}