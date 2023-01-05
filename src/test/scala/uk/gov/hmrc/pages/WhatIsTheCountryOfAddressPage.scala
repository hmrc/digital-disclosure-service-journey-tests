/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.pages
import org.junit.Assert
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration
import org.openqa.selenium.WebElement
import java.time.Duration

trait WhatIsTheCountryOfAddressPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, Duration.ofSeconds(20))

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
