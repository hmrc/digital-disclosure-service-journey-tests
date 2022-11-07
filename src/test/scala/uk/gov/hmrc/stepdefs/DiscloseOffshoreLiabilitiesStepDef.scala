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
    clickOnRadioButton(string,positionNum)
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

  Then("""I should navigate to Radio button {string} at Position {string}""") { (string: String, positionNum: String) =>
    verifyFocusOnRadioButton(string,positionNum)
  }
}