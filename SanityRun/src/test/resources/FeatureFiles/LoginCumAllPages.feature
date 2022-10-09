Feature: To test all the pages on various environment in a one go

  Scenario: To test all the pages on each environment
    Given User is on Login page
    When User is logged in after entering the correct credentials
    Then User is on Homepage
