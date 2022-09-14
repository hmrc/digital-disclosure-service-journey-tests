/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import io.cucumber.datatable.DataTable
import io.cucumber.scala.{EN, ScalaDsl}
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

import java.lang.Thread
import scala.jdk.CollectionConverters.asScalaBufferConverter


trait BasePage extends WebBrowser with Assertions with ScalaDsl with EN with ScalaFutures with StartUpTearDown {

  lazy val url: String = ""
  private lazy val webdriverWait = new WebDriverWait(driver, 20)
  //private lazy val envBaseUrl: String = Configuration.settings.baseUrl
  private val port = 10210

  //def baseUrl: String = if (envBaseUrl.startsWith("http://local")) s"$envBaseUrl:$port" else envBaseUrl

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

    Assert.assertTrue("Page Title Verified", title == driver.getTitle)
  }
  def verifyPageQuestion(expectedQHeader: String): Unit = {
    val question = driver.findElement(By.xpath("//*[@id=\'main-content\']/div/div/form/div/fieldset/legend/h1"))
    val actualQHeader = question.getText
    Assert.assertTrue("Page Question Verified", expectedQHeader.toString() == actualQHeader.toString())

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

    findByID("submit-top").click()

    driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/a")).click()
  }


}

