@SmokeScenario
Feature: feature to test google search functionality

  Scenario: Validate google search is working
    Given browser is open
    And user is on google webpage
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
