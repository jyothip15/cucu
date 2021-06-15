@smoke
Feature: Home page validation
@test
Scenario:  user menu dropdown
Given User is in HomePage,He should be able to see usermenu dropdown
When User should be able to click on user menu
Then User menu dropdown should contain UsermenuOptions

|Myprofile      	|1 |
|Mysettings 			|2 |
|Developer Console|3 |
|Logout						|4 |

#Then User menu dropdown should contain "Myprofile","Mysettings","Developer Console","Logout"
#Then User menu dropdown should contain "<UsermenuOptions>"
#Then User menu dropdown should contain "UsermenuOptions"

#Examples:
#|UserMenuOptions	|
#|Myprofile      	|
#|Mysettings 			|
#|Developer Console|
#|Logout						|

@regression
Scenario: validate my profile option
Given User is in HomePage,He should be able to see usermenu dropdown
When  User should be able to click on my profile from the usermenu
Then  User should be seeing profile page
When  User should be able to click on edit button
Then  user should be seeing edit profile pop up window
When  user should be able to click on about tab
And   user should be able to enter lastname and click on saveall button
Then  user profile page should be visible with the changed lastname


