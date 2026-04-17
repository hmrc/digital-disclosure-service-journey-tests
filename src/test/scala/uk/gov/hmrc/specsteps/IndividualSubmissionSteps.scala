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

import uk.gov.hmrc.specpage.{BasePage, LoginPage}

object IndividualSubmissionSteps extends BasePage with LoginPage {

  // ^User login with his government gateway id
  def givenUserLoginWithHisGovernmentGatewayId(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        println("Given User login with his government gateway id")
        login()
  }

  // the HMRC username is displayed on welcome page
  def andTheHMRCUsernameIsDisplayedOnWelcomePage(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        println("And the HMRC username is displayed on welcome page")
  }

  // user clicks on submit new disclosure service
  def andUserClicksOnSubmitNewDisclosureService(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        println("And user clicks on submit new disclosure service")
  }

  // the user enters all below mandatory customer details on the customer search page
  def whenTheUserEntersAllBelowMandatoryCustomerDetailsOnTheCustomerSearchPage(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        println("When the user enters all below mandatory customer details on the customer search page")
  }

  // the HMRC user clicks on next button
  def andTheHMRCUserClicksOnNextButton(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        println("And user clicks on submit new disclosure service")
  }

  // the HMRC user will be presented with more details page
  def thenTheHMRCUserWillBePresentedWithMoreDetailsPage(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        println("Then the HMRC user will be presented with more details page")
  }

}
