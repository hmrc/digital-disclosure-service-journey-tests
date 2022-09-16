package uk.gov.hmrc.pages

import org.openqa.selenium.{WebDriver, WebElement}
import org.openqa.selenium.support.ui.{ExpectedConditions, WebDriverWait}
import org.junit.Assert
import org.openqa.selenium.By.ByXPath
import uk.gov.hmrc.utils.Configuration

class HmrcLetterReferencePage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  def navigateToSpecificPage(url: String): Unit = {
    goTo(Configuration.settings.baseUrl + url)
    authenticationByPass()
  }
}
