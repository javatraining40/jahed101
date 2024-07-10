#Author: Ashit Barua
#Feature: Customer order
#User Story: NGAS-234
#Scenario: Scenario 1 tittle
#Scenario: Scenario 2 tittle
#Scenario: Scenario 3 tittle
Feature: Create Order Operation
  
  Scenario: Create order by customer
    Given I logged in as Customer
    |userId					 |password|
    |david@gmail.com |1234    | 
    And I click on Product menu
    When Select Product name
    And Enter Order Date
    And Click Order Product button
    Then Click Confirm order
    And Verify Order Status is Confirmed

  