package org.oc.internalsys.test.cucumber.stepdefs

import cucumber.api.scala.{ScalaDsl, EN}
import org.openqa.selenium.firefox.FirefoxDriver
import cucumber.runtime.Runtime

/**
 * User: tris
 * Date: 05/12/12
 */
class SetUpAndTearDown extends ScalaDsl with EN {

  Before() {
    driver = new FirefoxDriver()
  }

  After() {
    driver.quit()
  }

}
