Feature: to test the loginnnn func of app

  
  Scenario: usr logs in and lands on hmpg with corect credentials
    Given loginn pg is opn
    When entrs usrNam & pwd
    And clix on login buton
    Then usr sees hmpg

    Given user is on hmpg itslf
    When clix on Recognize link
    And wait for page load
    Then user lands on Recognize page
