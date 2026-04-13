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

package uk.gov.hmrc.specs

import uk.gov.hmrc.specsteps.AreYouRegisteredForVATStepDefSteps._
import uk.gov.hmrc.specsteps.AreYouRepresentingOrganisationStepDefSteps._
import uk.gov.hmrc.specsteps.CheckYourAnswersStepDefSteps._
import uk.gov.hmrc.specsteps.DoYouHaveNationalInsuranceNumStepDefSteps._
import uk.gov.hmrc.specsteps.IndividualAreYouRegisteredForSelfAssessmentStepDefSteps._
import uk.gov.hmrc.specsteps.NotificationSubmittedStepDefSteps._

class IndividualCheckYourAnswerAboutYouSpec extends BaseSpec {

  Feature("An individual UK tax payer is able to check their answers for About you section before submitting page") {

    Scenario("For Individual - About You Section Verification") {
      Given("I am on Check Your Answers page")
        // Possible match (best=0.56)
        givenIAmOnStringPage("")

      Then("page navigates to Check Your Answers")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")

      And("answers page should have h2 header Background")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")

      And("Background section has following")
        // Possible match (best=1.00)
        thenBackgroundSectionHasFollowing(null)

      Then("answers page should have h2 header About you")
        // Possible match (best=0.60)
        thenAnswersPageShouldHaveH2HeaderString("")

      And("line 1 should have a label Your full name an answer with my full name and change URL ends with your-full-name/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 2 should have a label Your contact preference an answer with Email,Telephone and change URL ends with contact-preference/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 3 should have a label Your email address an answer with abc@abc.com and change URL ends with your-email-address/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 4 should have a label Your telephone number an answer with 07777 777777 and change URL ends with your-telephone-number/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 5 should have a label Your address an answer with 2 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with your-address/lookup/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 6 should have a label Your date of birth an answer with 01 January 1980 and change URL ends with your-date-of-birth/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 7 should have a label Your main occupation an answer with Dentist and change URL ends with your-main-occupation/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 8 should have a label Do you have a National Insurance number? an answer with Yes, and I know my National Insurance number and change URL ends with have-national-insurance-number/change")
        // Possible match (best=0.57)
        givenIAmOnDoYouHaveANationalInsuranceNumberPage()

      And("line 9 should have a label Your National Insurance number an answer with AZ123456D and change URL ends with your-national-insurance-number/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 10 should have a label Are you registered for VAT? an answer with Yes, and I know my VAT registration number and change URL ends with registered-for-vat/change")
        // Possible match (best=0.54)
        givenIAmOnAreYouRegisteredForVATPage()

      And("line 11 should have a label Your VAT registration number an answer with 123456789 and change URL ends with your-vat-registration/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("line 12 should have a label Are you registered for Self Assessment? an answer with Yes, and I know my Unique Taxpayer Reference (UTR) and change URL ends with registered-for-self-assessment/change")
        // Possible match (best=0.58)
        givenIAmOnIsTheIndividualRegisteredForSelfAssessmentAsFarAsYouReAwarePageAsStringTaxPayer("")

      And("line 13 should have a label Your Unique Taxpayer Reference an answer with 1234567890 and change URL ends with your-utr/change")
        // Possible match (best=0.54)
        thenLineStringShouldHaveALabelStringAnAnswerWithStringAndChangeURLEndsWithString("", "", "", "")

      And("answers page should not have h2 header About the individual")
        // Possible match (best=0.61)
        thenAnswersPageShouldNotHaveH2HeaderString("")

      When("I click on send notification button")
        // Possible match (best=1.00)
        whenIClickOnSendNotificationButton()

      Then("page navigates to You have sent your notification")
        // Possible match (best=0.56)
        givenINavigateToStringPage("")

      And("the case reference should be CFSS-12345678")
        // Possible match (best=0.58)
        thenTheCaseReferenceShouldBeString("")

    }
  }
}
