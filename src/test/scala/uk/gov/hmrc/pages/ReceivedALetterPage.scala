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

import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.WebDriverWait
import org.junit.Assert
import uk.gov.hmrc.utils.Configuration
import java.time.Duration


trait ReceivedALetterPage extends BasePage {

  val currentEnvironment: String = Configuration.environment.toString

  //stride login locators for local
  def radioYes: WebElement = findByID("value")

  def radioNo: WebElement = findByID("value-no")


  def navigateToPage(): Unit = {
    goTo(Configuration.settings.baseUrl)
    authenticationByPass()
  }

  def verifyYesNoAreNotSelected(): Unit = {
    Assert.assertFalse("Verify Yes is not selected" + radioYes.isSelected, false)
    Assert.assertFalse("Verify No is not selected" + radioNo.isSelected, false)
  }

  def selectYes(): Unit = {
    radioYes.click()
  }

  def selectNo(): Unit = {
    radioNo.click()
  }

  def yesIsSelected(): Unit = {
    Assert.assertTrue("Verify Yes is not selected" + radioYes.isSelected, true)
  }


}
