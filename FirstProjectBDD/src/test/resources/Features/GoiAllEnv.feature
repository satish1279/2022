Feature: To validate login functionality for multiple environment

  #GOI TESTING ENVIRONMENT
  Scenario: To check Goi Testing environment
    Given User is on Testinglogin page
    When user is entering testingUsername and testingPassword
    And clicks on Testinglogin button
    Then user is redirected to the Testinghomepage

  #GOI STAGING ENVIRONMENT
  Scenario: To check Goi Staging environment
    Given User is on Staginglogin page
    When user is entering StagingUsername and StagingPassword
    And clicks on Staginglogin button
    Then user is redirected to the Staginghomepage

  #GOI IND PRODUCTION ENVIRONMENT
  Scenario: To check Goi IndProduction environment
    Given User is on IndProductionlogin page
    When user is entering IndProductionUsername and IndProductionPassword
    And clicks on IndProductionlogin button
    Then user is redirected to the IndProductionhomepage

  #GOI US PRODUCTION ENVIRONMENT
  Scenario: To check Goi USProduction environment
    Given User is on USProductionlogin page
    When user is entering USProductionUsername and USProductionPassword
    And clicks on USProductionlogin button
    Then user is redirected to the USProductionhomepage

  #GOI BEYOND USdemo ENVIRONMENT
  Scenario: To check Goi BeyondUSdemoProduction environment
    Given User is on BeyondUSdemologin page
    When user is entering BeyondUSdemoUsername and BeyondUSdemoPassword
    And clicks on BeyondUSdemologin button
    Then user is redirected to the BeyondUSdemohomepage
