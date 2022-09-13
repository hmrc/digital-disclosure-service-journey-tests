#! /bin/sh

sbt -Denvironment=local -Dbrowser=chrome 'testOnly uk.gov.hmrc.runner.RunWip'