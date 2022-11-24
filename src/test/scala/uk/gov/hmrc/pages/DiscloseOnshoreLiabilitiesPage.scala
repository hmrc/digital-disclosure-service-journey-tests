/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.junit.Assert
import uk.gov.hmrc.utils.Configuration

trait DiscloseOnshoreLiabilitiesPage extends BasePage {

  def verifyTextAtFourthPara(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//*[contains(@class,\"govuk-body\") and contains(@id,\"forth-paragraph\")]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }

  def verifyTextAtThirdPara(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//*[contains(@class,\"govuk-body\") and contains(@id,\"third-paragraph\")]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }
}
