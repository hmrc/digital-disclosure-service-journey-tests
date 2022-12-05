/*
 * Copyright 2022 HM Revenue & Customs
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


trait AreYouTheIndividualPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString


  val pageAddress = "notification/are-you-the-individual"

  //stride login locators for local
  def radioYes: WebElement = findByID("value_0")
  def radioNo: WebElement = findByID("value_1")

  def navigateToPage(): Unit = {
    navigateToSpecificPage(pageAddress)
  }

  def verifyNoRadioSelected(): Unit = {
    Assert.assertFalse("Verify An Individual is not selected" + radioYes.isSelected, false)
    Assert.assertFalse("Verify An Estate is not selected" + radioNo.isSelected, false)
  }

  def selectOption(option: String): Unit = {
    if (option.toLowerCase() == "yes") {
      radioYes.click()
    } else if (option.toLowerCase() == "no"){
      radioNo.click()
    }
  }

  def isSelected(option: String): Unit = {
    if (option.toLowerCase() == "yes") {
      Assert.assertTrue("Verify Yes is selected" + radioYes.isSelected, true)
    } else if (option.toLowerCase() == "no"){
      Assert.assertTrue("Verify No is selected" + radioNo.isSelected, true)
    }
  }


}
