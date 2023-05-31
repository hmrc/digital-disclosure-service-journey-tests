
# # DDS2 acceptance tests

This project provides a number of test suites that are intended to prove TODO


## Chromedriver setup

1. Download the latest Chromedriver from (http://chromedriver.chromium.org/downloads).
2. Extract the zip file and save the driver in the following folder - ```/usr/local/bin/``` (LINUX OR MAC)
3. Copy the chrome driver in project root directory (windows)

## Running the Tests

1. Navigate to the directory where the project has been cloned.
2. To run all journeytest tests on your local machine, use:

```./run_local_journeytests.sh```

OR

```sbt -Denvironment=local 'test-only uk.gov.hmrc.runner.RunJourneyTests'```

3. To run all tests that are tagged as "@accessibility", use:

```./run_local_accessibility.sh```

Jenkins: TODO