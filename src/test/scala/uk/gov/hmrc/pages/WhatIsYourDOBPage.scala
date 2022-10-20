/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.junit.Assert
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration

trait WhatIsYourDOBPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  //locators for the page
  def day: WebElement = findByID("value.day")
  def month: WebElement = findByID("value.month")
  def year: WebElement = findByID("value.year")

  def isInputTextBoxDisplayed(textBoxName: String): Unit = {
    if (textBoxName == "Day") {
      Assert.assertTrue("Input Text Box is not displayed", day.isDisplayed.==(true))
    } else if (textBoxName == "Month") {
      Assert.assertTrue("Input Text Box is not displayed", month.isDisplayed.==(true))
    } else if (textBoxName == "Year") {
      Assert.assertTrue("Input Text Box is not displayed", year.isDisplayed.==(true))
    } else {
      Assert.assertTrue("Invalid text box name", false)
    }
  }

  def enterInputInDOBPage(text: String, textBoxName: String): Unit = {
    if (textBoxName == "Day") {
      day.clear()
      day.sendKeys(text)
    } else if (textBoxName == "Month") {
      month.clear()
      month.sendKeys(text)
    } else if (textBoxName == "Year") {
      year.clear()
      year.sendKeys(text)
    } else {
      Assert.assertTrue("Invalid text box name", false)
    }
  }
}