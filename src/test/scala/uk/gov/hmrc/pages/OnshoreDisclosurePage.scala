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

import org.openqa.selenium.WebElement

trait OnshoreDisclosurePage extends BasePage {

  def valuewhatHasHappenedToPropertyTextArea: WebElement = findByID("whatHasHappenedToProperty")

  def stopDay: WebElement = findByID("stopDate.day")

  def stopMonth: WebElement = findByID("stopDate.month")

  def stopYear: WebElement = findByID("stopDate.year")

  def enterValueInStopDay(text: String): Unit = {
    stopDay.sendKeys(text)
  }

  def enterValueInStopYear(text: String): Unit = {
    stopYear.sendKeys(text)
  }

  def enterValueInStopMonth(text: String): Unit = {
    stopMonth.sendKeys(text)
  }

  def enterValueInwhatHasHappenedToPropertyTextArea(text: String): Unit = {
    valuewhatHasHappenedToPropertyTextArea.sendKeys(text)
  }
}
