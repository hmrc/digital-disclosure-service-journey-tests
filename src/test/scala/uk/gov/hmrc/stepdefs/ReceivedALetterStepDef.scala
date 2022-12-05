/*
 * Copyright 2022 HM Revenue & Customs
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

package uk.gov.hmrc.stepdefs
import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import uk.gov.hmrc.pages.{BasePage, ReceivedALetterPage}



@RunWith(classOf[Cucumber])
class ReceivedALetterStepDef extends BasePage with ReceivedALetterPage {
  Given("""^I am navigated to Received A Letter Page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    navigateToSpecificPage("")
  }

  When("""the page is loaded successfully and verifies the page title is {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageTitle(string)
  }

  Then("""verify the question should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageQuestion(string)
  }

  Then("""verify both the radio buttons are not selected""") { () =>
    // Write code here that turns the phrase above into concrete actions
    verifyYesNoAreNotSelected()
  }

  When("""I select Yes radio button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    selectYes()
  }

  When("""click on Save and Continue button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    saveAndContinue()
  }

  Then("""I am navigated to the next page with title {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageTitle(string)
  }

  When("""I click on Back button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    clickOnBack()
  }

  Then("""I am navigated back to Received A letter page with title {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageTitle(string)
  }

  Then("""verify that Yes radio option is still selected""") { () =>
      // Write code here that turns the phrase above into concrete actions
    yesIsSelected()
  }

  Then("""I select No radio button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    selectNo()
  }

}
