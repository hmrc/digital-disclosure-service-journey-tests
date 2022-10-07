/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages
import org.junit.Assert
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration
import org.openqa.selenium.WebElement

trait WhatIsTheCountryOfAddressPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  def verifyDropdownDisplayed(): Unit = {
    val element = driver.findElement(By.xpath("//*[@id='countryCode__listbox']"))
    Assert.assertTrue("Dropdown is displayed", element.isDisplayed)
  }

  def selectfromDropdown(stringtoSelect: String): Unit = {
    val element = driver.findElements(By.xpath("//li[contains(@id,'countryCode__option')]"))
    val count = element.size()
    Assert.assertTrue("Dropdown is displayed", element.get(count - 1).getText.equals(stringtoSelect))
    element.get(count - 1).click()
  }

  def verifyAddressHyperlink(expectedQHeader: String): Unit = {
    var actualHeader = ""
    val element = driver.findElements(By.xpath("//a[@class=\"govuk-link\"]"))
    element.forEach(e =>
      if (e.getText == expectedQHeader) {
        actualHeader = e.getText
      }
    )
    Assert.assertTrue("Hyperlink is not Verified" + "Actual:" + actualHeader + "Expected:" + expectedQHeader, expectedQHeader.toString() == actualHeader.toString())
  }
}
