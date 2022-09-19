Feature: To test the login functionality

@first
  Scenario: Check login is successful while enter correct credentials
    Given User is on login page
    When User enters Username and Password
    And clicks on Login button
    Then user is redirected to the homepage
