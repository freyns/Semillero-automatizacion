#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: login en Gmail
  Yo quiero entrar a mi correo y loguearme

  @tag1
  Scenario Outline: Login
    Given Abrimos el navegador y vamos al sitio web de Login
    When El usuario ingresa el username "<username>" y el password "<password>"
    And El usuario presiona click en el boton ingresar
    Then El Usuario debera ver el Mensaje "<mensaje>"

    Examples: 
      | username                 | password    | mensaje                                     |
      | alexanderfroy@gmail.com  | prueba12345 | Contraseña o dirección de email incorrectas |
      | alexanderf.roy@gmail.com | Prueba12345 | alexanderf.roy@gmail.com                    |
