/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage,WhatIsTheCountryOfAddressPage}

class WhatIsTheCountryOfYourAddressStepDef extends BasePage with WhatIsTheCountryOfAddressPage {

  Given("""I am on What is the country of your address Page""") { () =>
    navigateToSpecificURL("http://localhost:9028/lookup-address/a16928b5-a942-4b93-bbc5-c56ed0b864c0/country-picker")
  }

  When("""enter country name {string},dropdown is displayed""") { (string:String) =>
    enterInputInTextBox(string)
    verifyDropdownDisplayed()
  }

  When("""enter country name {string},select country {string}""") { (inputString: String,stringToSelect: String ) =>
    enterInputInTextBox(inputString)
    selectfromDropdown(stringToSelect)
  }

  When("""enter postcode {string}""") { (string: String) =>
    enterInputInTextBox(string)
  }

  When("""enter Property name as {string}""") { (string: String) =>
    enterPropertyInput(string)
  }

  When("""enter Property number as {string}""") { (string: String) =>
    enterPropertyInput(string)
  }

  When("""address at line {string} is {string}""") { (linePosition: String,string: String) =>
    verifyAddress(linePosition,string)
  }

  When("""click on Try a Different Postcode""") { () =>
    saveAndContinue()
  }

  When("""click on continue button""") { () =>
    saveAndContinue()
  }

  Then("""Continue Button displayed""") { () =>
    isSaveAndContinueButtonDisplayed()
  }

  Then("""hyperlink of {string} is displayed""") { (string:String) =>
    verifyAddressHyperlink(string)
  }

  Then("""shows message {string}""") { (string:String) =>
    verifyMessage(string)
  }

  Then("""list of matching option is displayed""") { () =>
    verifyRadioButtonAndTextNotSelected()
  }

  Then("""focus navigates TextBox field""") { () =>
    verifyFocusOnTextbox()
  }
}
