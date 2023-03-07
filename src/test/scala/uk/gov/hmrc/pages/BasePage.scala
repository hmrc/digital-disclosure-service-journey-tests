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

import io.cucumber.scala.{EN, ScalaDsl}
import org.apache.commons.lang3.StringUtils
import org.junit
import org.junit.Assert
import org.openqa.selenium.By.{ById, ByXPath}
import org.openqa.selenium.support.ui.{ExpectedConditions, Select, WebDriverWait}
import org.openqa.selenium.{By, Keys, WebElement}
import org.scalatest.Assertions
import org.scalatest.concurrent.ScalaFutures
import org.scalatestplus.selenium.WebBrowser
import uk.gov.hmrc.driver.StartUpTearDown
import uk.gov.hmrc.utils.Configuration
import uk.gov.hmrc.utils.MessageReader.getElement
import uk.gov.hmrc.domain.Generator
import scala.util.Random

import java.time.Duration

trait BasePage extends WebBrowser with Assertions with ScalaDsl with EN with ScalaFutures with StartUpTearDown {

  lazy val url: String = ""
  private lazy val webdriverWait = new WebDriverWait(driver, Duration.ofSeconds(20))
  private val port = 10210


  def goToPage(): Unit = {
    go to url
  }

  def findByID(id: String): WebElement = driver.findElement(By.id(id))

  def findByLinkText(linkText: String): WebElement = driver.findElement(By.linkText(linkText))

  def findByElement(elementId: String): WebElement = driver.findElement(By.id(getElement(elementId)))

  def findByXPath(xpath: String): WebElement = driver.findElement(By.xpath(getElement(xpath)))

  def findByclassName(elementclassName: String): WebElement = driver.findElement(By.className(getElement(elementclassName)))

  def clickOnElement(id: String): Unit = findByID(id).click()

  def checkURL(url: String): Unit = driver.getCurrentUrl.endsWith(url)

  def clickOnElementByClassName(className: String): Unit = findByclassName(className).click()

  def waitForPresenceOfElement(element: By): WebElement = webdriverWait.until(ExpectedConditions.elementToBeClickable(element))


  def contentNotPresent(text: String): Unit = {
    val list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"))
    Assert.assertFalse("Text found!", list.size > 0)
  }

  def pageUrl(url: String): Unit = {
    url match {
      case "receivedALetter" => checkURL("digital-disclosure/notification/letter-from-hmrc")
      case _ => throw new IllegalArgumentException(url + " not found")
    }
  }

  def verifyPageTitle (expectedTitle: String): Unit = {
    val actualTitle = driver.getTitle
    Assert.assertTrue("Page Title not Verified. Expected: " + expectedTitle + "--- Actual: " + actualTitle, expectedTitle == actualTitle)
  }

  def verifyPageQuestion(expectedQHeader: String): Unit = {
    val question = driver.findElement(By.xpath("//h1"))
    val actualQHeader = question.getText
    Assert.assertTrue("Page Question not Verified. Expected:  " + expectedQHeader +  "--- Actual:  " + actualQHeader, expectedQHeader == actualQHeader)
  }

  def saveAndContinue(): Unit = {
    findByID("continue").click()
  }

  def iConfirmButton(): Unit = {
    findByID("confirm").click()
  }

  def submit(): Unit = {
    findByID("submit").click()
  }

  def clickOnBack(): Unit = {
    driver.findElement(By.className("govuk-back-link")).click()
  }

  def authenticationByPass(): Unit = {
    val reDirectUrl = findByID("redirectionUrl")
    reDirectUrl.clear()
    reDirectUrl.sendKeys(Configuration.settings.baseUrl)
    val elements = findByID("confidenceLevel").findElements(By.tagName("option"))
    elements.get(2).click()
    //val nino = "AA000000B"
    val ninoGenerator = new Generator(new Random())
    def generateNino: String = ninoGenerator.nextNino.nino
    findByID("nino").sendKeys(generateNino)
    findByID("submit").click()
    if (driver.findElements( By.xpath("//*[@class='cbanner-govuk-cookie-banner']") ).size() != 0){
      driver.findElement( By.xpath("//button[contains(text(), 'Accept additional cookies')]")).click()
      driver.findElement( By.xpath("//button[contains(text(), 'Hide cookies message')]")).click()

    }
  }

  def navigateToBaseUrl(): Unit = {
    goTo(Configuration.settings.baseUrl)
  }

  def navigateToHomePage(): Unit = {
    goTo(Configuration.settings.baseUrl)
    authenticationByPass()
  }

  def navigateToSpecificURL(specificPage: String): Unit = {
    goTo(Configuration.settings.baseUrl + specificPage)
  }

  def navigateToSpecificPage(specificPage: String): Unit = {
    navigateToHomePage()
    findByID("start").click()
    if (driver.getTitle.contains("Using this service - ")) {
      clickOnRadioButton("Make a notification first","1")
      saveAndContinue()
    }
    if (specificPage != "") {
      goTo(Configuration.settings.baseUrl+specificPage)
    }
  }

  def verifyNewTabTitleAndCloseTab(title: String): Unit = {
    val tabs2 = driver.getWindowHandles
    val openedTabs=tabs2.iterator()
    val currentTab=openedTabs.next()
    val newTab=openedTabs.next()
    driver.switchTo.window(newTab)
    Assert.assertTrue("link is not opened in new tab", driver.getTitle.toLowerCase().contains(title.toLowerCase()))
    driver.switchTo.window(newTab).close()
    driver.switchTo().window(tabs2.iterator().next())
    val title2 = driver.getTitle
  }

  def verifyBulletText(expectedText: String, bulletNum: String): Unit = {
    val element = driver.findElements(By.xpath("//*[@class='dashed-list-item']"))
    val value=bulletNum.toInt
    val actualText = element.get(value-1).getText;
    Assert.assertTrue("bullet Text is not Verified. Expected:  " + expectedText +  "--- Actual:  " + actualText, expectedText == actualText)
  }

  def enterInputInTextBox(textInput: String): Unit = {

    try {
      driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).clear()
      driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).sendKeys(textInput)
    }
    catch {
      case e =>
        driver.findElement(By.id("countryCode")).clear()
        driver.findElement(By.id("countryCode")).sendKeys(textInput)
      case e =>
        driver.findElement(By.id("postcode")).clear()
        driver.findElement(By.id("postcode")).sendKeys(textInput)
      case e =>
        driver.findElement(By.xpath("//div[@class='hmrc-character-count']//textarea")).clear()
        driver.findElement(By.xpath("//div[@class='hmrc-character-count']//textarea")).sendKeys(textInput)
    }
  }

  def enterPropertyInput(textInput: String): Unit = {
      driver.findElement(By.id("filter")).sendKeys(textInput)
  }

  def enterInputInTextBoxWithMaxLength(length: String): Unit = {
    val textInput = StringUtils.repeat("a", length.toInt + 1)
    driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).sendKeys(textInput)
  }

  def verifyFocusOnTextbox(): Unit = {
    try{
      driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).equals(driver.switchTo().activeElement())
    }
    catch
    {
      case e=>
        driver.findElement(By.id("countryCode")).equals(driver.switchTo().activeElement())
      case e=>
        driver.findElement(By.id("postcode")).equals(driver.switchTo().activeElement())
     }
  }

  def verifyRadioButtonAndText(expectedText: String, bulletNum: String): Unit = {
    val elementInput = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/input[@class='govuk-radios__input']"))
    val value = bulletNum.toInt
    val buttontype = elementInput.get(value - 1).getAttribute("type");
    Assert.assertTrue("Button type is not radio", buttontype.toString() == "radio")

    val elementLabel = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/label[contains(@class,'govuk-radios__label')]"))
    val actualText = elementLabel.get(value - 1).getText
    Assert.assertTrue("Radio Text is not Verified. Expected: " + expectedText +  "--- Actual:  " + actualText, expectedText == actualText)
  }

  def verifyRadioButtonAndTextNotSelected(): Unit = {
    val elementInput = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/input[@class='govuk-radios__input']"))
    val value = elementInput.size()
    Assert.assertTrue("Radio Button is selected", !elementInput.get(value - 1).isSelected)
  }

  def verifyPageHeading(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//h1"))
    val actualQHeader = element.getText
    Assert.assertTrue("Heading is not Verified. Expected:  "+ expectedQHeader +  "--- Actual:  " + actualQHeader, expectedQHeader.contains(actualQHeader))
  }

  def verifySubPageHeading(expectedQHeader: String): Unit = {
    val element = driver.findElement(By.xpath("//*[@class='govuk-fieldset__legend  govuk-fieldset__legend--m']"))
    val actualQHeader = element.getText
    Assert.assertTrue("Heading is not Verified. Expected:  "+ expectedQHeader +  "--- Actual:  " + actualQHeader, expectedQHeader == actualQHeader)
  }

  def verifyH2Header(expectedHeader: String): Unit = {
    var actualHeader = ""
    val elements = driver.findElements(By.xpath("//h2"))
    elements.forEach(e =>
      if (e.getText == expectedHeader) {
        actualHeader = e.getText
      })
    Assert.assertTrue("H2 Header is not Verified. Expected:  "+ expectedHeader +  "--- Actual:  " + actualHeader, expectedHeader == actualHeader)
  }

  def verifyH2HeaderNotDisplayed(expectedHeader: String): Unit = {
    var actualHeader = ""
    val elements = driver.findElements(By.xpath("//h2"))
    elements.forEach(e =>
      if (e.getText == expectedHeader) {
        actualHeader = e.getText
      })
    Assert.assertTrue("H2 Header is displayed. Expected:  "+ expectedHeader +  " should not be displayed --- Actual:  Header displayed", actualHeader.equals(""))
  }

  def clickOnRadioButton(expectedText: String, bulletNum: String): Unit = {
    val elementLabel = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/label[contains(@class,'govuk-radios__label')]"))
    val value = bulletNum.toInt
    val actualText = elementLabel.get(value - 1).getText
    Assert.assertTrue("Radio Text is not Verified. Expected: " + expectedText +  "--- Actual:  " + actualText, expectedText.trim == actualText.trim)

    val elementInput = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/input[@class='govuk-radios__input']"))
    elementInput.get(value - 1).click()
  }

  def clickOnCheckBox(expectedText: String, bulletNum: String): Unit = {
    val elementLabel = driver.findElements(By.xpath("//*[@class='govuk-checkboxes__item']/label[contains(@class,'govuk-checkboxes__label')]"))
    val value = bulletNum.toInt
    val actualText = elementLabel.get(value - 1).getText
    Assert.assertTrue("Checkbox Text is not Verified. Expected: " + expectedText + "--- Actual:  " + actualText, expectedText.trim == actualText.trim)

    val elementInput = driver.findElements(By.xpath("//*[@class='govuk-checkboxes__item']/input[@class='govuk-checkboxes__input']"))
    elementInput.get(value - 1).click()
  }

  def verifyFocusOnRadioButton(expectedText: String, bulletNum: String): Unit = {
    val elementLabel = driver.findElements(By.xpath("//*[@class='govuk-radios__item']/label[contains(@class,'govuk-radios__label')]"))
    val value = bulletNum.toInt
    val actualText = elementLabel.get(value - 1).getText
    Assert.assertTrue("Radio Text is not Verified. Expected: " + expectedText +  "--- Actual:  " + actualText, expectedText.trim == actualText.trim)

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

  def verifyErrorSummary(expectedError: String): Unit = {
    val question = driver.findElement(By.xpath("//*[@class=\"govuk-error-summary__title\"]"))
    val actualError = question.getText
    Assert.assertTrue("Error Summary is not Verified.  Expected: " + expectedError + "--- Actual: " + actualError, expectedError == actualError)
  }
  def verifyPageHeader(expectedQHeader:String): Unit = {
    val question = driver.findElement(By.xpath("//h1"))
    val actualQHeader = question.getText
    Assert.assertTrue("Heading is not Verified. Expected:  "+ expectedQHeader +  "--- Actual:  " + actualQHeader, expectedQHeader == actualQHeader)
  }

  def verifyBody(expectedText: String): Unit = {
    var actualText = ""
    try {
      val element = driver.findElement(By.xpath("//*[@class='govuk-body']"))
      actualText = element.getText
    }

    catch
    {
      case e =>
        val element = driver.findElement(By.xpath("//label[@class=\"govuk-label\"]"))
        actualText = element.getText
    }
    Assert.assertTrue("Body Text is not Verified. Expected: " + expectedText + "--- Actual: " + actualText, expectedText == actualText)
  }
  def verifyErrorMessage(expectedError: String): Unit = {
    val question = driver.findElement(By.xpath("//*[@class=\"govuk-error-summary__body\"]//a[@href]"))
    val actualError = question.getText
    Assert.assertTrue("Error Message is not Verified. Expected: " + expectedError + "--- Actual: " + actualError, expectedError == actualError)
  }

  def clickErrorMessage(expectedError: String): Unit = {
    val question = driver.findElement(By.xpath("//*[@class=\"govuk-error-summary__body\"]"))
    val actualError = question.getText
    Assert.assertTrue("Error Message is not Verified. Expected: " + expectedError + "--- Actual: " + actualError, expectedError == actualError)
    driver.findElement(By.xpath("//*[@class=\"govuk-error-summary__body\"]//a[@href]")).click()
  }

  def verifyAddress(position: String, expectedText: String): Unit = {
    val element = driver.findElements(By.xpath("//div[@id='address']/span[@class=\"govuk-body-l\"]"))
    val actualText = element.get(position.toInt-1).getText
    Assert.assertTrue("Address is not Verified " + expectedText + " --- Actual:  " + actualText, expectedText==actualText)
  }

  def isSaveAndContinueButtonDisplayed(): Unit = {
    Assert.assertTrue("Save and Continue Button is not displayed", findByID("continue").isDisplayed.==(true))
  }

  def verifyMessage(message:String): Unit = {
    Assert.assertTrue("Message is not displayed", findByID("no-results").getText== message)
  }

  def verifyHintText(expectedText: String): Unit = {
    var actualText=""
    try{
      val element = driver.findElement(By.xpath("//*[@class='govuk-hint' or @class='govuk-hint govuk-radios__hint']"))
      actualText = element.getText
    }
    catch
    {
      case e =>
        val element = driver.findElement(By.xpath("//label[@class=\"govuk-label\"]"))
        actualText = element.getText
    }
    Assert.assertTrue("Hint text is not Verified" + expectedText + " --- Actual:  " + actualText, expectedText==actualText)
  }

  def SendNotification(): Unit = {
    findByID("send-button").click()
  }

  def clickOnContinue(): Unit = {
    findByID("start").click()
  }

  def verifySubmittedCaseRef(caseRef: String): Unit = {
    val element = driver.findElement(By.xpath("//*[@class=\"govuk-panel__body\"]"))
    val actualCaseRef = element.getText
    Assert.assertTrue("CaseRef is not displayed, --- Expected: "+caseRef + " --- Actual: " + actualCaseRef, actualCaseRef.contains(caseRef))
  }

  def selectValueFromDropdown(valueToSelect: String, dropDownID: String): Unit = {
    val element = new Select(driver.findElement(By.xpath("//*[@class='govuk-select' and @id=\"" + dropDownID + "\"]")))
    element.selectByVisibleText(valueToSelect)
  }

  def enterNINOInput(textInput: String): Unit = {
    driver.findElement(By.id("nino")).sendKeys(textInput)
  }

  def makeADisclosure(): Unit = {
    findByID("disclosure").click()
  }

  def sendOfferAndDisclosure(): Unit = {
    findByID("send-disclosure").click()
  }

  def verifyDisplayedCheckbox(expectedCount: String): Unit = {
    val element = driver.findElements(By.xpath("//input[contains(@class,\"govuk-checkboxes__input\")]"))
    val actualCount = element.size()
    Assert.assertTrue("CaseRef is not displayed, --- Expected: " + expectedCount + " --- Actual: " + actualCount, actualCount.toString.contains(expectedCount))
  }
}

