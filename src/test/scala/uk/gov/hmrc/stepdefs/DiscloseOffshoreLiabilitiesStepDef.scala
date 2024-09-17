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
import org.openqa.selenium.By
import org.openqa.selenium.support.ui.ExpectedConditions
import uk.gov.hmrc.pages.{BasePage, DiscloseOffshoreLiabilitiesPage}

class DiscloseOffshoreLiabilitiesStepDef extends BasePage with DiscloseOffshoreLiabilitiesPage {

  Given("""I am on Do you want to disclose offshore liabilities Page""") { () =>
    navigateToSpecificPage("notification/disclose-offshore-liabilities")
  }

  Given ("""I am on Are you the individual that the disclosure will be about? Page""") { () =>
    navigateToSpecificPage("notification/are-you-the-entity")
  }

  Then("""heading with text {string} is displayed""") { (string: String) =>
    verifyPageHeading(string)
  }

  Then("""sub heading with text {string} is displayed""") { (string: String) =>
    verifySubPageHeading(string)
  }

  Then("""body Text {string} is displayed""") { (string: String) =>
    verifyBodyText(string)
  }

  Then("""bullet Text {string} is displayed at position {string}""") { (string: String,positionNum:String) =>
    verifyBulletText(string,positionNum)
  }

  Then("""text {string} is displayed""") { (string: String) =>
    verifyText(string)
  }

  Then("""bullet text hyperlink with text {string} is displayed""") { (string: String) =>
    verifyBulletListHyperlinkText(string)
  }
  Then("""hyperlink with text {string} is displayed""") { (string: String) =>
    verifyHyperlinkText(string)
  }


  When("""click on Hyperlink {string}""") { (string: String) =>
    clickOnHyperlinkText(string)
  }

  When("""I select Radio Button {string} at Position {string}""") { (string: String, positionNum: String) =>
    waitFor(ExpectedConditions.elementToBeClickable(By.className("govuk-radios__item")))
    clickOnRadioButton(string,positionNum)
  }

  When("""I select Checkbox {string} at Position {string}""") { (string: String, positionNum: String) =>
    waitFor(ExpectedConditions.elementToBeClickable(By.className("govuk-checkboxes__item")))
    clickOnCheckBox(string, positionNum)
  }

  Then("""page navigates to {string} in new tab""") { (string: String) =>
    verifyNewTabUrl(string)
  }

  Then("""radio Button with text {string} is displayed at position {string}""") { (string: String, positionNum: String) =>
    verifyRadioButtonAndText(string, positionNum)
  }

  Then("""verify that radio options are not selected by default""") { () =>
    verifyRadioButtonAndTextNotSelected()
  }

  Then("""page navigates to {string}""") { (string: String) =>
    verifyPageHeading(string)
  }

  Then("""page heading contains {string}""") { (heading: String) =>
    verifyPageHeadingContains(heading)
  }

  Then("""I should navigate to Radio button {string} at Position {string}""") { (string: String, positionNum: String) =>
    verifyFocusOnRadioButton(string,positionNum)
  }

  When("""click on I confirm button""") { () =>
    iConfirmButton()
  }
}