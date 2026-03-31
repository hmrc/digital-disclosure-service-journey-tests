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
import uk.gov.hmrc.pages.{AreYouTheIndividualPage, BasePage}

object AreYouTheIndividualStepDefSteps extends BasePage with AreYouTheIndividualPage {

  // I am navigated to Are you the individual that the disclosure will be about? Page
  def givenIAmNavigatedToAreYouTheIndividualThatTheDisclosureWillBeAboutPage(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        navigateToSpecificPage("notification/what-is-this-disclosure-about")
        clickOnRadioButton("An individual","1")
        saveAndContinue()
  }

  // verify that Yes and No radio options are selected by default
  def thenVerifyThatYesAndNoRadioOptionsAreSelectedByDefault(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyNoRadioSelected()
  }

  // I select {string}
  def whenISelectString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        selectOption(string)
  }

  // option still selected is {string}
  def thenOptionStillSelectedIsString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        isSelected(string)
  }
}
