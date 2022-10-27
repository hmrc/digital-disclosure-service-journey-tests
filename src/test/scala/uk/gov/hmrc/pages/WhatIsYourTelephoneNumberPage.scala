/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration

trait WhatIsYourTelephoneNumberPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  def verifyBodyLabel(expectedText: String): Unit = {
    val element = driver.findElement(By.xpath("//*[@class='govuk-label']"))
    val actualText = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedText == actualText)
  }

}