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

package uk.gov.hmrc.specsteps

import uk.gov.hmrc.specpage.{BasePage, OffshoreDisclosurePage, OnshoreDisclosurePage}

object OnshoreDisclosureStepDefSteps extends BasePage with OffshoreDisclosurePage with OnshoreDisclosurePage {

  // I enter {string} in stop day text box field
  def whenIEnterStringInStopDayTextBoxField(string: String): Unit = {
    enterValueInStopDay(string)
  }

  // I enter {string} in stop month text box field
  def whenIEnterStringInStopMonthTextBoxField(string: String): Unit = {
    enterValueInStopMonth(string)
  }

  // I enter {string} in stop year text box field
  def whenIEnterStringInStopYearTextBoxField(string: String): Unit = {
    enterValueInStopYear(string)
  }

  // I enter {string} in whatHasHappenedToProperty text box field
  def whenIEnterStringInWhatHasHappenedToPropertyTextBoxField(string: String): Unit = {
    enterValueInwhatHasHappenedToPropertyTextArea(string)
  }

  // I enter {string} in yearNotSelected text box field
  def whenIEnterStringInYearNotSelectedTextBoxField(string: String): Unit = {
    enterTextInDescription(string)
  }

  // I enter {string} in percentage text box field
  def whenIEnterStringInPercentageTextBoxField(string: String): Unit = {
    enterTextInDescription(string)
  }

  // I enter {string} in typeOfMortage text box field
  def whenIEnterStringInTypeOfMortageTextBoxField(string: String): Unit = {
    enterTextInDescription(string)
  }

  // I enter {string} in landloard association text box field
  def whenIEnterStringInLandloardAssociationTextBoxField(string: String): Unit = {
    enterTextInDescription(string)
  }

  // I enter {string} in property count text box field
  def whenIEnterStringInPropertyCountTextBoxField(string: String): Unit = {
    enterTextInDescription(string)
  }

  // I enter {string} in tax owed reason text box field
  def whenIEnterStringInTaxOwedReasonTextBoxField(string: String): Unit = {
    enterTextInDescription(string)
  }

}
