/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import io.cucumber.datatable.DataTable
import io.cucumber.scala.{EN, ScalaDsl}
import org.junit.Assert
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.openqa.selenium.{By, Keys, WebElement}
import org.scalatest.Assertions
import org.scalatest.concurrent.ScalaFutures
import org.scalatestplus.selenium.WebBrowser
import uk.gov.hmrc.driver.StartUpTearDown
import uk.gov.hmrc.utils.Configuration
import uk.gov.hmrc.utils.MessageReader.getElement

import scala.jdk.CollectionConverters.asScalaBufferConverter


trait SearchPage extends WebBrowser with Assertions with ScalaDsl with EN with ScalaFutures with StartUpTearDown {

  lazy val url: String = ""
  private lazy val webdriverWait = new WebDriverWait(driver, 20)
  private lazy val envBaseUrl: String = Configuration.settings.baseUrl
  private val port = 10210

  def baseUrl: String = if (envBaseUrl.startsWith("http://local")) s"$envBaseUrl:$port" else envBaseUrl

  def goToPage(): Unit = {
    go to url
  }

  def findByID(id: String): WebElement = driver.findElement(By.id(id))

  def findByLinkText(linkText: String): WebElement = driver.findElement(By.linkText(linkText))

  def findByElement(elementId: String): WebElement = driver.findElement(By.id(getElement(elementId)))

  def findByclassName(elementclassName: String): WebElement = driver.findElement(By.className(getElement(elementclassName)))

  def clickOnElement(id: String): Unit = findByID(id).click()

  def checkURL(url: String): Unit = driver.getCurrentUrl.endsWith(url)

  def clickOnElementByClassName(className: String): Unit = findByclassName(className).click()

  def waitForPresenceOfElement(element: By): WebElement = webdriverWait.until(ExpectedConditions.elementToBeClickable(element))

  def enterSearchCriteria(dataTable: DataTable): Unit = {
    dataTable.asMaps[String, String](classOf[String], classOf[String]).asScala.foreach(data => {
      val field: String = data.get("Field")
      val value = data.get("Value")
      if (field == "Identity document type") {
        selectDocType(value)
      } else {
        findByElement(field).sendKeys(value)
      }
    })
  }


  def selectDocType(docType: String): Unit = {
    findByElement("Identity document type").click()
    docType match {
      case "European National Identity Card" => driver.findElement(By.cssSelector("[value=\"NAT\"]")).click()
      case "Biometric Residence Card" => driver.findElement(By.cssSelector("[value=\"BRC\"]")).click()
      case "Biometric Residence Permit" => driver.findElement(By.cssSelector("[value=\"BRP\"]")).click()
      case _ => throw new IllegalArgumentException(s"doc type not found")

    }
  }

  def contentNotPresent(text: String): Unit = {
    val list = driver.findElements(By.xpath("//*[contains(text(),'" + text + "')]"))
    Assert.assertFalse("Text found!", list.size > 0)
  }

  def updateField(changeData: String, data: String) = {
    if (changeData == "identity document type") {
      selectDocType(data)
    }
    else if(changeData == "nationality") {
      findByElement(changeData).sendKeys(data)
      findByElement(changeData).sendKeys(Keys.TAB)
    }
    else
    {
      findByElement(changeData).clear()
      findByElement(changeData).sendKeys(data)
    }
  }
}

