#Author: alexanderf.roy@gmail.com

@tag
Feature: Apply to a job
  As a web user
	I want to apply to a job in the website
	
	Background: given that Freyns was able to search a job in the page webs
		Given That Freyns wants to search job in the web page
    When He enters in the input the work he wants search
      | what | where    |
      | qa   | medellin |
    Then He should see the search result 

  @tag
  Scenario: Apply to a job in the page Indeed
    Given That Freyns wants to apply to job in the web page
    When He selects a job offer from the job list
    Then He should be able to see the detail of the work he chose
