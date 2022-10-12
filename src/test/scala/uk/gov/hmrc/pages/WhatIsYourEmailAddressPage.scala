/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages
import org.apache.commons.lang3.StringUtils
import org.junit.Assert
import org.openqa.selenium.{By}
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration

trait WhatIsYourEmailAddressPage extends BasePage {

  val currentEnvironment: String = Configuration.environment.toString

  def verifyHintText(expectedQHeader: String): Unit = {
    var actualQHeader=""
    try{
      val element = driver.findElement(By.xpath("//*[@class='govuk-hint']"))
      actualQHeader = element.getText
    }
    catch
    {
      case e =>
        val element = driver.findElement(By.xpath("//label[@class=\"govuk-label\"]"))
        actualQHeader = element.getText
    }
    Assert.assertTrue("Hint text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }

  def enterEmailInTextBoxWithMaxLength(length: String): Unit = {
    val textInput = StringUtils.repeat("a",length.toInt + 1)
    driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).sendKeys(textInput+"example.com")
  }
}