
Feature: Post for create user

Scenario: 1.Validate user creation
  Given Hit create user API
  Then create new user in system
  Then validate user created
 
Scenario: 2.Validate user creation
  Given Hit create user API
  Then create new user in system with extra attribute of 'firstComp'
  Then validate user created and above extra attribute did not considered anywhere 
  
Scenario: 3.Validate user creation
  Given Hit create user API
  Then create new user in system without dept attribute
  Then validate user created successsfully as this is option attribute
  
Scenario: 4.Validate user creation
  Given Hit create user API
  Then create new user in system without name attribute
  Then validate user created failed as name is mandatory attribute
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  