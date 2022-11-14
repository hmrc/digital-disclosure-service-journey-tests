/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import io.cucumber.datatable.DataTable
import uk.gov.hmrc.pages.{BasePage, CheckYourAnswersPage}

class CheckYourAnswersStepDef extends BasePage with CheckYourAnswersPage {

  Then("""answers page should have h2 header {string}""") { (string: String) =>
    verifyH2Header(string)
  }

  Then("""answers page should not have h2 header {string}""") { (string: String) =>
    verifyH2HeaderNotDisplayed(string)
  }
  Then("""line {string} should have a label {string} an answer with {string} and change URL ends with {string}""") { (string: String, string2: String, string3: String, string4: String) =>
    verifyAboutYouAnswers(string, string2, string3, string4)
  }

  Then("""label {string} is not displayed on check your answer page""") { (string: String) =>
    labelIsNotDisplayed(string)
  }

  Then("""About The Individual section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}""") { (string: String, string2: String, string3: String, string4: String) =>
    verifyAboutTheIndividualAnswers(string, string2, string3, string4)
  }

  Then("""About The Company section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}""") { (string: String, string2: String, string3: String, string4: String) =>
    verifyAboutTheCompanyAnswers(string, string2, string3, string4)
  }

  Then("""About The Trust section should have a label {string} at line {string} an answer with {string} and change URL ends with {string}""") { (string: String, string2: String, string3: String, string4: String) =>
    verifyAboutTheTrustAnswers(string, string2, string3, string4)
  }

  Then("""Background section has following""") { (dataTable: DataTable) =>
    verifyBackgroundAnswers(dataTable)
  }

  Then("""clicking on change button navigates as following:""") { (dataTable: DataTable) =>
    verifyChangeButtonNavigation(dataTable)
  }

  Then("""clicking on change button to validate changed value as following:""") { (dataTable: DataTable) =>
    validateChangedValue(dataTable)
  }

  Given("""I am on {string} page""") { (string: String) =>
    verifyPageHeading(string)
  }

  When("""I click on change button for {string}""") { (string: String) =>
    clickOnChangeButton(string)
  }

  Then("""country dropdown is empty""") { () =>
    verifyDropdownTextBoxIsEmpty()
  }

}
