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

import uk.gov.hmrc.pages.{BasePage, HomePage}

object HomePageStepDefSteps extends BasePage with HomePage {

  // I am on the Home page
  def ThenIAmOnTheHomePage(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        navigateToHomePage()
  }

  // the page title should be {string}
  def thenThePageTitleShouldBeString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyPageTitle(string)
  }

  // first heading should be {string}
  def thenFirstHeadingShouldBeString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyPageHeaderH1(string)
  }

  // first paragraph should be {string}
  def thenFirstParagraphShouldBeString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyParagraphOne(string)
  }

  // second paragraph should be {string}
  def thenSecondParagraphShouldBeString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyParagraphTwo(string)
  }

  // third paragraph should be {string}
  def thenThirdParagraphShouldBeString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyParagraphThree(string)
  }

  // second heading should be {string}
  def thenSecondHeadingShouldBeString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyPageHeaderH2(string)
  }

  // fourth paragraph should be {string}
  def thenFourthParagraphShouldBeString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyParagraphFour(string)
  }

  // fifth paragraph should be {string}
  def thenFifthParagraphShouldBeString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyParagraphFive(string)
  }

  // third heading should be {string}
  def thenThirdHeadingShouldBeString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyPageHeaderH3(string)
  }

  // sixth paragraph should be {string}
  def thenSixthParagraphShouldBeString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyParagraphSix(string)
  }

  // seventh paragraph should be {string}
  def thenSeventhParagraphShouldBeString(string: String): Unit = {
    verifyParagraphSeven(string)
  }

  // I click on continue button
  def whenIClickOnContinueButton(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        clickOnContinue()
  }

  // I click on the hyperlink with text {string}
  def whenIClickOnTheHyperlinkWithTextString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        clickOnLink(string)
  }

  // I am navigated to new tab with page title {string}
  def thenIAmNavigatedToNewTabWithPageTitleString(string: String): Unit = {
    // Write code here that turns the phrase above into concrete actions
        verifyNewTabTitleAndCloseTab(string)
  }

  // I am navigated to page with title {string}
  def thenIAmNavigatedToPageWithTitleString(string: String): Unit = {
    verifyPageTitle(string)
  }

  // I select {string} from drop down {string}
  def whenISelectStringFromDropDownString(valueToSelect: String, dropDownID: String): Unit = {
    selectValueFromDropdown(valueToSelect, dropDownID)
  }

  // I navigate to authority wizard page
  def givenINavigateToAuthorityWizardPage(): Unit = {
    navigateToBaseUrl()
  }

  // enter NINO {string}
  def whenEnterNINOString(string: String): Unit = {
    enterNINOInput(string)
  }

  // click on submit button
  def whenClickOnSubmitButton(): Unit = {
    // Write code here that turns the phrase above into concrete actions
        submit()
  }

}
