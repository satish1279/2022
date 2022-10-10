Feature: To test all the pages on various environment in a one go

  Scenario: To test all the pages on each environment
    Given User is on Login page
    When User is logged in after entering the correct credentials
    And Clicks on Login button
    When Clicks on Recognize link
    And Clicks on Skill Insight link
    When Clicks on Wellness link
    And Clicks on Survey link
    When Clicks on My Summary link
    And Clicks on Dashboard link
    When Clicks on Reports tab
    And Clicks on Redeem link
    When Clicks on LogOut link
    Then User is navigated to first page
