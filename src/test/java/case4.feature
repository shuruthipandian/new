Feature: demo for casefour
Scenario: move to cart scenario

Given User in Login page
When user enters the credentials
And  user is redirected to homepage
And user enters the product as "headphone"
And Click on search products
Then no items in cart displayed