#!/usr/bin/env bash

BROWSER=$1
ENVIRONMENT=$2

sbt clean -Dbrowser="${BROWSER:=chrome}" -Dbrowser.usePreviousVersion=true -Dbrowser.option.headless="${HEADLESS:=false}" -Denvironment="${ENVIRONMENT:=local}" "testOnly uk.gov.hmrc.runner.Runner" testReport