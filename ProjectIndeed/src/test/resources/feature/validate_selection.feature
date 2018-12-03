#Author: alexanderf.roy@gmail.com

@tag
Feature: Validate the login, search and selection of a job
  He want to validate the login, search and selection of a job in the website

 		@SmokeTest
 		Scenario: apply for a job at indeed.com		
 		Given That Freyns wants to login in the page web
    When He clicks the enter button of the page of index
    And He enters the username and the password and clic in the button enter
      | email                    | password    |
      | alexanderf.roy@gmail.com | Prueba12345 |
    Then He verifies that he was logged in with the status
    
    Given That Freyns wants to search job in the web page
    When He enters in the input the work he wants search
      | what | where    |
      | qa   | medellin |
    Then He should see the search result
    
    Given That Freyns wants to apply to job in the web page
    When He selects a job offer from the job list
    Then He should be able to see the detail of the work he chose