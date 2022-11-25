/*
 * Copyright 2022 HM Revenue & Customs
 *
 */

package uk.gov.hmrc.runner

import io.cucumber.junit.{Cucumber, CucumberOptions}
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
features = Array("src/test/resources/features"),
glue = Array("uk.gov.hmrc.stepdefs"),
plugin = Array("pretty", "html:target/cucumber", "json:target/cucumber.json"),
tags="@page"
)
class RunPageTests{
}