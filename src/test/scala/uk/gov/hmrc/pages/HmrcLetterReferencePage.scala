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

  def isSaveAndContinueButtonDisplayed(): Unit = {
    Assert.assertTrue("Save and Continue Button is not displayed", findByID("continue").isDisplayed.==(true))
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

  def verifyFocusOnTextbox(): Unit = {
    driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).equals(driver.switchTo().activeElement())
  }

  def verifyPageHeader(expectedQHeader:String): Unit = {
    val question = driver.findElement(By.xpath("//div[@class=\"govuk-form-group\"]//h1"))
    val actualQHeader = question.getText
    Assert.assertTrue("Page Header is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }

  def verifyErrorSummary(expectedQHeader: String): Unit = {
    val question = driver.findElement(By.xpath("//*[@class=\"govuk-error-summary__title\"]"))
    val actualQHeader = question.getText
    Assert.assertTrue("Error Summary is not Verified.  Expected: " + expectedQHeader + "Actual: " + actualQHeader, expectedQHeader.toString() == actualQHeader.toString())
  }

  def verifyErrorMessage(expectedQHeader: String): Unit = {
    val question = driver.findElement(By.xpath("//*[@class=\"govuk-error-summary__body\"]"))
    val actualQHeader = question.getText
    Assert.assertTrue("Error Message is not Verified. Expected: " + expectedQHeader + "Actual: " + actualQHeader, expectedQHeader.toString() == actualQHeader.toString())
  }

  def clickErrorMessage(expectedQHeader: String): Unit = {
    val question = driver.findElement(By.xpath("//*[@class=\"govuk-error-summary__body\"]"))
    val actualQHeader = question.getText
    Assert.assertTrue("Error Message is not Verified", expectedQHeader.toString() == actualQHeader.toString())
    driver.findElement(By.xpath("//*[@class=\"govuk-error-summary__body\"]//a[@href]")).click()
  }
}
