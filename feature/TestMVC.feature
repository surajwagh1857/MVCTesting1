Feature: Test Employee
Scenario: Test Employee data

Given user launched chorme browser
And user opened demosite url
When user enters all Credentials
And user clickes on submit

Then information  page should be displayed

Scenario: Test Employee data Entering only Name and age

Given user launched chorme 
And user opened demosite home url
When user enters Name and age only
And user clickes on submit button.

Then Employee information page should be displayed.

