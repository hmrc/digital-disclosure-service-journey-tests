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

package uk.gov.hmrc.pages

import org.junit.Assert
import org.openqa.selenium.WebElement
import uk.gov.hmrc.utils.Configuration

trait WhatIsYourDOBPage extends BasePage {

  val currentEnvironment: String = Configuration.environment.toString

  //locators for the page
  def day: WebElement = findByID("value.day")
  def month: WebElement = findByID("value.month")
  def year: WebElement = findByID("value.year")
  def disclosureYear: WebElement = findByID("years")
  def taxYear: WebElement = findByID("yearsThisAppliesTo")
  def income: WebElement = findByID("income")
  def chargeableTransfers: WebElement = findByID("chargeableTransfers")
  def capitalGains: WebElement = findByID("capitalGains")
  def unpaidTax: WebElement = findByID("unpaidTax")
  def interest: WebElement = findByID("interest")
  def penaltyRate: WebElement = findByID("penaltyRate")
  def nonBusinessIncome: WebElement = findByID("nonBusinessIncome")
  def lettingIncome: WebElement = findByID("lettingIncome")
  def penaltyRateReason: WebElement = findByID("penaltyRateReason")
  def gains: WebElement = findByID("gains")
  def niContributions: WebElement = findByID("niContributions")
  def undeclaredIncomeOrGain:WebElement = findByID("undeclaredIncomeOrGain")

  def isInputTextBoxDisplayed(textBoxName: String): Unit = {
    if (textBoxName == "Day") {
      Assert.assertTrue("Input Text Box is not displayed", day.isDisplayed.==(true))
    } else if (textBoxName == "Month") {
      Assert.assertTrue("Input Text Box is not displayed", month.isDisplayed.==(true))
    } else if (textBoxName == "Year") {
      Assert.assertTrue("Input Text Box is not displayed", year.isDisplayed.==(true))
    } else {
      Assert.assertTrue("Invalid text box name", false)
    }
  }

  def enterInputInDOBPage(text: String, textBoxName: String): Unit = {
    if (textBoxName == "Day") {
      day.clear()
      day.sendKeys(text)
    } else if (textBoxName == "Month") {
      month.clear()
      month.sendKeys(text)
    } else if (textBoxName == "Year") {
      year.clear()
      year.sendKeys(text)
    }
    else if (textBoxName == "Which tax years does this apply to?for not notifying HMRC") {
      disclosureYear.clear()
      disclosureYear.sendKeys(text)
    }
    else if (textBoxName == "Which tax years does this apply to?") {
      taxYear.clear()
      taxYear.sendKeys(text)
    } else if (textBoxName == "nonBusinessIncome") {
      nonBusinessIncome.clear()
      nonBusinessIncome.sendKeys(text)
    } else if (textBoxName == "lettingIncome") {
      lettingIncome.clear()
      lettingIncome.sendKeys(text)
    } else if (textBoxName == "income") {
      income.clear()
      income.sendKeys(text)
    } else if (textBoxName == "chargeableTransfers") {
      chargeableTransfers.clear()
      chargeableTransfers.sendKeys(text)
    } else if (textBoxName == "capitalGains") {
      capitalGains.clear()
      capitalGains.sendKeys(text)
    } else if (textBoxName == "unpaidTax") {
      unpaidTax.clear()
      unpaidTax.sendKeys(text)
    } else if (textBoxName == "interest") {
      interest.clear()
      interest.sendKeys(text)
    } else if (textBoxName == "penaltyRate") {
      penaltyRate.clear()
      penaltyRate.sendKeys(text)
    } else if (textBoxName == "penaltyRateReason") {
      penaltyRateReason.clear()
      penaltyRateReason.sendKeys(text)
    } else if (textBoxName == "gains") {
      gains.clear()
      gains.sendKeys(text)
    } else if (textBoxName == "niContributions") {
      niContributions.clear()
      niContributions.sendKeys(text)
    } else if (textBoxName == "undeclaredIncomeOrGain") {
      undeclaredIncomeOrGain.sendKeys(text)
    }
    else {
      Assert.assertTrue("Invalid text box name", false)
    }
  }
}