/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.driver

import org.openqa.selenium.WebDriver
import org.openqa.selenium.htmlunit.HtmlUnitDriver

trait StartUpTearDown {
    implicit val driver: WebDriver = BrowserDriver.webDriver
    //implicit val driver: WebDriver = new HtmlUnitDriver

}
