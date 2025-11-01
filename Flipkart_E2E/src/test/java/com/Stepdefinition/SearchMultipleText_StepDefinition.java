package com.Stepdefinition;

import com.Base.BaseClass;
import com.Pages.SearchMultipleText;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchMultipleText_StepDefinition extends BaseClass{
	SearchMultipleText sm = new SearchMultipleText(driver);
	
	@Given("Enter {string} in the search field")
	public void enter_in_the_search_field(String string) {
	    sm.Search_Method(string);
	}
	
	@When("Click search button for multiple text")
	public void click_search_button_for_multiple_text() {
	   sm.SearchButton_Method();
	}


	@Then("It should navigate to next page and display search result")
	public void it_should_navigate_to_next_page_and_display_search_result() throws InterruptedException {
	   PageTitle();
	   Screenshot("src\\test\\resources\\Screenshots\\searchmultiple.png");
	}
	
	

	
}
