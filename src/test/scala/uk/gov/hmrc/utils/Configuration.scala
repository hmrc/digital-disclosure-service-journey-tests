/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.utils

case class Configuration(baseUrl: String)

object Configuration {

  lazy val environment: Environment.Name = {
    val environmentProperty = Option(System.getProperty("environment")).getOrElse("Qa").toLowerCase
    println("environmentProperty" + environmentProperty)
    environmentProperty match {
      case "local" => Environment.Local
      case "qa" => Environment.Qa
      case "dev" => Environment.Dev
      case "staging" => Environment.Staging
      case _ => throw new IllegalArgumentException("Environment '$environmentProperty' not known")
    }
  }

  lazy val settings: Configuration = create()

  private def create(): Configuration = {
    environment match {
      case Environment.Local =>
        println("Im in Local")
        new Configuration(
          baseUrl = "http://localhost:15003/digital-disclosure/"
        )
      case Environment.Dev =>
        println("Im in DEV")
        new Configuration(
          baseUrl = "http://localhost:15003/digital-disclosure/"
        )
      case Environment.Qa =>
        println("Im in QA")
        new Configuration(
          baseUrl = "https://www.qa.tax.service.gov.uk/digital-disclosure/"
        )

      case Environment.Staging =>
        new Configuration(
          baseUrl = "https://www.qa.tax.service.gov.uk/"
        )

      case _ => throw new IllegalArgumentException("Environment '$environment' not known")
    }
  }
}


object Environment extends Enumeration {
  type Name = Value
  val Local, Dev, Qa, Staging = Value

}
