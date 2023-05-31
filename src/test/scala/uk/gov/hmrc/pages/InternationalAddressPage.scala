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
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

trait InternationalAddressPage extends BasePage with WhatIsTheCountryOfAddressPage {

  //locators for the page
  def organisation: WebElement = findByID("organisation")
  def addressLineOne: WebElement = findByID("line1")
  def addressLineTwo: WebElement = findByID("line2")
  def addressLineThree: WebElement = findByID("line3")
  def town: WebElement = findByID("town")
  def postcode: WebElement = findByID("postcode")
  def country: WebElement = findByID("countryName")

  def enterInputInManualAddressPage(text: String, textBoxName: String): Unit = {
    if (textBoxName == "Organisation") {
      organisation.clear()
      organisation.sendKeys(text)
    } else if (textBoxName == "Address line 1") {
      addressLineOne.clear()
      addressLineOne.sendKeys(text)
    } else if (textBoxName == "Address line 2") {
      addressLineTwo.clear()
      addressLineTwo.sendKeys(text)
    } else if (textBoxName == "Address line 3") {
      addressLineThree.sendKeys(text)
    } else if (textBoxName == "Town or city") {
      town.clear()
      town.sendKeys(text)
    } else if (textBoxName == "Postcode") {
      postcode.clear()
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
