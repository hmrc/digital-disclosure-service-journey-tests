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
import uk.gov.hmrc.pages.BasePage

object AreYouRepresentingOrganisationStepDefSteps  extends BasePage {

  // I navigate to {string} page
  def givenINavigateToStringPage(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        navigateToSpecificPage("notification/"+string)
  }

  // I should navigate to Organisation Name TextBox field
  def thenIShouldNavigateToOrganisationNameTextBoxField(): Unit = {
    verifyFocusOnTextbox()
  }

  // I enter data with max length of {string} in Organisation Name TextBox field
  def whenIEnterDataWithMaxLengthOfStringInOrganisationNameTextBoxField(string: String): Unit = {
    enterInputInTextBoxWithMaxLength(string)
  }

}
