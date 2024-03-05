/*
 * Copyright 2023 HM Revenue & Customs
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
import uk.gov.hmrc.pages.{BasePage, LoginPage}

@RunWith(classOf[Cucumber])
class IndividualSubmission extends BasePage with LoginPage {
  Given("""^User login with his government gateway id""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("Given User login with his government gateway id")
    login()
  }

  And("""the HMRC username is displayed on welcome page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("And the HMRC username is displayed on welcome page")
  }

  And("""user clicks on submit new disclosure service""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("And user clicks on submit new disclosure service")
  }

  When("""the user enters all below mandatory customer details on the customer search page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("When the user enters all below mandatory customer details on the customer search page")

  }

  And("""the HMRC user clicks on next button""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("And user clicks on submit new disclosure service")
  }

  Then("""the HMRC user will be presented with more details page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    println("Then the HMRC user will be presented with more details page")
  }
}

