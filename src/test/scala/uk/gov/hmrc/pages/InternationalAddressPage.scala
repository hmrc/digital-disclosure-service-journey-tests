/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.junit.Assert
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration

trait InternationalAddressPage extends BasePage with WhatIsTheCountryOfAddressPage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  //locators for the page
  def organisation: WebElement = findByID("organisation")
  def addressLineOne: WebElement = findByID("line1")
  def addressLineTwo: WebElement = findByID("line3")
  def addressLineThree: WebElement = findByID("line3")
  def town: WebElement = findByID("town")
  def postcode: WebElement = findByID("postcode")
  def country: WebElement = findByID("countryName")

  def enterInputInManualAddressPage(text: String, textBoxName: String): Unit = {
    if (textBoxName == "Organisation") {
      organisation.sendKeys(text)
    } else if (textBoxName == "Address line 1") {
      addressLineOne.sendKeys(text)
    } else if (textBoxName == "Address line 2") {
      addressLineTwo.sendKeys(text)
    } else if (textBoxName == "Address line 3") {
      addressLineThree.sendKeys(text)
    } else if (textBoxName == "Town or city") {
      town.sendKeys(text)
    } else if (textBoxName == "Postcode") {
      postcode.sendKeys(text)
    } else {
      Assert.assertTrue("Invalid text field name: " + textBoxName, false)
    }
  }

  def navigateToAddressPage(): Unit = {
    navigateToSpecificPage("notification/registered-for-self-assessment")
    clickOnRadioButton("No", "2")
    saveAndContinue()
  }

  def navigateToUKManualAddressPage(): Unit = {
    navigateToSpecificPage("notification/your-address/lookup")
    //navigateToAddressPage()
    enterInputInTextBox("United Kingdom")
    saveAndContinue()
    clickOnElement("manualAddress")
  }

  def navigateToIntManualAddressPage(): Unit = {
    navigateToSpecificPage("notification/your-address/lookup")
    //navigateToAddressPage()
    enterInputInTextBox("Brunei")
    saveAndContinue()
  }

}
