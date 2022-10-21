/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.pages

import io.cucumber.datatable.DataTable
import io.cucumber.scala.Implicits.ScalaDataTable
import org.junit.Assert
import org.openqa.selenium.{By, WebElement}
import org.openqa.selenium.support.ui.WebDriverWait
import uk.gov.hmrc.utils.Configuration

import scala.util.control.Breaks

trait CheckYourAnswersPage extends BasePage {

  private lazy val webdriverWait = new WebDriverWait(driver, 20)

  val currentEnvironment: String = Configuration.environment.toString

  //locators for the page
  def aboutYouSection: WebElement = findByID("about-you-list")
  def month: WebElement = findByID("value.month")
  def year: WebElement = findByID("value.year")

  def verifyAboutYouAnswers(lineNo: String, expectedLabel: String, expectedAnswer: String, expectedChangeURL: String): Unit = {
    //val answerRow = driver.findElement(By.xpath("xpath"))
    //val actualLabel = driver.findElement(By.xpath("//dl[@id='about-you-list']/div[@class='govuk-summary-list__row'][lineNo]/dt[@class='govuk-summary-list__key']"))
    val actualLabel = driver.findElement(By.xpath("//dl[@id='about-you-list']/div[@class='govuk-summary-list__row'][" + lineNo + "]/dt[@class='govuk-summary-list__key']")).getText.trim
    Assert.assertTrue("Check your answers - About You - Label not verified. Expected: " + expectedLabel + "--- Actual: " + actualLabel, expectedLabel == actualLabel)

    val actualAnswer = driver.findElement(By.xpath("//dl[@id='about-you-list']/div[@class='govuk-summary-list__row'][" + lineNo + "]/dd[@class='govuk-summary-list__value']")).getText.trim
    Assert.assertTrue("Check your answers - About You - Answer not verified. Expected: " + expectedAnswer + "--- Actual: " + actualAnswer, expectedAnswer == actualAnswer)

    val getChangeURL = driver.findElement(By.xpath("//dl[@id='about-you-list']/div[@class='govuk-summary-list__row'][" + lineNo + "]/dd[@class='govuk-summary-list__actions']/a[@class='govuk-link']")).getAttribute("href")
    Assert.assertTrue("Check your answers - About You - Change URL not verified. Expected: " + expectedChangeURL + "--- Actual: " + getChangeURL, getChangeURL.contains(expectedChangeURL))
  }

  def verifyAboutTheIndividualAnswers(expectedLabel: String,lineNo: String, expectedAnswer: String, expectedChangeURL: String): Unit = {
    val actualLabel = driver.findElement(By.xpath("//dl[@id='about-the-individual-list']/div[@class='govuk-summary-list__row'][" + lineNo + "]/dt[@class='govuk-summary-list__key']")).getText.trim
    Assert.assertTrue("Check your answers - About You - Label not verified. Expected: " + expectedLabel + "--- Actual: " + actualLabel, expectedLabel == actualLabel)

    val actualAnswer = driver.findElement(By.xpath("//dl[@id='about-the-individual-list']/div[@class='govuk-summary-list__row'][" + lineNo + "]/dd[@class='govuk-summary-list__value']")).getText.trim
    Assert.assertTrue("Check your answers - About You - Answer not verified. Expected: " + expectedAnswer + "--- Actual: " + actualAnswer, expectedAnswer == actualAnswer)

    val getChangeURL = driver.findElement(By.xpath("//dl[@id='about-the-individual-list']/div[@class='govuk-summary-list__row'][" + lineNo + "]/dd[@class='govuk-summary-list__actions']/a[@class='govuk-link']")).getAttribute("href")
    Assert.assertTrue("Check your answers - About You - Change URL not verified. Expected: " + expectedChangeURL + "--- Actual: " + getChangeURL, getChangeURL.contains(expectedChangeURL))
  }

  def verifyBackgroundAnswers(dataTable: DataTable): Unit = {

    dataTable.asScalaMaps[String, String] // Seq[Map[String, Option[String]]]
      .map { row =>
        val lineNo = row("Line").getOrElse("")
        val label = row("Label").getOrElse("")
        val answer = row("Answer").getOrElse("")
        val url = row("URL").getOrElse("")

        val actualLabel = driver.findElement(By.xpath("//dl[@id='background-list']/div[@class='govuk-summary-list__row'][" + lineNo + "]/dt[@class='govuk-summary-list__key']")).getText
        Assert.assertTrue("Check your answers - Background - Label not verified. Expected: " + label+ "--- Actual: " + actualLabel, label == actualLabel)

        val actualAnswer = driver.findElement(By.xpath("//dl[@id='background-list']/div[@class='govuk-summary-list__row'][" + lineNo + "]/dd[@class='govuk-summary-list__value']")).getText
        Assert.assertTrue("Check your answers - Background - Answer not verified. Expected: " + answer + "--- Actual: " + actualAnswer, answer == actualAnswer)

        val getChangeURL = driver.findElement(By.xpath("//dl[@id='background-list']/div[@class='govuk-summary-list__row'][" + lineNo + "]/dd[@class='govuk-summary-list__actions']/a[@class='govuk-link']")).getAttribute("href")
        Assert.assertTrue("Check your answers - Background - Change URL not verified. Expected: " + url + "--- Actual: " + getChangeURL, getChangeURL.contains(url))

      }
  }

  def clickOnChangeButton(expectedText: String): Unit = {
    val elementLabel = driver.findElements(By.xpath("//div[@class='govuk-summary-list__row']/dt[@class='govuk-summary-list__key']"))
    var line=1
    val outloop = new Breaks;
    outloop.breakable{
    elementLabel.forEach(e =>
      if (e.getText.trim == expectedText.trim) {
        driver.findElement(By.xpath("(//div[@class='govuk-summary-list__row']//a[@class='govuk-link'])["+line+"]")).click()
        outloop.break()
      }
      else {
      line=line+1
    })}
  }

  def verifyChangeButtonNavigation(dataTable: DataTable): Unit = {

    dataTable.asScalaMaps[String, String] // Seq[Map[String, Option[String]]]
      .map { row =>
        val label = row("Label").getOrElse("")
        val expectedPage = row("ExpectedPage").getOrElse("")
        clickOnChangeButton(label)
        verifyPageHeading(expectedPage)
        saveAndContinue()
      }
  }

  def validateChangedValue(dataTable: DataTable): Unit = {

    dataTable.asScalaMaps[String, String] // Seq[Map[String, Option[String]]]
      .map { row =>
        val label = row("Label").getOrElse("")
        val expectedPage = row("ExpectedPage").getOrElse("")
        val changedValue = row("ChangedValue").getOrElse("")
        clickOnChangeButton(label)
        verifyPageHeading(expectedPage)
        enterInputInTextBox(changedValue)
        saveAndContinue()

        val elementLabel = driver.findElements(By.xpath("//dl[@id='about-you-list']/div[@class='govuk-summary-list__row']/dd[@class='govuk-summary-list__value']"))
        var line = 1
        val outloop = new Breaks;
        outloop.breakable {
          elementLabel.forEach(e =>
            if (e.getText.trim == changedValue.trim) {
              line=line
              outloop.break()
            }
            else {
              line = line + 1
            })
        }

        val actualAnswer = driver.findElement(By.xpath("//dl[@id='background-list']/div[@class='govuk-summary-list__row'][" + line + "]/dd[@class='govuk-summary-list__value']")).getText
        Assert.assertTrue("Check your answers - Background - Answer not verified. Expected: " + changedValue + "--- Actual: " + actualAnswer, changedValue == actualAnswer)
      }
  }

  def verifyDropdownTextBoxIsEmpty(): Unit = {
    val element = driver.findElement(By.xpath("//input[@id='countryCode']"))
    Assert.assertTrue("Dropdown Textbox is empty", element.getText.isEmpty)
  }
}