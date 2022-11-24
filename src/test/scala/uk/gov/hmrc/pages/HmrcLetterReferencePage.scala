/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.junit.Assert
import org.openqa.selenium.By.ByXPath
import uk.gov.hmrc.utils.Configuration
import org.apache.commons.lang3.StringUtils

trait HmrcLetterReferencePage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  def isInputTextBoxDisplayed(): Unit = {
    Assert.assertTrue("Input Text Box is not displayed",driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).isDisplayed.==(true))
  }
  def isBackButtonDisplayed(): Unit = {
    Assert.assertTrue("Back Button is not displayed", driver.findElement(By.className("govuk-back-link")).isDisplayed.==(true))
  }

  def enterInputInRefNumTextBox(textInput:String): Unit = {
    driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).sendKeys(textInput)
  }

  def enterInputInRefNumTextBoxWithMaxLength(length: String): Unit = {
    val textInput = StringUtils.repeat("*", length.toInt + 1)
    driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).sendKeys(textInput)
  }


}
