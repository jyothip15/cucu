Feature: Login functionality

This feature file is responsible for validating all the scenarios of homepage

Background:
Given As a user,I should be able to launch the applicatiom
When  As a user,I should be able to enter user credentials

@smoke
Scenario Outline: Validate login with error message
#Given As a user,I should be able to launch the applicatiom
#When  As a user,I should be able to enter user credentials
#And user enters username and blank password and clicks login
#And user enters "jyothi15@gmail.com" and blank "" and clicks login
And user enters "<username>" and blank "<Password>" and clicks login
Then  user should be able to see a error message for wrong credentials entered

Examples:
|username          |Password    |
|jyothi15@gmail.com|            |
|xyz               |Blessings143|  
|jyothi15@gmail.com|Blessings143| 
 
@test 
Scenario: Validate login with wrong username
#Given As a user,I should be able to launch the applicatiom
#When  As a user,I should be able to enter user credentials
#And user enters wrong username and valid password and clicks login
And user enters wrong "xyz" and valid "Blessings143" and clicks login
Then  user should be able to see a error message for wrong credentials entered

Scenario: Validate login with valid credentials
#Given As a user,I should be able to launch the applicatiom
#When  As a user,I should be able to enter user credentials
#And user enters valid username and valid password and clicks login
And user enters "jyothi15@gmail.com" and "Blessings143" and clicks login
Then  user should be able to see a home page of the application

#Scenario: Validate usermenu dropdown 
#Given user is in Homepage,he should be able to see usermenu dropdown
#When user clicks usermenu dropdown
#Then user should be able to see the options profile,settings etc


