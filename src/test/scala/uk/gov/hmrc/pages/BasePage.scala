/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import io.cucumber.scala.{EN, ScalaDsl}
import org.apache.commons.lang3.StringUtils
import org.junit.Assert
import org.openqa.selenium.By.{ById, ByXPath}
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, Keys, WebElement}
import org.scalatest.Assertions
import org.scalatest.concurrent.ScalaFutures
import org.scalatestplus.selenium.WebBrowser
import uk.gov.hmrc.driver.StartUpTearDown
import uk.gov.hmrc.utils.Configuration
import uk.gov.hmrc.utils.MessageReader.getElement

trait BasePage extends WebBrowser with Assertions with ScalaDsl with EN with ScalaFutures with StartUpTearDown {

  lazy val url: String = ""
  private lazy val webdriverWait = new WebDriverWait(driver, 20)
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

  def verifyPageTitle (title: String): Unit = {
    Assert.assertTrue("Page Title not Verified", title == driver.getTitle)
  }

  def verifyPageQuestion(expectedQHeader: String): Unit = {
    val question = driver.findElement(By.xpath("//h1"))
    val actualQHeader = question.getText
    Assert.assertTrue("Page Question not Verified", expectedQHeader == actualQHeader)
  }

  def saveAndContinue(): Unit = {
    findByID("continue").click()
  }

  def clickOnBack(): Unit = {
    driver.findElement(By.className("govuk-back-link")).click()
  }

  def authenticationByPass(): Unit = {
    val reDirectUrl = findByID("redirectionUrl")
    reDirectUrl.clear()
    reDirectUrl.sendKeys(Configuration.settings.baseUrl)
    findByID("submit").click()
    if (driver.findElements( By.xpath("//*[@class='cbanner-govuk-cookie-banner']") ).size() != 0){
      driver.findElement( By.xpath("//button[contains(text(), 'Accept additional cookies')]")).click()
      driver.findElement( By.xpath("//button[contains(text(), 'Hide cookies message')]")).click()

    }
  }

  def navigateToHomePage(): Unit = {
    goTo(Configuration.settings.baseUrl)
    authenticationByPass()
  }

  def navigateToSpecificPage(specificPage: String): Unit = {
    navigateToHomePage()
    findByID("start").click()
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
    Assert.assertTrue("bullet Text is not Verified", expectedText == actualText)
  }

  def enterInputInTextBox(textInput: String): Unit = {
    driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).sendKeys(textInput)
  }

  def enterInputInTextBoxWithMaxLength(length: String): Unit = {
    val textInput = StringUtils.repeat("*", length.toInt + 1)
    driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).sendKeys(textInput)
  }

  def verifyFocusOnTextbox(): Unit = {
    driver.findElement(By.xpath("//input[contains(@class,\"govuk-input\")]")).equals(driver.switchTo().activeElement())
  }
}

