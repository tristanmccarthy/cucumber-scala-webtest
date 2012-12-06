package org.oc.internalsys.test.pageobjects

import org.openqa.selenium.WebDriver

/**
 * User: tris
 * Date: 05/12/12
 */
abstract class Page(val driver: WebDriver) {
  def navigateToPage(url: String) {
    driver.get(url)
  }
}
