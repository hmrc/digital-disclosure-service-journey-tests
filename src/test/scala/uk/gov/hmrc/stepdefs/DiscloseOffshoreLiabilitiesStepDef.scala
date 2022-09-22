/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs
import uk.gov.hmrc.pages.{BasePage, DiscloseOffshoreLiabilitiesPage}

class DiscloseOffshoreLiabilitiesStepDef extends BasePage with DiscloseOffshoreLiabilitiesPage {

  Given("""I am on Do you want to disclose offshore liabilities Page""") { () =>
    navigateToSpecificPage("notification/disclose-offshore-liabilities")
  }

  Given ("""I am on Are you the individual this disclosure relates to Page""") { () =>
    navigateToSpecificPage("notification/are-you-the-individual")
  }

  Then("""Heading with text {string} is displayed""") { (string: String) =>
    verifyPageHeading(string)
  }

  Then("""Body Text {string} is displayed""") { (string: String) =>
    verifyBodyText(string)
  }

  Then("""Bullet Text {string} is displayed at position {string}""") { (string: String,positionNum:String) =>
    verifyBulletText(string,positionNum)
  }

  Then("""Text {string} is displayed""") { (string: String) =>
    verifyText(string)
  }

  Then("""Hyperlink with text {string} is displayed""") { (string: String) =>
    verifyHyperlinkText(string)
  }

  When("""click on Hyperlink {string}""") { (string: String) =>
    clickOnHyperlinkText(string)
  }

  When("""I select Radio Button {string} at Position {string}""") { (string: String, positionNum: String) =>
    clickOnRadioButton(string,positionNum)
  }

  Then("""Page navigates to {string} in new tab""") { (string: String) =>
    verifyNewTabUrl(string)
  }

  Then("""Radio Button with text {string} is displayed at position {string}""") { (string: String, positionNum: String) =>
    verifyRadioButtonAndText(string, positionNum)
  }

  Then("""Page navigates to {string}""") { (string: String) =>
    verifyPageHeading(string)
  }

  Then("""I should navigate to Radio button {string} at Position {string}""") { (string: String, positionNum: String) =>
    verifyFocusOnRadioButton(string,positionNum)
  }
}