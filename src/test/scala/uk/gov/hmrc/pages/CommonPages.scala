/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import io.cucumber.datatable.DataTable

import scala.jdk.CollectionConverters.asScalaBufferConverter

trait CommonPages extends SearchPage with ResultPage {


  def customersDataPresent(dataTable: DataTable) {
    dataTable.asMaps[String, String](classOf[String], classOf[String]).asScala.foreach(data => {

      val field: String = data.get("FieldValue")
      val expectedValue: String = data.get("ExpectedValue")
      if (expectedValue == null) {
      } else {
        val actualValue: String = findByElement(field).getText
        assert(expectedValue == actualValue)
      }
    })
  }

  def previousStatus(realNumber: Int, data: String) {
    var number = realNumber
    number -= 1

    val expectedValue: String = data
    val actualValue: String = findByID("status-previous-" + number.toString).getText
    assert(expectedValue == actualValue)
  }

  def previousDates(realNumber: Int, startDate:String,endDate: String): Any = {
    var number = realNumber
    number -= 1

    val expectedStartDateValue: String = startDate
    val expectedEndDateValue: String = endDate

    val actualStartDateValue: String = findByID("startDate-previous-" + number.toString).getText
    assert(expectedStartDateValue == actualStartDateValue)

    val actualEndDateValue: String = findByID("expiryDate-previous-" + number.toString).getText
    assert(actualEndDateValue == expectedEndDateValue)
  }
}
