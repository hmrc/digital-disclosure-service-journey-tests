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

package uk.gov.hmrc.stepdefs

import io.cucumber.scala.{EN, ScalaDsl, Scenario}
import org.apache.commons.io.FileUtils
import org.openqa.selenium.{OutputType, TakesScreenshot}
import uk.gov.hmrc.driver.BrowserDriver
import uk.gov.hmrc.pages.BasePage
import uk.gov.hmrc.selenium.webdriver.Browser

import java.io.File

class Hooks extends ScalaDsl with Browser with EN with BasePage with BrowserDriver {

  Before {
    startBrowser()
    driver.manage().deleteAllCookies()
  }

  After { scenario: Scenario =>
    if (scenario.isFailed) {
      val screenshotName                = scenario.getName.replaceAll(" ", "_")
      val screenshot                    = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.BYTES)
      val screenshotFile                = driver.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)
      val screenshotDestination: String = "./target/screenshots/" + screenshotName + ".png"

      FileUtils.copyFile(screenshotFile, new File(screenshotDestination))
      scenario.attach(screenshot, "image/png", screenshotName)
    }
    quitBrowser()
  }

}