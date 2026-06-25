import sbt._

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "org.scalatest"         %%  "scalatest"          %  "3.2.20"   %  Test,
    "org.scalatestplus"     %%  "selenium-4-12"      %  "3.2.17.0" %  Test,
    "com.vladsch.flexmark"  %   "flexmark-all"       %  "0.64.8"   %  Test,
    "uk.gov.hmrc"           %%  "ui-test-runner"     %  "0.50.0"   %  Test,
    "junit"                 %   "junit"              %  "4.13.2"   %  Test,
    "com.novocode"          %   "junit-interface"    %  "0.11"     %  Test,
    "com.typesafe.play"     %%  "play-json"          %  "2.10.8"   %  Test,
    "uk.gov.hmrc"           %%  "domain-play-30"     %  "13.0.0",
    "uk.gov.hmrc"           %%  "domain-test-play-30"     %  "13.0.0"   %  Test
  )

}