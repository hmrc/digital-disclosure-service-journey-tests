/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.stepdefs

import uk.gov.hmrc.pages.{BasePage, OffshoreDisclosurePage, OnshoreDisclosurePage}

class OnshoreDisclosureStepDef extends BasePage with OnshoreDisclosurePage with OffshoreDisclosurePage{

  When("""I enter {string} in stop day text box field""") { (string: String) =>
     enterValueInStopDay(string)
  }

  When("""I enter {string} in stop month text box field""") { (string: String) =>
    enterValueInStopMonth(string)
  }
  When("""I enter {string} in stop year text box field""") { (string: String) =>
   enterValueInStopYear(string)
  }
  When("""I enter {string} in whatHasHappenedToProperty text box field""") { (string: String) =>
    enterValueInwhatHasHappenedToPropertyTextArea(string)
  }

  When("""I enter {string} in yearNotSelected text box field""") { (string: String) =>
    enterTextInDescription(string)
  }

  When("""I enter {string} in percentage text box field""") { (string: String) =>
    enterTextInDescription(string)
  }

  When("""I enter {string} in typeOfMortage text box field""") { (string: String) =>
    enterTextInDescription(string)
  }

  When("""I enter {string} in landloard association text box field""") { (string: String) =>
    enterTextInDescription(string)
  }

  When("""I enter {string} in property count text box field""") { (string: String) =>
    enterTextInDescription(string)
  }

  When("""I enter {string} in tax owed reason text box field""") { (string: String) =>
    enterTextInDescription(string)
  }

}
