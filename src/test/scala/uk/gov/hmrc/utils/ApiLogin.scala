/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.utils

import org.apache.http.client.methods.{HttpPost, HttpPut}
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.HttpClientBuilder

object ApiLogin {

  def CreateAPIUser() {
    val postrequest = new HttpPost("http://localhost:9009/agents-external-stubs/sign-in")
    postrequest.setHeader("Accept", "application/json")
    postrequest.setHeader("Content-Type", "application/json")

    val inputJson: String =
      """
        |{
        | "userId": "Test",
        | "password": "TestPass"
        |}
      """.stripMargin

    val stringEntity = new StringEntity(inputJson)
    postrequest.setEntity(stringEntity)

    val client = HttpClientBuilder.create.build
    val response = {
      client.execute(postrequest)
    }

    client.close()
    val headers = response.getAllHeaders
    for (header <- headers) {
    }

    val servetoken = response.getFirstHeader("Authorization").getValue

    val putrequest = new HttpPut("http://localhost:9009/agents-external-stubs/users")
    putrequest.setHeader("Accept", "application/json")
    putrequest.setHeader("Content-Type", "application/json")
    putrequest.setHeader("Authorization", s"$servetoken")

    val inputJson2: String =
      """
        |{
        | "userId": "Test",
        | "password": "TestPass"
        |}
      """.stripMargin

    val stringEntity2 = new StringEntity(inputJson2)
    putrequest.setEntity(stringEntity2)

    val client2 = HttpClientBuilder.create.build
    val response2 = {
      client2.execute(putrequest)
    }
  }
}