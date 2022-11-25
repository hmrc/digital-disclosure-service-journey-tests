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


trait LoginPage extends BasePage {

  val currentenvironment: String = Configuration.environment.toString
  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  //stride login locators for local
  def userid: WebElement = findByID("login-form-username")

  def password: WebElement = findByID("login-form-password")

  def signinBtn: WebElement = findByID("login-form-submit")

  def dashBoard: WebElement = findByID("dashboard-content")



  def pid: WebElement = findByID("pid")

  def usergivenname: WebElement = findByID("usersGivenName")

  def usersurname: WebElement = findByID("usersSurname")

  def useremail: WebElement = findByID("emailAddress")

  def nextbutton: WebElement = findByID("next-button")

  def login(): Unit = {
    goTo(Configuration.settings.baseUrl)
    if (currentenvironment == "Local") {
      userid.sendKeys("niranjan.vankadaru")
      password.sendKeys("InputPassHere")

      //webdriverWait.until(ExpectedConditions.visibilityOf(userid)).sendKeys("niranjan.vankadaru")
      //webdriverWait.until(ExpectedConditions.visibilityOf(password)).sendKeys("InputPassHerre")
      signinBtn.click()
      pageTitle should be ("System Dashboard - Jira")
      print("Welcome Page displayed: " + dashBoard.getText())
    }
    else if (currentenvironment == "Qa") {
      pid.sendKeys("test")
      usergivenname.sendKeys("test")
      usersurname.sendKeys("test")
      signinBtn.click()
    } else if (currentenvironment == "Dev") {
      pid.sendKeys("test")
      usergivenname.sendKeys("test")
      usersurname.sendKeys("test")
      signinBtn.click()

    } else if (currentenvironment == "Staging") {
      userid.sendKeys("test")
      password.sendKeys("test")
      signinBtn.click()
    }
  }
}
