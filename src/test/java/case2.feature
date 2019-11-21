Feature: demo on login process
Scenario Outline: login in testme app

Given user in login page
When user enters "<username>" and "<password>"
And clicks on login
Then user successfully access the homepage

Examples:
|username||password|
|Lalitha||Password123|
|xyz||xyz|