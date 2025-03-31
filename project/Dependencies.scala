import sbt._

object Dependencies {

  val test: Seq[ModuleID] = Seq(
    "org.scalatest"         %%  "scalatest"          %  "3.2.17"   %  Test,
    "org.scalatestplus"     %%  "selenium-4-12"      %  "3.2.17.0" %  Test,
    "com.vladsch.flexmark"  %   "flexmark-all"       %  "0.62.2"   %  Test,
    "uk.gov.hmrc"           %%  "ui-test-runner"     %  "0.45.0"   %  Test,
    "io.cucumber"           %%  "cucumber-scala"     %  "8.20.0"   %  Test,
    "io.cucumber"           %   "cucumber-junit"     %  "7.15.0"   %  Test,
    "io.cucumber"           %   "cucumber-java"      %  "7.15.0"   %  Test,
    "junit"                 %   "junit"              %  "4.13.2"   %  Test,
    "com.novocode"          %   "junit-interface"    %  "0.11"     %  Test,
    "org.scalaj"            %%  "scalaj-http"        %  "2.4.2"    %  Test,
    "com.typesafe"          %   "config"             %  "1.4.3"    %  Test,
    "com.typesafe.play"     %%  "play-json"          %  "2.10.3"   %  Test,
    "uk.gov.hmrc"           %%  "domain"             %  "8.3.0-play-28"
  )

}