package uk.gov.hmrc.stepdefs

import com.github.tomakehurst.wiremock.WireMockServer
import com.github.tomakehurst.wiremock.client.WireMock._
import com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig
import uk.gov.hmrc.pages.BasePage
import uk.gov.hmrc.utils.{Configuration, Environment}

import java.util.UUID

class AlfMock extends BasePage {

  val server: WireMockServer = new WireMockServer(wireMockConfig().port(6001))

  val journeyId: String = UUID.randomUUID().toString

  lazy val baseUrl: String = Configuration.settings.baseUrl

  lazy val alfStubbedUrl: String = Configuration.environment match {
    case Environment.Local => s"http://localhost:9028/lookup-address/$journeyId/confirm"
    case Environment.Qa => s"https://www.qa.tax.service.gov.uk/lookup-address/$journeyId/confirm"
    case Environment.Staging => s"https://www.staging.tax.service.gov.uk/lookup-address/$journeyId/confirm"
    case _ => throw new RuntimeException("Incorrect environment")
  }

  lazy val alfInitiStubUrl: String = Configuration.environment match {
    case Environment.Local => s"http://localhost:9028/lookup-address/api/init"
    case Environment.Qa => s"https://www.qa.tax.service.gov.uk/lookup-address/api/init"
    case Environment.Staging => s"https://www.staging.tax.service.gov.uk/lookup-address/api/init"
    case _ => throw new RuntimeException("Incorrect environment")
  }


  val callBackUrlIndividual: String = s"${baseUrl}notification/individual-address/retrieve"
  val callBackUrlYourAddress: String = s"${baseUrl}notification/your-address/retrieve"
  val callBackUrlCompany: String = s"${baseUrl}notification/company-address/retrieve"
  val callBackUrlLlp: String = s"${baseUrl}notification/llp-address/retrieve"
  val callBackUrlTrust: String = s"${baseUrl}notification/trust-address/retrieve"
  val callBackUrlEstate: String = s"${baseUrl}notification/estate-address/retrieve"

  val expectedAlfResponse: String =
    """{
      | "auditRef" : "some-ref",
      | "id" : "123456789",
      | "address" : {
      |   "organisation" : "organisation",
      |   "lines" :[
      |     "2 Testing Lane",
      |     "Royal Madeuptown"
      |   ],
      |   "postcode" : "ZZ9Z 9TT",
      |   "country"  :{
      |     "code" : "GB",
      |     "name" : "United Kingdom"
      |   }
      | }
      |}""".stripMargin

  Before {
    server.stubFor(
      post(urlEqualTo(alfInitiStubUrl))
        .withRequestBody(
          matchingJsonPath(
            "$.options.continueUrl",
            containing(callBackUrlIndividual)
          )
        )
        .willReturn(
          aResponse
            .withStatus(202)
            .withHeader("Location", s"$callBackUrlIndividual?id=$journeyId")
        )
    )

    server.stubFor(
      post(urlEqualTo(alfInitiStubUrl))
        .withRequestBody(
          matchingJsonPath(
            "$.options.continueUrl",
            containing(callBackUrlYourAddress)
          )
        )
        .willReturn(
          aResponse
            .withStatus(202)
            .withHeader("Location", s"$callBackUrlYourAddress?id=$journeyId")
        )
    )

    server.stubFor(
      post(urlEqualTo(alfInitiStubUrl))
        .withRequestBody(
          matchingJsonPath(
            "$.options.continueUrl",
            containing(callBackUrlCompany)
          )
        )
        .willReturn(
          aResponse
            .withStatus(202)
            .withHeader("Location", s"$callBackUrlCompany?id=$journeyId")
        )
    )

    server.stubFor(
      post(urlEqualTo(alfInitiStubUrl))
        .withRequestBody(
          matchingJsonPath(
            "$.options.continueUrl",
            containing(callBackUrlLlp)
          )
        )
        .willReturn(
          aResponse
            .withStatus(202)
            .withHeader("Location", s"$callBackUrlLlp?id=$journeyId")
        )
    )

    server.stubFor(
      post(urlEqualTo(alfInitiStubUrl))
        .withRequestBody(
          matchingJsonPath(
            "$.options.continueUrl",
            containing(callBackUrlTrust)
          )
        )
        .willReturn(
          aResponse
            .withStatus(202)
            .withHeader("Location", s"$callBackUrlTrust?id=$journeyId")
        )
    )

    server.stubFor(
      post(urlEqualTo(alfInitiStubUrl))
        .withRequestBody(
          matchingJsonPath(
            "$.options.continueUrl",
            containing(callBackUrlEstate)
          )
        )
        .willReturn(
          aResponse
            .withStatus(202)
            .withHeader("Location", s"$callBackUrlEstate?id=$journeyId")
        )
    )

    server.stubFor(
      get(urlEqualTo(s"/api/confirmed?id=$journeyId"))
        .willReturn(
          aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(expectedAlfResponse)
        )
    )

    server.start()
  }

  After {
    server.stop()
  }
}