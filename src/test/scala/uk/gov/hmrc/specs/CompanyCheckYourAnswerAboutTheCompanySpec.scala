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

// DONE
package uk.gov.hmrc.specs

import uk.gov.hmrc.specsteps.CheckYourAnswersStepDefSteps.{thenAnswersPageShouldHaveH2HeaderString, thenBackgroundSectionHasFollowing, verifyAboutTheCompanyAnswers, verifyAboutYouAnswers}
import uk.gov.hmrc.specsteps.DiscloseOffshoreLiabilitiesStepDefSteps.whenISelectRadioButtonStringAtPositionString
import uk.gov.hmrc.specsteps.HomePageStepDefSteps.{SendNotification, clickOnCheckBox, clickOnLink, clickOnRadioButton, enterInputInTextBox, saveAndContinue, verifyH2Header, verifyPageHeading, verifySubmittedCaseRef}
import uk.gov.hmrc.specsteps.InternationalAddressStepDefSteps.{enterInputInManualAddressPage, selectfromDropdown}
import uk.gov.hmrc.specsteps.ReceivedALetterStepDefSteps.givenIAmNavigatedToReceivedALetterPage
import org.scalatest.prop.TableDrivenPropertyChecks._

class CompanyCheckYourAnswerAboutTheCompanySpec extends BaseSpec {

  Feature("A company tax payer is able to check their answers for About the Company section before submitting page") {

    val backgroundRows =
      Table(
        ("lineNo", "label", "answer", "url"),
        ("1", "Will you be making a disclosure because you received a letter from HMRC?", "Yes", "letter-from-hmrc/change"),
        ("2", "Case reference", "CFSS-1234567", "hmrc-letter-reference/change"),
        ("3", "Who this disclosure is for", "A company", "what-is-this-disclosure-about/change"),
        ("4", "Are you an officer of the company that the disclosure will be about?", "I am an accountant or tax agent", "are-you-the-entity/change"),
        ("5", "Are you representing an organisation?", "Yes", "representing-organisation/change"),
        ("6", "Name of the organisation you represent", "Organization name", "representing-organisation-name/change"),
        ("7", "The disclosure will be about", "Offshore and onshore liabilities", "disclose-offshore-liabilities/change")
      )

    Scenario("About the company - CYA - Send notification") {
      Given("I am navigated to Received A Letter Page")
        givenIAmNavigatedToReceivedALetterPage()

      Then("I select Radio Button Yes at Position 1")
        whenISelectRadioButtonStringAtPositionString("Yes","1")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I enter CFSS-1234567" in the TextBox field""")
        enterInputInTextBox("CFSS-1234567")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I select Radio Button A company at Position 3""")
        clickOnRadioButton("A company","3")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I select Radio Button I am an accountant or tax agent at Position 2""")
        clickOnRadioButton("I am an accountant or tax agent","2")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I select Radio Button Yes at Position 1""")
        clickOnRadioButton("Yes","1")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""And I enter Organization name in the TextBox field""")
        enterInputInTextBox("Organization name")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I select Radio Button Yes at Position 1""")
        clickOnRadioButton("Yes","1")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I select Radio Button Yes at Position 1""")
        clickOnRadioButton("Yes","1")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""And I select Checkbox Self-employment income" at Position 5""")
        clickOnCheckBox("Self-employment income", "5")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I enter Company name in the TextBox field""")
        enterInputInTextBox("Company name")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I enter 12345678 in the TextBox field""")
        enterInputInTextBox("12345678")

      And("""click on Save and Continue button""")
        saveAndContinue()

      When("""And enter country name United Kingdom, then select country United Kingdom""")
        enterInputInTextBox("United Kingdom")
        selectfromDropdown("United Kingdom")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""And I click on the hyperlink with text Enter the address manually""")
        clickOnLink("Enter the address manually")

      And("""I enter The Farm in the Address line 1 field""")
        enterInputInManualAddressPage("The Farm", "Address line 1")

      And("""I enter Royal Madeuptown in the Town or city field""")
        enterInputInManualAddressPage("Royal Madeuptown", "Town or city")

      And("""I enter ZZ9Z 9TT in the Postcode field""")
        enterInputInManualAddressPage("ZZ9Z 9TT", "Postcode")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""click on confirm button""")
        saveAndContinue()

      Then("""I enter Agent full name in the TextBox field""")
        enterInputInTextBox("Agent full name")

      And("""click on Save and Continue button""")
        saveAndContinue()

      When("""I select Checkbox Email at Position 1""")
        clickOnCheckBox("Email", "1")

      Then("""I select Checkbox Telephone at Position 2""")
        clickOnCheckBox("Telephone", "2")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I enter abc@abc.com in the TextBox field""")
        enterInputInTextBox("abc@abc.com")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""I enter 07777 777777 in the TextBox field""")
        enterInputInTextBox("07777 777777")

      And("""click on Save and Continue button""")
        saveAndContinue()

      When("""enter country name United Kingdom, then select country United Kingdom""")
        enterInputInTextBox("United Kingdom")
        selectfromDropdown("United Kingdom")

      And("""click on Save and Continue button""")
        saveAndContinue()

      When("""I click on the hyperlink with text Enter the address manually """)
        clickOnLink("Enter the address manually")

      Then("""I enter 1 Testing Lane in the Address line 1 field""")
        enterInputInManualAddressPage("1 Testing Lane", "Address line 1")

      And("""I enter Royal Madeuptown in the Town or city field""")
        enterInputInManualAddressPage("Royal Madeuptown", "Town or city")

      And("""I enter ZZ9Z 9TT in the Postcode field""")
        enterInputInManualAddressPage("ZZ9Z 9TT", "Postcode")

      And("""click on Save and Continue button""")
        saveAndContinue()

      Then("""click on confirm button""")
        saveAndContinue()

      When("I am on Check Your Answers page")
        verifyPageHeading("Check Your Answers")

      And("answers page should have h2 header Background")
        verifyH2Header("Background")

      And("Background section has following")
      thenBackgroundSectionHasFollowing(backgroundRows)

      And("answers page should have h2 header About you")
        thenAnswersPageShouldHaveH2HeaderString("")

      And("line 1 should have a label Your full name an answer with Agent full name and change URL ends with your-full-name/change")
        verifyAboutYouAnswers("1", "Your full name", "Agent full name", "your-full-name/change")

      And("line 2 should have a label Your contact preference an answer with Email,Telephone and change URL ends with contact-preference/change")
       verifyAboutYouAnswers("2", "Your contact preference", "Email,Telephone", "contact-preference/change")

      And("line 3 should have a label Your email address an answer with abc@abc.com and change URL ends with your-email-address/change")
        verifyAboutYouAnswers("3", "Your email address", "abc@abc.com", "your-email-address/change")

      And("line 4 should have a label Your telephone number an answer with 07777 777777 and change URL ends with your-telephone-number/change")
       verifyAboutYouAnswers("4", "Your telephone number", "07777 777777", "your-telephone-number/change")

      And("line 5 should have a label Your address an answer with 1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with your-address/lookup/change")
        verifyAboutYouAnswers("5", "Your address", "1 Testing Lane,Royal Madeuptown,ZZ9Z 9TT,United Kingdom", "your-address/lookup/change")

      Then("answers page should have h2 header About the company")
       verifyH2Header("About the company")

      And("About The Company section should have a label Company’s name at line 1 an answer with Company name and change URL ends with company-name/change")
        verifyAboutTheCompanyAnswers("Company’s name", "1", "Company name", "company-name/change")

      And("About The Company section should have a label Company registration number at line 2 an answer with 12345678 and change URL ends with company-registration/change")
       verifyAboutTheCompanyAnswers("Company registration number", "2", "12345678", "company-registration/change")

      And("About The Company section should have a label Company’s address at line 3 an answer with The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom and change URL ends with company-address/lookup/change")
       verifyAboutTheCompanyAnswers("Company’s address", "3", "The Farm,Royal Madeuptown,ZZ9Z 9TT,United Kingdom", "company-address/lookup/change")

      When("I click on send notification button")
       SendNotification()

      Then("page navigates to You have sent the notification")
        verifyPageHeading("You have sent the notification")

      And("the case reference should be CFSS-1234567")
       verifySubmittedCaseRef("CFSS-1234567")
    }
  }
}
