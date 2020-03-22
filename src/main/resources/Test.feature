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
Feature: Register client

  @tag1
  Scenario: Succesful client registration
    Given Client in database is false
    And all information is true
    When Register client
    Then Client saved in database
    
   Scenario: Client already exists
   	Given Client in database is true (checks on client name)
    When Register client
    Then Client not saved (prompt for new name)
   
   Scenario: Not enough information
  	Given Client in database is false
    And all information is false
    When Register client
    Then Client saved in database
    
   Scenario: 


