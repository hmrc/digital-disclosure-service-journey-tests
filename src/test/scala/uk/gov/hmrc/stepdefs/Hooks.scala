/*
 * Copyright 2022 HM Revenue & Customs
 *
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

}