Feature: To test the Login feature

  Scenario: User logged in successfully and remains on Homepage
    Given User is on Login Page
    When User enters correct credentials
    And Clicks on Login button
    Then landing on homepage
