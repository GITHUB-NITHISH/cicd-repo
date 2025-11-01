Feature: Login Functionality

Background:
	Given user Launch Browser
	 And user Navigate To Url 
	 
Scenario: Test with valid Credentials
	When user Enters Username In The Input Field
	When user Enters Password "Password123" In The Input Field
  Then user Clicks On Submit Button
  And It Navigates To Next Page and Verifies It