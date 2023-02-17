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
Feature: Login page

  Scenario Outline: Login with correct credentials
    Given Navigate to direct url
    When Insert <UserName> and <Password> and click on login button
    Then User should in home page

    Examples: 
      | UserName | Password |
      | abc      | pass1    |
      | abcd     | pass2    |
      | abcde    | pass3    |
