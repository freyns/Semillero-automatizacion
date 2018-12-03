#Author: alexanderf.roy@gmail.com

@tag
Feature: Search job
  As a web user
  He want to search job in the website

  @tag
  Scenario: Search job in the page Indeed
    Given That Freyns wants to search job in the web page
    When He enters in the input the work he wants search
      | what | where    |
      | qa   | medellin |
    Then He should see the search result
