#Author: alexanderf.roy@gmail.com
@tag
Feature: Login
  As a web user
  He want to log in on the website

  @tag
  Scenario: Login on the page indeed
    Given That Freyns wants to login in the page
    When He clicks the enter button of the page of index
    And He enters the username and the password
      | email                      | password      |
      | "alexanderfroy@gmail.com"  | "a12345"      |
      | "alexanderf.roy@gmail.com" | "Prueba12345" |
    And He clic in the button enter
    Then He verifies that he was logged in with the status
      | status                                        |
      | "Contraseña o dirección de email incorrectas" |
      | "alexanderf.roy@gmail.com"                    |
