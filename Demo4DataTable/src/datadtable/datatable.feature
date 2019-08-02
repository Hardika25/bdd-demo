
Feature: Login with Valid Credentials
 
  Scenario: Successful Login with Valid Credentials 
   
    Given User is on Home Page
    When User navigates to LogIn Page
    And User enters Credentials to LogIn Page
        |testuser_1| Test@153|
    Then Message displayed Login Successfully