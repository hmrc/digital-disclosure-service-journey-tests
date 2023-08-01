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

package uk.gov.hmrc.integration.cucumber.utils

import com.typesafe.config.ConfigFactory

object TestConfiguration {

  val timeout                    = 30
  val env: String                = Option(System.getProperty("environment")).getOrElse("local")
  val javascriptDisabled: String = Option(System.getProperty("disable.javascript")).getOrElse("false")
  private val config             = ConfigFactory.load("environments.conf").getConfig(s"environments.$env")

  def baseUrl(url: String, envHostForEnv: String = environmentHost): String =
    if (env.equalsIgnoreCase("local")) s"$environmentHost:${servicePort(url)}${serviceRoute(url)}"
    else s"$envHostForEnv${serviceRoute(url)}"

  def url(url: String): String =
    url match {
      case "UsingThisServiceUrl"             => baseUrl("dds") + "using-this-service"
      case "WillYouBeMakingADisclosureUrl"   => baseUrl("dds") + "notification/letter-from-hmrc"
      case "CaseReferenceNumberUrl"          => baseUrl("dds") + "notification/hmrc-letter-reference"
      case "DisclosureAboutUrl"              => baseUrl("dds") + "notification/what-is-this-disclosure-about"
      case "AreYouTheEntityUrl"              => baseUrl("dds") + "notification/are-you-the-entity"
      case "OffshoreLiabilitiesUrl"          => baseUrl("dds") + "notification/disclose-offshore-liabilities"
      case "OnshoreLiabilitiesUrl"            => baseUrl("dds") + "notification/disclose-onshore-liabilities"
      case "ViewEditCreateCaseUrl"           => baseUrl("dds") + "case-management/cases/1"
      case "YouHaveStartedNotificationUrl"   => baseUrl("dds") + "started-a-notification"
      case "WhereDidTheIncomeComeFromUrl"    => baseUrl("dds") + "notification/where-the-income-came-from"
      case "NameOfIndividualUrl"             => baseUrl("dds") + "notification/estates-individual-full-name"
      case "IndividualDobUrl"                => baseUrl("dds") + "notification/estates-individual-date-of-birth"
      case "ListOfTasksUrl"                  => baseUrl("dds") + "disclosure-list-of-tasks"

//            test-only routes
//            case "TestOnlyTaxCheckUrl" => baseUrl(testOnly, environmentHostForTestOnly) + taxCheck
    }

  def environmentHost: String            = config.getString("services.host")
  def environmentHostForTestOnly: String = config.getString("services.test-only.host")

  def servicePort(serviceName: String): String  = config.getString(s"services.$serviceName.port")
  def serviceRoute(serviceName: String): String = config.getString(s"services.$serviceName.productionRoute")

}
