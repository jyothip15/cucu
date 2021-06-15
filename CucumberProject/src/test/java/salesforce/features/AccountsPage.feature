Feature: Account page validation 

@regression
Scenario: validating accounts tab
Given user is on the homepage
When  user clicks on the accounts link
Then  user should see accounts page

@smoke
Scenario: validating account page with account details	
Given user is on the accounts page
When  user clicks on the new button
And   user should see new account edit page
And   user should be able to enter details on all fields
Then  user should see the new accounts page with the account details 
