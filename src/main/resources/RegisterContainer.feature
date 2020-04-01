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
    Given Port of origin "Stockholm"
    And Destination "Copenhagen"
    And Client "NETTO"
    And Content "Milk"
    And Container Port "Stockholm" and ID "CON00000001"
	  When Registering a container
    Then Change container status


	Scenario: Unsuccessful registration of container (invalid info)
    Given Port of origin "Stockholm"
    And Destination "Moon"
    And Client "NETTO"
    And Content "Milk"
    And Container Port "Stockholm" and ID "CON00000001"
		When Registering a container
    Then Display that the information is invalid
    
  Scenario: Unsuccessful registration of container (no container)
    Given Port of origin "Stockholm"
    And Destination "Copenhagen"
    And Client "NETTO"
    And Content "Milk"
    And Container "NULL"
    When Registering a container
    Then Display that there is no container available
    
    
    