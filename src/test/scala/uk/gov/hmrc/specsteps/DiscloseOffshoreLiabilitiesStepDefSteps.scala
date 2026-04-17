/*
 * Copyright 2026 HM Revenue & Customs
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

package uk.gov.hmrc.specsteps

import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import uk.gov.hmrc.specpage.{BasePage, DiscloseOffshoreLiabilitiesPage}

object DiscloseOffshoreLiabilitiesStepDefSteps extends BasePage with DiscloseOffshoreLiabilitiesPage {

  // I am on Do you want to disclose offshore liabilities Page
  def givenIAmOnDoYouWantToDiscloseOffshoreLiabilitiesPage(): Unit = {
    navigateToSpecificPage("notification/disclose-offshore-liabilities")
  }

  // I am on Are you the individual that the disclosure will be about? Page
  def givenIAmOnAreYouTheIndividualThatTheDisclosureWillBeAboutPage(): Unit = {
    navigateToSpecificPage("notification/are-you-the-entity")
  }

  // heading with text {string} is displayed
  def thenHeadingWithTextStringIsDisplayed(string: String): Unit = {
    verifyPageHeading(string)
  }

  // sub heading with text {string} is displayed
  def thenSubHeadingWithTextStringIsDisplayed(string: String): Unit = {
    verifySubPageHeading(string)
  }

  // body Text {string} is displayed
  def thenBodyTextStringIsDisplayed(string: String): Unit = {
    verifyBodyText(string)
  }

  // bullet Text {string} is displayed at position {string}
  def thenBulletTextStringIsDisplayedAtPositionString(string: String,positionNum:String): Unit = {
    verifyBulletText(string,positionNum)
  }

  // text {string} is displayed
  def thenTextStringIsDisplayed(string: String): Unit = {
    verifyText(string)
  }

  // bullet text hyperlink with text {string} is displayed
  def thenBulletTextHyperlinkWithTextStringIsDisplayed(string: String): Unit = {
    verifyBulletListHyperlinkText(string)
  }

  // hyperlink with text {string} is displayed
  def thenHyperlinkWithTextStringIsDisplayed(string: String): Unit = {
    verifyHyperlinkText(string)
  }

  // click on Hyperlink {string}
  def whenClickOnHyperlinkString(string: String): Unit = {
    clickOnHyperlinkText(string)
  }

  // I select Radio Button {string} at Position {string}
  def whenISelectRadioButtonStringAtPositionString(string: String, positionNum: String): Unit = {
    waitFor(ExpectedConditions.elementToBeClickable(By.className("govuk-radios__item")))
        clickOnRadioButton(string,positionNum)
  }

  // I select Checkbox {string} at Position {string}
  def whenISelectCheckboxStringAtPositionString(string: String, positionNum: String): Unit = {
    waitFor(ExpectedConditions.elementToBeClickable(By.className("govuk-checkboxes__item")))
        clickOnCheckBox(string, positionNum)
  }

  // page navigates to {string} in new tab
  def thenPageNavigatesToStringInNewTab(string: String): Unit = {
    verifyNewTabUrl(string)
  }

  // radio Button with text {string} is displayed at position {string}
  def thenRadioButtonWithTextStringIsDisplayedAtPositionString(string: String, positionNum: String): Unit = {
    verifyRadioButtonAndText(string, positionNum)
  }

  // verify that radio options are not selected by default
  def thenVerifyThatRadioOptionsAreNotSelectedByDefault(): Unit = {
    verifyRadioButtonAndTextNotSelected()
  }

  // page navigates to {string}
  def thenPageNavigatesToString(string: String): Unit = {
    verifyPageHeading(string)
  }

  // page heading contains {string}
  def thenPageHeadingContainsString(heading: String): Unit = {
    verifyPageHeadingContains(heading)
  }

  // I should navigate to Radio button {string} at Position {string}
  def thenIShouldNavigateToRadioButtonStringAtPositionString(string: String, positionNum: String): Unit = {
    verifyFocusOnRadioButton(string,positionNum)
  }

  // click on I confirm button
  def whenClickOnIConfirmButton(): Unit = {
    iConfirmButton()
  }

}
