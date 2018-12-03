#Author: alexanderf.roy@gmail.com

@tag
Feature: Login
  As a web user
  He want to log in on the website

  @successful
  Scenario: Login on the page indeed
    Given That Freyns wants to login in the page web
    When He clicks the enter button of the page of index
    And He enters the username and the password and clic in the button enter
      | email                    | password    |
      | alexanderf.roy@gmail.com | Prueba12345 |
    Then He verifies that he was logged in with the status

  @failed
  Scenario: Login on the page indeed
    Given That Freyns wants to login in the page web
    When He clicks the enter button of the page of index
    And He enters the username and the password and clic in the button enter
      | email                    | password    |
      | alexanderf.roy@gmail.com | prueba12345 |
    Then He verifies that he was logged in with the status
    