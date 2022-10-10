Feature: To test all the pages on Goi Production-India environment

  Scenario: To test all the pages on Goi Production-India environment
    Given User is on Login page wrt Ind_Production
    When User is logged in after entering the correct credentials wrt Ind_Production
    And Clicks on Recognize link wrt Ind_Production
    When Clicks on Skill Insight link wrt Ind_Production
    And Clicks on Wellness link wrt Ind_Production
    When Clicks on Survey link wrt Ind_Production
    And Clicks on My Summary link wrt Ind_Production
    When Clicks on Redeem link wrt Ind_Production
    And Clicks on Dashboard link wrt Ind_Production
    When Clicks on Reports tab wrt Ind_Production
    And Clicks on Budget Head Report option from Select Report dropdown wrt Ind_Production
    When Clicks on Recognitions Report option from Select Report dropdown wrt Ind_Production
    And Clicks on Redemption Report option from Select Report dropdown wrt Ind_Production
    When Clicks on User Login Report option from Select Report dropdown wrt Ind_Production
    And Clicks on Data Visualization tab wrt Ind_Production
    When Clicks on LogOut link wrt Ind_Production
    Then User is navigated to first page wrt Ind_Production
