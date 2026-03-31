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
import uk.gov.hmrc.pages.{BasePage, WhatIsDisclosurePage}

object WhatIsDisclosureStepDefSteps extends BasePage with WhatIsDisclosurePage {

  // I am navigated to What is the disclosure Page
  def givenIAmNavigatedToWhatIsTheDisclosurePage(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        navigateToPage()
  }

  // verify that An individual, An estate, A company, A limited liability partnership, A trust are not selected by default
  def thenVerifyThatAnIndividualAnEstateACompanyALimitedLiabilityPartnershipATrustAreNotSelectedByDefault(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyNoRadioSelected()
  }

  // I select radio option An Individual
  def whenISelectRadioOptionAnIndividual(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        selectAnIndividual()
  }

  // I am navigated back to the page with title {string}
  def thenIAmNavigatedBackToThePageWithTitleString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyPageTitle(string)
  }

  // the option An Individual is still selected
  def thenTheOptionAnIndividualIsStillSelected(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        isIndividualSelected()
  }

}
