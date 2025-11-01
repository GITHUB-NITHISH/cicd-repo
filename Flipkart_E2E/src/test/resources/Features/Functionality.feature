
Feature: To validate flipkart application

Background: 

When Close the popup
Then It should navigate to homepage

	@tc1   @regression  @smoke
  Scenario: To validate search functionality
    Given User enters text in search field
    When Click search button
    Then It should navigate to search result page 
    Then Extract results and print in console
    Then print eighth result and keep it in console
    Then print mobile name and its price
    Then print mobile name
    Then print mobile prices

 
  @tc2  @smoke
  Scenario: To validate filter functionality
    Given User enters text in search field
    When Click search button
    Then It should navigate to search result page 
    And Select minimum and maximum price
    And Select brand
    And Select Ram
    And Select battery capacity
    Then It should display relavant result


  @tc3  @sanity  @regression
  Scenario: To validate fashion functionality
  	Given User move to fashion link
  	When Cursor move to Kids
  	And Move to Boys & Girls Tshirts
  	And Click high to low price link
  	Then It should display relavant details and get the title

  
  @tc4  @smoke
  Scenario Outline: To validate search functionality with different values
   	 Given Enter <searchtext> in the search field
   	 When Click search button for multiple text
   	 Then It should navigate to next page and display search result
   
   	 Examples:
   	 |searchtext|
   	 |"Mobiles"|
   	 |"TV"|
   	 |"Headphones"|
   	 |"Laptop"|
   	 
  @tc5   @regression
  Scenario:  To validate upto addcart functionality
			Given User move to login link
			Then User click flipkart plus zone
			And User move cursor to Home & furniture link
			And User Click Smart Security System link
			Then User Scroll down page and click on particular result
			Then User Enter delivery pincode and click check link
			Then Pincode checked and displayed & Verify child and parent window
			
	@tc6  @sanity
	Scenario: To get title and price from search result
			Given User enter search text in search field
			When User click search icon
			And Displays search result and get title and price
			
	@tc7 @regression
	Scenario: To test Search functionality by using data from excelsheet
			Given User enters searchText in search field
			Then Click search icon
			Then It should display relevant result
			
   	 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   


