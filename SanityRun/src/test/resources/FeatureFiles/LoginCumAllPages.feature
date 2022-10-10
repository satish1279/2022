Feature: To test all the pages on various environment in a one go

  Scenario: To test all the pages on each environment
    Given User is on Login page
    When User is logged in after entering the correct credentials
    And Clicks on Recognize link
    When Clicks on Skill Insight link
    And Clicks on Wellness link
    When Clicks on Survey link
    And Clicks on My Summary link
    When Clicks on Redeem link
    And Clicks on Dashboard link
    When Clicks on Reports tab
    And Clicks on Budget Head Report option from Select Report dropdown
    When Clicks on Recognitions Report option from Select Report dropdown
    And Clicks on Redemption Report option from Select Report dropdown
    When Clicks on User Login Report option from Select Report dropdown
    And Clicks on Data Visualization tab
    When Clicks on LogOut link
    Then User is navigated to first page
