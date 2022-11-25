/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.junit.Assert
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration


trait HomePage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString


  val pageAddress = "notification/are-you-the-individual"

  //locators for the page
  def paragraphOne: WebElement = findByID("first-paragraph")
  def paragraphTwo: WebElement = findByID("second-paragraph")
  def paragraphThree: WebElement = findByID("third-paragraph")
  def paragraphFour: WebElement = findByID("forth-paragraph")
  def paragraphFive: WebElement = findByID("fifth-paragraph")
  def paragraphSix: WebElement = findByID("seventh-paragraph")

  def continue: WebElement = findByID("start")



  def navigateToPage(): Unit = {
    navigateToSpecificPage(pageAddress)
  }
  def verifyPageHeaderH1(expectedHeader: String): Unit = {
    val header = driver.findElement(By.xpath("//h1[contains(@class,'heading')]"))
    val actualHeader = header.getText
    Assert.assertTrue("H1 Verified", expectedHeader == actualHeader)
  }

  def verifyPageHeaderH2(expectedHeader: String): Unit = {
    val header = driver.findElement(By.xpath("//h2[contains(@class,'heading')]"))
    val actualHeader = header.getText
    Assert.assertTrue("H2 Verified", expectedHeader == actualHeader)
  }

  def verifyPageHeaderH3(expectedHeader: String): Unit = {
    val header = driver.findElement(By.xpath("//h3[contains(@class,'heading')]"))
    val actualHeader = header.getText
    Assert.assertTrue("H3 Verified", expectedHeader == actualHeader)
  }

  def verifyParagraphOne(expectedPara: String): Unit = {
    val actualPara = paragraphOne.getText
    Assert.assertTrue("Paragraph One verified", expectedPara == actualPara)
  }

  def verifyParagraphTwo(expectedPara: String): Unit = {
    val actualPara = paragraphTwo.getText
    Assert.assertTrue("Paragraph Two verified. ---Expected: "+expectedPara +" ---Actual: "+ actualPara, expectedPara == actualPara)
  }

  def verifyParagraphThree(expectedPara: String): Unit = {
    val actualPara = paragraphThree.getText
    Assert.assertTrue("Paragraph Three verified", expectedPara == actualPara)
  }

  def verifyParagraphFour(expectedPara: String): Unit = {
    val actualPara = paragraphFour.getText
    Assert.assertTrue("Paragraph Four verified", expectedPara == actualPara)
  }

  def verifyParagraphFive(expectedPara: String): Unit = {
    val actualPara = paragraphFive.getText
    Assert.assertTrue("Paragraph Five verified", expectedPara == actualPara)
  }

  def verifyParagraphSix(expectedPara: String): Unit = {
    val actualPara = paragraphSix.getText
    Assert.assertTrue("Paragraph Six verified", expectedPara == actualPara)
  }

  def clickOnLink(linkText: String): Unit = {
    val hyperLink = driver.findElement(By.linkText(linkText))
    hyperLink.click()
  }

  def clickOnContinue(): Unit = {
    continue.click()
  }

}
