#Author: Ashit Barua
#Feature: Customer order
#User Story: NGAS-234
#Scenario: Scenario 1 tittle
#Scenario: Scenario 2 tittle
#Scenario: Scenario 3 tittle


Feature: Customer orders functionality
  As a Custmer
  I want to See my orders
  So that I can manage my Orders  

  Scenario: Customer order total count test
    Given I logged in as Customer
    |userId         |password|
    |david@gmail.com|1234    | 
    When Click on Order List Menu
    And Verify Total count is greater than 100
