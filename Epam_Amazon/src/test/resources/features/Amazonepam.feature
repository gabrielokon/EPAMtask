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

Feature: Amazon task 
Scenario: phonefilter
Given user opens the url 
When user accepts cookies
Then user clicks all menu 
Then scroll
Then user clicks electronics
When user clicks phone and ac
Then user clicks mobilephone
When user selects price
Then user selects samsung
When user selects resolution 
Then user selects year 

Scenario: list items found 
Given user opens url
Then list
