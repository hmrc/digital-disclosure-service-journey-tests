/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import io.cucumber.java.{AfterStep, Before, Scenario}
import org.openqa.selenium.{OutputType, TakesScreenshot, WebDriverException}
import uk.gov.hmrc.driver.StartUpTearDown
import uk.gov.hmrc.utils.{ApiLogin, Configuration}

class Hooks extends StartUpTearDown{

  @Before
  def initialize(): Unit = {
    driver.manage().deleteAllCookies()


    lazy val currentenvironment = "Local"
    if (currentenvironment == "Local") {
      driver.manage().deleteAllCookies()
      driver.navigate.refresh()
      driver.manage().deleteAllCookies()
      //ApiLogin.CreateAPIUser()
    }
  }


}