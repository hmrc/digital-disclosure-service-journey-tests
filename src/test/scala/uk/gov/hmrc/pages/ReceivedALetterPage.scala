/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.scalatest.concurrent.Eventually.eventually
import org.scalatest.matchers._
import org.scalatest.matchers.must.Matchers.be
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import org.scalatestplus.selenium._
import uk.gov.hmrc.utils.Configuration


trait ReceivedALetterPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  //stride login locators for local
  def radioYes: WebElement = findByID("value")

  def radioNo: WebElement = findByID("value-no")

  def navigateToPage(): Unit = {
    goTo(Configuration.settings.baseUrl)
  }


}
