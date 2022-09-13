/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.junit.Assert
import org.openqa.selenium.By.ByXPath
import uk.gov.hmrc.utils.Configuration


trait ReceivedALetterPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  //stride login locators for local
  def radioYes: WebElement = findByID("value")

  def radioNo: WebElement = findByID("value-no")


  def navigateToPage(): Unit = {
    goTo(Configuration.settings.baseUrl)
    authenticationByPass()
  }

  def verifyYesNoAreNotSelected(): Unit = {
    Assert.assertFalse("Verify Yes is not selected" + radioYes.isSelected, false)
    Assert.assertFalse("Verify No is not selected" + radioNo.isSelected, false)
  }

  def selectYes(): Unit = {
    radioYes.click()
  }

  def selectNo(): Unit = {
    radioNo.click()
  }


}
