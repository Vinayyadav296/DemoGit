Feature: Validate add to cart functionality

Scenario: Verify add to cart successfully from PDP page

Given user launch URL
When user login into the application
And  add product into the cart from PDP
Then  validate user is able to add the product