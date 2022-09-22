/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages
import org.junit.Assert
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration

trait WhatIsYourEmailAddressPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  def verifyHintText(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//*[@class='govuk-hint']"))
    val actualQHeader = element.getText
    Assert.assertTrue("Hint text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }
}