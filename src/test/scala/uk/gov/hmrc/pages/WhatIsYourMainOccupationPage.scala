/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.junit.Assert
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration

trait WhatIsYourMainOccupationPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  //locators for the page
  def mainOccupation: WebElement = findByID("value")

  def enterInputBox(data: String): Unit = {
    mainOccupation.sendKeys(data)
  }
}