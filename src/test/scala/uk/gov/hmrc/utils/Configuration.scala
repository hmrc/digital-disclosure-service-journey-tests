/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.utils

case class Configuration(baseUrl: String, SIGN_IN_PAGE: String)

object Configuration {

  lazy val environment: Environment.Name = {
    val environmentProperty = Option(System.getProperty("environment")).getOrElse("Local").toLowerCase
    environmentProperty match {
      case "local" => Environment.Local
      case "qa" => Environment.Qa
      case "dev" => Environment.Dev
      case "staging" => Environment.Staging
      case _ => throw new IllegalArgumentException(s"Environment '$environmentProperty' not known")
    }
  }

  lazy val settings: Configuration = create()

  private def create(): Configuration = {
    environment match {
      case Environment.Local =>
        new Configuration(
          baseUrl = "https://jira.tools.tax.service.gov.uk/",
          SIGN_IN_PAGE = "https://jira.tools.tax.service.gov.uk/login.jsp"
        )
      case Environment.Dev =>
        new Configuration(
          baseUrl = "https://admin.development.tax.service.gov.uk/",
          SIGN_IN_PAGE = "https://admin.development.tax.service.gov.uk/check-immigration-status/"
        )
      case Environment.Qa =>
        new Configuration(
          baseUrl = "https://admin.qa.tax.service.gov.uk/",
          SIGN_IN_PAGE = "https://admin.qa.tax.service.gov.uk/check-immigration-status/"
        )

      case Environment.Staging =>
        new Configuration(
          baseUrl = "https://admin.staging.tax.service.gov.uk/",
          SIGN_IN_PAGE = "https://admin.staging.tax.service.gov.uk/check-immigration-status/"
        )

      case _ => throw new IllegalArgumentException(s"Environment '$environment' not known")
    }
  }
}


object Environment extends Enumeration {
  type Name = Value
  val Local, Dev, Qa, Staging = Value

}
