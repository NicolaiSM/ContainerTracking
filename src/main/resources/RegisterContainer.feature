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

	Background: The information is destination, client and content

	Scenario: Successful registration of a container
    Given Port
    And Destination
    And Client
    And Content
    And Container
	  When Registering a container
    And New container information is valid
    Then Change container status


	Scenario: Unsuccessful registration of container
    Given Port
    And Destination
    And Client
    And Content
    And Container
		When Registering a container
    And New information is invalid
    Then Display that the information is invalid
    
    