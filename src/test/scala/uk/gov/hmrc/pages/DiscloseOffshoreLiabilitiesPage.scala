/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.openqa.selenium.{By, WebDriver, WebElement}
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.junit.Assert
import uk.gov.hmrc.utils.Configuration


trait DiscloseOffshoreLiabilitiesPage extends BasePage{

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  def verifyBodyText(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//*[contains(@class,\"govuk-body\") and contains(@id,\"first-paragraph\")]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }

  def verifyText(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//*[contains(@class,\"govuk-body\") and contains(@id,\"second-paragraph\")]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }

  def verifyHyperlinkText(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//a[contains(@class,\"govuk-link\") and contains(@id,'guidance-link')]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }

  def verifyBulletListHyperlinkText(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//a[contains(@class,\"govuk-link\") and contains(@id,'bullet-list-forth-link')]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }

  def clickOnHyperlinkText(expectedQHeader: String): Unit = {
    try{
      val element = driver.findElement(By.xpath("//a[contains(@class,\"govuk-link\") and contains(@id,'guidance-link')]"))
      val actualQHeader = element.getText
      Assert.assertTrue("Body Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
      element.click()
    }
    catch
    {
      case e=>
        val element = driver.findElement(By.xpath("//a[contains(@class,\"govuk-link\") and contains(@id,'differentAddress')]"))
        val actualQHeader = element.getText
        Assert.assertTrue("Body Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
        element.click()
    }


  }
}
