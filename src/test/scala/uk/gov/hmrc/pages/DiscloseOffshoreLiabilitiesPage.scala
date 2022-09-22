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

  def verifyPageHeading(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//h1[contains(@class,'heading')]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Heading is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }

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

  def clickOnHyperlinkText(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//a[contains(@class,\"govuk-link\") and contains(@id,'guidance-link')]"))
    val actualQHeader = element.getText
    Assert.assertTrue("Body Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
    element.click()
  }

  def clickOnRadioButton(expectedQHeader: String, bulletNum: String): Unit = {
    val elementLabel = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/label[contains(@class,'govuk-radios__label')]"))
    val value = bulletNum.toInt
    val actualQHeader = elementLabel.get(value - 1).getText
    Assert.assertTrue("Radio Text is not Verified", expectedQHeader.toString().trim == actualQHeader.toString().trim)

    val elementInput = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/input[@class='govuk-radios__input']"))
    elementInput.get(value - 1).click()
  }

  def verifyFocusOnRadioButton(expectedQHeader: String, bulletNum: String): Unit = {
    val elementLabel = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/label[contains(@class,'govuk-radios__label')]"))
    val value = bulletNum.toInt
    val actualQHeader = elementLabel.get(value - 1).getText
    Assert.assertTrue("Radio Text is not Verified", expectedQHeader.toString().trim == actualQHeader.toString().trim)

    val elementInput = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/input[@class='govuk-radios__input']"))
    Assert.assertTrue("Focus is not on Radio Button",elementInput.get(value - 1).equals(driver.switchTo().activeElement()))
  }

  def verifyNewTabUrl(expectedQHeader: String): Unit = {
    val tabs2 = driver.getWindowHandles
    val openedTabs=tabs2.iterator()
    val currentTab=openedTabs.next()
    val newTab=openedTabs.next()
    driver.switchTo.window(newTab)
    Assert.assertTrue("link is not opened in new tab", driver.getCurrentUrl.toLowerCase().contains(expectedQHeader.toLowerCase()))
    driver.close()
    driver.switchTo.window(currentTab)
  }

  def verifyRadioButtonAndText(expectedQHeader: String, bulletNum: String): Unit = {
    val elementInput = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/input[@class='govuk-radios__input']"))
    val value = bulletNum.toInt
    val buttontype = elementInput.get(value - 1).getAttribute("type");
    Assert.assertTrue("Button type is not radio", buttontype.toString() == "radio")

    val elementLabel = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/label[contains(@class,'govuk-radios__label')]"))
    val actualQHeader = elementLabel.get(value - 1).getText
    Assert.assertTrue("Radio Text is not Verified", expectedQHeader.toString() == actualQHeader.toString())
  }
}
