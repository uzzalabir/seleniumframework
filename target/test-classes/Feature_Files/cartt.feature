Feature: This Feature for cart functionality

@cart
Scenario: Verify item added in cart
Given MetaLaunchURL "<URL>"
Then click Nokia Lumia
Then click add to cart
Then click cart link
Then Verify item added in cart
