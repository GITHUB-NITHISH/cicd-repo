
Feature: Login Functionality
Scenario: Test with valid Credentials

  Given user Launch Browser
  And user Navigate To Url 
	When user Enters Username In The Input Field
	When user Enters Password "Password123" In The Input Field
  Then user Clicks On Submit Button
  And It Navigates To Next Page and Verifies It
  



#Scenario Outline: Test with invalid username and valid password
#	When user Enters Username <username> In The Input Field
#	When user Enters Password <password> In The Input Field
#	Then user Clicks On Submit Button
#	And user Verifies Error Message
#	
#	Examples:
#	|username||password|
#	|"dfhdf"||"Password123"|
#	|"dfffgd"||"Password123"|
#	|"jkjgfnh"||"Password123"|
#	
#
#Scenario Outline: Test with valid username and invalid password
#	When user Enters Username "student" In The Input Field
#	When user Enters Password In The Input Field
#	Then user Clicks On Submit Button
#	And user Verifies Error Message
#	
