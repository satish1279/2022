Feature: To check login functionality

  Scenario Outline: User navigated to homepage once logged in successfully
    Given User is on goi login page
    When user enters <GOIuserName> and <GOIpassWord>
    And clicks on goi login button
    Then User navigated to goi homepage

    Examples: 
      | GOIuserName                  | GOIpassWord |
      | satish.jaiswal@beyond360.com | pass@1234   |
