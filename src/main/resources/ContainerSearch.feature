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
Feature: Find containers based on a keyword
  
  Background: Keyword is Port of origin, Destination, Container ID, Journey ID, Content, Client name, Contactperson Email, contactperson firstname, contactperson lastname, clinet address. 

  @tag1
  Scenario: One or more containers matching the keyword is found
    Given Keyword
    When Finding a container
    And the keyword matches
    Then Display the containers

	Scenario: No Container found that matches the keyword
		Given Keyword
		When Finding a container that matches the keyword
		And No keyword matches
		Then Display that no containers matching the keyword was found

