# digital-disclosure-service-journey-tests

Digital Disclosure Service journey tests.

## Pre-requisites

### Services

Start Mongo Docker container as follows:

```bash
docker run --rm -d -p 27017:27017 --name mongo percona/percona-server-mongodb:5.0
```

Start `DDS_ALL` services as follows:

```bash
sm2 --start DDS_ALL
```

### Selenium Manager

Selenium Manager now used to manage browser automation. No pre-requisites required.

## Tests

Run tests as follows:

* Argument `<browser>` must be `chrome`, `edge`, or `firefox`.
* Argument `<environment>` must be `local`, `dev`, `qa` or `staging`.

```bash
./run-tests.sh <browser> <environment>
```

## Scalafmt

Check all project files are formatted as expected as follows:

```bash
sbt scalafmtCheckAll scalafmtCheck
```

Format `*.sbt` and `project/*.scala` files as follows:

```bash
sbt scalafmtSbt
```

Format all project files as follows:

```bash
sbt scalafmtAll
```

## License

This code is open source software licensed under the [Apache 2.0 License]("http://www.apache.org/licenses/LICENSE-2.0.html").

## Local Debugging

When local testing you may come across the following error:
* Service Unavailable in the browser
* Forbidden error in the terminal: Unexpected response from DDS Store, status: 403, body: {"statusCode":403,"message":"Forbidden"}

The fix for this is to drop the collection 'internal-auth' from your local Mongo Database (usually in Studio3T).
Then restart all the services using Service Manager 2, and try again.
