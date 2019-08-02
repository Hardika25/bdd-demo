
Feature: Login Action Test
This Feature will test LogIn and LogOut functionality


  Scenario: Unsuccessful login with invalid credential
    Given User is in Home page
   
    When USer navigate to Login page
    And User enters Username and password
    But User credentials are wrong
    Then Message displayed wrong Username and Password
   


