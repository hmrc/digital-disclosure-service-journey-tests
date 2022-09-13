/*
 * Copyright 2022 HM Revenue & Customs
 *
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
