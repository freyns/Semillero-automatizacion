#Author: alexanderf.roy@gmail.com

Feature: Google Translate
	As a web user
	I want to use Google Translate
	To translate words between different languajes

  Scenario: Translate from English to Spanish
    Given That susan wants to translate a word
    When She translates the word cheese from English to Spanish
    Then She should see the word queso in the screen
