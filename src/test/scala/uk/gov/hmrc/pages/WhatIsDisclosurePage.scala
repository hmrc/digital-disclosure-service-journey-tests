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
import uk.gov.hmrc.utils.Configuration
import java.time.Duration


trait WhatIsDisclosurePage extends BasePage {

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
