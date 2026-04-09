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

// DONE
package uk.gov.hmrc.specs

import uk.gov.hmrc.specsteps.CaseManagementStepDefSteps.{andIClickTheEditLinkWithinTheCaseTable, andOnTheHomepageIClickContinueToNavigateToTheXPage, andVerifyOnTheXPage, givenTheValuesWithinTheDatatableAreVerified, thenOnTheXPageIClickReturnToViewEditOrCreateACase, thenOnTheXPageIClickXAndClickSaveAndContinue, thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue, thenOnTheXPageISelectXAndClickSaveAndContinue, whenClickOnSubmitOnWizardPage, whenISelectCreateANewCase, whenOnTheXPageIClickOnTheHeaderHyperlink, whenSelectStringFromAffinityGroupDropDown, whenSelectStringFromConfidenceLevelDropDown}
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{clickOnContinue, givenINavigateToAuthorityWizardPage}


class CaseManagementSpec extends BaseSpec {

  Feature("An agent is able to edit and create case") {

    Scenario("Case validation - Edit and create a new case") {
      Given("I navigate to authority wizard page")
        givenINavigateToAuthorityWizardPage()

      When("select Agent from affinityGroup drop down")
        whenSelectStringFromAffinityGroupDropDown("Agent")

      And("select 250 from confidenceLevel drop down")
        whenSelectStringFromConfidenceLevelDropDown("250")

      And("click on submit on wizard page")
        whenClickOnSubmitOnWizardPage()

      And("I click on continue button")
        clickOnContinue()

      Then("on the UsingThisService page I click Make a notification first and click save and continue")
        thenOnTheXPageIClickXAndClickSaveAndContinue("UsingThisService", "Make a notification first")

      Then("on the WillYouBeMakingADisclosure page I select Yes and click save and continue")
        thenOnTheXPageISelectXAndClickSaveAndContinue("WillYouBeMakingADisclosure", "Yes")

      Then("on the CaseReferenceNumber page I enter the CRN into the textbox and click save and continue")
        thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue("CaseReferenceNumber", "the CRN")

      Then("on the DisclosureAbout page I select An Individual and click save and continue")
        thenOnTheXPageISelectXAndClickSaveAndContinue("DisclosureAbout", "An Individual")

      Then("on the AreYouTheEntity page I select Yes, I am the individual and click save and continue")
        thenOnTheXPageISelectXAndClickSaveAndContinue("AreYouTheEntity", "Yes, I am the individual")

      Then("on the OffshoreLiabilities page I select Yes and click save and continue")
        thenOnTheXPageISelectXAndClickSaveAndContinue("OffshoreLiabilities", "Yes")

      Then("on the OnshoreLiabilities page I select No and click save and continue")
        thenOnTheXPageISelectXAndClickSaveAndContinue("OnshoreLiabilities", "No")

      When("on the WhereDidTheIncomeComeFrom page I click on the header hyperlink")
        whenOnTheXPageIClickOnTheHeaderHyperlink("WhereDidTheIncomeComeFrom")

      And("on the homepage I click continue to navigate to the ViewEditCreateCase page")
        andOnTheHomepageIClickContinueToNavigateToTheXPage("ViewEditCreateCase")

      Then("the values within the datatable are verified")
        givenTheValuesWithinTheDatatableAreVerified()

      And("I click the Edit link within the case table")
        andIClickTheEditLinkWithinTheCaseTable()

      Then("on the YouHaveStartedNotification page I click Continue or edit this notification and click save and continue")
        thenOnTheXPageIClickXAndClickSaveAndContinue("YouHaveStartedNotification", "Continue or edit this notification")

      And("on the WillYouBeMakingADisclosure page I click on the header hyperlink")
        whenOnTheXPageIClickOnTheHeaderHyperlink("WillYouBeMakingADisclosure")

      And("on the homepage I click continue to navigate to the ViewEditCreateCase page")
        andOnTheHomepageIClickContinueToNavigateToTheXPage("ViewEditCreateCase")

      And("I select create a new case")
        whenISelectCreateANewCase()

      Then("on the UsingThisService page I click Make a notification first and click save and continue")
        thenOnTheXPageIClickXAndClickSaveAndContinue("UsingThisService", "Make a notification first")

      Then("on the WillYouBeMakingADisclosure page I select Yes and click save and continue")
        thenOnTheXPageISelectXAndClickSaveAndContinue("WillYouBeMakingADisclosure", "Yes")

      Then("on the CaseReferenceNumber page I enter the CRN into the textbox and click save and continue")
        thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue("CaseReferenceNumber", "the CRN")

      Then("on the DisclosureAbout page I select An Estate and click save and continue")
        thenOnTheXPageISelectXAndClickSaveAndContinue("DisclosureAbout", "An Estate")

      Then("on the AreYouTheEntity page I select Yes, I am the executor or administrator and click save and continue")
        thenOnTheXPageISelectXAndClickSaveAndContinue("AreYouTheEntity", "Yes, I am the executor or administrator")

      Then("on the OffshoreLiabilities page I select Yes and click save and continue")
        thenOnTheXPageISelectXAndClickSaveAndContinue("OffshoreLiabilities", "Yes")

      Then("on the OnshoreLiabilities page I select Yes and click save and continue")
        thenOnTheXPageISelectXAndClickSaveAndContinue("OnshoreLiabilities", "Yes")

      Then("on the WhereDidTheIncomeComeFrom page I select Other capital gains and click save and continue")
        thenOnTheXPageISelectXAndClickSaveAndContinue("WhereDidTheIncomeComeFrom", "Other capital gains")

      Then("on the NameOfIndividual page I enter Estate Person into the textbox and click save and continue")
        thenOnTheXPageIEnterXIntoTheTextboxAndClickSaveAndContinue("NameOfIndividual", "Estate Person")

      And("on the IndividualDob page I click on the header hyperlink")
        whenOnTheXPageIClickOnTheHeaderHyperlink("IndividualDob")

      And("on the homepage I click continue to navigate to the ViewEditCreateCase page")
        andOnTheHomepageIClickContinueToNavigateToTheXPage("ViewEditCreateCase")

      Then("the values within the datatable are verified")
        givenTheValuesWithinTheDatatableAreVerified()

      And("I click the Edit link within the case table")
        andIClickTheEditLinkWithinTheCaseTable()

      Then("on the YouHaveStartedNotification page I click Make a disclosure and click save and continue")
        thenOnTheXPageIClickXAndClickSaveAndContinue("YouHaveStartedNotification", "Make a disclosure")

      Then("on the ListOfTasks page I click Return to view, edit or create a case")
        thenOnTheXPageIClickReturnToViewEditOrCreateACase("ListOfTasks")

      And("verify on the ViewEditCreateCase page")
        andVerifyOnTheXPage("ViewEditCreateCase")
    }
  }
}
