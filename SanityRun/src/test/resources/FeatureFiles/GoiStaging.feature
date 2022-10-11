@GoiStaging
Feature: To test all the pages on Goi Staging environment

  Scenario: To test all the pages on Goi Staging environment
    Given User is on Login page wrt Staging env
    When User is logged in after entering the correct credentials wrt Staging env
    And Clicks on Recognize link wrt Staging env
    When Clicks on Skill Insight link wrt Staging env
    And Clicks on Wellness link wrt Staging env
    When Clicks on Survey link wrt Staging env
    And Clicks on My Summary link wrt Staging env
    When Clicks on Redeem link wrt Staging env
    And Clicks on Dashboard link wrt Staging env
    When Clicks on Reports tab wrt Staging env
    And Clicks on Budget Head Report option from Select Report dropdown wrt Staging env
    When Clicks on Recognitions Report option from Select Report dropdown wrt Staging env
    And Clicks on Redemption Report option from Select Report dropdown wrt Staging env
    When Clicks on User Login Report option from Select Report dropdown wrt Staging env
    And Clicks on Data Visualization tab wrt Staging env
    When Clicks on LogOut link wrt Staging env
    Then User is navigated to first page wrt Staging env
