/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import uk.gov.hmrc.pages.{AreYouTheIndividualPage, BasePage}


@RunWith(classOf[Cucumber])
class AreYouTheIndividualStepDef extends BasePage with AreYouTheIndividualPage {

  Given("""I am navigated to Are you the individual this disclosure relates to Page""") { () =>
    // Write code here that turns the phrase above into concrete actions
    navigateToSpecificPage("notification/what-is-this-disclosure-about")
    clickOnRadioButton("An individual","1")
    saveAndContinue()

  }

  Then("""verify that Yes and No radio options are selected by default""") { () =>
    // Write code here that turns the phrase above into concrete actions
    verifyNoRadioSelected()
  }

  When("""I select {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    selectOption(string)
  }

  Then("""option still selected is {string}""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    isSelected(string)
  }

}
