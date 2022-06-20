/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.driver

/*
 * Copyright 2018 HM Revenue & Customs
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

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriverService
import uk.gov.hmrc.webdriver.SingletonDriver


object BrowserDriver {

  val turnOnProxy: String = Option(System.getProperty("turnOnProxy")).getOrElse("No")

  if (!Option(System.getProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY)).exists(_.nonEmpty)) {
    System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "C:\\Niru\\Repos\\dds2-ui-framework\\chromedriver_win32\\chromedriver.exe")
    print(System.getProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY))
  }


  val webDriver: WebDriver = SingletonDriver.getInstance()

    //sys.addShutdownHook(webDriver.quit())
  }


