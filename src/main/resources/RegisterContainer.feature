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
Feature: Registration of container

Scenario: Successful registration of a container
#	  Given a port Of origin
#	  And an available container
#	  And a destination Port
#	  And a Content description
#	  And a client name
#	  And a client ID
		Given valid information
	  When registering container 
#	  And an available journey
	  Then Interface displays that the container is registered
	  And Change container status


Scenario: Unsuccessful registration of container
		Given invalid information
		When registering container
		Then Interface displays that container information was missing or incorrect
		And prompt information input


Scenario: 


		