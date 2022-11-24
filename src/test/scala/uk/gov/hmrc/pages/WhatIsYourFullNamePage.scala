/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages
import org.junit.Assert
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration


trait WhatIsYourFullNamePage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString
}
