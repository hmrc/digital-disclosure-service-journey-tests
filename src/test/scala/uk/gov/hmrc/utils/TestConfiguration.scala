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

import com.typesafe.config.ConfigFactory

object TestConfiguration {

  val timeout                    = 30
  val env: String                = Option(System.getProperty("environment")).getOrElse("local")
  private val config             = ConfigFactory.load("environments.conf").getConfig(s"environments.$env")

  def baseUrl(url: String, envHostForEnv: String = environmentHost): String =
    if (env.equalsIgnoreCase("local")) s"$environmentHost:${servicePort(url)}${serviceRoute(url)}"
    else s"$envHostForEnv${serviceRoute(url)}"

  def url(url: String): String =
    url match {
      case "UsingThisService"             => baseUrl("dds") + "using-this-service"
      case "WillYouBeMakingADisclosure"   => baseUrl("dds") + "notification/letter-from-hmrc"
      case "CaseReferenceNumber"          => baseUrl("dds") + "notification/hmrc-letter-reference"
      case "DisclosureAbout"              => baseUrl("dds") + "notification/what-is-this-disclosure-about"
      case "AreYouTheEntity"              => baseUrl("dds") + "notification/are-you-the-entity"
      case "OffshoreLiabilities"          => baseUrl("dds") + "notification/disclose-offshore-liabilities"
      case "OnshoreLiabilities"           => baseUrl("dds") + "notification/disclose-onshore-liabilities"
      case "ViewEditCreateCase"           => baseUrl("dds") + "case-management/cases/1"
      case "YouHaveStartedNotification"   => baseUrl("dds") + "started-a-notification"
      case "WhereDidTheIncomeComeFrom"    => baseUrl("dds") + "notification/where-the-income-came-from"
      case "NameOfIndividual"             => baseUrl("dds") + "notification/estates-individual-full-name"
      case "IndividualDob"                => baseUrl("dds") + "notification/estates-individual-date-of-birth"
      case "ListOfTasks"                  => baseUrl("dds") + "disclosure-list-of-tasks"
    }

  def environmentHost: String            = config.getString("services.host")
  def servicePort(serviceName: String): String  = config.getString(s"services.$serviceName.port")
  def serviceRoute(serviceName: String): String = config.getString(s"services.$serviceName.productionRoute")

}
