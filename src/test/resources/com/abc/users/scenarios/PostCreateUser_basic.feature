
Feature: Post for create user

Scenario: 1.Validate user creation
  Given Hit create user API
  Then create new user in system
  Then validate user created
 
Scenario: 2.Validate user creation
  Given Hit create user API
  Then create new user in system with extra attribute of 'country' with value 'India'
  Then validate user created and above extra attribute did not considered anywhere 
  
Scenario: 3.Validate user creation
  Given Hit create user API
  Then create new user in system with extra attribute of 'country' with value 'India'
  Then validate user created successsfully with attribute 'country' with value 'India'
  
Scenario: 4.Validate user creation
  Given Hit create user API
  Then create new user in system without name attribute
  Then validate user created failed as name is mandatory attribute
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  