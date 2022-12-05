/*
 * Copyright 2022 HM Revenue & Customs
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