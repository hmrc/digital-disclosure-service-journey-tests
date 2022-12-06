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

import io.cucumber.scala.{EN, PendingException, ScalaDsl}
import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import uk.gov.hmrc.pages.{BasePage, HomePage}

@RunWith(classOf[Cucumber])
class HomePageStepDef extends BasePage with HomePage {

  Given("""I am on the Home page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    navigateToHomePage()
  }

  Then("""the page title should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageTitle(string)
  }

  Then("""first heading should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageHeaderH1(string)
  }

  Then("""first paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphOne(string)
  }

  Then("""second paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphTwo(string)
  }

  Then("""third paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphThree(string)
  }

  Then("""second heading should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageHeaderH2(string)
  }

  Then("""fourth paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphFour(string)
  }

  Then("""fifth paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphFive(string)
  }


  Then("""third heading should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyPageHeaderH3(string)
  }


  Then("""sixth paragraph should be {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyParagraphSix(string)
  }

  When("""I click on continue button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    clickOnContinue()
  }

  When("""I click on the hyperlink with text {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    clickOnLink(string)
  }

  Then("""I am navigated to new tab with page title {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    verifyNewTabTitleAndCloseTab(string)
  }

  Then("""I am navigated to page with title {string}""") { (string: String) =>
    verifyPageTitle(string)
  }

  When ("""I select {string} from drop down {string}""") { (valueToSelect: String, dropDownID: String) =>
    selectValueFromDropdown(valueToSelect, dropDownID)
  }

  Given("""I navigate to authority wizard page""") { () =>
    navigateToBaseUrl()
  }

  When("""enter NINO {string}""") { (string: String) =>
    enterNINOInput(string)
  }

  When("""click on submit button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    submit()
  }
}