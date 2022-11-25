#!/usr/bin/env bash

sbt -Denvironment=local -Dbrowser=remote-chrome "testOnly uk.gov.hmrc.runner.RunAcceptance"