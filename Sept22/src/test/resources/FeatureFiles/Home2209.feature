Feature: to test parallel execution

  Background: 
    Given User is already logged into main app

  Scenario: to test IT IS parallel execution
    Given user is on Homepage
    When Clicks on Recognize link
    And Clicks on Skill Insight link
    When Clicks on Wellness link
    And Clicks on Survey link
    When Clicks on Job Referral link
    And Clicks on My Summary link
    When Clicks on Dashboard link
    And Clicks on Redeem link
