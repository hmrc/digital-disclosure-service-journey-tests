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

import uk.gov.hmrc.pages.{BasePage, WhatIsYourDOBPage}


object IndividualAreYouRegisteredForSelfAssessmentStepDefSteps extends BasePage with WhatIsYourDOBPage {

  // I am on Is the individual registered for Self Assessment, as far as you’re aware page as {string} tax payer
  def givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer(string: String): Unit = {
    if (string == "Individual"){
          navigateToSpecificPage("notification/individual-self-assessment")
        } else {
          navigateToSpecificPage("notification/registered-for-self-assessment")
        }
  }

}
