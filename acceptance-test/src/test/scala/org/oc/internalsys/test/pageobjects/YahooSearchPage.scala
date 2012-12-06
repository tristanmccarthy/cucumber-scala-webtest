package org.oc.internalsys.test.pageobjects

import org.openqa.selenium.{WebElement, By, WebDriver}
import scala.collection.JavaConverters._

/**
 * User: tris
 * Date: 05/12/12
 */
class YahooSearchPage(override val driver: WebDriver) extends Page(driver) {
  def searchText: WebElement = driver.findElement(By.id("p_13838465-p"))

  def searchButton: WebElement = driver.findElement(By.id("search-submit"))

  def enterSearchText(text: String) {
    searchText.sendKeys(text)
  }

  def submitSearch() {
    searchButton.click()
  }

  def isSearchResultPresentOnPage(resultLink: String): Boolean
  = driver.findElements(By.partialLinkText(resultLink)).asScala.toList.size > 0
}
