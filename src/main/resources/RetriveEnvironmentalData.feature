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
Feature: Retrive environmental data about container 
	
	Background: environmental data is temperature, humidity and pressure over time in the container during a journey.
	
  @tag1
  Scenario: Retrivel of environmental data 
    Given A Specific Container 
    And Container status is active # Oliver wants to change to afterWwhen
    When Retriveing the environmental data
    Then Display environmental data
    
  Scenario: Fail to retrive environmental data
  	Given A Specific Container
  	And Container status is inactive
    When Retriveing the environmental data
    Then Display no avaliable environmental data


