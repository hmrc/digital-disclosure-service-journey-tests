#!/usr/bin/env bash

BROWSER=$1
ENVIRONMENT=$2

sbt clean -Dbrowser="${BROWSER:=chrome}" -Dbrowser.option.headless=false -Denvironment="${ENVIRONMENT:=local}" "testOnly uk.gov.hmrc.runner.Runner" testReport