Feature: demo for case3
Scenario: search engine in testme app

Given User in login page
When user enter login credentials
And user is redirected tp homepage
And type first four letters of the product
And select product from drop down
And click on search products
Then product details provided to user