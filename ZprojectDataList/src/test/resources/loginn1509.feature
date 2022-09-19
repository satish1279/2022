Feature: to test login1509

  Scenario: chk login1509
    Given usr is at loginnPG
    When user enter credentials
      | usr  | pwd  |
      | aman | test |
    And clik on buton
    Then user lands on hmpgggg
