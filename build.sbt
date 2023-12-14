lazy val testSuite = (project in file("."))
  .enablePlugins(SbtAutoBuildPlugin)
  .settings(
      name := "dds2-ui-framework",
      version := "1.0",
      scalaVersion := "2.13.12",
      scalacOptions ++= Seq("-feature"),
      libraryDependencies ++= Dependencies.test,
      //The testOptions from SbtAutoBuildPlugin supports only ScalaTest. Resetting testOptions for Cucumber Tests.
      testOptions in Test := Seq.empty
  )