@SmokeScenario
Feature: feature to test login scenario

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters uname and pswd
    And clicks on login button
    Then user is navigated to home page
