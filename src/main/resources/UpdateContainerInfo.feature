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
Feature: Update container information

  Scenario: Succesful update 
    Given Datafile
    And Valid information
    When Update internal container information
    Then Update internal container information
    And Display container has been updated

  Scenario: Unsuccesful update: No datafile
    Given No datafile
    When Update internal container information
    Then display missing datafile
    
  Scenario: Unsuccesful update: Invalid information
    Given Datafile
    And Invalid information
    When Update internal container information
    Then display that there is bad data