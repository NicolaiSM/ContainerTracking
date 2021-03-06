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
Feature: Update Client information
	
	Background: Information is: contact person fistname, contact person lastname, contact person email, Client address 
	
	
  @tag1
  Scenario: Succesful Client information update
    Given New information
    When Update Client information
    And New information is valid
    Then Change client information
    
  Scenario: Unsuccesful Client information update
    Given New information
    When Update Client information
    And New information is invalid
    Then Display that the information is invalid