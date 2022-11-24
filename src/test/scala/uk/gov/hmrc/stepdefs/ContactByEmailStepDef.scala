/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs
import uk.gov.hmrc.pages.{BasePage, ContactByEmailPage}

class ContactByEmailStepDef extends BasePage with ContactByEmailPage {
  Given("""I am on Do you have an email address that you are happy to be contacted on by HMRC Page""") { () =>
    navigateToSpecificPage("notification/contact-by-email")
  }
}