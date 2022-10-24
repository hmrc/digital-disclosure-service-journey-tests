/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import io.cucumber.junit.Cucumber
import org.junit.runner.RunWith
import uk.gov.hmrc.pages.{AreYouTheIndividualPage, BasePage}


@RunWith(classOf[Cucumber])
class AreYouRepresentingOrganisationStepDef extends BasePage {

  Given("""I navigate to {string} page""") { (string: String) =>
    // Write code here that turns the phrase above into concrete actions
    navigateToSpecificPage("notification/"+string)
  }

}
