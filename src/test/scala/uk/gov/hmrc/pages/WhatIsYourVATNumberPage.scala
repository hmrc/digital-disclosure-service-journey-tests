/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration

trait WhatIsYourVATNumberPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  def verifyBodyText(expectedText: String): Unit = {
    val element = driver.findElement(By.xpath("//*[@id=\'main-content\']/div/div/form/div/label"))
    val actualText = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedText == actualText)
  }
  def verifyHintText(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//*[@class='govuk-hint']"))
    val actualQHeader = element.getText
    Assert.assertTrue("Hint text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }
}