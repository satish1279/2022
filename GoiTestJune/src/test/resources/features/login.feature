Feature: To test the login functionality for GOI Test environment

  Scenario: User is able to login into Goi Test environment
    Given user is on Glogin page
    When user enters the Gusername and Gpassword
    And clicks on Glogin button
    Then user is redirected to the Ghomepage
