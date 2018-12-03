
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
Feature: Buscar en Google
  Yo quiero usar Google para buscar una cadena

  @tag1
  Scenario: Busqueda exitosa
    Given Dado que puedo Abrir el navegador
    When Voy a Google
    And Busco "El tiempo mañana" en Google
    Then Valido que el resultado sea el Esperado
