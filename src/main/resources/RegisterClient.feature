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

Background: Valid information is the validation of Company name, adresse, contact person firstname, contact person lastname, contact person email and password. 

  @tag1
  Scenario: Succesful client registration
    Given Client name doesnt exist
    And Valid information 
    When Register client
    Then new client is registered 
    And uniqe Client ID generated
    And Succesful registration
    
   Scenario: Unsuccsesful client registration: Client already exists
   	Given Client name exists
    When Register client
    Then Client not registered
    And Display Name already in use
   
   Scenario: Unsuccsesful client registration: Invalid information
  	Given Client doesnt exists
    And Invalid information
    When Register client
    Then Client not registered
    And Display faulty information

    

