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

import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import uk.gov.hmrc.pages.{BasePage, ReceivedALetterPage}

object ReceivedALetterStepDefSteps extends BasePage  with ReceivedALetterPage {

  // ^I am navigated to Received A Letter Page
  def givenIAmNavigatedToReceivedALetterPage(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        navigateToSpecificPage("")
  }

  // the page is loaded successfully and verifies the page title is {string}
  def whenThePageIsLoadedSuccessfullyAndVerifiesThePageTitleIsString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyPageTitle(string)
  }

  // verify the question should be {string}
  def thenVerifyTheQuestionShouldBeString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyPageQuestion(string)
  }

  // verify both the radio buttons are not selected
  def thenVerifyBothTheRadioButtonsAreNotSelected(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyYesNoAreNotSelected()
  }

  // I select Yes radio button
  def whenISelectYesRadioButton(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        selectYes()
  }

  // click on Save and Continue button
  def whenClickOnSaveAndContinueButton(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        saveAndContinue()
  }

  // I am navigated to the next page with title {string}
  def thenIAmNavigatedToTheNextPageWithTitleString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyPageTitle(string)
  }

  // I click on Back button
  def whenIClickOnBackButton(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        clickOnBack()
  }

  // I am navigated back to Received A letter page with title {string}
  def thenIAmNavigatedBackToReceivedALetterPageWithTitleString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyPageTitle(string)
  }

  // verify that Yes radio option is still selected
  def thenVerifyThatYesRadioOptionIsStillSelected(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        yesIsSelected()
  }

  // I select No radio button
  def thenISelectNoRadioButton(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        selectNo()
  }

}
