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

import io.cucumber.datatable.DataTable
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.scalatest.prop.TableFor4
import uk.gov.hmrc.pages.{BasePage, CheckYourAnswersPage}

import java.time.Duration
import uk.gov.hmrc.selenium.webdriver.Driver

object CheckYourAnswersStepDefSteps extends BasePage with CheckYourAnswersPage {

  // answers page should have h2 header {string}
  def thenAnswersPageShouldHaveH2HeaderString(string: String): Unit = {
    verifyH2Header(string)
  }

  // answers page should not have h2 header {string}
  def thenAnswersPageShouldNotHaveH2HeaderString(string: String): Unit = {
    verifyH2HeaderNotDisplayed(string)
  }

  // line {string} should have a label {string} an answer with {string} and change URL ends with {string}
  def thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString(string: String, string2: String, string3: String, string4: String): Unit = {
    verifyAboutYouAnswers(string, string2, string3, string4)
  }

  // label {string} is not displayed on check your answer page
  def thenLabelStringIsNotDisplayedOnCheckYourAnswerPage(string: String): Unit = {
    labelIsNotDisplayed(string)
  }

  // About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
  def thenAboutTheIndividualSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString(string: String, string2: String, string3: String, string4: String): Unit = {
    verifyAboutTheIndividualAnswers(string, string2, string3, string4)
  }

  // About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
  def thenAboutTheCompanySectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString(string: String, string2: String, string3: String, string4: String): Unit = {
    verifyAboutTheCompanyAnswers(string, string2, string3, string4)
  }

  // About The LLP section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
  def thenAboutTheLLPSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString(string: String, string2: String, string3: String, string4: String): Unit = {
    verifyAboutTheLLPAnswers(string, string2, string3, string4)
  }

  // About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
  def thenAboutTheTrustSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString(string: String, string2: String, string3: String, string4: String): Unit = {
    verifyAboutTheTrustAnswers(string, string2, string3, string4)
  }

  // Background section has following
  def thenBackgroundSectionHasFollowing(
                                         backgroundRows: TableFor4[String, String, String, String]
                                       ): Unit = {
    verifyBackgroundAnswers(backgroundRows)
  }

  // clicking on change button navigates as following:
  def thenClickingOnChangeButtonNavigatesAsFollowing(dataTable: DataTable): Unit = {
    verifyChangeButtonNavigation(dataTable)
  }

  // clicking on change button to validate changed value as following:
  def thenClickingOnChangeButtonToValidateChangedValueAsFollowing(dataTable: DataTable): Unit = {
    validateChangedValue(dataTable)
  }

  // I am on {string} page
  def givenIAmOnStringPage(string: String): Unit = {
    verifyPageHeading(string)
  }

  // I click on change button for {string}
  def whenIClickOnChangeButtonForString(string: String): Unit = {
    clickOnChangeButton(string)
  }

  // country dropdown is empty
  def thenCountryDropdownIsEmpty(): Unit = {
    verifyDropdownTextBoxIsEmpty()
  }

  // About the person who died section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}
  def thenAboutThePersonWhoDiedSectionShouldHaveALabelStringAtLineStringAnAnswerWithStringAndChangeURLEndsWithString(string: String, string2: String, string3: String, string4: String): Unit = {
    verifyAboutThePersonDiedAnswers(string, string2, string3, string4)
  }

}
