package org.oc.internalsys.test.cucumber.stepdefs

import cucumber.api.scala.{ScalaDsl, EN}
import org.openqa.selenium.{Keys, By, WebDriver}
import junit.framework.Assert._
import org.oc.internalsys.test.pageobjects.YahooSearchPage

/**
 * User: tris
 * Date: 05/12/12
 */
class BrowserTest extends ScalaDsl with EN {
  lazy val yahooSearchPage = new YahooSearchPage(driver)

  Given( """^I am on the '(.+)' page$""") {
    (url: String) =>
      yahooSearchPage.navigateToPage(url)
  }

  When( """^I enter the search term '(.+)'$""") {
    (searchTerm: String) =>
      yahooSearchPage.enterSearchText(searchTerm)
  }

  When( """^I submit the search$""") {
    () =>
      yahooSearchPage.submitSearch()
  }

  Then( """^I should be shown results for the search term '(.+)'$""") {
    (searchResult: String) =>
      assertTrue(yahooSearchPage.isSearchResultPresentOnPage(searchResult))
  }


}

