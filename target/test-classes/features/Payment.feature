Feature: Validate all Payment functionality

Scenario: Verify card payment successfully with valid details

Given user launch URL
When user login into the application
And add product to the cart and navigate to the checkout page
And user select card payment method and add valid details
Then validate successfull payment by card