
@Regression
Feature: To test all the functionality of OrangeHRM Demo Apps.

Scenario: log as System Admin
    Given the user launches the url
    When User click login option
   Then login with differrent user1 
   And Enter the system admin
   Then click logout 

Scenario: log as System Administator
    When User click login option
   Then login with differrent user2
   And Enter the system admin
   Then click logout 
   
   Scenario: log as System ESS USER
    When User click login option
   Then login with differrent user3
   And Enter the system admin
   Then click logout 
   
   Scenario: log as System 1st Level Supervisor
    When User click login option
   Then login with differrent user4
   And Enter the system admin
   Then click logout 
   
   Scenario: Select the Employee List
 	 Given the user launches the url
   When User click login option
   Then login with differrent user1 
   Then Enter the PIM Option
   And Click the Employee List
   Then Get particular Employee Details
  
   
   