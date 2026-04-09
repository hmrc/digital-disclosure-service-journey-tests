#!/bin/bash -e

BROWSER=$1
ENVIRONMENT=$2

sbt clean -Dbrowser="${BROWSER:=chrome}" -Dbrowser.usePreviousVersion=true -Denvironment="${ENVIRONMENT:=local}" "testOnly uk.gov.hmrc.specs.LLPCheckYourAnswersSpec" testReport -Dbrowser.option.headless=false