/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.junit.Assert
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration


trait WhatIsDisclosurePage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString


  val pageAddress = "notification/what-is-this-disclosure-about"

  //stride login locators for local
  def radioAnIndividual: WebElement = findByID("value_0")
  def radioAnEstate: WebElement = findByID("value_1")
  def radioACompany: WebElement = findByID("value_2")
  def radioAPartnerShip: WebElement = findByID("value_3")
  def radioATrust: WebElement = findByID("value_4")

  def navigateToPage(): Unit = {
    navigateToSpecificPage(pageAddress)
  }

  def verifyNoRadioSelected(): Unit = {
    Assert.assertFalse("Verify An Individual is not selected" + radioAnIndividual.isSelected, false)
    Assert.assertFalse("Verify An Estate is not selected" + radioAnEstate.isSelected, false)
    Assert.assertFalse("Verify A Company is not selected" + radioACompany.isSelected, false)
    Assert.assertFalse("Verify A Partnership is not selected" + radioAPartnerShip.isSelected, false)
    Assert.assertFalse("Verify A Trust is not selected" + radioATrust.isSelected, false)
  }

  def selectAnIndividual(): Unit = {
    radioAnIndividual.click()
  }

  def isIndividualSelected(): Unit = {
    Assert.assertTrue("Verify An Individual is selected" + radioAnIndividual.isSelected, true)
  }


}
