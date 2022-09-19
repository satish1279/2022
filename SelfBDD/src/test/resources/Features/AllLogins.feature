Feature: To Login to the Goi selfTesting environment

 
  Scenario: User should login into Goi Testing environment and navigate to the homepage
    Given User is on Goi selfTesting Login page
    When User enters Goi selfTesting credentials
    And User click on selfLogin button for Goi selfTesting environment
    Then User navigates to the Goi selfTesting homepage

