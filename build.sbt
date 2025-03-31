lazy val testSuite = (project in file("."))
  .settings(
      name := "digital-disclosure-service-journey-tests",
      version := "1.0",
      scalaVersion := "2.13.16",
      scalacOptions ++= Seq("-feature"),
      libraryDependencies ++= Dependencies.test,
      //The testOptions from SbtAutoBuildPlugin supports only ScalaTest. Resetting testOptions for Cucumber Tests.
      Test / testOptions := Seq.empty
  )