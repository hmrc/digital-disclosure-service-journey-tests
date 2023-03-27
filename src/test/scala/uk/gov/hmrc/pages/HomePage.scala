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
import java.time.Duration


trait HomePage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, Duration.ofSeconds(20))

  val currentEnvironment: String = Configuration.environment.toString


  val pageAddress = "notification/are-you-the-individual"

  //locators for the page
  def paragraphOne: WebElement = findByID("first-paragraph")
  def paragraphTwo: WebElement = findByID("second-paragraph")
  def paragraphThree: WebElement = findByID("third-paragraph")
  def paragraphFour: WebElement = findByID("forth-paragraph")
  def paragraphFive: WebElement = findByID("fifth-paragraph")
  def paragraphSix: WebElement = findByID("sixth-paragraph")
  def paragraphSeven: WebElement = findByID("seventh-paragraph")

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
    Assert.assertTrue("Paragraph One not verified. Expected: "+ expectedPara + "-- Actual: "+actualPara, expectedPara == actualPara)
  }

  def verifyParagraphTwo(expectedPara: String): Unit = {
    val actualPara = paragraphTwo.getText
    Assert.assertTrue("Paragraph Two verified. ---Expected: "+expectedPara +" ---Actual: "+ actualPara, expectedPara == actualPara)
  }

  def verifyParagraphThree(expectedPara: String): Unit = {
    val actualPara = paragraphThree.getText
    Assert.assertTrue("Paragraph Three not verified. Expected: "+ expectedPara + "-- Actual: "+actualPara, expectedPara == actualPara)
  }

  def verifyParagraphFour(expectedPara: String): Unit = {
    val actualPara = paragraphFour.getText
    Assert.assertTrue("Paragraph Four not verified. Expected: "+ expectedPara + "-- Actual: "+actualPara, expectedPara == actualPara)
  }

  def verifyParagraphFive(expectedPara: String): Unit = {
    val actualPara = paragraphFive.getText
    Assert.assertTrue("Paragraph Five not verified. Expected: "+ expectedPara + "-- Actual: "+actualPara, expectedPara == actualPara)
  }

  def verifyParagraphSix(expectedPara: String): Unit = {
    val actualPara = paragraphSix.getText
    Assert.assertTrue("Paragraph Six not verified. Expected: "+ expectedPara + "-- Actual: "+actualPara, expectedPara == actualPara)
  }

  def verifyParagraphSeven(expectedPara: String): Unit = {
    val actualPara = paragraphSeven.getText
    Assert.assertTrue("Paragraph Seven not verified. Expected: "+ expectedPara + "-- Actual: "+actualPara, expectedPara == actualPara)
  }

  def clickOnLink(linkText: String): Unit = {
    val hyperLink = driver.findElement(By.linkText(linkText))
    hyperLink.click()
  }

}
