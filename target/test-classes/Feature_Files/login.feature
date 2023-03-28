Feature: This feature is for login functionality





@cart
Scenario: Verify user can login with valid card
Given MetaLaunchURL "<URL>"
Then Click login link
Then Enter Username and Enter Password and Click login button
Then Verify user can login with valid card