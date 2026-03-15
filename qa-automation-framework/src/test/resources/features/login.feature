Feature: Login functionality

Scenario: Successful login

Given user is on the login page
When user enters valid username and password
Then user should see the products page