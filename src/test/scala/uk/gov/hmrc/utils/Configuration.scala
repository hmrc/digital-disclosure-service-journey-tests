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

case class Configuration(baseUrl: String)

object Configuration {

  lazy val environment: Environment.Name = {
    val environmentProperty = Option(System.getProperty("environment")).getOrElse("Qa").toLowerCase

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
        new Configuration(
          baseUrl = "http://localhost:15003/digital-disclosure/"
        )
      case Environment.Dev =>
        new Configuration(
          baseUrl = "http://localhost:9000/digital-disclosure/"
        )
      case Environment.Qa =>
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