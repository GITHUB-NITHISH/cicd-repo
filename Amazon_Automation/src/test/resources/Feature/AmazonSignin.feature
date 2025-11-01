Feature: Amazon.in Sign-In Functionality

  Background:
    Given The user is on the Amazon Sign-In page
 
  @Positive
  Scenario: Valid Login
    When The user enters a valid email 
    And Clicks the continue button
    And Enters a valid password 
    And Clicks the sign-in button
    Then The user should be redirected to the account homepage
    
  @negative  
  Scenario Outline: Invalid Email Format
    When the user enters <invalid email>
    And Clicks the continue button
    Then Appropriate Error message and icon should be displayed 
    Examples:
      |invalid email|
      |"dsnithishkumargmail.com"|
      |"dsnithishkumar"|
      |"@gmail.com"|
      |"dsnithishkumar@com"|
      |"dsnithishkumar@@gmail.com"|
      |"dsnithishkumar@gmail..com"|
      |"dsnithishkumar&gmail.com"|

