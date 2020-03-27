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
Feature: Find old journeys and active journeys based on keywords. 
	
	Background: Keyword is Port of Origin, Destination, Client name, and status
	
  @tag1
  Scenario: Journeys are found that matches the keyword
    Given Keyword
    When Finding journeys 
		And the keyword matches
    Then Display journeys that was found

  Scenario: No journeys was found that matches the keyword
    Given Keyword
    When Finding journeys
    And The keyword dosent match
    Then Display that no Journeys was found that matches the keyword
    
