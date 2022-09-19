Feature: To check the login functionality as a review

  Scenario: User should get login succcessfully and redirected to the homepage
    Given user is on the loginn page
    When user entering userName & passWord into field
    And clicks on Login button displayed on the page
    Then user is being redirected to its homepage
    
    
    
    
    
