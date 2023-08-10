Feature: Validate Login functionality
Scenario: Verify successfull login with valid credentials
Given User Lanunces site Url
When  User enters valid username and password
And   Click on login  button
Then  Validate user logged in successfully


#Scenario: Verify error message when  login with invalid credentials
#Given User Lanunces site Url
#When  User enters valid username and password
#And   Click on login  button
#Then  Validate error message on the page