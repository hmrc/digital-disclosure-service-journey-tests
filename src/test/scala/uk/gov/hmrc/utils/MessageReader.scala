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

package uk.gov.hmrc.utils

import java.io.FileInputStream
import java.util.PropertyResourceBundle

object MessageReader {
  val messageResource = {

    lazy val message = new FileInputStream("./src/test/resources/keys/page_element_identifiers")

    try {
      new PropertyResourceBundle(message)
    } finally {
      message.close()
    }
  }
  val pageTitleResource = {

    lazy val message = new FileInputStream("./src/test/resources/keys/page_titles.properties")

    try {
      new PropertyResourceBundle(message)
    } finally {
      message.close()
    }
  }

  def getElement(key: String) = {
    val modifiedKey = key.toLowerCase.replaceFirst("'", "").replaceAll(" +", "_")
    messageResource.getString(modifiedKey)
  }

  def getPageTitles(key: String) = {
    val modifiedKey = key.toLowerCase.replaceFirst("'", "").replaceAll(" +", "_")
    pageTitleResource.getString(modifiedKey)
  }

}
