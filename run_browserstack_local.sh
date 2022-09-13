#!/usr/bin/env bash

username=$1
key=$2

#====================Browsers to test in (from June 2021)================
#WindowsOS
sbt -Dbrowser=browserstack -Dlanguage=english -Denvironment=local -Dbrowserstack.username=paulcallaghan_XeCVNg -Dbrowserstack.key=zRb1BsacUZvBsxZFBMgq -Dbrowserstack.browser_version="94" -Dbrowserstack.browser="Chrome" -Dbrowserstack.os="Windows" -Dbrowserstack.os_version="10" 'testOnly uk.gov.hmrc.runner.RunCrossBrowser'
sbt -Dbrowser=browserstack -Dlanguage=english -Denvironment=local -Dbrowserstack.username=paulcallaghan_XeCVNg -Dbrowserstack.key=zRb1BsacUZvBsxZFBMgq -Dbrowserstack.browser_version="93" -Dbrowserstack.browser="Firefox" -Dbrowserstack.os="Windows" -Dbrowserstack.os_version="10" 'testOnly uk.gov.hmrc.runner.RunCrossBrowser'
sbt -Dbrowser=browserstack -Dlanguage=english -Denvironment=local -Dbrowserstack.username=paulcallaghan_XeCVNg -Dbrowserstack.key=zRb1BsacUZvBsxZFBMgq -Dbrowserstack.browser_version="94" -Dbrowserstack.browser="EDGE" -Dbrowserstack.os="Windows" -Dbrowserstack.os_version="10" 'testOnly uk.gov.hmrc.runner.RunCrossBrowser'
#IE is not clearing the data - test manually
#sbt -Dbrowser=browserstack -Dlanguage=english -Denvironment=local -Dbrowserstack.username=paulcallaghan_XeCVNg -Dbrowserstack.key=zRb1BsacUZvBsxZFBMgq -Dbrowserstack.browser_version="11" -Dbrowserstack.browser="IE" -Dbrowserstack.os="Windows" -Dbrowserstack.os_version="10" 'testOnly uk.gov.hmrc.runner.RunCrossBrowser'
#macOS
sbt -Dbrowser=browserstack -Dlanguage=english -Denvironment=local -Dbrowserstack.username=paulcallaghan_XeCVNg -Dbrowserstack.key=zRb1BsacUZvBsxZFBMgq -Dbrowserstack.browser_version="93" -Dbrowserstack.browser="Firefox" -Dbrowserstack.os="OS X" -Dbrowserstack.os_version="Catalina" 'testOnly uk.gov.hmrc.runner.RunCrossBrowser'
sbt -Dbrowser=browserstack -Dlanguage=english -Denvironment=local -Dbrowserstack.username=paulcallaghan_XeCVNg -Dbrowserstack.key=zRb1BsacUZvBsxZFBMgq -Dbrowserstack.browser_version="94" -Dbrowserstack.browser="Chrome" -Dbrowserstack.os="OS X" -Dbrowserstack.os_version="Catalina" 'testOnly uk.gov.hmrc.runner.RunCrossBrowser'

#macOS Safari 12 and later -> Need to check manually
