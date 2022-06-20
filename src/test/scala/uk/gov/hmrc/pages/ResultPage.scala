/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import org.openqa.selenium.WebElement
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper
import uk.gov.hmrc.utils.Configuration


trait ResultPage extends SearchPage  {

  override lazy val url: String = Configuration.settings.SIGN_IN_PAGE

  def unavailableResultheader: WebElement = findByElement("title")

  def resultFoundHeader: WebElement = findByElement("Status found title")

  def noResultFoundHeader: WebElement = findByElement("Status check failure  title")

  def noActiveResultFoundHeader: WebElement = findByElement("Status not available title")

  def recourseIsNo: WebElement = findByElement("recourse is no")

  def zambranoWarning: WebElement = findByElement("zambrano warning")

  def immigrationRoute: WebElement = findByElement("immigration Route")

  def recourseWarning: WebElement = findByElement("recourse warning")

  def pastInformation: WebElement = findByclassName("past information")

  def firstmessage: WebElement = findByElement("firstmessage")

  def searchagainBtn: WebElement = findByElement("Search again")

  def previous_status: WebElement = findByElement("previous_status")

  def displayresult_details(): Unit = {
    resultFoundHeader.isDisplayed
  }

  def displayresult_inactive_status(): Unit = {
    noActiveResultFoundHeader.isDisplayed
  }

  def checkinstructions_no_match_found(): Unit = {
    noResultFoundHeader.getText shouldBe "A match has not been found"

  }

  def displayresult_no_unique_match_found(): Unit = {
    findByElement("status_check_failure_conflict_title").isDisplayed
  }

  def displayresult_service_unavailable() {
    unavailableResultheader.isDisplayed
  }

  def immigrationRouteDetails(): Unit = {
    immigrationRoute.isDisplayed
  }

  def noRecourseToPulicFundNoDetail(): Unit = {
    recourseIsNo.isDisplayed
    recourseWarning.isDisplayed
  }

  def zambranoMessageDisplayed(): Unit = {
    zambranoWarning.isDisplayed
  }

  def zambranoMessageNotDisplayed(): Unit = {
    contentNotPresent("This is a rest of the world national with an EU Settlement Scheme status")
  }

  def clickOnPastInformationLink(): Unit = {
    pastInformation.click()
  }

  def pageUrl(url: String): Unit = {
    url match {
      case "search by nino" => checkURL("check-immigration-status/search-by-nino")
      case "search by passport or id" => checkURL("check-immigration-status/search-by-passport")
      case _ => throw new IllegalArgumentException(url + " not found")
    }
  }
}
