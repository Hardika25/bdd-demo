Feature: 1: Login with Credentials

  Scenario Outline: 1:Successful Login with Valid email
    Given User is on Home Page
    When User navigates to LogIn Page
    Then Message displayed Login Successfully

    Examples: 
      | login                    | password | status  |
      | hardikabauskar@gmail.com |     1234 | success |
      | hardika123               |     1234 | success |

  Scenario Outline: 2: Successful Login with Valid phone
    Given User is on Home Page
    When User navigates to LogIn Page
    Then Message displayed Login Successfully

    Examples: 
      | login      | password | status  |
      | 9657186034 |     1234 | success |
      | 7798358445 |     1234 | success |

      Scenario Outline: 3: Successful Login with Valid username
    Given User is on Home Page
    When User navigates to LogIn Page
    Then Message displayed Login Successfully

    Examples: 
      | login      | password | status  |
      | hardika25 |     1234 | success |
      |hadrika@25 |     1234 | success |
      