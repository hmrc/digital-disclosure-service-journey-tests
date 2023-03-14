#!/usr/bin/env bash

sbt -Denvironment=local -Dbrowser=firefox "testOnly uk.gov.hmrc.runner.RunJourneyTests"